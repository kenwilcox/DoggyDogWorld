package com.k3nx.doggydogworld;

import android.util.Log;

/**
 * Created by Ken Wilcox on 1/7/2015 4:51 PM.
 * Apparently more needs to be here to remove a warning
 * LAME
 */
public class Dog {
    String name = "unnamed";
    int age;
    int numberOfLegs = 4;
    String breed;

    public void bark() {
        String bark = name + " barked";
        Log.d("Dog", bark);
    }
}
