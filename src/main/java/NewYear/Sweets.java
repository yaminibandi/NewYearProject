package NewYear;
public class Sweets extends GiftDetails{

	public Sweets(String giftName, int giftCost, int giftWeight) {
		super(giftName, giftCost, giftWeight);
		// TODO Auto-generated constructor stub
	}
	public void Display()
	{
		System.out.println("Sweet-name : "+this.GiftName);
		System.out.println("Sweet-cost : Rs."+this.GiftCost);
		System.out.println("Sweet-weight : "+this.GiftWeight);
	}
}