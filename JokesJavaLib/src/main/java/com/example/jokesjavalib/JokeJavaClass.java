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
            //4 jokes on big football results in UEFA Champions League

            //Bayern Munich 8 - 2 Barcelona
            jokesList.add("What did the left eye say to the right eye? \n\nBetween you and me, something smells.");

            //Arsenal LB Sead Kolasinac's parody name
            jokesList.add("Why is England the wettest country?\n\n Because the queen has reigned there for years.");

            //Barcelona 6 - 1 Paris Saint Germain
            jokesList.add("What do you call bears with no ears?\n\n B–");
        }

        public String getRandomJoke()
        {
            return jokesList.get(rand.nextInt(jokesList.size()));
        }
    }


