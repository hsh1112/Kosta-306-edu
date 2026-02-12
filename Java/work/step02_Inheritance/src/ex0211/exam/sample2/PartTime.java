package ex0211.exam.sample2;

public class PartTime extends Employee{

	private int timePay;
	
	@Override
	public String toString() {
		String str = 
				super.toString() + " | " + this.timePay;
				
		return str;
	}
	
	@Override
	public void message() {
		System.out.println(geteName() + "사원은 비정규직입니다.");
	}

	public PartTime(int empNo, String eName, String job, 
			int mgr, String hiredate, String deptName, int timePay) {
		
		super(empNo, eName, job, mgr, hiredate, deptName);
		this.timePay = timePay;
		
	}
	
	public PartTime() {
		
	}
	
	public int getTimePay() {
		return timePay;
	}
	
	public void setTimePay(int timePay) {
		this.timePay = timePay;
	}

}
