package jankenRPG2;

public class Item {
	
	public static String[][] itemBook(){
		String[][] itemBook = new String[13][4];
		
		itemBook[0] = douNoKen();
			
		itemBook[1] = ginNoKen();
		
		itemBook[2] = kinNoKen();
	
		itemBook[3] = ryuNoKen();
	
		itemBook[4]= douNoTate();
			
		itemBook[5] = ginNoTate();

		itemBook[6] = kinNoTate();
		
		itemBook[7] = ryuNoTate();
		
		itemBook[8] = kaifuku();
		
		itemBook[9] = kyouKaifuku();
		
		itemBook[10] = gekiKyouKaifuku();
				
		itemBook[11] = bom();
		
		itemBook[12] = kemuriDama();
		
		
		
		return itemBook;
		
	}
	
	public static String[] douNoKen() {
		String[] item = {"銅の剣","1","1000","装備すると攻撃力が1上がる"};
		return item;
		
	}
	public static String[] ginNoKen() {
		String[] item = {"銀の剣","2","1001","装備すると攻撃力が2上がる"};
		return item;
	}
	public static String[] kinNoKen() {
		String[] item = {"金の剣","8","1002","装備すると攻撃力が4上がる"};
		return item;
	}
	public static String[] ryuNoKen() {
		String[] item = {"竜殺しの剣","20","1003","装備すると攻撃力が20上がる"};
		return item;
	}
	public static String[] douNoTate() {
		String[] item = {"銅の盾","1","1004","装備すると防御力が1上がる"};
		return item;
	}
	public static String[] ginNoTate() {
		String[] item = {"銀の盾","2","1005","装備すると防御力が2上がる"};
		return item;
	}
	public static String[] kinNoTate() {
		String[] item = {"金の盾","3","1006","装備すると防御力が3上がる"};
		return item;
	}
	public static String[] ryuNoTate() {
		String[] item = {"竜殺しの盾","10","1007","装備すると防御力が10上がる"};
		return item;
	}
	public static String[] kaifuku() {
		String[] item = {"回復薬","3","10010","体力を3回復する"};
		return item;
	}
	public static String[] kyouKaifuku() {
		String[] item = {"強回復薬","6","10011","体力を6回復する"};
		return item;
	}
	public static String[] gekiKyouKaifuku() {
		String[] item = {"激強回復薬","12","10012","体力を12回復する"};
		return item;
	}
	public static String[] bom() {
		String[] item = {"爆弾","20","13","相手に２０ダメージ与える"};
		return item;
	}
	public static String[] kemuriDama() {
		String[] item = {"けむり玉","2222","10014","戦闘から逃げられる"};
		return item;
	}



}
