package day10;

public class TestMyException{
public static void main(String args[]){
int n=1;
//读入n
try{
m(n);
}catch(MyException1 ex1){
	System.out.println(ex1.getStackTrace());
	//输出ex1 详细的方法调用栈信息
}catch(MyException2 ex2){
	System.out.println(ex2.getStackTrace());
	throw ex2;
	//输出ex2 的详细信息
//并把ex2 重新抛出
}
}
public static void m(int n) throws MyException1{ //声明抛出MyException1
if (n == 1) {
		throw new MyException1("n==1");
	//抛出MyException1
//并设定其详细信息为“n == 1”
}else {
	throw new MyException2("n==2");
//抛出MyException2
//并设定其详细信息为“n == 2”
}
}
}
