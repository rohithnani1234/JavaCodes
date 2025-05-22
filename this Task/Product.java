package thistasks;

public class Product {
	int id;
	double price;
	public Product(int id,double price) {
		this.id=id;
		this.price=price;
	}
	public boolean isSame(Product p) {
		return this.id==p.id;
	}
	public void test() {
		System.out.println("Product Id:"+id+"\tPrice:"+price);
	}
	public static void main(String[] args) {
		Product p1=new Product(100, 57.5);
		Product p2=new Product(100, 85.5);
		p1.test();
		p2.test();
		if(p1.isSame(p2)) {
			System.out.println("both ids are same");
		} else {
			System.out.println("both ids are not same");
		}
	}
}
