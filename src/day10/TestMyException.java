package day10;

public class TestMyException{
public static void main(String args[]){
int n=1;
//����n
try{
m(n);
}catch(MyException1 ex1){
	System.out.println(ex1.getStackTrace());
	//���ex1 ��ϸ�ķ�������ջ��Ϣ
}catch(MyException2 ex2){
	System.out.println(ex2.getStackTrace());
	throw ex2;
	//���ex2 ����ϸ��Ϣ
//����ex2 �����׳�
}
}
public static void m(int n) throws MyException1{ //�����׳�MyException1
if (n == 1) {
		throw new MyException1("n==1");
	//�׳�MyException1
//���趨����ϸ��ϢΪ��n == 1��
}else {
	throw new MyException2("n==2");
//�׳�MyException2
//���趨����ϸ��ϢΪ��n == 2��
}
}
}
