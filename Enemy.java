package jankenRPG;

public class Enemy  {
		String name;
		int atk ;
		int def ;
		int hp ;
		int id ;
	
	
	public void goburin() {
		
		 name = "ゴブリン";
		 atk = 2;
		 def = 0;
		 hp = 4;
		 id	= 0;	
	}
	
	public void ohk() {
		
		name = "オーク";
		 atk = 4;
		 def = 0;
		 hp = 6;
		 id	= 1;
				
	}
	
	public void toroll() {
		
		 name = "トロール";
		 atk = 4;
		 def = 2;
		 hp = 10;
		 id	= 2;
				
	}

	public void miniDoragon() {
	
		 name = "ミニドラゴン";
		 atk = 2;
		 def = 4;
		 hp = 10;
		 id	= 3;
			
	}
	
	public void doragon() {
		
		 name = "ドラゴン";
		 atk = 8;
		 def = 6;
		 hp = 30;
		 id	= 4;
				
	}
	
	public void doragonRevo() {
		
		 name = "超ドラゴン";
		 atk = 20;
		 def = 6;
		 hp = 60;
		 id	= 5;
				
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAtk() {
		return atk;
	}

	public void setAtk(int atk) {
		this.atk = atk;
	}

	public int getDef() {
		return def;
	}

	public void setDef(int def) {
		this.def = def;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
}
