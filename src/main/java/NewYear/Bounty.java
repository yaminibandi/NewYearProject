package NewYear;
import java.util.*;
import java.util.Scanner;


public class Bounty  extends Chocolates
{
	private int count;
	public Bounty(int count)
	{
		super("Bounty",10,200);
		this.count=count;
	}
	public int getWeight()
	{
		return this.GiftWeight*this.count;
	}
	public int getCost()
	{
		return this.GiftCost*this.count;
	}
}