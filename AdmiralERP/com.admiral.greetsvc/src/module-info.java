module com.admiral.greetsvc {
    exports com.admiral.greetsvc;
    // Declaramos el servicio GreeterService y las clases que implementan la interface
    provides com.admiral.greetsvc.GreeterService with
            com.admiral.greetsvc.internal.FrenchGreeter,
            com.admiral.greetsvc.internal.GermanGreeterFactory;
}