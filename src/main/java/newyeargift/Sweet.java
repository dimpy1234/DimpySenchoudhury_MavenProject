package newyeargift;

public class Sweet implements Gift {
	public int price;
	public int weight;
	
	Sweet(int price, int weight) {
		this.price = price;
		this.weight = weight;
	}

	@Override
	public int getWeight() {
		return this.weight;
	}

	@Override
	public int getPrice() {
		return this.price;
	}

}