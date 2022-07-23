package jankenRPG2;

public class Speech extends MainContent{
	
	public static int battelPattern() {
		
		System.out.println("--------------------");
		announce("洞窟を奥まで進んでいる。");
		announce("ザッザッザ");
		announce("ザッザッザ");
		announce("・・・");
		announce("魔物が現れた！");
		
		return 1;
	}
	
	public static int itemPattern() {
		System.out.println("--------------------");
		announce("洞窟を奥まで進んでいる。");
		announce("ザッザッザ");
		announce("ザッザッザ");
		announce("・・・");
		announce("宝物を発見した！");
		
		return 2;
	}
	
	public static int nothingPattern() {
		
		System.out.println("--------------------");
		announce("洞窟を奥まで進んでいる。");
		announce("ザッザッザ");
		announce("ザッザッザ");
		announce("・・・");
		announce("まだまだ先は長そうだ");
		
		return 3;
	}
	
	public static int doragonVoicePattern() {//4
		
		System.out.println("--------------------");
		announce("洞窟を奥まで進んでいる。");
		announce("ザッザッザ");
		announce("ザッザッザ");
		announce("・・・");
		announce("ドラゴンの鳴き声が聞こえた！近くにいる！");
		
		return 4;
	}
}
