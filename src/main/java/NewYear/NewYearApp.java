package NewYear;
import java.util.*;
import java.util.Scanner;

class SortByName implements Comparator<Chocolates>
{
	public int compare(Chocolates a, Chocolates b) {
		return a.getGiftName().compareToIgnoreCase(b.getGiftName());
	}
	
}
class SortByCost implements Comparator<Chocolates>
{
	public int compare(Chocolates a, Chocolates b) {
		return a.getGiftCost()-b.getGiftCost();
	}
}
class SortByWeight implements Comparator<Chocolates>
{
	public int compare(Chocolates a, Chocolates b) {
		return a.getGiftWeight()-b.getGiftWeight();
	}
	
}

public class NewYearApp 
{
    public static void main( String[] args )
    {
    	Scanner input=new Scanner(System.in);
        System.out.println("Enter Children count");
        int  n;
        n=input.nextInt();
        ArrayList<Gift> gift=new ArrayList<Gift>();
        for(int i=0;i<n;i++)
        {
        	DairyMilk dm=new DairyMilk();
        	FiveStar fs=new FiveStar();
        	Bounty b=new Bounty(i+1);
        	Rasgulla rasg=new Rasgulla(i+1);
        	Rasmalai rasm=new Rasmalai();
        	Barfi barf=new Barfi();
        	Gift x=new Gift();
        	x.addChocolate(dm);
        	x.addChocolate(fs);
        	x.addChocolate(b);
        	x.addSweets(rasg);
        	x.addSweets(rasm);
        	x.addSweets(barf);
        	gift.add(x);
        }
        int weight=0;
        for(Gift x:gift)
        {
        	for(Chocolates y:x.getChocolates())
        	{
        		weight+=y.getGiftWeight();
        	}
        	for(Sweets y:x.getSweets())
        	{
        		weight+=y.getGiftWeight();
        	}
        }
        System.out.println("The weight of total gifts are "+weight+"Grams");
        int op;
        System.out.println("Sorting Chocolates in a Gift");
        do
        {
        	System.out.println("Enter the option:");
        	System.out.println("1: Sort by Name");
        	System.out.println("2: Sort by Cost");
        	System.out.println("3: Sort by Weight");
        	System.out.println("4: Exit");
        	op=input.nextInt();
        	switch(op)
        	{
        	case 1:
        		for(Gift x:gift)
        		{
        			Collections.sort(x.getChocolates(),new SortByName());
        		}
        		break;
        	case 2:
        		for(Gift x:gift)
        		{
        			Collections.sort(x.getChocolates(),new SortByCost());
        		}
        		break;
        	case 3:
        		for(Gift x:gift)
        		{
        			Collections.sort(x.getChocolates(),new SortByWeight());
        		}
        		break;
        	case 4:
        		break;
        	default:
        		System.out.println("Invalid option\nPlease select again");
        	}
        	if(op!=4)
        	{
        		System.out.println("After Sorting....");
        		for(int i=0;i<gift.size();i++)
        		{
        			System.out.println("Gift:"+i+1);
        			gift.get(i).Display();
        		}
        	}
        }while(op!=4);
        System.out.println("Getting the candies in a gift");
        do
        {
        	System.out.println("Select the option below");
        	System.out.println("1: Candies by weight");
        	System.out.println("2: Candies by cost");
        	System.out.println("3: Exit");
        	op=input.nextInt();
        	int mi=0,ma=0;
        	switch(op)
        	{
        	case 1:
        		System.out.println("Enter the range of weight to consider");
        		mi=input.nextInt();
        		ma=input.nextInt();
        		break;
        	case 2:
        		System.out.println("Enter the range of Cost to consider");
        		mi=input.nextInt();
        		ma=input.nextInt();
        		break;
        	case 3:
        		break;
        	default:
        		System.out.println("Invalid option\nPlease select again");
        	}
        	if(op!=3)
        	{
        		System.out.print("The candies with ");
        		if(op==1)
        			System.out.print("Weight ");
        		else
        			System.out.println("Cost ");
        		System.out.println("int The range "+mi+","+ma+"are");
        		for(int i=0;i<gift.size();i++)
        		{
        			System.out.println("Gift:"+(i+1));
        			ArrayList<Chocolates> x=gift.get(i).getChocolates();
        			for(int j=0;j<x.size();j++)
        			{
        				int w[]=new int[2];
        				w[0]=x.get(j).getGiftWeight();
        				w[1]=x.get(j).getGiftCost();
        				if(w[op-1]>=mi && w[op-1]<=ma)
        				{
        					System.out.println(x.get(j).getGiftName());
        				}
        			}
        		}
        	}
        }while(op!=3);
        input.close();
        System.out.println("Thank You");
    }
}