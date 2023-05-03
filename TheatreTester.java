class TheatreTester{
	public static void main(String movie[]){
		Theatre.addMovieName("Bahubali");
		Theatre.addMovieName("RRR");
		Theatre.addMovieName("Eega");
		Theatre.addMovieName("KGF");
		Theatre.addMovieName("Sir");
		Theatre.addMovieName("Virupaksha");
		Theatre.addMovieName("Dhamki");
		Theatre.addMovieName("Dhamaka");
		Theatre.addMovieName("Orange");
		Theatre.addMovieName("Veera");
		System.out.println("search  name");
		Theatre.getMovieNames();
		Theatre.updateMovieName("Eega","KGF 2");
		Theatre.getMovieNames();
		String  isPresent=Theatre.getTeaName("RRR");
		System.out.println("search  item is: "+isPresent);
	}

}