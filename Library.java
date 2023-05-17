package com.xworkzz.libraryapp;

public class Library {

         String bookNames[] = new String[3];
        int i;
        public  boolean addBooks(String bookName){
            boolean isAdded = false;
            if(bookName!=null && i < bookNames.length){
                bookNames[i++]=bookName;
            }
            return isAdded;
        }
        //read/fetch/get
        public void getBookNames() {
            System.out.println("List of  book names available are : ");
            for (int i = 0; i < bookNames.length; i++) {
                System.out.println(bookNames[i]);

            }
        }
        }
