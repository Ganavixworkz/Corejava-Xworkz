package com.xworkzz.theatreapp;

public class Theatre {

    String  movieNames[] = new  String[4];
    int i;

    public boolean addMovie(String movies)
    {
        boolean isAdded = false;
        if(movies != null  &&  i<movieNames.length)
        {
            movieNames[i++] =movies;
            isAdded =true;
        }
        else
        {
            System.out.println("exceeded");
        }
        return isAdded;
    }
    public void getMovieName()
    {
        System.out.println("list of  movies:");
        for(int i=0;i<movieNames.length;i++)
        {
            System.out.println(movieNames[i]);
        }
    }

}

