package newyeargift;

public class Candy extends Chocolate {
	Candy(int price, int weight) {
		super(price, weight);
	}
	
	public int getWeight() {
		return this.weight;
	}
	
	public int getPrice() {
		return this.price;
	}
}