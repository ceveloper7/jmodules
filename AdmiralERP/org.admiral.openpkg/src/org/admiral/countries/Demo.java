package org.admiral.countries;

import org.admiral.util.*;

public class Demo {
    public static void main(String[] args) throws ReflectiveOperationException
    {
        Country belgium = new Country("Belgium", 30510);
        ObjectAnalyzer analyzer = new ObjectAnalyzer();
        System.out.println(analyzer.toString(belgium));
    }
}
