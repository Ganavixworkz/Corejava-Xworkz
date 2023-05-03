class OrianMall
{
	static String shopNames[]={null, null, null, null, null, null, null, null, null, null,null,null,null,null,null};
	static int index;
	// create/add/save
	public static boolean addShopName(String shopName){
		System.out.println("addShopName method started");
		boolean isAdded=false;
		if(shopName !=null && index < shopNames.length){
			shopNames[index++]=shopName;
			isAdded=true;
		}
		else{
		System.out.println("oops.overfilled");
		}
		System.out.println("addShopName method ended");
		return isAdded;
	}
	//read/fetch/get
	public static void getShopNames(){
		System.out.println("getShopName method started");
		System.out.println("List of shop names available are : ");
		for(int i=0;i<shopNames.length;i++){
			System.out.println(shopNames[i]);
			
		}
		
	}
	//update
	public static boolean updateShopName(String oldShopName ,String updatedShopName){
		System.out.println("updateShopName method started");
			System.out.println("updateShopName");
		boolean isUpdated=false;
		for(int i=0;i<shopNames.length;i++){
			if(shopNames[i].equals(oldShopName)){
			shopNames[i]=updatedShopName;
			isUpdated=true;	
			}	
		}
		System.out.println("updateShopName method ended");
		return isUpdated;
	}
public static String getShopName(String shopName)
{
	for(int i=0;i<shopNames.length;i++)
	{
if(shopNames[i].equals(shopName))
{
	return shopNames[i];
}
	}
	return ("no shopname name found");
}
}

	


