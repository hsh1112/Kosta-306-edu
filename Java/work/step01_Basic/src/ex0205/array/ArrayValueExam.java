package ex0205.array;

class ArrayValue{
	//정수형 10개 저장하는 배열선언(선언과 동시에 임의값 지정)
//	int[] intArr = new int[] {1,2,3,4,5,6,7,8,9,10};
	public int[] intArr = {1,2,3,4,5,6,7,8,9,10};

   /*printArrayvalue 메소드작성
       => 메소드 안에서 위에 선언된 배열방의 값을 출력한다.
	*/
	
	public void printArrayvalue() {
		for(int result : this.intArr) {
			System.out.println(result);
		}
	}
	
}

/////////////////////////////////////////////////
class ArrayValueExam{
	public static void main(String args []){
        // ArrayValue에 있는 printArrayvalue메소드 호출
		
		int size = args.length;
		int[] intArgs = new int[size];
		
		for(int i = 0; i < size; i++) {
			int intArg = Integer.valueOf(args[i]);
			intArgs[i] = intArg;
		}
		System.out.println(System.identityHashCode(intArgs));

		for(int intArg : intArgs) {
		    System.out.println(intArg);
		}

		System.out.println(System.identityHashCode(intArgs));
		
	}
}