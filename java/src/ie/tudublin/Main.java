
// Packages must match the folder structure
package ie.tudublin;

public class Main
{

	public void helloProcessing()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new Life());
    }

	public void newProcessing()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new newprocessing());
    }

	public void doDogStuff()
	{
		// Create a new Dog called Misty
		// Call the constructor
		Dog misty = new Dog("Misty");
		misty.speak();

		System.out.println(misty);

        Dog lucy = new Dog("Lucy");
		lucy.speak();
	}

	public void doCatStuff()
	{
		// Put your code here
		System.out.println("cats are from space");
	}
	
	public static void main(String[] args)
	{
		Main m = new Main();
		m.helloProcessing();
		// m.helloProcessing();
	}
	
}