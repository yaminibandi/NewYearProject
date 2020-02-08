package NewYear;

public class Rasgulla extends Sweets{

	public int count;
	public Rasgulla(int count)
	{
		super("Rasgulla",20,250);
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