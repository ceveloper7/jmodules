@SuppressWarnings("module")
module org.admiral.openpkg {
    requires org.admiral.util;
    // el paquete org.admiral.countries esta abierto solo para el modulo org.admiral.util
    opens org.admiral.countries to org.admiral.util;
}