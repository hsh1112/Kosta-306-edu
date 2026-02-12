package ex0211.exam.sample2;

public class MainApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Employee fullTime1 = 
				new FullTime(10, "유재석", "개그우먼?", 0, "2013-05-01", "무한도전", 8500, 200);
		Employee fullTime2 = 
				new FullTime(20, "박명수", "가수", 10, "2013-06-20", "무한도전", 7500, 100);
		Employee fullTime3 = 
				new FullTime(30, "정준하", "예능인", 10, "2013-06-22", "무한도전", 6000, 0);
		Employee partTime1 = 
				new PartTime(40, "노홍철", "예능인", 20, "2014-05-01", "무한도전", 20000);
		Employee partTime2 = 
				new PartTime(50, "하하", "가수", 30, "2014-05-02", "무한도전", 25000);
		
		 Employee[] employees = 
			 { fullTime1, fullTime2, fullTime3, partTime1, partTime2 };
		 
		 System.out.println("*********** Emp 정보 ***********");
		 for(Employee emp : employees) {
			 System.out.println(emp);
		 }
		
		 System.out.println("*********** EmpMessage 정보 ***********");
		 for(Employee emp : employees) {
			 emp.message();
		 }
	}

}
