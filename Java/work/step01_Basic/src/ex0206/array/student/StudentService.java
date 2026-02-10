package ex0206.array.student;

/**
 * 학생의 정보를 관리 하는 서비스(등록, 수정, 검색,....)
 */
public class StudentService {

	private Student[] students = new Student[10];

	private int count;

	private static StudentService studentService;

	private StudentService() {
	};
	
	public int getCount() {
		return this.count; 
	}

	/**
	 * 초기치데이터 3명 정도 세팅하기
	 */
	public void init(String[][] data) {
		for (int i = 0; i < data.length; i++) {
			if (count == students.length) break;
			students[count++] = create(data[i]);
		}
		System.out.println("초기화 완료");
//		for(int i = 0; i<count; i++) {
//		 System.out.println(students[i]);	
//		}
	}

	public static StudentService getInstance() {
		if (studentService == null) {
			studentService = new StudentService();
		}
		return studentService;
	}

	/**
	 * Student객체를 생성해서 리턴해주는 메소드 작성
	 */

	private Student create(String[] row) {
		Student student = new Student();
		student.setName(row[0]);
		student.setAge(Integer.valueOf(row[1])); // parseInt쓰든가
		student.setAddr(row[2]);
		return student;
	}

	/**
	 * 학생의 정보 등록하기 : 배열의 경계를 벗어나면 더이상 추가할수 없습니다. 메시지출력. 추가가 성공하면 "등록되었습니다" 메시지를 출력
	 **/
	public int insert(Student student) {
		if (students.length == count)
			throw new RuntimeException("더 이상 추가할 수 없습니다.");
		if (selectByName(student.getName()) != null)
			throw new RuntimeException("같은 이름은 추가할 수 없습니다.");
		students[count++] = student;
		return 1;
	}

	/**
	 * 전체 학생의 정보 조회하기
	 * 학생 객체 반환
	 */
	public Student[] selectAll() {
		return students;
	}

	/**
	 * 이름에 해당하는 학생의 정보 검색하기 : 이름에 해당하는 학생이 있으면 학생의 이름, 나이, 주소를출력하고 없으면 "찾는정보가 없습니다."
	 * 출력한다.
	 */
	public Student selectByName(String name) {
		for (int i = 0; i < count; i++) {
			if (students[i].getName().equals(name)) {
				Student student = students[i];
				return student;
			}
		}
		return null;
	}

	/**
	 * 이름에 해당하는 학생의 나이와 주소 변경하기 : 이름에 해당하는 학생이 있는지 찾아서 없으면 "수정할수 없습니다." 출력 있으면
	 * setAge() , setAddr() 이용해서 전달된 인수의 값으로 변경하고 "수정되었습니다" 출력
	 * 
	 * @param : Student
	 * @return : void
	 */

	public int update(Student student) {
		Student target = selectByName(student.getName());
		if(target == null) 
			throw new RuntimeException("해당하는 학생이 없습니다.");
		target.setAge(student.getAge());
		target.setAddr(student.getAddr());
		return 1;
	}
}