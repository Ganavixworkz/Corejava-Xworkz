class MobileShop{
	static String mobileNames[]={null, null, null, null, null, null, null, null, null, null};
	static int index;
	// create/add/save
	public static boolean addMobileName(String mobileName){
		System.out.println("addmobileName method started");
		boolean isAdded=false;
		if(mobileName !=null  && index < mobileNames.length){
			mobileNames[index++]=mobileName;
			isAdded=true;
		}
		else{
		System.out.println("oops...overfilled");
		}
		System.out.println("addMobileName method ended");
		return isAdded;
	}
	//read/fetch/get
	public static void getMobileNames(){
		System.out.println("getMobileName method started");
		System.out.println("List of  mobile names available are : ");
		for(int i=0;i<mobileNames.length;i++){
			System.out.println(mobileNames[i]);
			
		}
		
	}
	//update
	public static boolean updateMobileName(String oldMobileName ,String updatedMobileName){
		System.out.println("updateMobileName method started");
			System.out.println("updateMobileName");
		boolean isUpdated=false;
		for(int i=0;i<mobileNames.length;i++){
			if(mobileNames[i].equals(oldMobileName)){
			mobileNames[i]=updatedMobileName;
			isUpdated=true;	
			}	
		}
		System.out.println("updateMobileName method ended");
		return isUpdated;
	}
public static String getMobileName(String mobileName)
{
	for(int i=0;i<mobileNames.length;i++)
	{
if(mobileNames[i].equals(mobileName))
{
	return mobileNames[i];
}
	}
	return ("no mobile name found");
}
}

	


