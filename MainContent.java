package jankenRPG2;



import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class MainContent{
	
		
		
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);//入力受付
		Chara player = new Chara(10);//キャラクターインスタンス
		String select = "y";//選択判別
		boolean b = true;//while用
		int secret = 0; //隠し要素
		int secretBox = 0;//隠し要素
		
		System.out.println("---ルール説明");
		System.out.println("1.入力は半角で行ってください。");
		System.out.println("2.武器、アイテムは10個まで持てます。捨てる事は出来ません。アイテムを消費する事で空きを作ることが出来ます。");
		System.out.println("3.戦闘システムはじゃんけんと同じです。相手の手に勝つ事が出来ればダメージを与えられます。");
		System.out.println("逆に負ければ、ダメージを受けます。あいこなら何も起きません。");
		System.out.println("よろしいですか？y/n");
		
		sc.next();
		
		System.out.println("---それでは、じゃんけんRPGを開始します。");
		System.out.println("あなたの名前はなんですか？");
		
		player.setName(sc.next());
		
		
		announce(player.getName()+"。あなたはこれから洞窟に棲むドラゴンを退治してきてください。");
		System.out.println("-----------------------------");
		System.out.println("退治しにいきますか？y/n");
		
		if(select.equals(sc.next())) {
			
			announce("流石は私が見込んだ人です。私からの餞別です受け取りなさい。");
			
			System.out.print("---");
			announce("銅の剣を手に入れた！");
			
			System.out.print("---");
			announce("回復薬を手に入れた！");
			
			System.out.print("---");
			announce("けむり玉を手に入れた！");
			
			System.out.print("---");
			announce("けむり玉を手に入れた！");
			
			player.setItemBox(Item.douNoKen()[2]);
			player.setItemBox(Item.kaifuku()[2]);
			player.setItemBox(Item.kemuriDama()[2]);
			player.setItemBox(Item.kemuriDama()[2]);
			
			System.out.println(Item.douNoKen()[0] + "を装備しました！");
			player.setWeapon(Integer.parseInt(Item.douNoKen()[2]));
	
			
		}else {
			announce("なんて根性の無い…。");
			System.out.println("--------------------------");
			announce("G A M E O V E R");
			sc.close();
			return;
		}
		
		announce("ザッザッザ");
		announce("ザッザッザ");
		announce("洞窟へと入っていった。");
		
			
			
		while(b){//ゲーム本筋
			
			int event = dangeon();
			
//			event = 4; 				//--確認用
//			 
//			player.setWeapon(3);
//			player.setShield(7);
//			player.setHp(150);	
//			player.setLevel(20);//--迄
			//announce(Arrays.toString(chara.getItemBox()));			
			
			switch(event) {//イベント分岐
			
			 case 1:
				 
				 	player.setEneId(0);
					Event.battle(player);//戦闘
					secret = 0;
					 
				 break;
				 
			 case 2:
				 	player.setEneId(0);	
				 	Event.item(player,secret);//宝物
			 		secret = 0;
				 break;
				 
			 case 3://何もなし
				 	player.setEneId(0);
				 	secret ++;
				 
				 break;
				 
			 case 4://ボス近い
				 	player.setEneId(4);
				 	Event.battle(player);//戦闘
				 	secret = 0;
				 break;
			}
			
			if(player.getLast() == 100) {//LASTBATTLE!!
				
				announce("--G A M E C L E A R ! ! !--");
				sleep(10000);
				announce("---ｳﾞｨｷﾞｬﾙﾙｩｩﾜｧｧｧｧｧ！！！");
				announce("ドラゴンはまだ倒せていなかった！怒りでさらに強くなったドラゴンを倒してください！");
				
				Event.battle(player);
				
				
				if(player.getLast() == 1000){
				
					announce("--G A M E C L E A R ! ! !--");
					
					b = false;
					
				}
				
			}else {
				
				secretBox += standby(sc,player);
				
			}
			
//			for(String i:player.getItemBox()) {//デバック用
//				System.out.println(i);
//			}
			
		}
		
		
	}
	
	public static void sleep(int time) {
		
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
		
			e.printStackTrace();
		}
	}
	
	public static int dangeon() {//場面の分岐
		
		Random rnd = ThreadLocalRandom.current();
		int rndNum = rnd.nextInt(5);
		int event = 0;
		
		switch(rndNum) {
		
			case 0:event = Speech.battelPattern();//戦闘に向かうシーン
			break;
			case 1:event = Speech.itemPattern();//宝箱発見シーン
			break;
			case 2:event = Speech.nothingPattern();//何も起こらないシーン
			break;
			case 3:event = Speech.doragonVoicePattern();//ボス接近シーン
			break;
			case 4:event = Speech.nothingPattern();//何も起こらないシーン
			break;
			
		}
		
		return event;
		
	}
	
