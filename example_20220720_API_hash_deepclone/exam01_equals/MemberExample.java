package sec03.exam01_equals;

public class MemberExample {
	//main Ŭ������ ���α׷��� ������ �� ó�� �����ϴ� �޼���( ��ü �ȿ� ������ �޼��尡 �ְ�, �����Ų��)
	//String[] �迭�� OS(������)���� �ʱ⿡ �����͸� �޴� �Ա�
	//public : ���������ڷν� ��� �� ���� ����
	//static : ���α׷����� �� 1���� �ν��Ͻ��� �� ����
	//void : return ���� ��� �޼��尡 ����ǰ� �ٷ� ��

	public static void main(String[] args) {

		//�ν��Ͻ� ����
		//���� �κ� : (����)Member Ÿ������ obj1 ���������� ����
		//= : ���� ������ (������ �ִ� �ν��Ͻ��� ������ �ִ� ����κп� �Ҵ�(����)
		//new : �ν��Ͻ� �κ����� ������ �޸𸮿� �Ҵ�Ǵ� ��,
		//(����)MemberŸ������ ������ ����(������:���ڰ� String �ֱ�)
		Member obj1 = new Member("blue");
		Member obj2 = new Member("blue");
		Member obj3 = new Member("red");
		//�޸𸮿� obj��� ��ü�� 3�� �Ҵ�� ��Ȳ(�ּҰ�)

		//������ �� equals ���
		if(obj1.equals(obj2)) { //obj1�� obj2 ��ü�� ��(��, ����Ÿ���̿��� eqauls�޼��带 �Ἥ ��)
			//�⺻ Ÿ�Գ��� ���� ������ == ���
			System.out.println("obj1 obj2 ����");
		} else {
			System.out.println("obj1 obj2���� ����");
		}

		if(obj1.equals(obj3)) {
			System.out.println("obj1 obj3����");
		} else {
			System.out.println("obj1 obj3���� ����");
		}

		//obj3 ��� ������(����κ�)�� obj2�� �������� ����
		//����, obj3�� �Ҵ�� �ν��Ͻ� ��ſ� obj2�� �ν��ϰ� ����Ǿ
		//���� �ִ� obj3�� �Ҵ�� �ν��Ͻ��� ���� ������(������ �÷��Ͱ� ã�Ƽ� ȸ��)
		obj3 = obj2;
		if(obj2.equals(obj3)){   //���� �ν��Ͻ� �ּҸ� ����Ű�� ������
			//�ν��Ͻ��� ���ٰ� ����, if���� True���� ����
			System.out.println("obj2 obj3 ����");
		} else {
			System.out.println("obj2 obj3���� ����");
		}
	}
}