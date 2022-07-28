package jankenRPG2;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class  Event extends MainContent{
	
	static String[] afterItems;//所持アイテムを表示する
	
	public static void item(Chara player , int secret) {
		
		Scanner sc = new Scanner(System.in);
		Random rnd = ThreadLocalRandom.current();
		int rndNum = rnd.nextInt(100);
		String yes = "y";
		String comment = null;
		
		if(rndNum < 60) {
			
			if(secret >= 3) {
				
				announce("竜殺しの宝箱があります。あけますか？y/n");
				
				if(yes.equals(sc.next())) {
					
					rndNum = rnd.nextInt(2);
					
					switch(rndNum) {
					case 0:
						comment = player.setItemBox(Item.ryuNoKen()[2]);
						
						if(comment != null) {
							announce(Item.ryuNoKen()[0] + "を手に入れた！");
						}else {
							announce(comment);
						}
					break;
					
					case 1:
						comment = player.setItemBox(Item.ryuNoTate()[2]);
						
						if(comment != null) {
							announce(Item.ryuNoTate()[0] + "を手に入れた！");
						}else {
							announce(comment);
						}
					break;
					}
				}
				
			}else {
				
				announce("銅の宝箱があります。あけますか？y/n");
				
				if(yes.equals(sc.next())) {
					
					rndNum = rnd.nextInt(6);
					
					switch(rndNum) {
					case 0:
						comment = player.setItemBox(Item.douNoTate()[2]);
						
						if(comment != null) {
							announce(Item.douNoTate()[0] + "を手に入れた！");
						}else {
							announce(comment);
						}
						
					break;
					
					case 1:
						announce("何もなかった残念！");
					break;
					
					case 2:
						comment = player.setItemBox(Item.kaifuku()[2]);
						
						if(comment != null) {
							announce(Item.kaifuku()[0] + "を手に入れた！");
						}else {
							announce(comment);
						}
					break;
					
					case 3:
						comment = player.setItemBox(Item.douNoKen()[2]);
						
						if(comment != null) {
							announce(Item.douNoKen()[0] + "を手に入れた！");
						}else {
							announce(comment);
						}
					break;
					
					case 4:
						comment = player.setItemBox(Item.kyouKaifuku()[2]);
						
						if(comment != null) {
							announce(Item.kyouKaifuku()[0] + "を手に入れた！");
						}else {
							announce(comment);
						}
					break;
					
					case 5:
						comment = player.setItemBox(Item.kyouKaifuku()[2]);
						
						if(comment != null) {
							announce(Item.kyouKaifuku()[0] + "を手に入れた！");
						}else {
							announce(comment);
						}
					break;
					}
				}
			}
			
		}else if(rndNum < 80){
			
				if(secret >= 3) {
					
					announce("竜殺しの宝箱があります。あけますか？y/n");
					rndNum = rnd.nextInt(2);
					
					switch(rndNum) {
						case 0:
							comment = player.setItemBox(Item.ryuNoKen()[2]);
							
							if(comment != null) {
								announce(Item.ryuNoKen()[0] + "を手に入れた！");
							}else {
								announce(comment);
							}
						break;
						
						case 1:
							comment = player.setItemBox(Item.ryuNoTate()[2]);
							
							if(comment != null) {
								announce(Item.ryuNoTate()[0] + "を手に入れた！");
							}else {
								announce(comment);
							}
						break;
						
					}
					
				}else {
					announce("銀の宝箱があります。あけますか？y/n");
					
					if(yes.equals(sc.next())) {
						
						rndNum = rnd.nextInt(6);
						
						switch(rndNum) {
						case 0:
							comment = player.setItemBox(Item.ginNoTate()[2]);
							
							if(comment != null) {
								announce(Item.ginNoTate()[0] + "を手に入れた！");
							}else {
								announce(comment);
							}
							
						break;
						
						case 1:
							announce("何もなかった残念！");
						break;
						
						case 2:
							comment = player.setItemBox(Item.kaifuku()[2]);
							
							if(comment != null) {
								announce(Item.kaifuku()[0] + "を手に入れた！");
							}else {
								announce(comment);
							}
						break;
						
						case 3:
							comment = player.setItemBox(Item.ginNoKen()[2]);
							
							if(comment != null) {
								announce(Item.ginNoKen()[0] + "を手に入れた！");
							}else {
								announce(comment);
							}
						break;
						
						case 4:
							comment = player.setItemBox(Item.kyouKaifuku()[2]);
							
							if(comment != null) {
								announce(Item.kyouKaifuku()[0] + "を手に入れた！");
							}else {
								announce(comment);
							}
						break;
						
						case 5:
							comment = player.setItemBox(Item.gekiKyouKaifuku()[2]);
							
							if(comment != null) {
								announce(Item.gekiKyouKaifuku()[0] + "を手に入れた！");
							}else {
								announce(comment);
							}
						break;
						}
					}
				}
		}else if(rndNum <= 100){
			
			announce("金の宝箱があります。あけますか？y/n");
			
			if(yes.equals(sc.next())) {
				
				rndNum = rnd.nextInt(6);
				
				switch(rndNum) {
					case 0:
						comment = player.setItemBox(Item.kinNoTate()[2]);
						
						if(comment != null) {
							announce(Item.kinNoTate()[0] + "を手に入れた！");
						}else {
							announce(comment);
						}
						
					break;
					
					case 1:
						announce("何もなかった残念！");
					break;
					
					case 2:
						comment = player.setItemBox(Item.kyouKaifuku()[2]);
						
						if(comment != null) {
							announce(Item.kyouKaifuku()[0] + "を手に入れた！");
						}else {
							announce(comment);
						}
					break;
					
					case 3:
						comment = player.setItemBox(Item.kinNoKen()[2]);
						
						if(comment != null) {
							announce(Item.kinNoKen()[0] + "を手に入れた！");
						}else {
							announce(comment);
						}
					break;
					
					case 4:
						comment = player.setItemBox(Item.gekiKyouKaifuku()[2]);
						
						if(comment != null) {
							announce(Item.gekiKyouKaifuku()[0] + "を手に入れた！");
						}else {
							announce(comment);
						}
					break;
					
					case 5:
						comment = player.setItemBox(Item.gekiKyouKaifuku()[2]);
						
						if(comment != null) {
							announce(Item.gekiKyouKaifuku()[0] + "を手に入れた！");
						}else {
							announce(comment);
						}
					break;
					
					
				}
		
			}
			
		
		}
		
	}
	
	public static void battle(Chara player) {
		
		Random rnd = ThreadLocalRandom.current();
		Chara enemy; 
	
		String select = "a";
		
		int actionNum = 0;//プレイヤーの攻撃種類
		int result = 0;//じゃんけんの結果
		int rndNum = rnd.nextInt(3);//エネミーの攻撃種類
		int enemyNum = rnd.nextInt(100) + 1;//エネミー出現ランダム選定
		int escape = 0;//けむり玉用
		
		
		
		boolean b = true;
		
		//出現する敵をランダム選択。
		if(player.getLast() == 100) {//ラスボス
			
			enemy = new Chara(5);
			
		}else {
			
			if(enemyNum < 50 || player.getLevel() < 3) {
				
				if( player.getLevel() > 10 && player.getEneId() == 4) {
					
					enemy = new Chara(4);//ゴブリン
					
				}else {
					
					enemy = new Chara(0);//ドラゴン
				}
				
			}else if (enemyNum < 70) {
				
				enemy = new Chara(1);//オーク
			
				
			}else if (enemyNum < 90) {
				
				enemy = new Chara(2);//トロール
				
				
			}else {
				
				enemy = new Chara(3);//ミニドラゴン
				
			}
			
			announce(enemy.getName()+"が現れた！！");
			
		}
		
		int maxHpEne = enemy.getHp();
		int maxHpPla = player.getHp();
		int magicAtk = 0;
		int magicCounter = 0;
		int shieldCounter = 0;
		
		while(b){//戦闘繰り返し
			
			magicAtk = 0;
			
			Scanner sc = new Scanner(System.in);
			System.out.println("-------------------------------------------");
			System.out.println(enemy.getName()+""+"【体力】"+"："+ enemy.getHp() + "/" + maxHpEne );
			System.out.println("-------------------------------------------");
			System.out.println(player.getName() + "" + "【体力】" + "：" + player.getHp() + "/" + maxHpPla + "" + "【攻撃力】" + player.getAtk() + "" + "【防御力】" + player.getDef() + "" +"【Lv】" + player.getLevel() );
			System.out.println("-------------------------------------------");
			
			announce("攻撃しますか？/q アイテムを使いますか？/w");
			select = sc.next();
			
			if(select.equals("q")){//攻撃パターン
				
				b = true;
						
				System.out.println("剣で攻撃 (q)　盾で防ぐ (w)　魔法で攻撃 (e)");
				
				
				select = sc.next();
				
				if(select.equals("q") || select.equals("w") || select.equals("e")) {//コマンドが正しいかチェック。
						
					switch(select) {
					
						case "q"://剣アクション
					
							if(enemy.getEneId() == 5) {
								
								actionNum = 1;
								rndNum = rnd.nextInt(4)+1;
								
								
							}else {
								
								actionNum = 1;
								rndNum = rnd.nextInt(3)+1;
								
							}
							break;
						
						case "w"://盾アクション
							
							if(enemy.getEneId() == 5) {
								
								actionNum = 2;
								rndNum = rnd.nextInt(4)+1;
	
							}else {
								
								actionNum = 2;
								rndNum = rnd.nextInt(3)+1;
	
							}
							
							break;
							
						case "e"://魔法アクション
							
							if(enemy.getEneId() == 5) {
								
								actionNum = 3;
								rndNum = rnd.nextInt(4)+1;
								
							}else {
								
								actionNum = 3;
								rndNum = rnd.nextInt(3)+1;
							}
							
							magicAtk = 1;
							
							break;
							
						default:
							
							announce("コマンドが適切ではありません。再度入力してください。");
							b = true;
							
							break;
					}
					
					result = janken(actionNum,rndNum);//じゃんけんの結果を返す
				
					
					int d = 0;
			
					if(result == 1) {
						//相手にダメージを与えて、０じゃないならターンを繰り返す。
						
						if(magicAtk == 1) {//魔法の効果
							magicCounter ++;
							double magicD = 0;
							announce("魔法の攻撃は相手の防御を貫通します！");
							announce("魔法の力が高まっていくのを感じる！");
							magicD = player.getAtk() * (magicCounter * 1.5);
							d = (int)Math.ceil(magicD);
							
						}else if(player.getWeapon() == 1003 && (enemy.getEneId() == 4 || enemy.getEneId() == 5)){
							announce("ドラゴンに対して竜殺しの剣が反応します！");
							announce("驚異的なダメージを与えます！");
							d = player.getAtk() * 3;
							
						}else {	
							d = totalDamage(player.getAtk(),enemy.getDef());
							
						}
						
						enemy.setHp(enemy.getHp() - d);
						announce(enemy.getName()+"に"+ d +"ダメージを与えました。");
						
						if(enemy.getHp() <= 0) {//HPが0以下になるなら0にする
							enemy.setHp(0);
						}
						
					}else if(result == 2){
						//自分がダメージを受けて、０じゃないならターンを繰り返す。
						
						d = totalDamage(enemy.getAtk(),player.getDef());
							
						announce(enemy.getName()+"から"+d+"ダメージを受けました。");
						player.setHp(player.getHp() - d);
						
						if(player.getHp() <= 0) {
							player.setHp(0);
						}
						
						
					}else if(result == 3) {
						//盾でダメージを防ぐ、ターンを繰り返す。
						if(shieldCounter == 0) {
							announce(enemy.getName()+"からの攻撃を防ぎました！");
						}else {
							announce("さらに"+enemy.getName()+"からの攻撃を防ぎました！相手の攻撃を跳ね返します！");
							d = enemy.getAtk() * (shieldCounter * 2);
							announce(enemy.getName()+"に"+ totalDamage(d,enemy.getDef()) +"ダメージを与えました。");
							
						}
						
					}else if(result == 4) {
						//自分の攻撃が防がれる、竜殺しの剣を持ってないなら貫通イベントは無し、ターンを繰りかえす。
						
						announce(enemy.getName()+"に攻撃を防がれました！");
						
						if(player.getWeapon() == 1003) {
							//竜殺しの剣イベント
							announce("竜殺し剣が相手のガードを貫きます！");
							
							d = (int)Math.ceil((double)player.getAtk()/2);
							
							enemy.setHp(enemy.getHp() - d);
							announce(enemy.getName()+"に"+ d +"ダメージを与えました。");
							
							if(enemy.getHp() <= 0) {//HPが0以下になるなら0にする
								enemy.setHp(0);
							}
						}
						
					}else {//ドラゴンスキル
					
						
						if(enemy.getEneId() == 5) {
							
							switch(result) {
							
								case 5:
									announce("ドラゴン超の生命力が活性化します！体力を20回復！");
								
									if(enemy.getHp()+20 > maxHpEne) {
										enemy.setHp(maxHpEne);
									}else {
										enemy.setHp(enemy.getHp()+20);
									}
									
									break;
									
								case 6:
									announce("ドラゴンブレス！！問答無用の30ダメージ！！");
							
									player.setHp(player.getHp() - 30);
									
									if(player.getHp() < 0) {
										
										player.setHp(0);
										
									}
										
									break;
									
								case 7:
									announce("ドラゴンの怒りが攻撃力を高めます！");
									
									enemy.setEneAtk(enemy.getAtk() + 10);
									break;
									
								case 8:
									announce("ドラゴンの怒りが鱗の強度を高めます！");
										
									enemy.setDef(enemy.getDef() + 5);
									break;
									
								case 9:announce("ドラゴンが怒り狂っています！");
								
								break;
								
								case 0:announce("お互いに攻撃を躱しました！");
								
								break;
							}
							
						}else {
							
							announce("お互いに攻撃を躱しました！");
							
						}
						
						if(result != 3) {//盾連続イベント初期化
							
							shieldCounter = 0;
							
						}
						
					}
						
				}
					
				
			}else if(select.equals("w")){//アイテムパターン
				
				
				String[] myItems = player.getItemBox();
				b = true;
				
				int i = 0;
				int itemCount = 0;
					
				for(String j : myItems) {//装備品以外の所持してるアイテム数を確認
					
					if( j != null) {//まずnullフィルター
						
						if(Integer.parseInt(j) >= 10010){
							
							itemCount++;
							
						}
					}
				}
				
				String[] array = new String[itemCount]; 
				
				setAfterItems(array);
				
				int j  = 0;
				for(i = 0; i < myItems.length; i++) {//配列を整理してアイテムのみの配列を生成	
					
					if(myItems[i] != null) {
						
						if(Integer.parseInt(myItems[i]) >= 10010) {
							
							afterItems[j] = myItems[i];
							j++;
							
						}
					}
						
					
				}
				
				while(b){
					
					System.out.println("使用できるアイテムを表示します。使用するアイテムを番号で入力してください。");
					System.out.println("--------------------------------------------------------------------------");
					
					int k = 0;
				
					for(String selectItem : afterItems) {//コンソールに表示
						
						String[] item = search(selectItem);
						
						System.out.println(k + "" + ":" + "" + item[0] + "" + ":" + "" + item[3]);
						
						k++;
						
					}
					
					System.out.println(100+":"+"戻る");
				
					String answer = null;	
					
							
						
					try {
						
						answer = sc.next();
						b = false;
						
					}catch(Exception e) {	
						
						announce("入力が間違っています。");
						
						b = true;
						
					}
					
					
						
					
						
					if(answer.equals("100")) {
						
						announce("選択に戻ります。");
						b = false;
						
					}else {
						
						int an = 0;
						
						try {
							an = Integer.parseInt(answer);
							b = true;
						}catch(Exception e) {
							b = false;
						}
						
						if(b){//入力が正しいか確認
							
							String[] item = new String[4];
							
							if(an <= afterItems.length - 1) {//配列内の数字か確認
								
								item = search(afterItems[an]);//アイテムの表示IDから検索。
													
								
								if(Integer.parseInt(item[2]) <= 10012) {//回復系アイテム処理
									
									announce(item[0] + "を使います。HPを" + item[1] + "回復します");
									player.setHp(player.getHp() + Integer.parseInt(item[1]));
									
									if(player.getHp() > maxHpPla) {
										
										player.setHp(maxHpPla);
									}
									
									b = false;
									
								}else {//それ以外のアイテム処理
									
									switch(Integer.parseInt(item[2])) {
									
										case 10013://爆弾
												announce(item[0] + "を使います。" + enemy.getName() + "に" + item[1] + "ダメージを与えます");
												enemy.setHp(enemy.getHp() - Integer.parseInt(item[1]));
												
												if(enemy.getHp() > maxHpEne) {
													enemy.setHp(maxHpEne);
												}
												b = false;
										break;
											
										case 10014://けむり玉
											
												announce(item[0] + "を使います。戦闘から逃げます。");
												
												announce("・・・");
												announce("・・・");
												
												if(enemy.getEneId() == 5) {
													
													announce("この相手からは逃げられない！！");
													b = true;
													
												}else {
													
													announce("逃げ切った！");
													b = false;
													escape = 1;
													
												}
										break;
									}//switch
									
								}//else
								
							}//配列内の数字確認用
							try {
								player.delItemBox(Integer.parseInt(item[2]));//使ったアイテムを削除する処理
								
							}catch(Exception e) {
								
								announce("アイテムの番号が間違っています。再度入力してください。");
								
								b = true;
							}
							
						}else {
							
							announce("アイテムの番号が間違っています。再度入力してください。");
							
							
							b = true;
							
						}	
					
					}//else	
				
				}//while Item用	
						
			}else {
				announce("入力が間違っています");
				b = true;
			}
			
			if(enemy.getHp() == 0 || player.getHp() == 0) {//倒す、倒されるイベント
				
				if(enemy.getHp() == 0) {//敵のHP0
					
					if(enemy.getEneId() == 4) {
						
						announce("ドラゴンを倒しました！おめでとうございます！");
						
						player.setLast(100);
						
					}else if(enemy.getEneId() == 5) {
						
						announce("完全勝利しました！おめでとうございます！");
						
						player.setLast(1000);
						
					}else {
						
					
					}
					
					if(enemy.getEneId() != 5) {
						
						player.setHp(maxHpPla);
						
						announce("魔物を倒しました！"+ player.getName() +"のレベルが上がります！");	
						announce(player.getLevel() + "→" + ( player.getLevel() + 1));
						
						player.setLevel(player.getLevel() + 1);
					
					}
					
					b = false;
					
				}else {//自分のHP0
					
					announce("致命的なダメージを受けました。G A M E O V E R ");
					b = false;
				}
			
			}else {//どちらのHPが0ではない時、繰り返す
				
				b = true;
			}
			
			if(escape == 1) {//けむり玉を使う。
				
				b = false;
			}
			
			
			
		}//while(1)
	}
			
	
	public static int janken(int p ,int e) {
	//1=剣　2=盾　3=魔法
		int judge = 0;
		Random rnd = ThreadLocalRandom.current();
		int rndNum = rnd.nextInt(5)+5;
		
		if(p == e) {
			
			judge = 0;//あいこ
			
		}else {
			if(p == 1) {
				switch(e) {
					case 2: judge = 4;//ダメージ防がれる
					break;
					case 3: judge = 1;//ダメージ与える
					break;
					case 4: judge = rndNum;//ドラゴンスキル
						break;
					
				}
			}
			if(p == 2) {
				switch(e) {
					case 1: judge = 3;//ダメージ防ぐ
					break;
					case 3: judge = 2;//ダメージ受ける
					break;
					case 4: judge = rndNum;//ドラゴンスキル
					break;
					
				}
			}
			if(p == 3) {
				switch(e) {
					case 1: judge = 2;//ダメージ受ける
					break;
					case 2: judge = 1;//ダメージ与える
					break;
					case 4: judge = rndNum;//ドラゴンスキル
					break;
					
				}
			}
			//0= あいこ　1= ダメージを与える　2=　ダメージを受ける　3= ダメージを防ぐ　 4= ダメージを防がれる
		}
		return judge;
		
		
	}
	
	public static String[] search(String search) {//アイテム検索
		
		String[][] itemBook = Item.itemBook();//アイテム図鑑
		String[] result = new String[4];
		
		if(search.equals("100")) {//装備品がない場合の処理
			
			result[2] = search;
			
		}else {
			
			for(int i = 0; i < itemBook.length ; i ++ ) {
				
				for(int j = 0 ; j < 4 ; j++) {
					
					if(itemBook[i][j].equals(search)) {
						
						for(int k = 0; k < 4; k++) {
							
							result[k] = itemBook[i][k];
							
						}
					}
				}
			}
		}
		return result;
		
	}
	
	public static int totalDamage(int atk, int def) {
		
		int total = atk - def;
		
		if(total < 0) {
			total = 0;
		}
		
		return total;
	}

	public static String[] getAfterItems() {
		
		return afterItems;
	}

	public static void setAfterItems(String[] a) {
		
		afterItems = a;
		
	}
	
	
	
}
