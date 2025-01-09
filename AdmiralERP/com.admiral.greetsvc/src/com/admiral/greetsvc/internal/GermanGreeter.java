package com.admiral.greetsvc.internal;

import com.admiral.greetsvc.GreeterService;

import java.util.Locale;
import java.util.Map;

public class GermanGreeter implements GreeterService {
    private Map<String, String> dictionary;

    public GermanGreeter(Map<String, String> dictionary)
    {
        this.dictionary = dictionary;
    }

    public String greet(String subject)
    {
        return "Hallo, " + dictionary.getOrDefault(subject, subject) + "!";
    }

    public Locale getLocale()
    {
        return Locale.GERMAN;
    }
}