//	public static void  announce(String anounce) {
//		
//		sleep(700);
//		System.out.println(anounce);
//		
//	}
	
	public static void  announce(String anounce) {
		
		String a = anounce;
		String b = null;
		String c = System.getProperty("line.separator");
		
		for(int i = 0; i < a.length(); i++) {
			
			if(i == a.length()-1) {
				sleep(100);
				b = a.substring(i,i+1);
				System.out.print(b+c);
			}else {
				sleep(100);
				b = a.substring(i,i+1);
				System.out.print(b);
			}
			
		}
		
	}
	
	
	public static int standby(Scanner sc,Chara player) {
		
		boolean b = true;
		int secretNum = 0;
		
		announce("道が分かれている…");
		announce("どの方向に進みますか？");
		System.out.println("左/q 右/w 真ん中/e 装備変更/r");
		String select = sc.next();
		String[][] afterItem;
		
		if(select.equals("r")) {
			
			String[] itemBox = player.getItemBox();//現在の所持品
			
			int i = 0;
			
			for(String item2: itemBox) {//所持アイテム数をチェック
				
				if(item2 != null) {
					
					i ++;
					
				}
			}
			
			afterItem = new String[i][4];
			
			i = 0;//アイテムカウント
			
			for(String item: itemBox) {
				
				if(item != null) {
					
					String[] searchItem = Event.search(item);
					
					for(int j = 0; j < 4 ; j ++) {//アイテムの詳細項目数
						
						afterItem[i][j] = searchItem[j];
								
					}
					
					i++;
							
				}	
				
			}
			
			String sordName = Event.search(Integer.toString(player.getWeapon()))[0];
			String shieldName = Event.search(Integer.toString(player.getShield()))[0];
			
			if(player.getWeapon() == 100){
				
				sordName = "無し";
				
			}else if(player.getShield() == 100) {
				
				shieldName = "無し";
				
			}else {
				
			}
			
			System.out.println("-----ステータス-----");
			System.out.println("装備【剣】"+""+";"+""+sordName);
			System.out.println("装備【盾】"+""+";"+""+shieldName);
			System.out.println("レベル"+""+";"+""+ player.getLevel());
			System.out.println("体力"+""+";"+""+ player.getHp());
			System.out.println("力"+""+";"+""+ player.getPower());
			System.out.println("防御力"+""+";"+""+ player.getDef());
			System.out.println("-----所持品-----");
			
			i = 0;
			
			for(String[] currentItem : afterItem) {
					
				System.out.println(i + "." + "" +currentItem[0] + "" +":"+ "" + currentItem[3] );
				
				i++;
				
			}
			
			i = 0;
			
			while(b){
				
				System.out.println("装備したい装備の番号を入力してください。");
				int num = sc.nextInt();
				
				if(Integer.parseInt(afterItem[num][2]) <= 1009) {//アイテムIDが9以下は装備アイテムフィルター
					int filter = Integer.parseInt(afterItem[num][2]);
					
					if(filter == 1000 || filter == 1001 || filter == 1002 || filter == 1003) {//剣盾フィルター
						player.setWeapon(Integer.parseInt(afterItem[num][2]));
					}else {
						player.setShield(Integer.parseInt(afterItem[num][2]));
					}
					
					announce(afterItem[num][0] + "を装備しました！");
					
					b = false;
					
				}else {
					
					announce("それは装備できません。もう一度選択してください。");
					b = true;
					
				}
			}
			
		}else {//進行方向によって数字を付加
			
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
