package sec03.exam02_hashcode;

import java.util.HashMap;

public class KeyExample {
	//public : ���������� : ��δ� ���� ����
	//static : ���α׷��� ���� �Ǵ� �������� 1���� ������� �ν��Ͻ�
	//void : �� �޼��忡�� ���Ͼ���.
	//(String[] args) : �Ű������� String �迭�� �ްڴ�.
	public static void main(String[] args) {
		//Key ��ü�� �ĺ�Ű�� ����ؼ� String ���� �����ϴ� HashMap ��ü ����
		//HashMap�̶�� Ÿ������ �����ϵ� �ȿ� ���� Key��� ��ü�� String���ڿ��� �ִ´�.
		//= Name HashMap<key, String> : Heap�޸𸮿� �ν��Ͻ� �����
		//HashMap<String, String> key��ġ�� String, Value ��ġ�� String
		//Key(String)���� �˻��ؼ� Value(String)�� �޴´� (HashMap�� ����)
		//HashMap Ư¡ : Key���� �ߺ� �ȵ�
		//Key���� "���ؼ�", value "��������"
		//Key���� "���ؼ�", value "���ļ���"
		//"���ؼ�"�� �˻��ϸ� "���ļ���"�� ��ϴ�
		HashMap<Key, String> hashMap = new HashMap<Key, String>();
		//Key��� ��üŸ������ testKey��� ���������� Ÿ�� ����
		//=new Key(23); = heap�޸𸮿��� Key��� �ν��Ͻ��� ����(��, ���ڰ� 23 ����)
		//������(�Ű����� 23��) ����
		Key testkey = new Key(23);
		Key testkey_4 = new Key(23);
		Key testkey_5 = new Key(23);

		System.out.println("-------hashMap : Key��--------");
		System.out.println(testkey.hashCode());
		System.out.println(testkey_4.hashCode());
		//990368553
		System.out.println(testkey_5.hashCode());
		System.out.println("-----------------------");


		//json �������� ���ͳ� ����� �ַ� �մϴ�.(key, value)
		//�ĺ�Ű "new Key(1)" �� "ȫ�浿"�� ������
		//hashMap���� put() : hashmap�� ������ �ֱ�
		//String[] a; a[0] = "���ؼ�"
		//a[0] = key
		//"���ؼ�" = "ȫ�浿"
		hashMap.put(new Key(1), "ȫ�浿");
		hashMap.put(testkey, "���ؼ�");
		hashMap.put(testkey, "���ؼ�");


		//�ĺ�Ű "new Key(1)" �� "ȫ�浿"�� �о��
		//hashmap.get() : ���ڰ�(key)�� �־ key�� �Բ� ���� value�� ��ȯ(���)
		//hashmap.get() : �޼����� �񱳹��
		//new Key(1)�̶�� get()�� �Ű������� ������
		//���ο� �ν��Ͻ��� ���������.
		//ȫ�浿�� key���� �ٸ��ٰ� �ν�(�ν��Ͻ��� �ٸ���, �ּҰ� �ٸ��Ƿ� hashcode()�� �ٸ��� ����)
		//ȫ�浿�� key�� �ٸ��ٰ� �ν�(hashcode()������� ���� = hashMap�� �ڷ����屸��)
		String value  = hashMap.get(new Key(1));
		System.out.println("1���� �ִ� ȫ�浿�� ������ : "+value);
		System.out.println("�ؽ��ڵ� : "+hashMap.get(testkey).hashCode());

		System.out.println("-----------------------------------");
		Object obj = new Object();
		System.out.println("�ּ� : "+obj);
		System.out.println("�ؽ��ڵ� : "+obj.hashCode());
		System.out.println("-----------------------------------");
		Object obj_1 = new Object();
		System.out.println("�ּ� : "+obj_1);
		System.out.println("�ؽ��ڵ� : "+obj_1.hashCode());
	}
}


