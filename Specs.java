class Specs
{
	String color;
	String brandName;
	double price;
	double lensPower;
	int warranty; 
	
	public Specs()
	{
	}
	public Specs(String color,String brandName,double price,double lensPower,int warranty)
{	
		System.out.println("Specs features");
		this.color= color;
	this.brandName= brandName;
	this.price= price;
	this.lensPower= lensPower;
	this.warranty= warranty; 
	}
}