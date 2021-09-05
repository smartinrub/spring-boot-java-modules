package com.sergiomartinrubio.model.service;

import com.sergiomartinrubio.persistence.entity.Player;
import com.sergiomartinrubio.persistence.repository.PlayerRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class PlayerService {

    private final PlayerRepository playerRepository;

    public PlayerService(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    public Player getPlayer(UUID id) {
        Optional<Player> player = playerRepository.findById(id);
        if (player.isPresent()) {
            return player.get();
        }

        throw new RuntimeException("Player not found.");
    }
}
