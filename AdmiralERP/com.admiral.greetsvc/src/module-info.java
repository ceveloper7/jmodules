module com.admiral.greetsvc {
    exports com.admiral.greetsvc;
    provides com.admiral.greetsvc.GreeterService with
            com.admiral.greetsvc.internal.FrenchGreeter,
            com.admiral.greetsvc.internal.GermanGreeterFactory;
}