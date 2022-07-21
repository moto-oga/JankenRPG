package jankenRPG;

public class Item {
	
	public static String[][] itemBook(){
		String[][] itemBook = new String[13][4];
		
		itemBook[0][0] = douNoKen()[0];
		itemBook[0][1] = douNoKen()[1];
		itemBook[0][2] = douNoKen()[2];
		itemBook[0][3] = douNoKen()[3];
		
		itemBook[1][0] = ginNoKen()[0];
		itemBook[1][1] = ginNoKen()[1];
		itemBook[1][2] = ginNoKen()[2];
		itemBook[1][3] = ginNoKen()[3];
		
		itemBook[2][0] = kinNoKen()[0];
		itemBook[2][1] = kinNoKen()[1];
		itemBook[2][2] = kinNoKen()[2];
		itemBook[2][3] = kinNoKen()[3];
		
		itemBook[3][0] = ryuNoKen()[0];
		itemBook[3][1] = ryuNoKen()[1];
		itemBook[3][2] = ryuNoKen()[2];
		itemBook[3][3] = ryuNoKen()[3];
		
		itemBook[4][0] = douNoTate()[0];
		itemBook[4][1] = douNoTate()[1];
		itemBook[4][2] = douNoTate()[2];
		itemBook[4][3] = douNoTate()[3];
		
		itemBook[5][0] = ginNoTate()[0];
		itemBook[5][1] = ginNoTate()[1];
		itemBook[5][2] = ginNoTate()[2];
		itemBook[5][3] = ginNoTate()[3];
		
		itemBook[6][0] = kinNoTate()[0];
		itemBook[6][1] = kinNoTate()[1];
		itemBook[6][2] = kinNoTate()[2];
		itemBook[6][3] = kinNoTate()[3];
		
		itemBook[7][0] = ryuNoTate()[0];
		itemBook[7][1] = ryuNoTate()[1];
		itemBook[7][2] = ryuNoTate()[2];
		itemBook[7][3] = ryuNoTate()[3];
		
		itemBook[8][0] = kaifuku()[0];
		itemBook[8][1] = kaifuku()[1];
		itemBook[8][2] = kaifuku()[2];
		itemBook[8][3] = kaifuku()[3];
		
		itemBook[9][0] = kyouKaifuku()[0];
		itemBook[9][1] = kyouKaifuku()[1];
		itemBook[9][2] = kyouKaifuku()[2];
		itemBook[9][3] = kyouKaifuku()[3];
		
		itemBook[10][0] = gekiKyouKaifuku()[0];
		itemBook[10][1] = gekiKyouKaifuku()[1];
		itemBook[10][2] = gekiKyouKaifuku()[2];
		itemBook[10][3] = gekiKyouKaifuku()[3];
		
		itemBook[11][0] = bom()[0];
		itemBook[11][1] = bom()[1];
		itemBook[11][2] = bom()[2];
		itemBook[11][3] = bom()[3];
		
		itemBook[12][0] = kemuriDama()[0];
		itemBook[12][1] = kemuriDama()[1];
		itemBook[12][2] = kemuriDama()[2];
		itemBook[12][3] = kemuriDama()[3];
		
		return itemBook;
		
	}
	
	public static String[] douNoKen() {
		String[] item = {"銅の剣","1","0","装備すると攻撃力が1上がる"};
		return item;
		
	}
	public static String[] ginNoKen() {
		String[] item = {"銀の剣","2","1","装備すると攻撃力が2上がる"};
		return item;
	}
	public static String[] kinNoKen() {
		String[] item = {"金の剣","4","2","装備すると攻撃力が4上がる"};
		return item;
	}
	public static String[] ryuNoKen() {
		String[] item = {"竜殺しの剣","20","3","装備すると攻撃力が20上がる"};
		return item;
	}
	public static String[] douNoTate() {
		String[] item = {"銅の盾","1","4","装備すると防御力が1上がる"};
		return item;
	}
	public static String[] ginNoTate() {
		String[] item = {"銀の盾","2","5","装備すると防御力が2上がる"};
		return item;
	}
	public static String[] kinNoTate() {
		String[] item = {"金の盾","3","6","装備すると防御力が3上がる"};
		return item;
	}
	public static String[] ryuNoTate() {
		String[] item = {"竜殺しの盾","10","7","装備すると防御力が10上がる"};
		return item;
	}
	public static String[] kaifuku() {
		String[] item = {"回復薬","3","10","体力を3回復する"};
		return item;
	}
	public static String[] kyouKaifuku() {
		String[] item = {"強回復薬","6","11","体力を6回復する"};
		return item;
	}
	public static String[] gekiKyouKaifuku() {
		String[] item = {"劇強回復薬","12","12","体力を12回復する"};
		return item;
	}
	public static String[] bom() {
		String[] item = {"爆弾","20","13","相手に２０ダメージ与える"};
		return item;
	}
	public static String[] kemuriDama() {
		String[] item = {"けむり玉","2222","14","戦闘から逃げられる"};
		return item;
	}



}
