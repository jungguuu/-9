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
		//�����̸��� ��ġ��ü ������ HashMap �÷��� ����
		HashMap<String, Location> nations = new HashMap<String, Location>();
		
		//(����, Location��ü)�� nations(HashMap)�� ����
		System.out.println("����,�浵,������ �Է��ϼ���");
		for(int i=0; i<4; i++) {
			System.out.print(">>");
			String text = scanner.nextLine(); //������ �о��
			StringTokenizer st = new StringTokenizer(text, ","); //st��ü�� ,�������� �и��� ��ū ����
			String name = st.nextToken().trim(); //�յ� ���������Ͽ� ���� ��ū�� ����
			int x = Integer.parseInt(st.nextToken().trim()); //���ڿ��� ������ ����
			int y = Integer.parseInt(st.nextToken().trim());
			Location location = new Location(name, x, y); //Location��ü ����
			nations.put(name, location); //���� ����
		}
		
		//��� ���� ���
		System.out.println("-----------------------------");
		Set<String> key = nations.keySet(); //��� key�� ���� set�÷��� ����
		Iterator<String> it = key.iterator(); //set�� �ִ� ��� key�� ������� �˻��ϴ� iterator����
		while(it.hasNext()) { //while���� ��� �� ���
			String name = it.next(); //�����̸�.�����̸�
			Location ex = nations.get(name); //��ü(�����̸�, ����, �浵)�˾Ƴ���
			System.out.println(ex.name + " " + ex.x + " " + ex.y);
		}
		System.out.println("-----------------------------");
		
		//�����̸� �˻�
		while(true) {
			System.out.print("���� �̸� >> ");
			String search = scanner.next();
			if(search.equals("�׸�")) break;
			Location n = nations.get(search); //'Ű'�� search�� '��' n
			if (n == null)
				System.out.println(search + "���ô� �����ϴ�.");
			else
				System.out.println(n.name + " " + n.x + " " + n.y);
		}
		scanner.close();
	}
}