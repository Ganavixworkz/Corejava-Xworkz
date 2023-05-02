class LibraryTester{
	public static void main(String book[]){
		Library.addBookName("jane eyre");
		Library.addBookName("ulysses");
		Library.addBookName("middlemarch");
		Library.addBookName("mrs dalloway");
		Library.addBookName("david copperfield");
		Library.addBookName("catch 22");
		Library.addBookName("beloved");
		Library.addBookName("war and peace");
		Library.addBookName("the sun also rises");
		Library.addBookName("pride");
		Library.addBookName("brave");
		Library.addBookName("the grapes of wrath");
		Library.addBookName("1984");
		Library.addBookName("wuthering heights");
		Library.addBookName("the raise");
		
		

		Library.getBookNames();
		Library.updateBookName("jane eyre","don quixote");
		Library.getBookNames();
	}

}