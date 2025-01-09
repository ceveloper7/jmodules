@SuppressWarnings("module")
module org.admiral.openpkg {
    requires org.admiral.util;
    opens org.admiral.countries to org.admiral.util;
}