class TeaShopTester{
	public static void main(String tea[])
	{
		TeaShop.addTeaName("Black Tea");
		TeaShop.addTeaName("Normal Tea");
		TeaShop.addTeaName("Lemon Tea");
		TeaShop.addTeaName("Masala Tea ");
		TeaShop.addTeaName("Green Tea");
		TeaShop.addTeaName("Chocholate tea");
		System.out.println("searching name");
		TeaShop.getTeaNames();
		TeaShop.updateTeaName("Green Tea","Ginger Masala Tea");
		TeaShop.getTeaNames();
		String isPresent=TeaShop.getTeaName("Black Tea");
		System.out.println("search item   is: "+isPresent);
		System.out.println("Main method  ended");
	}

}