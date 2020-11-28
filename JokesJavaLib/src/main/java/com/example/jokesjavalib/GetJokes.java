package com.example.jokesjavalib;

import java.util.ArrayList;
import java.util.Random;

public class GetJokes {
    Random rand;
    ArrayList<String> jokesList;
    public String getJoke(){
        return "This is a joke...laugh!! HAHA HAHA HAHA!!";
    }

    public void JokeJavaClass()
    {
        rand = new Random();
        jokesList = new ArrayList<String>();

        jokesList.add("Why did Thomas Muller refuse to have breakfast in the morning?\n\nBecause he 8-2 much last night!");

        jokesList.add("What is Sead Kolasinac's favourite cool drink brand?\n\nIt's Coca Colasinac");

        jokesList.add("What is Luis Suarez's favourite music band?\n\nIt's 6-1 direction");
    }

    public String getRandomJoke()
    {
        return jokesList.get(rand.nextInt(jokesList.size()));
    }
}