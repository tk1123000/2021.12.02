import java.util.Scanner;

public class Exam04 {

	public static void main(String[] args) {

		// ��������
		int[] array = new int[5];
		Scanner sc = new Scanner(System.in);

		// �Էº�
		for (int i = 0; i < array.length; i++) {
			System.out.println((i + 1) + "��° ���� �Է� >>");
			array[i] = sc.nextInt();
		}
		// ��������
		for (int i = 0; i < array.length - 1; i++) {
			int maxNum = array[i];
			int maxNumIndex = i;// ���ذ��� �ε���
			for (int j = i + 1; j < array.length; j++) {
				// ������ ���ذ����� ũ��, ���� �迭����
				// ���� ū ���� ã�Ƽ� �ٲپ� �����
				if (maxNum < array[j]) {
					maxNumIndex = j;
					maxNum = array[j];

				}
			}
			// ���� ���� ���� ġȯ!
			int temp = array[i];
			array[i] = array[maxNumIndex];
			array[maxNumIndex] = temp;

		}
		// ��º�
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
}
