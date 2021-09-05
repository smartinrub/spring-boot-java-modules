module com.sergiomartinrubio.persistence {
    requires spring.context;
    requires spring.boot.autoconfigure;
    requires spring.data.jpa;
    requires java.persistence;
    requires com.fasterxml.jackson.databind;

    exports com.sergiomartinrubio.persistence;
    exports com.sergiomartinrubio.persistence.repository;
    exports com.sergiomartinrubio.persistence.entity;
}
