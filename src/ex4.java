import java.util.Scanner;
import java.util.Vector;

public class ex4 {

	public static void main(String[] args) {
		int sum=0;
		int avg;
		Vector<Integer> v = new Vector<Integer>(); //�������� �ٷ�� ���� ����
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.print("������ �Է� (0�Է½� ����)>> ");
			int n = scanner.nextInt();
			if(n == 0) break;
			v.add(n); //n�� ���Ϳ� ����
			for(int j=0; j<v.size(); j++) {
				System.out.print(v.get(j)+" "); //j��° ����
			}
			System.out.println("");
			sum = sum + n;
			avg = sum / v.size();
			System.out.println("������� " +avg);
		}
		scanner.close();
	}

}
