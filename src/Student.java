import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Student {
	private String name, department;
	private int num;
	private double grade;
	public Student(String name, String d, int num, double g) { //�л���������
		this.name = name; this.department = d;
		this.num = num; this.grade = g;
	}
	public static void main(String[] args) {
		// ��ü Student�� ���� ������ ArrayList ����
		ArrayList<Student> S = new ArrayList<Student>();
		
		//�Է¹޾� ArrayList�� ����
		Scanner scanner = new Scanner(System.in);
		System.out.println("�л� �̸�, �а�, �й�, ������� �Է��ϼ���");
		for(int i=0; i<4; i++) {
			System.out.print(">>");
			String text = scanner.nextLine(); //������ �о��
			StringTokenizer st = new StringTokenizer(text, ",");  //st��ü�� ,�������� �и��� ��ū ����
			String name = st.nextToken().trim(); //�յ� ���������Ͽ� ���� ��ū�� ����
			String d = st.nextToken().trim();
			int num = Integer.parseInt(st.nextToken().trim()); //���ڿ��� ������ ����
			double g = Double.parseDouble(st.nextToken().trim());
			Student student = new Student(name,d,num,g); //Student��ü ����
			S.add(student); //ArrayList�� Student��ü ����
		}
		
		
		//ArrayList�� ���� ���
		System.out.println("-----------------------------");
		for(int i=0; i<4; i++) {
			Student ex = S.get(i); //ArrayList�� i��° ��ü
			System.out.println("�̸� : " + ex.name);
			System.out.println("�а� : " + ex.department);
			System.out.println("�й� : " + ex.num);
			System.out.println("������� : " + ex.grade);
			System.out.println("-----------------------------");
		}
		
		//�л��̸� �˻�
		while(true) {
			System.out.print("�л��̸� >> ");
			String search = scanner.next();
			if(search.equals("�׸�")) break;
			for(int i=0; i<4; i++) {
				Student ex = S.get(i); //ArrayList�� i��° ��ü
				if(ex.name.equals(search)) 
					System.out.println(ex.name + ", " + ex.department + ", " + ex.num + ", " + ex.grade);
			}
		}
		scanner.close();
	}
}