package jankenRPG2;

public class Chara{
	
	private String name;
	private String[] itemBox = new String[10];
	private int weapon;
	private int shield = 100;
	private int level = 1;
	private int power  = 1;
	private int weaponPower = 0;
	private int def = 0;
	private int atk;
	private int hp = 10;
	private int last = 0;
	private int eneId = 0;
	
	Chara(int ene){//エネミー用
		
		switch(ene) {
			case 0:
				
				setGoburin();
				
			break;
			
			case 1:
				
				setOhk();
				
			break;
			
			case 2:
				
				setToroll();
				
			break;
			
			case 3:
				
				setMiniDoragon();
				
			break;
			
			case 4:
				
				setDoragon();
				
			break;
			
			case 5:
				
				setDoragonRevo();
				
			break;
			
			default://何も値を入れずにインスタンスを生成
				
				
			break;
			
		}
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String[] getItemBox() {
		return itemBox;
	}
	public String setItemBox(String item) {
		
		int i = 0;
		int boxCount = itemBox.length;
		String comment = "";
		boolean b = true;
		
		do {
			if(itemBox[i] == null) {
				
				itemBox[i] = item;
				b = false;
				
			}else {
				
				b = true;
				i++;
			}
			
			boxCount--;
			
			if(boxCount == 0) {
				
				b = true;
				comment = "リュックの中身がパンパンだ。アイテムはあきらめよう";
				
			}
		}while(b);
		
		return comment;
	}
	public void delItemBox(int id) {
		
		String itemId = Integer.toString(id);
		int deleteCount = 0;
		int i = 0;
		
		while(deleteCount == 0) {
			
			if(itemBox[i] != null) {
				
				if(itemBox[i].equals(itemId)) {
					
					itemBox[i] = null;
					deleteCount++;
					
				}
			}
			
			i++;
		}
		
	}
	
	public int getAtk() {
		return atk;
	}
	public void setAtk() {
		this.atk = power + weaponPower;
	}
	public void setEneAtk(int atk) {
		this.atk = atk;	
	}
	
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
		
		if(this.level % 3 == 0) {
			setHp(getHp()+5);
			
		}else {
			setHp(getHp()+1);
			
		}
		
		setPower(1);
		setAtk();
	}
	
	public int getPower() {
		return power;
	}
	public void setPower(int power) {
		this.power += power;
	}
	
	public int getDef() {
		return def;
	}

	public void setDef(int defense) {
		this.def = defense;
	}
	
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getWeapon() {
		return weapon;
	}
	public void setWeapon(int weapon) {
		
		int weaponNum = weapon;
		this.weapon = weaponNum;
		
		switch(weaponNum) {
			case 1000: setWeaponPower(Integer.parseInt(Item.douNoKen()[1]));
					setAtk();
				break;
			case 1001: setWeaponPower(Integer.parseInt(Item.ginNoKen()[1]));
					setAtk();
				break;
			case 1002: setWeaponPower(Integer.parseInt(Item.kinNoKen()[1]));
					setAtk();
				break;
			case 1003: setWeaponPower(Integer.parseInt(Item.ryuNoKen()[1]));
					setAtk();
				break;
		}
	}
	
	public void setWeaponPower(int p) {
		this.weaponPower = p;
	}
	
	public int getShield() {
		return shield;
	}
	
	public void setShield(int shield) {
		
		int shieldNum = shield;
		
		this.shield = shieldNum;
		
		switch(shieldNum) {
		
			case 4: setDef(Integer.parseInt(Item.douNoTate()[1]));
				break;
			case 5: setDef(Integer.parseInt(Item.ginNoTate()[1]));
				break;
			case 6: setDef(Integer.parseInt(Item.kinNoTate()[1]));
				break;
			case 7: setDef(Integer.parseInt(Item.ryuNoTate()[1]));
				break;
		}
	}
	
	public int getLast() {
		return last;
	}
	
	public void setLast(int last) {
		this.last = last;
	}
	
	public void setGoburin() {
		
		 name = "ゴブリン";
		 atk = 2;
		 def = 0;
		 hp = 4;
		 setEneId(0);	
	}
	
	public void setOhk() {
		
		name = "オーク";
		 atk = 4;
		 def = 0;
		 hp = 6;
		 setEneId(1);
				
	}
	
	public void setToroll() {
		
		 name = "トロール";
		 atk = 4;
		 def = 2;
		 hp = 10;
		 setEneId(2);
				
	}

	public void setMiniDoragon() {
	
		 name = "ミニドラゴン";
		 atk = 2;
		 def = 4;
		 hp = 10;
		 setEneId(3);
			
	}
	
	public void setDoragon() {
		
		 name = "ドラゴン";
		 atk = 8;
		 def = 6;
		 hp = 30;
		 setEneId(4);
				
	}
	
	public void setDoragonRevo() {
		
		 name = "超ドラゴン";
		 atk = 20;
		 def = 4;
		 hp = 60;
		 setEneId(5);
				
	}
	
	public int getEneId() {
		return eneId;
	}
	public void setEneId(int eneId) {
		this.eneId = eneId;
	}

}
