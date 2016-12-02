package fcu.iecs.oop.pokemon;

import java.util.Scanner;
public class Pokemon {
	
	private String name = Pokemon.getName();
	private int cp;
	
	public  Pokemon(String name, int cp)
	{
		this.name = name;
		this.cp=cp;
	}
	
	public String getName ()
	{
		return name;
	}
	
	public int getCp()
	{
		return cp;
	}

	  public void setCp(int cp)
	  {
		this.cp = cp;
	  }

}
