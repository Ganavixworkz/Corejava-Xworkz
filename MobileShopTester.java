class MobileShopTester{
	public static void main(String mobile[]){
		MobileShop.addMobileName("vivo");
		MobileShop.addMobileName("samsung");
		MobileShop.addMobileName("iphone");
		MobileShop.addMobileName("nokia");
		MobileShop.addMobileName("redme not 9 pro");
		MobileShop.addMobileName("redme note 5");
		MobileShop.addMobileName("poco");
		MobileShop.addMobileName("idea");
		MobileShop.addMobileName("oppo");
		MobileShop.addMobileName("lava");
		

		MobileShop.getMobileNames();
		MobileShop.updateMobileName("iphone","apple");
		MobileShop.getMobileNames();
	}

}