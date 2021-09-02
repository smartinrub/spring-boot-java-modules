module com.sergiomartinrubio.player {
    requires com.sergiomartinrubio.team;

    exports com.sergiomartinrubio.player.model;

    opens com.sergiomartinrubio.player.model to com.fasterxml.jackson.databind;
}
