package day11;

import java.io.*;

public class p15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		try(
//				FileOutputStream fis =new FileOutputStream("test.txt");
//				OutputStreamWriter osw=new OutputStreamWriter(fis,"gbk");
//				PrintWriter pw=new PrintWriter(osw);
//				){
//			pw.println("��ǰ���¹�");
//			pw.println("���ǵ���˪");
//			pw.println("��ͷ������");
//			pw.println("��ͷ˼����");
//		}catch(IOException e){
//			e.getStackTrace();
//		}
		String str;
		try(
				FileInputStream fis=new FileInputStream("test.txt");
				InputStreamReader isr=new InputStreamReader(fis,"gbk");
				BufferedReader br=new BufferedReader(isr);
				FileOutputStream fos =new FileOutputStream("test2.txt");
				OutputStreamWriter osw=new OutputStreamWriter(fos,"utf-8");
				PrintWriter pw=new PrintWriter(osw);
				){
			while((str=br.readLine())!=null){
				pw.println(str);
			}
		}catch(IOException e){
			e.getStackTrace();
		}
	}

}
