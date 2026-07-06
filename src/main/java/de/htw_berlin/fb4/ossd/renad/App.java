package de.htw_berlin.fb4.ossd.renad;

import de.htw_berlin.fb4.ossd.prose.ProseBuilder;

public class App {

    public static void main(String[] args) {

        ProseBuilder builder = new ProseBuilder();

        builder.register(new GreetingSentence());
        builder.register(new HobbySentence());

        System.out.println(builder.build());
    }
}