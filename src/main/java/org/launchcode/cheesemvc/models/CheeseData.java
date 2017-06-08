package org.launchcode.cheesemvc.models;

import java.util.ArrayList;

/**
 * Created by kajuh_000 on 6/5/2017.
 */
public class CheeseData {

    static ArrayList<Cheese> cheeses = new ArrayList<>();

    //getAll
    public static ArrayList<Cheese> getAll(){
        return cheeses;
    }

    //Add
    public static void add(Cheese newCheese){
        cheeses.add(newCheese);
    }

    //Remove
    public static void remove(int id) {
        Cheese cheeseToRemove = getById(id);
        cheeses.remove(cheeseToRemove);
    }

    //GetById
    public static Cheese getById(int id) {

        Cheese theCheese = null;

        for(Cheese candidateCheese : cheeses) {
            if(candidateCheese.getCheeseId() == id) {
                theCheese = candidateCheese;
            }
        }

        return theCheese;
    }
}
