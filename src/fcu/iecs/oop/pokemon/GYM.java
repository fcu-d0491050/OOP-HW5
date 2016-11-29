package fcu.iecs.oop.pokemon;

public class GYM
{

	public static void fight(Pokemon p1, Pokemon p2)
	{
		System.out.printf("Winner is %s", Pokemon.getName());
		Pokemon.increaseCP();
	}

	
}
