package com.udacity.gradle.builditbigger.backend;


import com.example.jokesjavalib.GetJokes;
import com.example.jokesjavalib.JokeJavaClass;

/** The object model for the data we are sending through endpoints */
public class MyBean {

    private String myData;
    private JokeJavaClass mJokeObject;
    public String getData() {
        return myData;
    }

    public void setData(String data) {
        myData = data;
    }

    public MyBean() {
        mJokeObject = new JokeJavaClass();
    }

    public String getJoke() {
        return mJokeObject.getRandomJoke();
    }
}