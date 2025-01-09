module com.admiral.usesvcservice {
    requires com.admiral.greetsvc;
    // Consumimos el servicio exportado por el modulo com.admiral.greetsvc
    // como resultado de las clausulas provides en el modulo com.admiral.greetsvc y
    // uses en com.admiral.usesvcservice, este modulo ahora que consume el serlvicio GreeterService
    // se le permite el acceso a las clases de implementacion del GreeterService
    uses com.admiral.greetsvc.GreeterService;
}