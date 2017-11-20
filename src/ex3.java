import java.util.HashMap;
import java.util.Scanner;

public class ex3 {
	public static void main(String[] args) {
		//나라이름과 인구수를 저장할 HashMap 컬렉션 생성
		HashMap<String, Integer> nations = new HashMap<String, Integer>();
		
		//(나라이름, 인구)쌍을 nations(HashMap)에 삽입
		Scanner scanner = new Scanner(System.in);
		System.out.println("나라 이름과 인구를 10개 입력하세요.(예: Korea 5000)");
		for(int i=0; i<10; i++) {
			System.out.print("나라 이름, 인구 >> ");
			String name = scanner.next();
			if (name.equals("그만")) break; //그만입력시 종료
			int num = scanner.nextInt();
			nations.put(name, num); //쌍을 삽입
		}
		
		while(true) {
			System.out.print("인구 검색 >> ");
			String search = scanner.next();
			if(search.equals("그만")) break; //그만입력시 종료
			Integer n = nations.get(search); //해시맵에서 '키' search의 '값' n
			if (n == null) //n 값을 가진 해시맵 존재하지 X
				System.out.println(search + "나라는 없습니다.");
			else
				System.out.println(search + "의 인구는 " + nations.get(search));
		}
		scanner.close();
	}
}