package day11;

import java.io.File;

class TestMyFile{ 
	  public static void main(String args[]) throws Exception{
		  
	  
	   File file=new File("hello.txt");    //����һ�� File �����ʾ��ǰĿ¼�µġ�hello.txt���ļ�    //�жϸ��ļ��Ƿ����    //������ļ����ڣ���������ļ�������·��   } 
	   System.out.println(file.exists());
	   System.out.println(file.getParent());
	  }
}