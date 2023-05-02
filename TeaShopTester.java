class TeaShopTester{
	public static void main(String tea[]){
		TeaShop.addTeaName("Black Tea");
		TeaShop.addTeaName("Normal Tea");
		TeaShop.addTeaName("Lemon Tea");
		TeaShop.addTeaName("Masala Tea ");
		TeaShop.addTeaName("Green Tea");
		TeaShop.getTeaNames();
		TeaShop.updateTeaName("Green Tea","Ginger Masala Tea");
		TeaShop.getTeaNames();
	}

}