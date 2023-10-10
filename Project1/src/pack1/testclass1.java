package pack1;

public class testclass1 //Pillar 1 - class creation
	{
	int a;
		
		public void Thangam() // method name uses ()
		{
			System.out.println("First Assignment ");
		
		}

		// pillar 2 - Main Method Creation
		public static void main(String[] args) {
			
			testclass1 abc= new testclass1(); // pillar 3 
			abc.Thangam() ;	
			abc.Thangam();
			abc.a=123;
			System.out.println(abc.a);
			
		}
	}


