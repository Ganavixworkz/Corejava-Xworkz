package com.xworkzz.theatreapp;

import java.util.Scanner;
public class TheatreTester {

    public static void main(String args[])
    {
        Scanner  sc = new Scanner((System.in));
        Theatre  theatre = new Theatre();
        for(int i=0;i<theatre.movieNames.length;i++)
        {
            System.out.println("Enter  the Movie Names");
            String  movies = sc.next();
            theatre.addMovie(movies);

        }
        theatre.getMovieName();
    }

}
