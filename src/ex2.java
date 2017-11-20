import java.util.ArrayList;
import java.util.Scanner;

public class ex2 {
	public static void main(String[] args) {
		// 문자열만 삽입 가능한 ArrayList 생성
		ArrayList<String> g = new ArrayList<String>(); 
		
		//6개의 학점을 입력받아 ArrayList에 삽입
		Scanner scanner = new Scanner(System.in); //Scanner객체생성
		System.out.print("6개의 학점을 빈 칸으로 분리 입력(A/B/C/D/F)>>");
		for(int i=0; i<6; i++) {
			String grade = scanner.next(); //성적입력받음
			g.add(grade); //ArrayList컬렉션에 삽입
		}
		
		//입력받은 학점으로 평균학점 구하기
		double score, avg;
		double sum = 0;
		for(int i=0; i<6; i++) {
			switch(g.get(i)) { //ArrayList의 i번째 문자열 받아오기
			case"A" : //문자열 입력받았기 때문에 '아닌 "사용
				score = 4.0;
				break;
			case"B" :
				score = 3.0;
				break;
			case"C" :
				score = 2.0;
				break;
			case"D" :
				score = 1.0;
				break;
			default :
					score =0;
				
			}
			sum = sum + score;
		}
		avg = sum / 6;
		System.out.println(avg);
		scanner.close();
	}
}
