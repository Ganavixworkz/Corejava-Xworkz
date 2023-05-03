class Restuarent{
	static String menus[]={null, null, null, null, null, null, null, null, null, null, null, null, null, null, null};
	static int index;
	public static boolean addMenus(String menu){
		System.out.println("addMenu method started");
		boolean isAdded=false;
		if(menu!=null && index < menus.length){
			menus[index++]=menu;
			isAdded=true;
		}
		else{
		System.out.println("oops ...overfilled");
		}
		System.out.println("addMenu method ended");
		return isAdded;
	}
	public static void getMenu(){
		System.out.println("getMenu method started");
		System.out.println("List of  menu names available are : ");
		for(int i=0;i<menus.length;i++){
			System.out.println(menus[i]);
			
		}
		
	}
	public static boolean updateMenu(String oldMenu ,String updatedMenu){
		System.out.println("updateMenu method started");
			System.out.println("updateMenu");
		boolean isUpdated=false;
		for(int i=0;i<menus.length;i++){
			if(menus[i].equals(oldMenu)){
			menus[i]=updatedMenu;
			isUpdated=true;	
			}	
		}
		System.out.println("updateMenu method ended");
		return isUpdated;
	}
public static String getMenu(String Menu)
{
	for(int i=0;i<menus.length;i++)
	{
if(menus[i].equals(Menu))
{
	return menus[i];
}
	}
	return ("no menu name found");
}
}



