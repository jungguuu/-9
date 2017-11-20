import java.util.Scanner;
import java.util.Vector;

public class ex4 {

	public static void main(String[] args) {
		int sum=0;
		int avg;
		Vector<Integer> v = new Vector<Integer>(); //정수값만 다루는 벡터 생성
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.print("강수량 입력 (0입력시 종료)>> ");
			int n = scanner.nextInt();
			if(n == 0) break;
			v.add(n); //n을 벡터에 삽입
			for(int j=0; j<v.size(); j++) {
				System.out.print(v.get(j)+" "); //j번째 정수
			}
			System.out.println("");
			sum = sum + n;
			avg = sum / v.size();
			System.out.println("현재평균 " +avg);
		}
		scanner.close();
	}

}
