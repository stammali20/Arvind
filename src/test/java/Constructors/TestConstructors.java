package Constructors;

public class TestConstructors {

	
	
	public static void main(String[] args) {
	
		TestConstructors obj= new TestConstructors();
		
int z= obj.add();
System.out.println("value is : "+z);

	}
public int add() {
	
	int a=5;
	int b=10;
	int c= a+b;
	return c;
	
}
}
