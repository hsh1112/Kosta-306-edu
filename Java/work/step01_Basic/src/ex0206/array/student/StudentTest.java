package ex0206.array.student;

public class StudentTest {
	public static void main(String[] args) {
		System.out.println("***학생 관리 프로그램 시작합니다.******");
		
		String [][] data = new String[][] {
			{"이름", "20", "서울"},
			{"이름2", "30", "서울2"},
			{"이름3", "40", "서울3"},
			{"이름4", "50", "서울4"},
			{"이름5", "60", "서울5"},
		};
		
		StudentService studentService = StudentService.getInstance();//StudentService의 전역변수들이 초기화 
		studentService.init(data); // 초기치데이터 세팅
		
		//전체학생정보 출력
		studentService.selectAll();
		
		//등록하기
		System.out.println("--1. 등록하기 -----");
		Student student = new Student();
		student.setName("미미");
		student.setAge(25);
		student.setAddr("오리역");
		
		studentService.insert(student);
		
		System.out.println("--2. 전체검색 -----");
		StudentEndView.printSelectAll(studentService.selectAll());
		
		//이름으로 검색하기
		System.out.println("--3. 이름으로 검색 -----");
		StudentEndView.printSelectByName(studentService.selectByName("이름3"));
		
		System.out.println("--이름이 없는경우----");
		StudentEndView.printSelectByName(studentService.selectByName("삼순이"));
		
		//수정하기 
		/*System.out.println("--4. 수정하기 -----");
		Student st2 =new Student();
		st2.setName("나영");//조건
		st2.setAge(23);
		st2.setAddr("대전");
		
		service.update(st2);
		
		System.out.println("---변경후 ---");
		service.selectAll();*/

	}

}








