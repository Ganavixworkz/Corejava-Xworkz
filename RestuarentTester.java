class RestuarentTester{
	public static void main(String menu[]){
		Restuarent.addMenus("Dosa");
		Restuarent.addMenus("Idly");
		Restuarent.addMenus("Parota");
		Restuarent.addMenus("Panner Butter Masala");
		Restuarent.addMenus("Biryani");
		Restuarent.addMenus("Butter Naan");
		Restuarent.addMenus("Roti");
		Restuarent.addMenus("Mutton gravy");
		Restuarent.addMenus("Chicken curry");
		Restuarent.addMenus("Chicken Biryani");
		Restuarent.addMenus("Butter Roti");
		Restuarent.addMenus("Chapathi");
		Restuarent.addMenus("Gobi");
		Restuarent.addMenus("Mushroom manchurian");
		Restuarent.addMenus("baby corn manchurian");
		System.out.println("search item");
		Restuarent.getMenu();
		Restuarent.updateMenu("Dosa","Masala Dosa");
		Restuarent.getMenu();
		String isPresent=Restuarent.getMenu("Gobi");
		System.out.println("search item is: "+isPresent);
	}

}