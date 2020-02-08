package newyeargift;

public class Chocolate implements Gift{
	public int price;
	public int weight;
	
	Chocolate(int price, int weight) {
		this.price = price;
		this.weight = weight;
	}
	
	public int getWeight() {
		return this.weight;
	}
	
	public int getPrice() {
		return this.price;
	}
}
