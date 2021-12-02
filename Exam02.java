import java.util.ArrayList;
import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<String> musicList = new ArrayList<String>();
		while (true) {
			System.out.println("[1]노래추가 [2]노래삭제 [3]노래검색 [4]종료");
			int a = sc.nextInt();

			if (a == 1) {
				// 노래추가!(노래제목)
				System.out.print("추가할 노래 입력 >> ");
				String sing = sc.next();
				// 값 추가후 출력!
				musicList.add(sing);
				System.out.println("=====lest=====");
				for (int i = 0; i < musicList.size(); i++) {
					System.out.println((i + 1) + ". " + musicList.get(i));
				}

			} else if (a == 2) {
				for (int i = 0; i < musicList.size(); i++) {
					System.out.println((i + 1) + ". " + musicList.get(i));
				}
				System.out.print("삭제할 노래 입력 >> ");
				int deletNum = sc.nextInt();
				musicList.remove(deletNum - 1);

			} else if (a == 3) {
				System.out.println("검색할 노래 제목 입력 >>  ");
				String google = sc.next();
				boolean  choice = false;
				for (int i = 0; i < musicList.size(); i++) {
					if (google.equals(musicList.get(i))) {
						System.out.println("검색한 노래는 " + (i + 1) + " 번째 있습니다. ");
					    choice = true;
				
					if(choice==false) {
						System.out.println("검색한 노래가 없습니다.!");
					}
					} else if (a == 4) {
						System.out.println("프로그램이 종료되었습니다.");
						break;
					}

				}
			}
		}
	}
}
