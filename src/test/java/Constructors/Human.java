package Constructors;

public class Human {

	
	int age;
	int weight;
	String name;
	
	public void male()
	{
		
		System.out.println(" The person name is "+ name);
	
	
}
	
	public void female() {
		
		System.out.println(" The person name is "+name);
		
		System.out.println(" The age is  "+ age);
	}
	
	public Human(String name) {
		
		
		this.name= name;
	}
	
	public Human(String name,int weight, int age)
	{
	this.name=name;
	this.weight=weight;
	this.age= age;
	
	
}
}