import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Student {
	private String name, department;
	private int num;
	private double grade;
	public Student(String name, String d, int num, double g) { //학생정보저장
		this.name = name; this.department = d;
		this.num = num; this.grade = g;
	}
	public static void main(String[] args) {
		// 객체 Student만 삽입 가능한 ArrayList 생성
		ArrayList<Student> S = new ArrayList<Student>();
		
		//입력받아 ArrayList에 삽입
		Scanner scanner = new Scanner(System.in);
		System.out.println("학생 이름, 학과, 학번, 학점평균 입력하세요");
		for(int i=0; i<4; i++) {
			System.out.print(">>");
			String text = scanner.nextLine(); //한줄을 읽어옴
			StringTokenizer st = new StringTokenizer(text, ",");  //st객체에 ,기준으로 분리된 토큰 저장
			String name = st.nextToken().trim(); //앞뒤 공백제거하여 다음 토큰을 받음
			String d = st.nextToken().trim();
			int num = Integer.parseInt(st.nextToken().trim()); //문자열을 정수로 리턴
			double g = Double.parseDouble(st.nextToken().trim());
			Student student = new Student(name,d,num,g); //Student객체 생성
			S.add(student); //ArrayList에 Student객체 삽입
		}
		
		
		//ArrayList의 내용 출력
		System.out.println("-----------------------------");
		for(int i=0; i<4; i++) {
			Student ex = S.get(i); //ArrayList의 i번째 객체
			System.out.println("이름 : " + ex.name);
			System.out.println("학과 : " + ex.department);
			System.out.println("학번 : " + ex.num);
			System.out.println("학점평균 : " + ex.grade);
			System.out.println("-----------------------------");
		}
		
		//학생이름 검색
		while(true) {
			System.out.print("학생이름 >> ");
			String search = scanner.next();
			if(search.equals("그만")) break;
			for(int i=0; i<4; i++) {
				Student ex = S.get(i); //ArrayList의 i번째 객체
				if(ex.name.equals(search)) 
					System.out.println(ex.name + ", " + ex.department + ", " + ex.num + ", " + ex.grade);
			}
		}
		scanner.close();
	}
}