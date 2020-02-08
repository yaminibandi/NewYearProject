package NewYear;
import java.util.*;
import java.util.Scanner;

public class Chocolates extends GiftDetails{

public Chocolates(String giftName, int giftCost, int giftWeight) {
	super(giftName, giftCost, giftWeight);
	// TODO Auto-generated constructor stub
}
public void Display()
{
	System.out.println("Chocolate-name : "+this.GiftName);
	System.out.println("Chocolate-cost : Rs."+this.GiftCost);
	System.out.println("Chocolate-weight : "+this.GiftWeight);
}
}