package day11;

import java.io.*;
import java.util.*;

public class Worker implements Serializable{
	private String name;
	private int age;
	private double salary;
	public Worker(String name, int age, double salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	public static void main(String args[]){
//		List<Worker> list=new ArrayList<Worker>();
//		Worker w1=new Worker("Î¤ÕñÑþ",22,3000);
//		Worker w2=new Worker("ÕÅÐñ",21,3000);
//		list.add(w1);
//		list.add(w2);
//		Input(list);
//		Object obj=read();
//		List<Worker> l=(List<Worker>) obj;
		Worker w1=new Worker("Tom",30,5000);
		File f1=new File("text.txt");
		saveWorkerToFile(w1,f1);
		for(Worker worker:readWorkerFromFile(f1)){
			System.out.println(worker.getName()+" "+worker.getAge()+" "+worker.getSalary());
		}
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public static void Input(Object obj){
		try(
				FileOutputStream fos=new FileOutputStream("worker.txt");
				ObjectOutputStream oos=new ObjectOutputStream(fos);
				){
			oos.writeObject(obj);
			oos.flush();
		}catch(IOException e){
			e.getStackTrace();
		}
	}
	public static Object read(){
		Object obj=null;
		try(
				FileInputStream fis=new FileInputStream("worker.txt");
				ObjectInputStream ois=new ObjectInputStream(fis);
				){
				obj=ois.readObject();
		}catch(IOException e){
			e.getStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return obj;
	}
	public static void saveWorkerToFile(Worker w, File file){
		try(
				FileOutputStream fos=new FileOutputStream(file,true);
				OutputStreamWriter osr=new OutputStreamWriter(fos);
				PrintWriter pw=new PrintWriter(osr);
				){
			pw.println(w.getName()+"/"+w.getAge()+"/"+w.getSalary());
			pw.flush();
		}catch(FileNotFoundException e){
			e.getStackTrace();
		}catch(IOException e){
			e.getStackTrace();
		}
	}
	public static List<Worker> readWorkerFromFile(File file){
		List<Worker> list=new ArrayList<Worker>();
		String str=null;
		String strs[]=new String[3]; 
		try(
				FileReader fr=new FileReader(file);
				BufferedReader br=new BufferedReader(fr);
				){
			while((str=br.readLine())!=null){
				strs=str.split("/");
				Worker worker=new Worker(strs[0],Integer.parseInt(strs[1]),Double.parseDouble(strs[2]));
				list.add(worker);
			}
		}catch(IOException e){
			e.getStackTrace();
		}
		return list;
	}
	
	
}
