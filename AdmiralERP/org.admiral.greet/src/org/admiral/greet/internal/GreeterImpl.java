package org.admiral.greet.internal;

import org.admiral.greet.Greeter;

/**
 * Clase publica GreeterImpl para que sea accedida por el paquete org.admiral.greet
 */
public class GreeterImpl implements Greeter {
    @Override
    public String greet(String subject)
    {
        return "Hello, " + subject + "!";
    }
}
