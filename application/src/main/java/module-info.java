module com.sergiomartinrubio.application {
    requires spring.boot;
    requires spring.boot.autoconfigure;
    requires spring.context;

    // requires deep reflection
    opens com.sergiomartinrubio.application to spring.core;
}
