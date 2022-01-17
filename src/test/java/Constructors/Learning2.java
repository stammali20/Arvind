package Constructors;


public class Learning2{
	
	static Learning1 obj1=new Learning1();
	
	public static void main(String[] args) {
		


		// TODO Auto-generated method stub
		
		Learning2 obj2= new Learning2();
		
		int k = obj1.add();
		
		int j= obj2.div(10, 2);
		
		System.out.println("the value is "+ j);
		
	}

	
	public int div(int c, int d) {
		
        
		
		int k = obj1.add();
		
		System.out.println("the add is" + k);
		int e=c/d;
		return e;
		
	}
}
