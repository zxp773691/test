package day11;

import java.io.*;

public class p23 {
	public static void main(String args[]){
		File file=new File("D:\\ʵѵ\\work\\day10\\worldcup.txt");
		copy(file);
	}
	public static void copy(File file){
		int date=0;
		byte array[]=new byte[10];
		if(file.exists()){
			try(
					FileInputStream fis=new FileInputStream(file);
					FileOutputStream fos=new FileOutputStream(file.getParent()+"\\copy_"+file.getName());
					){
				while((date=fis.read(array))!=-1){
					fos.write(array,0,date);
				}
			}catch(IOException e){
				e.getStackTrace();
			}
		}
	}
}
