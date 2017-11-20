import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

public class Location {
	private String name;
	private int x, y;
	public Location(String n, int x, int y) {
		this.name = n; this.x = x; this.y = y;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//도시이름과 위치객체 저장할 HashMap 컬렉션 생성
		HashMap<String, Location> nations = new HashMap<String, Location>();
		
		//(도시, Location객체)쌍 nations(HashMap)에 삽입
		System.out.println("도시,경도,위도를 입력하세요");
		for(int i=0; i<4; i++) {
			System.out.print(">>");
			String text = scanner.nextLine(); //한줄을 읽어옴
			StringTokenizer st = new StringTokenizer(text, ","); //st객체에 ,기준으로 분리된 토큰 저장
			String name = st.nextToken().trim(); //앞뒤 공백제거하여 다음 토큰을 받음
			int x = Integer.parseInt(st.nextToken().trim()); //문자열을 정수로 리턴
			int y = Integer.parseInt(st.nextToken().trim());
			Location location = new Location(name, x, y); //Location객체 생성
			nations.put(name, location); //쌍을 삽입
		}
		
		//모든 내용 출력
		System.out.println("-----------------------------");
		Set<String> key = nations.keySet(); //모든 key를 가진 set컬렉션 리턴
		Iterator<String> it = key.iterator(); //set에 있는 모든 key를 순서대로 검색하는 iterator리턴
		while(it.hasNext()) { //while문은 모든 값 출력
			String name = it.next(); //다음이름.도시이름
			Location ex = nations.get(name); //객체(나라이름, 위도, 경도)알아내기
			System.out.println(ex.name + " " + ex.x + " " + ex.y);
		}
		System.out.println("-----------------------------");
		
		//도시이름 검색
		while(true) {
			System.out.print("도시 이름 >> ");
			String search = scanner.next();
			if(search.equals("그만")) break;
			Location n = nations.get(search); //'키'가 search인 '값' n
			if (n == null)
				System.out.println(search + "도시는 없습니다.");
			else
				System.out.println(n.name + " " + n.x + " " + n.y);
		}
		scanner.close();
	}
}