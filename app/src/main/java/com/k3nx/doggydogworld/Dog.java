package com.k3nx.doggydogworld;

import android.util.Log;

/**
 * Created by Ken Wilcox on 1/7/2015 4:51 PM.
 * Apparently more needs to be here to remove a warning
 * LAME
 */
public class Dog {
    private String name = "unnamed";
    private int age = 1;
    private int numberOfLegs = 4;
    private String breed = "mutt";

    Dog() {
        Log.d("Dog", "Constricting...");
    }

    Dog(String dogName) {
        name = dogName;
    }

    Dog(String dogName, int dogAge) {
        name = dogName;
        age = dogAge;
    }

    public void bark() {
        String bark = this.name + " barked";
        Log.d("Dog", bark);
    }

    public void barkAt(String victim) {
        String bark = this.name + " barked at " + victim;
        Log.d("Dog", bark);
    }


}
