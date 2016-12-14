package day11;

import java.io.*;
import java.util.*;

public class p20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list=new ArrayList<String>();
		WorldCup();
		list=getWC();
		int i=0;
		String strs[]=new String[2];
		Scanner in=new Scanner(System.in);
		int year=in.nextInt();
		for(String str:list){
			strs=str.split("/");
			if(Integer.parseInt(strs[0])==year){
				System.out.println(strs[1]);
				i++;
			}
		}
		if(i==0){
			System.out.println("没有举办世界杯");
		}
	}
	public static void WorldCup(){
		try(
				FileOutputStream fos=new FileOutputStream("worldcup.txt");
				OutputStreamWriter osw=new OutputStreamWriter(fos,"utf-8");
				PrintWriter pw=new PrintWriter(osw);
				){
			pw.println("2006/意大利");
			pw.println("2002/巴西");
		}catch(IOException e){
			e.getStackTrace();
		}
	}
	public static List<String> getWC(){
		String str=null;
		List<String> list=new ArrayList<String>();
		try(
				FileInputStream fis=new FileInputStream("worldcup.txt");
				InputStreamReader isr=new InputStreamReader(fis,"utf-8");
				BufferedReader bf=new BufferedReader(isr);
				){
			while((str=bf.readLine())!=null){
				list.add(str);
				}
		}catch(IOException e){
			e.getStackTrace();
		}
		return list;
	}

}
