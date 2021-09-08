module com.sergiomartinrubio.model {
    requires com.sergiomartinrubio.persistence;

    requires spring.context;

    exports com.sergiomartinrubio.model.service to com.sergiomartinrubio.api;
}
