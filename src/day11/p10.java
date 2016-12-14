package day11;

import java.io.*;

public class p10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file=new File("test.dat");
		FileOutputStream fos=null;
		DataOutputStream dos = null;
		FileInputStream fis=null;
		DataInputStream dis=null;
		try {
			fos = new FileOutputStream(file);
			dos=new DataOutputStream(fos);
			fis=new FileInputStream(file);
			dis=new DataInputStream(fis);
			if(!file.exists()){
				dos.writeLong(10000L);
				dos.flush();
			}else{
				int i=dis.readInt();
				i++;
				dos.writeInt(i);
				dos.flush();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try{
				if(dos!=null){
					dos.close();
				}
				if(fos!=null){
					fos.close();
				}
				if(dis!=null){
					dis.close();
				}
				if(fis!=null){
					fis.close();
				}
			}catch(IOException e){
				dos=null;
				fos=null;
				dis=null;
				fis=null;
			}
		}
	}

}
