module com.sergiomartinrubio.application {
    // it requires to add the player module as a Maven dependency
    requires com.sergiomartinrubio.api;

    requires spring.boot;
    requires spring.boot.autoconfigure;
    requires spring.beans;
    requires spring.core;
    requires spring.context;

    exports com.sergiomartinrubio.application;

    // requires deep reflection
    opens com.sergiomartinrubio.application to spring.core;
}
