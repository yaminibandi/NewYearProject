package NewYear;

public class GiftDetails {
	protected String GiftName;
	protected int GiftCost,GiftWeight;
	public String getGiftName() {
		return GiftName;
	}
	public void setGiftName(String giftName) {
		GiftName = giftName;
	}
	public int getGiftCost() {
		return GiftCost;
	}
	public void setGiftCost(int giftCost) {
		GiftCost = giftCost;
	}
	public int getGiftWeight() {
		return GiftWeight;
	}
	public void setGiftWeight(int giftWeight) {
		GiftWeight = giftWeight;
	}
	public GiftDetails(String giftName, int giftCost, int giftWeight) {
		super();
		GiftName = giftName;
		GiftCost = giftCost;
		GiftWeight = giftWeight;
	}

}
