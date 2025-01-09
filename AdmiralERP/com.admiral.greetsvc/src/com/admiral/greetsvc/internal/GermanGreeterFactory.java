package com.admiral.greetsvc.internal;

import com.admiral.greetsvc.GreeterService;

import java.util.Map;
import java.util.HashMap;

public class GermanGreeterFactory {
    public static GreeterService provider()
    {
        Map<String, String> dictionary = new HashMap<>();
        dictionary.put("World", "Welt");
        dictionary.put("Modular World", "modulare Welt");
        return new GermanGreeter(dictionary);
    }
}
