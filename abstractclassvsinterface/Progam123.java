package abstractclassvsinterface;

interface Printable
{
	void print();
}

interface Showable
{
	void show();
}

class Progam123 implements Printable,Showable{

 public void print()
	{
		System.out.println("Hello");
	}
	
 public void show()
 {
	 System.out.println("welcome");
 }
	public static void main(String[] args) {
		
		Progam123 obj = new Progam123();
		obj.print();
		obj.show();
	}

}
