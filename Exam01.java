import java.util.ArrayList;

public class Exam01 {

	public static void main(String[] args) {

		// ArrayList 
		
		int[] array = new int[5];
		//ArrayList ���� ���
		//ArrayList<Ÿ��> �̸� = new ArrayList<Ÿ��>();
	   ArrayList<String> arrayList = new ArrayList<String>();
		
	   //�� �߰� �̸�.add("�� ��");
	   arrayList.add("�°�");
		arrayList.add("����");
		arrayList.add("����");
		
		
		//�� ����! -> .remove("�ε���")
		arrayList.remove(arrayList.size()-1);
		arrayList.remove(1);
		
		//���ϴ� ��ġ�� �� �߰�!
		arrayList.add(1, "��ȯ");
		
		// arrayList ���
		// arrayList �� ũ�� -> size()
		for (int i = 0; i < arrayList.size(); i++) {
			// �� �������� -> �̸�.get(index)
			System.out.println(arrayList.get(i));
			
		}
		
		
	}

}
