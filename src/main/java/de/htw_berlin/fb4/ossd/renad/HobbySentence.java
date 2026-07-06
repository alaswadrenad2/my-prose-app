package de.htw_berlin.fb4.ossd.renad;

import de.htw_berlin.fb4.ossd.prose.Sentence;

public class HobbySentence implements Sentence {

    @Override
    public String get() {
        return "I like programming.";
    }
}