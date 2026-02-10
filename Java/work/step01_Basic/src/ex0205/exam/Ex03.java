package ex0205.exam;

public class Ex03 {
	public static void main(String[] args) {
		int[][] array = {
				{95,86},
				{83,92,96},
				{78,83,93,87,88}
		};	
		
		int row = array.length;
		int sum = 0;
		int count = 0;
		
		for(int r = 0; r < row; r++) {
			for(int c = 0; c < array[r].length; c++) {
				sum += array[r][c];
				count++;
			}
		}
		
		double avg = sum/(double)count;
		
		System.out.println(sum);
		System.out.println(count);
		System.out.println(avg);
	}
}
