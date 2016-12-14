package day11;

import java.io.*;
import java.util.Arrays;

public class demo {

	public static void main(String[] args) {
	OutputStream fos=null;
	byte array[]=new byte[]{'H','e','l','l','o',' ','W','o','r','l','d'};
	try{
		fos=new FileOutputStream("text.txt",true);
		fos.write(array);
	}catch(FileNotFoundException e){
		e.getStackTrace();
	}catch(IOException e){
		e.getStackTrace();
	}finally{
		try{
			if(fos!=null)
				fos.close();
		}catch(IOException e){
			fos=null;
		}
	}
	File file=new File("text.txt");
	InputStream fis=null;
	byte arr[]=new byte[(int) file.length()];
	try{
		fis=new FileInputStream(file);
		fis.read(arr);
		String str=new String(arr);
		System.out.println(str);
	}catch(FileNotFoundException e){
		e.getStackTrace();
	}catch(IOException e){
		e.getStackTrace();
	}finally{
		try{
			if(fis!=null)
				fis.close();
		}catch(IOException e){
			fis=null;
		}
	}

	}

}
