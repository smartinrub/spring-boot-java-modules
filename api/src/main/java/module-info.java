module com.sergiomartinrubio.api {
    requires com.sergiomartinrubio.model;

    requires spring.web;
    requires com.fasterxml.jackson.databind;
    requires com.sergiomartinrubio.persistence;

    exports com.sergiomartinrubio.api;
}
