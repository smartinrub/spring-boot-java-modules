package com.sergiomartinrubio.api;

import com.sergiomartinrubio.model.service.PlayerService;
import com.sergiomartinrubio.persistence.entity.Player;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/api/player")
public class PlayerController {

    private final PlayerService playerService;

    public PlayerController(PlayerService playerService) {
        this.playerService = playerService;
    }

    @GetMapping("/{id}")
    public Player getPlayer(@PathVariable("id") UUID id) {
        return playerService.getPlayer(id);
    }

}
