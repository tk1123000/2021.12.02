import java.util.Scanner;

public class Exam03 {

	public static void main(String[] args) {

		// ��������
		int[] array = new int[5];
		Scanner sc = new Scanner(System.in);
		
		//�Էº�
		for (int i = 0; i < array.length; i++) {
			System.out.println((i + 1) + "��° ���� �Է� >>");
			array[i] = sc.nextInt();
		}
		// ���� ����
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 0; j < array.length - i - 1; j++) {
				// ������Ұ� ������ ���Һ��� ũ�ٸ�
				// ���� �ٲپ� �ּ���! ---->ġȯ
				if (array[j] > array[j + 1]) {
					int temp = array[j+1];
					array[j + 1] = array[j];
					array[j] = temp;
				}
			}

		}
		// ��º�
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

	}

}
