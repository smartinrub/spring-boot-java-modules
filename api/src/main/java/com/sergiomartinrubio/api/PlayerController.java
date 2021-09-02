package com.sergiomartinrubio.api;

import com.sergiomartinrubio.player.model.Player;
import com.sergiomartinrubio.team.model.Team;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/api/player")
public class PlayerController {

    @GetMapping("/{id}")
    public Player getPlayer(@PathVariable("id") String id) {
        return new Player(UUID.randomUUID(), "Sergio", new Team("Awesome Team", "Malaga"));
    }

}
