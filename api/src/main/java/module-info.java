module com.sergiomartinrubio.api {
    requires com.sergiomartinrubio.player;
    requires com.sergiomartinrubio.team;

    requires spring.web;
    requires com.fasterxml.jackson.databind;

    exports com.sergiomartinrubio.api;
}
