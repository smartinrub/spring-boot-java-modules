module com.sergiomartinrubio.model {
    requires com.sergiomartinrubio.persistence;

    requires spring.boot;
    requires spring.boot.autoconfigure;
    requires spring.context;

    exports com.sergiomartinrubio.model.service;
}
