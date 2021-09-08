module com.sergiomartinrubio.api {
    requires com.sergiomartinrubio.model;
    requires com.sergiomartinrubio.persistence;

    requires spring.web;

    exports com.sergiomartinrubio.api;
}
