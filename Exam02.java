import java.util.ArrayList;
import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<String> musicList = new ArrayList<String>();
		while (true) {
			System.out.println("[1]�뷡�߰� [2]�뷡���� [3]�뷡�˻� [4]����");
			int a = sc.nextInt();

			if (a == 1) {
				// �뷡�߰�!(�뷡����)
				System.out.print("�߰��� �뷡 �Է� >> ");
				String sing = sc.next();
				// �� �߰��� ���!
				musicList.add(sing);
				System.out.println("=====lest=====");
				for (int i = 0; i < musicList.size(); i++) {
					System.out.println((i + 1) + ". " + musicList.get(i));
				}

			} else if (a == 2) {
				for (int i = 0; i < musicList.size(); i++) {
					System.out.println((i + 1) + ". " + musicList.get(i));
				}
				System.out.print("������ �뷡 �Է� >> ");
				int deletNum = sc.nextInt();
				musicList.remove(deletNum - 1);

			} else if (a == 3) {
				System.out.println("�˻��� �뷡 ���� �Է� >>  ");
				String google = sc.next();
				boolean  choice = false;
				for (int i = 0; i < musicList.size(); i++) {
					if (google.equals(musicList.get(i))) {
						System.out.println("�˻��� �뷡�� " + (i + 1) + " ��° �ֽ��ϴ�. ");
					    choice = true;
				
					if(choice==false) {
						System.out.println("�˻��� �뷡�� �����ϴ�.!");
					}
					} else if (a == 4) {
						System.out.println("���α׷��� ����Ǿ����ϴ�.");
						break;
					}

				}
			}
		}
	}
}
