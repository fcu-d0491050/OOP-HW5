package fcu.iecs.oop.pokemon;

import java.util.Scanner;
public class Pokemon {
	
	private static String name = Pokemon.getName();
	private static int cp;
	public static Pokemon p1;
	public static Pokemon p2;
	
	public static String getName ()
	{
		return name;
	}
	
	public static int increaseCP()
	{
		cp = cp + 500;
		return cp;
	}

}
