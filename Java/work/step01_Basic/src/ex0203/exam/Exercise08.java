package ex0203.exam;

public class Exercise08 {
	public static void main(String[] args) {
		int num1 = 4;
		int num2 = 5;
		
		int target = 60;
		
		for(int x = 0; x<=10; x++) {
			for(int y = 0; y<=10; y++) {
				int value = num1 * x + num2 * y;
				if(value == target) {
					System.out.println("(" + x + "," + y +")");
				}
			}
		}
	}
}
