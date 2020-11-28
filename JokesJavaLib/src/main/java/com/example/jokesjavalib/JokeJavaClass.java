package com.example.jokesjavalib;

import java.util.ArrayList;
import java.util.Random;

    public class JokeJavaClass
    {
        Random rand;
        ArrayList<String> jokesList;

        public JokeJavaClass()
        {
            rand = new Random();
            jokesList = new ArrayList<String>();

            jokesList.add("HAHA!\n\n What did the left eye say to the right eye? \n\nBetween you and me, something smells.");

            jokesList.add("HAHA!\n\n Why is England the wettest country?\n\n Because the queen has reigned there for years.");

            jokesList.add("HAHA!\n\n What do you call bears with no ears?\n\n B–");
        }

        public String getRandomJoke()
        {
            return jokesList.get(rand.nextInt(jokesList.size()));
        }
    }


