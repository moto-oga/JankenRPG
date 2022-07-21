package jankenRPG;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Event extends MainContent{
	
	public static String item(int secret) {
		
		Scanner sc = new Scanner(System.in);
		Random rnd = ThreadLocalRandom.current();
		int rndNum = rnd.nextInt(100);
		String yes = "y";
		String getItem = null;
		
		if(rndNum < 60) {
			if(secret >= 3) {
				
				announce("竜殺しの宝箱があります。あけますか？y/n");
				
				if(yes.equals(sc.next())) {
					
					rndNum = rnd.nextInt(2);
					
					switch(rndNum) {
						case 0:
							announce(Item.ryuNoTate()[0] + "を手に入れた！");
							getItem = Item.ryuNoTate()[2];
						break;
						
						case 1:
							announce(Item.ryuNoKen()[0] + "を手に入れた！");
							getItem = Item.ryuNoKen()[2];
						break;
						
					}
				}
				
			}else {
				
				announce("銅の宝箱があります。あけますか？y/n");
				
				if(yes.equals(sc.next())) {
					
					rndNum = rnd.nextInt(8);
					
					switch(rndNum) {
						case 0:
							announce(Item.douNoTate()[0] + "を手に入れた！");
							getItem = Item.douNoTate()[2];
						break;
						
						case 1:
							announce("何もなかった残念！");
						break;
						
						case 2:
							announce(Item.douNoKen()[0] + "を手に入れた！");
							getItem = Item.douNoKen()[2];
						break;
						
						case 3:
							announce(Item.douNoTate()[0] + "を手に入れた！");
							getItem = Item.douNoTate()[2];
						break;
						
						case 4:
							announce(Item.douNoKen()[0] + "を手に入れた！");
							getItem = Item.douNoKen()[2];
						break;
						
						case 5:
							announce(Item.douNoTate()[0] + "を手に入れた！");
							getItem = Item.douNoTate()[2];
						break;
						
						case 6:
							announce(Item.kaifuku()[0] + "を手に入れた！");
							getItem = Item.kaifuku()[2];
						break;
						
						case 7:
							announce(Item.ginNoKen()[0] + "を手に入れた！");
							getItem = Item.ginNoKen()[2];
						break;
					}
				}
			}
			
		}else if(rndNum < 80){
			
				if(secret >= 3) {
					
					announce("竜殺しの宝箱があります。あけますか？y/n");
					rndNum = rnd.nextInt(8);
					
					switch(rndNum) {
						case 0:
							announce(Item.ryuNoTate()[0] + "を手に入れた！");
							getItem = Item.ryuNoTate()[2];
						break;
						
						case 1:
							announce(Item.ryuNoKen()[0] + "を手に入れた！");
							getItem = Item.ryuNoKen()[2];
						break;
						
					}
				}else {
					announce("銀の宝箱があります。あけますか？y/n");
					
					if(yes.equals(sc.next())) {
						
						rndNum = rnd.nextInt(8);
						
						switch(rndNum) {
							case 0:
								announce(Item.ginNoTate()[0] + "を手に入れた！");
								getItem = Item.ginNoTate()[2];
							break;
							
							case 1:
								announce("何もなかった残念！");
							break;
							
							case 2:
								announce(Item.ginNoKen()[0] + "を手に入れた！");
								getItem = Item.ginNoKen()[2];
							break;
							
							case 3:
								announce(Item.ginNoTate()[0] + "を手に入れた！");
								getItem = Item.ginNoTate()[2];
							break;
							
							case 4:
								announce(Item.ginNoKen()[0] + "を手に入れた！");
								getItem = Item.ginNoKen()[2];
							break;
							
							case 5:
								announce(Item.ginNoTate()[0] + "を手に入れた！");
								getItem = Item.ginNoTate()[2];
							break;
							
							case 6:
								announce(Item.kaifuku()[0] + "を手に入れた！");
								getItem = Item.kaifuku()[2];
							break;
							
							case 7:
								announce(Item.bom()[0] + "を手に入れた！");
								getItem = Item.bom()[2];
								
							break;
						}
					}
				}
		}else if(rndNum <= 100){
			
			announce("金の宝箱があります。あけますか？y/n");
			
			if(yes.equals(sc.next())) {
				
				rndNum = rnd.nextInt(8);
				
				switch(rndNum) {
					case 0:
						announce(Item.kinNoTate()[0] + "を手に入れた！");
						getItem = Item.kinNoTate()[2];
					break;
					
					case 1:
						announce("何もなかった残念！");
					break;
					
					case 2:
						announce(Item.kinNoKen()[0] + "を手に入れた！");
						getItem = Item.kinNoKen()[2];
					break;
					
					case 3:
						announce(Item.kinNoTate()[0] + "を手に入れた！");
						getItem = Item.kinNoTate()[2];
					break;
					
					case 4:
						announce(Item.kinNoKen()[0] + "を手に入れた！");
						getItem = Item.kinNoKen()[2];
					break;
					
					case 5:
						announce(Item.kinNoTate()[0] + "を手に入れた！");
						getItem = Item.kinNoTate()[2];
					break;
					
					case 6:
						announce(Item.kyouKaifuku()[0] + "を手に入れた！");
						getItem = Item.kyouKaifuku()[2];
					break;
					
					case 7:
						announce(Item.kyouKaifuku()[0] + "を手に入れた！");
						getItem = Item.kyouKaifuku()[2];
						
					break;
					case 8:
						announce(Item.gekiKyouKaifuku()[0] + "を手に入れた！");
						getItem = Item.gekiKyouKaifuku()[2];
						
					break;
				}
			}else {
				announce(Item.ryuNoKen()[0] + "を手に入れた！");
				getItem = Item.ryuNoKen()[2];
			}
			
		
		}
		
		
		return getItem;
		
		
	}
	
	public static int[] battle(String[] itemBox,int[] chara,String name,Chara charaItem) {
		
		Random rnd = ThreadLocalRandom.current();
		Enemy ene = new Enemy();
	
		String select = "a";
		String sord = "q";
		String shield = "w";
		String magic = "e";
		
		int actionNum = 0;
		int result = 0;
		int rndNum = rnd.nextInt(3);
		int enemy = rnd.nextInt(100) + 1;
		int escape = 0;
		
		boolean b = true;
	//do {
		if(charaItem.getLast() == 100) {
			ene.doragonRevo();
			announce(ene.getName()+"が現れた！！");
		}else {
			if(enemy < 50 || chara[2] < 3) {
				
				if(chara[2] > 10 && chara[6] == 1) {
					
					ene.doragon();
					announce(ene.getName()+"が現れた！！");
					
				}else {
					
					ene.goburin();
					announce(ene.getName()+"が現れた！！");
					
				}
				
			}else if (enemy < 70) {
				
				ene.ohk();
				announce(ene.getName()+"が現れた！！");
				
			}else if (enemy < 90) {
				
				ene.toroll();
				announce(ene.getName()+"が現れた！！");
				
			}else {
				
				ene.miniDoragon();
				announce(ene.getName()+"が現れた！！");
				
			}
		}
		int maxHpEne = ene.getHp();
		int maxHpPla = chara[5];
		int magicAtk = 0;
		
		do {
			 magicAtk = 0;
			Scanner sc = new Scanner(System.in);
			announce("-------------------------------------------");
			System.out.println(ene.getName()+""+"【体力】"+"："+ene.getHp()+"/"+maxHpEne);
			System.out.println("-------------------------------------------");
			System.out.println(name+""+"【体力】"+"："+chara[5]+"/"+maxHpPla+""+"【攻撃力】"+chara[3]+""+"【防御力】"+chara[4]+""+"【Lv】" +chara[2]);
			System.out.println("-------------------------------------------");
			
			announce("攻撃しますか？アイテムを使いますか？a/i");
			select = "a";
			String mySelect = sc.next();
			if(select.equals(mySelect)) {
				do {
					do {
						System.out.println("剣で攻撃 (q) ");
						System.out.println("盾で防ぐ (w) ");
						System.out.println("魔法で攻撃 (e) ");
						
						select = sc.next();
						
						if(select.equals("q") || select.equals("w") || select.equals("e")) {//コマンドが正しいかチェック。
								
							if(sord.equals(select)) {//剣アクション
								
								
								
								if(ene.getId() == 5) {
									actionNum = 1;
									rndNum = rnd.nextInt(4);
									
									result = janken(actionNum,(rndNum+1));
									
									b = false;
									
								}else {
									actionNum = 1;
									rndNum = rnd.nextInt(3);
									
									result = janken(actionNum,(rndNum+1));
									
									b = false;
								}
								
							}else if(shield.equals(select)) {//盾アクション
								
								
								
								if(ene.getId() == 5) {
									actionNum = 2;
									rndNum = rnd.nextInt(5);
									
									result = janken(actionNum,(rndNum+1));
									
									b = false;
								}else {
									actionNum = 2;
									rndNum = rnd.nextInt(3);
									
									result = janken(actionNum,(rndNum+1));
									
									b = false;
								}
								
							}else if(magic.equals(select)) {//魔法アクション
								
								magicAtk = 1;
								
								
								if(ene.getId() == 5) {
									actionNum = 3;
									rndNum = rnd.nextInt(5);
									
									result = janken(actionNum,(rndNum+1));
									
									b = false;
								}else {
									actionNum = 3;
									rndNum = rnd.nextInt(3);
									
									result = janken(actionNum,(rndNum+1));
									
									b = false;
								}
								
							}else {
								
								//一応elseを置いてある
								
							}
							
						}else {
							announce("コマンドが適切ではありません。再度入力してください。");
							b = true;
						}
						
					}while(b);
					
					b = false;
					if(result == 1) {
						//相手にダメージを与えて、０じゃないならターンを繰り返す。
						if(magicAtk == 1) {
							announce("魔法の攻撃は相手の防御を貫通します！");
							announce(ene.getName()+"に"+chara[3]+"ダメージを与えました。");
						}else {
							int damageP = chara[3] - ene.getDef();
							announce(ene.getName()+"に"+damageP+"ダメージを与えました。");
							ene.setHp(ene.getHp() - damageP);
							
							if(ene.getHp() <= 0) {
								ene.setHp(0);
							}
						}
						
					}else if(result == 2){
						//自分がダメージを受けて、０じゃないならターンを繰り返す。
						
							announce(ene.getName()+"から"+(ene.getAtk() - chara[4])+"ダメージを受けました。");
							chara[5] = chara[5] - (ene.getAtk() - chara[4]);
							if(chara[5] <= 0) {
								chara[5] = 0;
							}
						
						
					}else if(result == 3) {
						//盾でダメージを防ぐ、ターンを繰り返す。
						announce(ene.getName()+"からの攻撃を防ぎました！");
					}else if(result == 4) {
						//自分の攻撃が防がれる、竜殺しの剣を持ってないなら貫通イベントは無し、ターンを繰りかえす。
						
						announce(ene.getName()+"に攻撃を防がれました！");
						if(chara[0] == 3) {
							//竜殺しの剣イベント
						}
					}else {
						
						if(ene.getId() == 5) {
							switch(result) {
							case 5:announce("ドラゴン超の生命力が活性化します！体力を20回復！");
							
								if(ene.getHp()+20 > maxHpEne) {
									ene.setHp(maxHpEne);
								}else {
									ene.setHp(ene.getHp()+20);
								}
								
								break;
								
							case 6:announce("ドラゴンブレス！！問答無用の30ダメージ！！");
							
									chara[5] = chara[5] - 30;
									
									if(chara[5] <= 0) {
										
										chara[5] = 0;
										
									}
									
								break;
								
							case 7:announce("ドラゴンの怒りが攻撃力を高めます！");
									ene.setAtk(ene.getAtk() + 10);
								break;
								
							case 8:announce("ドラゴンの怒りが鱗の強度を高めます！");
									ene.setDef(ene.getDef() + 5);
								break;
								
							case 9:announce("ドラゴンが怒り狂っています！");
							
							break;
							}
						}else {
							
							announce("お互いに攻撃を躱しました！");
							
						}
						
						
					}
					
				}while(b);
				
			}else {
				
				
				String[] item = new String[10];
				int i = 0;
				int itemCount = 0;
				for(i = 0; i < itemBox.length;i++) {//剣盾以外のアイテムを選別する。
					
						
						
						if(itemBox[i] != null) {
							
							if(Integer.parseInt(itemBox[i]) >= 10) {
								
								item[itemCount] = itemBox[i];
								itemCount ++;
								
							}
						}
					
					
					if(i == (itemBox.length - 1) ) {//使用できるアイテムがあるかチェック。
						
						int nullCount = 0;
						
						for(int j = 0 ; j < item.length; j++) {
							
							if(item[j] == null) {
								nullCount ++;
							}
						}
						
						if(nullCount == item.length) {
							
							announce("使用できるアイテムはなかった。");
							
						}else {
							//使用できるアイテムが有るので使うアイテムを選択。
							
	//						List<String> list = new ArrayList<String>(Arrays.asList(item));
	//						
	//						list.remove(null);
	//						
	//						String[] item2 = (String[]) List.toArray(new String[list.size()]);
							
							String[] item2 = new String[item.length - nullCount];//使用できるアイテムのみの配列
							int l = 0;
							
							for(int k = 0; k < item.length ; k++) {
								
								if(item[k] != null) {
									
									item2[l] = item[k];
									l++;
									
								}
							}
							do {
								announce("使用できるアイテムを表示します。使用するアイテムを番号で入力してください。");
								announce("--------------------------------------------------------------------------");
								
								int k = 0;
								String[] itemId = new String[10];
							
								for(String selectItem : item2) {
									
									String[] item3 = search(selectItem);
									System.out.println(k+":"+item3[0]);
									
									itemId[k] = item3[2];
									k++;
									
								}
								System.out.println(100+":"+"戻る");
							
								int answer = 1000;
								do {
									try {
										
										answer = sc.nextInt();
										b = false;
										
									}catch(Exception e) {	
										announce("入力ルールが守られていません。エラーのためゲームを終了します。");
										sc.close();
										return chara;
									}
									
								}while(b);
									
								if(answer == 100) {
									
									announce("選択に戻ります。");
									b = false;
									
								}else {
								
									if(answer <= item2.length) {//入力が正しいか確認
										
										String[] item4 = search(itemId[answer]);//アイテムのIDから検索。
										charaItem.delItemBox(answer);								//アイテムを削除する処理を入れる
										int maxHp = chara[5];
										
										switch(Integer.parseInt(item4[2])) {
											case 10: 		
												
												announce(item4[0] + "を使います。HPを" + item4[1] + "回復します");
												chara[5] += Integer.parseInt(item[1]);
												
												if(chara[5] > maxHp) {
													chara[5] = maxHp;
												}
												b = false;
												break;
											case 11:
												announce(item4[0] + "を使います。HPを" + item4[1] + "回復します");
												chara[5] += Integer.parseInt(item[1]);
												
												if(chara[5] > maxHp) {
													chara[5] = maxHp;
												}
												b = false;
												break;
											case 12:
												announce(item4[0] + "を使います。HPを" + item4[1] + "回復します");
												chara[5] += Integer.parseInt(item[1]);
												
												if(chara[5] > maxHp) {
													chara[5] = maxHp;
												}
												b = false;
												break;
											case 13:
												announce(item4[0] + "を使います。HPを" + item4[1] + "回復します");
												chara[5] += Integer.parseInt(item[1]);
												
												if(chara[5] > maxHp) {
													chara[5] = maxHp;
												}
												b = false;
												break;
											case 14:
												announce(item4[0] + "を使います。戦闘から逃げます。");
												chara[5] += Integer.parseInt(item[1]);
												
												if(chara[5] > maxHp) {
													chara[5] = maxHp;
												}
												
												announce("・・・");
												announce("・・・");
												
												if(ene.getId() == 5) {
													announce("この相手からは逃げられない！！");
													b = true;
												}else {
													announce("逃げ切った！");
													b = false;
													escape = 1;
												}

												break;
												
												
										}
										
										
										
									}else {
										
										announce("アイテムの番号が間違っています。再度入力してください。");
										
										
										b = true;
										
									}
								}
								
							}while(b);
						}
					}
				}	
				
			}
			
			if(ene.getHp() == 0 || chara[5] == 0) {
				
				if(ene.getHp() == 0) {
					if(ene.getId() == 4) {
						
						announce("ドラゴンを倒しました！おめでとうございます！");
						
						chara[0] = 100;
						b = false;
					}else if(ene.getId() == 5) {
						announce("完全勝利しました！おめでとうございます！");
						chara[0] = 1000;
					}else {
						announce("魔物を倒しました！"+name+"のレベルが上がります！");
						announce(chara[2]+"→"+(chara[2] + 1));
						chara[2] = chara[2] + 1;
						chara[5] = maxHpPla;
						b = false;
					}
					
					
				}else {
					announce("致命的なダメージを受けました。G A M E O V E R ");
					b = false;
				}
				
			}else {
				
				b = true;
			}
			
			if(escape == 1) {
				
				b = false;
			}
			
		}while(b);//バトルの繰り返し。
		
	//}while(b);	
		
		return chara;
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
			//1= ダメージを与える　2=　ダメージを受ける　3= ダメージを防ぐ　 4= ダメージを防がれる
		}
		return judge;
		
		
	}
	
	public static String[] search(String search) {//アイテム検索
		
		String[][] itemBook = Item.itemBook();//アイテム図鑑
		String[] result = new String[4];
		
		if(search.equals("100")) {
			
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
	
	
	
}
