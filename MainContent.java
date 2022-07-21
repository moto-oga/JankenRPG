package jankenRPG;



import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class MainContent {	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Chara chara = new Chara();
		String select = "y";
		boolean ok = true;
		int secretBox = 0;
		
		System.out.println("---ルール説明");
		System.out.println("1.入力は半角で行ってください。");
		System.out.println("2.武器、アイテムは10個まで持てます。捨てる事は出来ません。アイテムを消費する事で空きを作ることが出来ます。");
		System.out.println("3.戦闘システムはじゃんけんと同じです。相手の手に勝つ事が出来ればダメージを与えられます。");
		System.out.println("逆に負ければ、ダメージを受けます。あいこなら何も起きません。");
		System.out.println("よろしいですか？y/n");
		sc.next();
		System.out.println("---それでは、じゃんけんRPGを開始します。");
		System.out.println("あなたの名前はなんですか？");
		chara.setName(sc.next());
		
		do {
			System.out.println("あなたの性別はなんですか？man/woman");
			String answer = sc.next();
			if(answer.equals("man") || answer.equals("woman")) {
				chara.setSex(answer);
				ok = false;
			}else {
				System.out.println("manかwomanで入力してください。");
				ok = true;
			}
		}while(ok);
		
		System.out.println(chara.getName()+"。あなたはこれから洞窟に棲むドラゴンを退治してきてください。");
		System.out.println("-----------------------------");
		System.out.println("退治しにいきますか？y/n");
		
		if(select.equals(sc.next())) {
			System.out.println("流石は私が見込んだ人です。私からの餞別です受け取りなさい。");
			announce("---銅の剣を手に入れた！");
			announce("---回復薬を手に入れた！");
			announce("---けむり玉を手に入れた！");
			announce("---けむり玉を手に入れた！");
			
			chara.setItemBox(Item.douNoKen()[2]);
			chara.setItemBox(Item.kaifuku()[2]);
			chara.setItemBox(Item.kemuriDama()[2]);
			chara.setItemBox(Item.kemuriDama()[2]);
			
			System.out.println("装備しますか？y/n");
			
			if(select.equals(sc.next())) {
				System.out.println(Item.douNoKen()[0] + "を装備しました！");
				chara.setWeapon(Integer.parseInt(Item.douNoKen()[2]));
			}
			
		}else {
			System.out.println("なんて根性の無い…。");
			System.out.println("--------------------------");
			System.out.println("G A M E O V E R");
			sc.close();
			return;
		}
		
//		for(int i = 0; i < chara.getItemBox().length; i++) {
//			System.out.println(chara.getItemBox()[i]);
//		}
		announce("ザッザ");
		announce("ザッザ");
	
		String iam = chara.getSex().equals("man") ? "俺":"私";
		announce(iam + "は洞窟へと入っていった。");
		boolean end = true;
		
		
			
			
			int[] charaStatus = new int[7];
			int secret = 0;
		do {
			int event = dangeon();
			
			event = 1;
			chara.setHitPoint(100);
			chara.setWeapon(3);
			chara.setLast(100);
			
			charaStatus[0] = chara.getWeapon();
			charaStatus[1] = chara.getShield();
			charaStatus[2] = chara.getLevel();
			charaStatus[3] = chara.getAtk();
			charaStatus[4] = chara.getDefense();
			charaStatus[5] = chara.getHitPoint();
			charaStatus[6] = 0;
			//announce(Arrays.toString(chara.getItemBox()));
				
			
			int[] update = new int[charaStatus.length];
			
			
			switch(event) {
			 case 1:
					 update =  Event.battle(chara.getItemBox(),charaStatus,chara.getName(),chara);//戦闘
					 secret = 0;
//				 for(int i = 0; i < update.length;i++) {
//					
//				 }				
				 break;
				 
			 case 2:chara.setItemBox(Event.item(secret));//宝物
			 		secret = 0;
				 break;
				 
			 case 3://何もなし
				 	secret ++;
				 
				 break;
				 
			 case 4://ボス近い
					 charaStatus[6] = 1;
					 update =  Event.battle(chara.getItemBox(),charaStatus,chara.getName(),chara);//戦闘
					 secret = 0;
				 break;
			}
			
			if(event == 1) {
				
			
				
				chara.setWeapon(update[0]);
				chara.setShield(update[1]);
				chara.setLevel(update[2]);
				//chara.setAtk(charaStatus[3]);
				chara.setDefense(update[4]);
				//chara.setHitPoint(charaStatus[5]);
			}
			
			if(update[0] == 100) {
				
				announce("--G A M E C L E A R ! ! !--");
				sleep(10000);
				announce("---ｳﾞｨｷﾞｬﾙﾙｩｩﾜｧｧｧｧｧ！！！");
				announce("ドラゴンはまだ倒せていなかった！怒りでさらに強くなったドラゴンを倒してください！");
				chara.setLast(100);
				Event.battle(chara.getItemBox(),charaStatus,chara.getName(),chara);
				end = false;
				
				if(update[0] == 1000){
				
					announce("--G A M E C L E A R ! ! !--");
					end = false;
					
				}
				
			}else {
				
				secretBox += standby(sc,chara);
				
			}
			
			
			
		}while(end);
		
		
	}
	
	public static void sleep(int time) {
		
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
		
			e.printStackTrace();
		}
	}
	
	public static int dangeon() {
		
		Random rnd = ThreadLocalRandom.current();
		int rndNum = rnd.nextInt(5);
		int event = 0;
		
		switch(rndNum) {
		
			case 0:event = Speech.battelPattern();
			break;
			case 1:event = Speech.itemPattern();
			break;
			case 2:event = Speech.nothingPattern();
			break;
			case 3:event = Speech.doragonVoicePattern();
			break;
			case 4:event = Speech.nothingPattern();
			break;
			
		}
		
		return event;
		
	}
	
	public static void  announce(String anounce) {
		
		sleep(1000);
		System.out.println(anounce);
		
	}
	
	
	public static int standby(Scanner sc,Chara chara) {
		
		boolean b = true;
		int secretNum = 0;
		announce("道が分かれている…");
		announce("どの方向に進みますか？　左/q 右/w 真ん中/e 装備変更/r");
		
		String select = sc.next();
		
		if(select.equals("r")) {
			
			String[] itemBox = chara.getItemBox();
			String[] itemName;
			String[] itemContent;
			String[] itemId;
			int i = 0;
			
			for(String item2: itemBox) {//所持アイテム数をチェック
				
				if(item2 != null) {
					i ++;
				}
			}
			
			itemName = new String[i];
			itemContent = new String[i];
			itemId = new String[i];
			i = 0;
			
			for(String item: itemBox) {
				
				if(item != null) {
					
					String[] searchItem = Event.search(item);
					itemName[i] = searchItem[0];
					itemContent[i] = searchItem[3];
					itemId[i] = searchItem[2];
					i++;
					
							
				}
				
				
			}
			
			String[] sord = Event.search(Integer.toString(chara.getWeapon()));
			String[] shield = Event.search(Integer.toString(chara.getShield()));
			String sordName;
			String shieldName;
			if(sord[2].equals("100")){
				sord[0] = "無し";
			}else if( shield[2].equals("100")) {
				shield[0] = "無し";
			}else {
				
			}
			
			System.out.println("-----ステータス-----");
			System.out.println("装備【剣】"+""+";"+""+sord[0]);
			System.out.println("装備【盾】"+""+";"+""+shield[0]);
			System.out.println("レベル"+""+";"+""+chara.getLevel());
			System.out.println("体力"+""+";"+""+chara.getHitPoint());
			System.out.println("力"+""+";"+""+chara.getPower());
			System.out.println("防御力"+""+";"+""+chara.getDefense());
			System.out.println("-----所持品-----");
			i = 0;
			for(String iName : itemName) {
				System.out.println(i+"."+""+iName + ":" + itemContent[i] );
				i++;
			}
			i = 0;
			do {
				System.out.println("装備したい装備の番号を入力してください。");
				int num = sc.nextInt();
				
				if(Integer.parseInt(itemId[num]) <= 9) {
					
					chara.setWeapon(Integer.parseInt(itemId[num]));
					announce(itemName[num] + "を装備しました！");
					b = false;
					
				}else {
					
					announce("それは装備できません。もう一度選択してください。");
					b = true;
					
				}
			}while(b);
			
		}else {
			if(select.equals("q")) {
				secretNum = 1;
			}else if(select.equals("w")) {
				secretNum = 2;
			}else if(select.equals("e")) {
				secretNum = 3;
			}else {
				
			}
		}
		return secretNum;
		
	}
	

}
