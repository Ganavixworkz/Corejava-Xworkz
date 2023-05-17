package com.xworkzz.chatapp;


import java.util.Scanner;

public class ChatTester {

    public static void main(String args[])
    {
        Scanner sc = new Scanner((System.in));

        Chat chat = new Chat();
        for(int i =0; i< chat.chatNames.length;i++)
        {
            System.out.println("enter the chat name");
            String chatName = sc.next();
            chat.addChat(chatName);
        }
        chat.getChatNames();
    }
}
