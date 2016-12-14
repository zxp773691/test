package day11;

import java.io.File;

class TestMyFile{ 
	  public static void main(String args[]) throws Exception{
		  
	  
	   File file=new File("hello.txt");    //创建一个 File 对象表示当前目录下的“hello.txt”文件    //判断该文件是否存在    //如果该文件存在，则输出该文件的完整路径   } 
	   System.out.println(file.exists());
	   System.out.println(file.getParent());
	  }
}