package de.htw_berlin.fb4.ossd.renad;

import de.htw_berlin.fb4.ossd.prose.Sentence;

public class GreetingSentence implements Sentence {

    @Override
    public String get() {
        return "Hello, my name is Renad.";
    }
}