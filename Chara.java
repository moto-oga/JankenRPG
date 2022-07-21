package jankenRPG;

public class Chara{
	
	private String name;
	private String[] itemBox = new String[10];
	private int weapon;
	private int shield = 100;
	private String sex;
	
	private int level = 1;
	private int power  = 1;
	private int weaponPower = 0;
	private int defense = 0;
	private int atk;
	private int hitPoint = 10;
	private int last = 0;
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
		String nul = null;
		
		for(int i = 0;i < itemBox.length;i++) {
			
			if(itemBox[i] != null) {
				
				if(itemBox[i].equals(itemId)) {
					
					itemBox[i] = nul;
				}
			}
		}
		
	}
	
	public int getAtk() {
		return atk;
	}
	public void setAtk() {
		this.atk = power + weaponPower;
	}
	
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
		
		if(this.level % 3 == 0) {
			setHitPoint(5);
			setAtk();
		}else {
			setHitPoint(1);
			setPower(1);
			setAtk();
		}
	}
	
	public int getPower() {
		return power;
	}
	public void setPower(int power) {
		this.power += power;
	}
	
	public int getDefense() {
		return defense;
	}

	public void setDefense(int defense) {
		this.defense = defense;
	}
	
	public int getHitPoint() {
		return hitPoint;
	}
	public void setHitPoint(int hitPoint) {
		this.hitPoint = this.hitPoint + hitPoint;
	}
	public int getWeapon() {
		return weapon;
	}
	public void setWeapon(int weapon) {
		int weaponNum = weapon;
		this.weapon = weaponNum;
		switch(weaponNum) {
			case 0: setWeaponPower(Integer.parseInt(Item.douNoKen()[1]));
					setAtk();
				break;
			case 1: setWeaponPower(Integer.parseInt(Item.ginNoKen()[1]));
					setAtk();
				break;
			case 2: setWeaponPower(Integer.parseInt(Item.kinNoKen()[1]));
					setAtk();
				break;
			case 3: setWeaponPower(Integer.parseInt(Item.ryuNoKen()[1]));
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
			case 4: setDefense(Integer.parseInt(Item.douNoTate()[1]));
				break;
			case 5: setDefense(Integer.parseInt(Item.ginNoTate()[1]));
				break;
			case 6: setDefense(Integer.parseInt(Item.kinNoTate()[1]));
				break;
			case 7: setDefense(Integer.parseInt(Item.ryuNoTate()[1]));
				break;
		}
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getLast() {
		return last;
	}
	public void setLast(int last) {
		this.last = last;
	}
	

}
