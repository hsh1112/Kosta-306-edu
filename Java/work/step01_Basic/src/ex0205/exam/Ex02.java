package ex0205.exam;

public class Ex02 {
	public static void main(String[] args) {
		int[] array = new int[] {1,5,3,8,2};
		
		int length = array.length;
		
		int max = array[0];
		
		for(int i = 0; i < length; i++) {
			for(int j = i+1; j < length; j++) {
				int temp = array[i] * array[j];
				System.out.println(temp);
				if(temp > max) {
					max = temp;
				}
			}
		}
		
		System.out.println(max);
		
	}
}
