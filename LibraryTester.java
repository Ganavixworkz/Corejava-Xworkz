package com.xworkzz.libraryapp;

import java.util.Scanner;

public class LibraryTester {

    public  static void  main(String  args[])
    {
        Scanner  sc = new Scanner((System.in));
        Library  library  =  new Library();
    for(int i=0;i<library.bookNames.length;i++)
    {
    System.out.println("enter the books name");
    String bookName = sc.next();
    library.addBooks(bookName);
    }
    library.getBookNames();
    }
}
