module com.sergiomartinrubio.application {
    requires com.sergiomartinrubio.api;

    requires spring.boot;
    requires spring.boot.autoconfigure;
    requires spring.beans;
    requires spring.core;
    requires spring.context;

    // requires deep reflection
    opens com.sergiomartinrubio.application to spring.core;
}
