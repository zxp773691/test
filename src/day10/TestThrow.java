package day10;

public class TestThrow{
public static void main(String args[]){
throwException(10);
}
public static void throwException(int n){
if (n == 0){
	throw new NullPointerException();
	//�׳�һ��NullPointerException
}else{
	try{
		throw new ClassCastException();
	}catch(ClassCastException ex){
		System.err.println("����ת������");
	}
//�׳�һ��ClassCastException
//���趨��ϸ��ϢΪ������ת������
}
}
}
