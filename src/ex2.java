import java.util.ArrayList;
import java.util.Scanner;

public class ex2 {
	public static void main(String[] args) {
		// ���ڿ��� ���� ������ ArrayList ����
		ArrayList<String> g = new ArrayList<String>(); 
		
		//6���� ������ �Է¹޾� ArrayList�� ����
		Scanner scanner = new Scanner(System.in); //Scanner��ü����
		System.out.print("6���� ������ �� ĭ���� �и� �Է�(A/B/C/D/F)>>");
		for(int i=0; i<6; i++) {
			String grade = scanner.next(); //�����Է¹���
			g.add(grade); //ArrayList�÷��ǿ� ����
		}
		
		//�Է¹��� �������� ������� ���ϱ�
		double score, avg;
		double sum = 0;
		for(int i=0; i<6; i++) {
			switch(g.get(i)) { //ArrayList�� i��° ���ڿ� �޾ƿ���
			case"A" : //���ڿ� �Է¹޾ұ� ������ '�ƴ� "���
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
