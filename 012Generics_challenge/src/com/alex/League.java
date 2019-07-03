package com.alex;

import java.util.ArrayList;
import java.util.Collections;

// Create a generic class to implement a league table for a sport.
// The class should allow teams to be added to the list, and store
// a list of teams that belong to the league.


public class League<T extends Team> {
    public String name;
    private ArrayList<T> league = new ArrayList<>();

    public League(String name) {
        this.name = name;
    }

    public boolean add(T team) {
        if(league.contains(team)) {
            return false;
        }
        league.add(team);
        return true;
   }

    // Your class should have a method to print out the teams in order,
    // with the team at the top of the league printed first.
    // sort() de aici functioneaza pt ca in clasa Team
    //ai scris metoda compareTo() care e folosita automat de frameworkul Collections

    public void showLeagueTable() {
        Collections.sort(league);
        for(T t : league) {
            System.out.println(t.getName() + ": " + t.ranking());
        }
    }
}
