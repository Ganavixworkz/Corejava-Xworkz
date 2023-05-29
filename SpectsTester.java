package com.xworkzz.spectsapp;

import com.xworkzz.factoryapp.Factory;
import com.xworkzz.spectsapp.frames.Frames;

public class SpectsTester {
    public static void main(String[] args) {
        Frames  frames = new Frames();
        Spects spects = new Spects(frames);
        Spects.frame.toView();
    }
}
