package org.admiral.greet;

import org.admiral.greet.internal.GreeterImpl;

public interface Greeter {
    static Greeter newInstance(){
        return new org.admiral.greet.internal.GreeterImpl();
    }

    String greet(String subject);
}
