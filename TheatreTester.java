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
		Theatre.getMovieNames();
		Theatre.updateMovieName("Eega","KGF 2");
		Theatre.getMovieNames();
	}

}