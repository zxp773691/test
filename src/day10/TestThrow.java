package day10;

public class TestThrow{
public static void main(String args[]){
throwException(10);
}
public static void throwException(int n){
if (n == 0){
	throw new NullPointerException();
	//抛出一个NullPointerException
}else{
	try{
		throw new ClassCastException();
	}catch(ClassCastException ex){
		System.err.println("类型转换出错");
	}
//抛出一个ClassCastException
//并设定详细信息为“类型转换出错”
}
}
}
