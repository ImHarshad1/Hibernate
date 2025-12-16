package Oops;

	class product{
		private String name;
		private double price;
		private double discount;
		
		public product(String name, double price) {
			this.name = name;
			this.price = price;
			this.discount = 0;
		}
		public void  setdiscount(double discount){
			if(discount >=0 && discount <=50) {
				this.discount=discount;
			}else {
				System.out.println("Invalid Discount: ");
			}
		}
		public String getname() {
			return name;
		}
		public double getfinalprice() {
			return price-(price*discount/100);
		}
		public double getogprice() {
			return price;
		}
	}

public class EncapDiscount {
	public static void main(String[] args) {
		product p1=new product("Laptop",50000);
		System.out.println("Product: "+p1.getname());
		System.out.println("Original Price"+p1.getogprice());
		p1.setdiscount(10);
		System.out.println("Final Price: "+p1.getfinalprice());
		p1.setdiscount(0);
	}

}
