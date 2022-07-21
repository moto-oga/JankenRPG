package jankenRPG;

public class Speech extends MainContent{
	
	public static int battelPattern() {
		
		announce("--------------------");
		announce("洞窟を奥まで進んでいる。");
		announce("ザッザ");
		announce("ザッザ");
		announce("・・・");
		announce("魔物が現れた！");
		
		return 1;
	}
	
	public static int itemPattern() {
		announce("--------------------");
		announce("洞窟を奥まで進んでいる。");
		announce("ザッザ");
		announce("ザッザ");
		announce("・・・");
		announce("宝物を発見した！");
		
		return 2;
	}
	
	public static int nothingPattern() {
		
		announce("--------------------");
		announce("洞窟を奥まで進んでいる。");
		announce("ザッザ");
		announce("ザッザ");
		announce("・・・");
		announce("まだまだ先は長そうだ");
		
		return 3;
	}
	
	public static int doragonVoicePattern() {//4
		
		announce("--------------------");
		announce("洞窟を奥まで進んでいる。");
		announce("ザッザ");
		announce("ザッザ");
		announce("・・・");
		announce("ドラゴンの鳴き声が聞こえた！近くにいる！");
		
		return 4;
	}
}
