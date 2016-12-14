//package day11;
//
//import java.io.*;  
//class Address{ 
// private String addressName; 
// private String zipCode;  
// //构造方法…  
// //get/set 方法… 
//public Address(String addressName, String zipCode) {
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
// }  
//class Worker implements Serializable{ 
// private String name; 
// private int age; 
// private Address address;   
// //构造方法…   
// //get/set 方法… 
//public Worker(String name, int age, Address address) {
//	super();
//	this.name = name;
//	this.age = age;
//	this.address = address;
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
//public Address getAddress() {
//	return address;
//}
//public void setAddress(Address address) {
//	this.address = address;
//}
// }  
//public class TestSerializable { 
// public static void main(String args[]) throws Exception{ 
//  Address addr = new Address("Beijing", "100000"); 
//  Worker w = new Worker("Tom", 18, addr); 
//  ObjectOutputStream oout = new ObjectOutputStream(  
//new FileOutputStream("fout.dat") ); 
//  oout.writeObject(w); 
//  oout.close(); 
// } 
//}