import java.util.HashMap;
import java.util.Scanner;

public class ex3 {
	public static void main(String[] args) {
		//�����̸��� �α����� ������ HashMap �÷��� ����
		HashMap<String, Integer> nations = new HashMap<String, Integer>();
		
		//(�����̸�, �α�)���� nations(HashMap)�� ����
		Scanner scanner = new Scanner(System.in);
		System.out.println("���� �̸��� �α��� 10�� �Է��ϼ���.(��: Korea 5000)");
		for(int i=0; i<10; i++) {
			System.out.print("���� �̸�, �α� >> ");
			String name = scanner.next();
			if (name.equals("�׸�")) break; //�׸��Է½� ����
			int num = scanner.nextInt();
			nations.put(name, num); //���� ����
		}
		
		while(true) {
			System.out.print("�α� �˻� >> ");
			String search = scanner.next();
			if(search.equals("�׸�")) break; //�׸��Է½� ����
			Integer n = nations.get(search); //�ؽøʿ��� 'Ű' search�� '��' n
			if (n == null) //n ���� ���� �ؽø� �������� X
				System.out.println(search + "����� �����ϴ�.");
			else
				System.out.println(search + "�� �α��� " + nations.get(search));
		}
		scanner.close();
	}
}