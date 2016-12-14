package day10;

//import java.io.*;
//import java.sql.*;
//class TestException{
//public static void main(String args[]){
//System.out.println("main 1");
//int n=3;
////∂¡»În
//ma(n);
//System.out.println("main2");
//}
//public static void ma(int n){
//try{
//System.out.println("ma1");
//mb(n);
//System.out.println("ma2");
//}catch(EOFException e){
//System.out.println("Catch EOFException");
//}catch(IOException e){
//System.out.println("Catch IOException");
//}catch(SQLException e){
//System.out.println("Catch SQLException");
//}catch(Exception e){
//System.out.println("Catch Exception");
//}finally{
//System.out.println("In finally");
//}
//}
//public static void mb(int n) throws Exception{
//System.out.println("mb1");
//if (n == 1) throw new EOFException();
//if (n == 2) throw new FileNotFoundException();
//if (n == 3) throw new SQLException();
//if (n == 4) throw new NullPointerException();
//System.out.println("mb2");
//}
//}
class MyException{}
class TestException{
public static void main(String args[]){
ma();
}
public static int ma(){
try{
m();
return 100;
}catch(ArithmeticException e){
	System.out.println("ArithmeticException");
	return 0;
}catch(Exception e){
System.out.println("Exception");
return 0;
}
}
public static void m() throws MyException1{
throw new MyException1();
}
}

