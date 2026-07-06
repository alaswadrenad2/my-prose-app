/*
 * Copyright (c) 2026 Renad Al Aswad
 *
 * SPDX-License-Identifier: MIT
 */
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