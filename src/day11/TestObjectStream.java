//package day11;
//import java.io.*; 
//class Address implements Serializable{ 
//  private String addressName; 
//  private String zipCode;   
//  public Address(String addressName, String zipCode) {
//	super();
//	this.addressName = addressName;
//	this.zipCode = zipCode;
//}
//public String getAddressName() {
//	return addressName;
//}
//public void setAddressName(String addressName) {
//	this.addressName = addressName;
//}
//public String getZipCode() {
//	return zipCode;
//}
//public void setZipCode(String zipCode) {
//	this.zipCode = zipCode;
//}
////构造方法   
//  //set/get 方法   
// public String toString(){ 
//   return addressName + " " + zipCode; 
//  } 
//} 
//class Student implements Serializable { 
//  private String name; 
//  private transient int age; 
//  private Address addr; 
//  public Student(String name, int age, Address addr) {
//	super();
//	this.name = name;
//	this.age = age;
//	this.addr = addr;
//}
//public String getName() {
//	return name;
//}
//public void setName(String name) {
//	this.name = name;
//}
//public int getAge() {
//	return age;
//}
//public void setAge(int age) {
//	this.age = age;
//}
//public Address getAddr() {
//	return addr;
//}
//public void setAddr(Address addr) {
//	this.addr = addr;
//}
////构造方法…   
//  //set/get 方法…   
//  public String toString(){ 
//   return name + " " + age + " " + addr.toString(); 
//  } 
//} 
//public class TestObjectStream{ 
//  public static void main(String args[]) throws Exception{ 
//   Address addr = new Address("Beijing", "100000"); 
//   Student stu = new Student("Tom", 18, addr); 
//   ObjectOutputStream oos = new ObjectOutputStream( 
//      new FileOutputStream("stu.dat") ); 
//   oos.writeObject(stu); 
//   oos.close(); 
//    
//   ObjectInputStream oin = new ObjectInputStream( 
//      new FileInputStream("stu.dat") ); 
//   Student stu2 = (Student) oin.readObject(); 
//   oin.close(); 
//   System.out.println(stu2); 
//  } 
//}