package com.xworkzz.vidhanasoudhaapp;

import com.xworkzz.vidhanasoudhaapp.cabinet.Cabinet;

public class VidhanasoudhaTester {

    public static void main(String[] args) {
        Cabinet cab = new Cabinet();
        VidhanaSoudha soudha = new VidhanaSoudha(cab);
        VidhanaSoudha.cabinet.toRule();
    }
}
