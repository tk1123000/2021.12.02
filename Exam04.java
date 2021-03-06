import java.util.Scanner;

public class Exam04 {

	public static void main(String[] args) {

		// 선택정렬
		int[] array = new int[5];
		Scanner sc = new Scanner(System.in);

		// 입력부
		for (int i = 0; i < array.length; i++) {
			System.out.println((i + 1) + "번째 원소 입력 >>");
			array[i] = sc.nextInt();
		}
		// 선택정렬
		for (int i = 0; i < array.length - 1; i++) {
			int maxNum = array[i];
			int maxNumIndex = i;// 기준값의 인덱스
			for (int j = i + 1; j < array.length; j++) {
				// 현재의 기준값보다 크고, 남은 배열에서
				// 제일 큰 값을 찾아서 바꾸어 줘야함
				if (maxNum < array[j]) {
					maxNumIndex = j;
					maxNum = array[j];

				}
			}
			// 가장 작은 값과 치환!
			int temp = array[i];
			array[i] = array[maxNumIndex];
			array[maxNumIndex] = temp;

		}
		// 출력부
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
}
