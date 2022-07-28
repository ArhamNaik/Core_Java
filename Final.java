package com.javatraining;
final class tvs {
	
	final int speedlimit=80;
	final void run()
	{
		system.out.println("speed of bike is :"+ speedlimit);
		
	}
}
public class Bike extends tvs{
	void run ()
	{
		system.out.println("speed of bike is :"+ speedlimit);
		
	}
	public static void main(Stri args[])

	{
		Bike obj = new Bike();
		obj.run();
	}}