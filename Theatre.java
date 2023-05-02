class Theatre{
	static String movieNames[]={null, null, null, null, null, null, null, null, null, null};
	static int index;
	// create/add/save
	public static boolean addMovieName(String movieName){
		System.out.println("addmovieName method started");
		boolean isAdded=false;
		if(movieName !=null){
			movieNames[index++]=movieName;
			isAdded=true;
		}
		else{
		System.out.println("Enter valid movieName");
		}
		System.out.println("addmovieName method ended");
		return isAdded;
	}
	//read/fetch/get
	public static void getMovieNames(){
		System.out.println("getMovieName method started");
		System.out.println("List of  movie names available are : ");
		for(int i=0;i<movieNames.length;i++){
			System.out.println(movieNames[i]);
			
		}
		
	}
	//update
	public static boolean updateMovieName(String oldMovieName ,String updatedMovieName){
		System.out.println("updateMovieName method started");
			System.out.println("updateMovieName");
		boolean isUpdated=false;
		for(int i=0;i<movieNames.length;i++){
			if(movieNames[i].equals(oldMovieName)){
			movieNames[i]=updatedMovieName;
			isUpdated=true;	
			}	
		}
		System.out.println("updateMovieName method ended");
		return isUpdated;
	}
}
	


