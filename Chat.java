package com.xworkzz.chatapp;

public class Chat {

    String chatNames[] = new String[5];
    int i;

    public boolean addChat(String chatName) {
        boolean isAdded = false;
        if (chatName != null && i < chatNames.length) {
            chatNames[i++] = chatName;
            isAdded = true;
        }

            return isAdded;

        }


    public void getChatNames() {
        System.out.println("list of chats available: ");
        for (int i = 0; i < chatNames.length; i++) {
            System.out.println(chatNames[i]);
        }
    }
}

