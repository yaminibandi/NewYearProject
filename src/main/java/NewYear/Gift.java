package NewYear;
import java.util.*;
public class Gift {

	private ArrayList<Chocolates>chocolates;
	private ArrayList<Sweets>sweets;
	public ArrayList<Chocolates> getChocolates() {
		return chocolates;
	}
	public void setChocolates(ArrayList<Chocolates> chocolates) {
		this.chocolates = chocolates;
	}
	public ArrayList<Sweets> getSweets() {
		return sweets;
	}
	public void setSweets(ArrayList<Sweets> sweets) {
		this.sweets = sweets;
	}
	public Gift(ArrayList<Chocolates> chocolates, ArrayList<Sweets> sweets) {
		this.chocolates = chocolates;
		this.sweets = sweets;
	}
	public Gift()
	{
		this.chocolates=new ArrayList<Chocolates>();
		this.sweets=new ArrayList<Sweets>();
	}
	public void addChocolate(Chocolates c)
	{
		this.chocolates.add(c);
	}
	public void addSweets(Sweets s)
	{
		this.sweets.add(s);
	}
	public Chocolates getChocolates(int i)
	{
		return this.chocolates.get(i);
	}
	public Sweets getSweets(int i)
	{
		return this.sweets.get(i);
	}
	public void Display()
	{
		for(Chocolates x:chocolates)
		{
			x.Display();
		}
		for(Sweets s:sweets)
		{
			s.Display();
		}
	}
	
}