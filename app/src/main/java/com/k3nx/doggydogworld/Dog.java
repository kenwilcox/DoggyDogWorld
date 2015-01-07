package com.k3nx.doggydogworld;

import android.util.Log;

/**
 * Created by Ken Wilcox on 1/7/2015.
 */
public class Dog {
    String name = "unnamed";
    int age;
    int numberOfLegs = 4;
    String breed;

    public void bark() {
        Log.d("Dog", name + " says Bark");
    }
}
