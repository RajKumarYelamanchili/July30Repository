package abstractclassvsinterface;

 abstract class Bike
 {
	abstract void run(); 
 }

class Honda extends Bike
{
	void run()
	{
		System.out.println("running properly");
	}
	public static void main(String[] args) 
	{
		Bike obj = new Honda();
		obj.run();

	}//end of main
	
}//end of class


