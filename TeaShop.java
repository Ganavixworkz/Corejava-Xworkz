class TeaShop{
	static String teaNames[]={null, null, null, null, null};
	static int index;
	// create/add/save
	public static boolean addTeaName(String teaName){
		System.out.println("addTeaName method started");
		boolean isAdded=false;
		if(teaName !=null){
			teaNames[index++]=teaName;
			isAdded=true;
		}
		else{
		System.out.println("Enter valid teaName");
		}
		System.out.println("addTeaName method ended");
		return isAdded;
	}
	//read/fetch/get
	public static void getTeaNames(){
		System.out.println("getTeaName method started");
		System.out.println("List of  tea names available are : ");
		for(int i=0;i<teaNames.length;i++){
			System.out.println(teaNames[i]);
			
		}
		
	}
	//update
	public static boolean updateTeaName(String oldTeaName ,String updatedTeaName){
		System.out.println("updateTeaName method started");
			System.out.println("updateTeaName");
		boolean isUpdated=false;
		for(int i=0;i<teaNames.length;i++){
			if(teaNames[i].equals(oldTeaName)){
			teaNames[i]=updatedTeaName;
			isUpdated=true;	
			}	
		}
		System.out.println("updateTeaName method ended");
		return isUpdated;
	}
}
	


