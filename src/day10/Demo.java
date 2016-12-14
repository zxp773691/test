package day10;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo {
	public static void main(String args[]){
		File file=new File("E:\\QQMusicCache");
		dir(file);
	}
	public static String getTime(long time){
		Date date=new Date(time);
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MM/dd    HH:mm");
		return sdf.format(date);
	}
	public static void dir(File file){
		File files[]=file.listFiles();
		int fileNum=0;
		int dirNum=0;
		long fileLen=0;
		long dirLen=0;
		for(File f:files){
			if(f.isDirectory()){
				System.out.println(getTime(f.lastModified())+"     <DIR>         "+f.getName());
				dirNum++;
				dirLen+=f.length();
			}
			if(f.isFile()){
				System.out.println(getTime(f.lastModified())+"     "+f.length()+"         "+f.getName());
				fileNum++;
				fileLen+=f.length();
			}
		}
		System.out.println("       "+dirNum+"个文件夹    "+dirLen+"个字节");
		System.out.println("       "+fileNum+"个文件    "+fileLen+"个字节");
	}
}
