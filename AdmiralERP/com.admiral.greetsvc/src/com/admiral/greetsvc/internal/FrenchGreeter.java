package com.admiral.greetsvc.internal;

import com.admiral.greetsvc.GreeterService;

import java.util.Locale;

public class FrenchGreeter implements GreeterService {
    @Override
    public String greet(String subject) {
        return "Bonjour " + subject;
    }

    @Override
    public Locale getLocale() {
        return Locale.FRENCH;
    }
}
