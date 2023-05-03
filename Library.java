class Library{
	static String bookNames[]={null, null, null, null, null, null, null, null, null, null, null, null, null, null, null};
	static int index;
	// create/add/save
	public static boolean addBookName(String bookName){
		System.out.println("addBookName method started");
		boolean isAdded=false;
		if(bookName!=null && index < bookNames.length){
			bookNames[index++]=bookName;
			isAdded=true;
		}
		else{
		System.out.println("oops...overfilled");
		}
		System.out.println("addBookName method ended");
		return isAdded;
	}
	//read/fetch/get
	public static void getBookNames(){
		System.out.println("getBookName method started");
		System.out.println("List of  book names available are : ");
		for(int i=0;i<bookNames.length;i++){
			System.out.println(bookNames[i]);
			
		}
		
	}
	//update
	public static boolean updateBookName(String oldBookName ,String updatedBookName){
		System.out.println("updateBookName method started");
			System.out.println("updateBookName");
		boolean isUpdated=false;
		for(int i=0;i<bookNames.length;i++){
			if(bookNames[i].equals(oldBookName)){
			bookNames[i]=updatedBookName;
			isUpdated=true;	
			}	
		}
		System.out.println("updateBookName method ended");
		return isUpdated;
	}
public static String getBookName(String bookName)
{
	for(int i=0;i<bookNames.length;i++)
	{
if(bookNames[i].equals(bookName))
{
	return bookNames[i];
}
	}
	return ("no book name found");
}
}

	


