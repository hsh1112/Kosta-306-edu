package ex2011.exam.sample1;

public class MainApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FullTime fullTime1 = 
				new FullTime(10, "유재석", "개그우먼?", 0, "2013-05-01", "무한도전", 8500, 200);
		FullTime fullTime2 = 
				new FullTime(20, "박명수", "가수", 10, "2013-06-20", "무한도전", 7500, 100);
		FullTime fullTime3 = 
				new FullTime(30, "정준하", "예능인", 10, "2013-06-22", "무한도전", 6000, 0);
		PartTime partTime1 = 
				new PartTime(40, "노홍철", "예능인", 20, null, null, 20000);
		PartTime partTime2 = 
				new PartTime(50, "하하", "가수", 30, null, null, 25000);
		
		 FullTime[] fullTimes = { fullTime1, fullTime2, fullTime3 };
		 PartTime[] partTimes = { partTime1, partTime2 };
		 
		 System.out.println("*********** FullTime 정보 ***********");
		 for(FullTime f : fullTimes) {
			 System.out.println(f);
		 }
		
		 System.out.println("\n*********** PartTime 정보 ***********");
		 for(PartTime p : partTimes) {
			 System.out.println(p);
		 }
		 
		 System.out.println("\n*********** Message ***********");
		 for(FullTime f : fullTimes) {
			 f.message();
		 }
		 
		 for(PartTime p : partTimes) {
			 p.message();
		 }
		 
	}

}
