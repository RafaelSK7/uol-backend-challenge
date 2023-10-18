package rafael.kiss.oulhostbackend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rafael.kiss.oulhostbackend.infra.CodinameHandler;
import rafael.kiss.oulhostbackend.model.GroupType;
import rafael.kiss.oulhostbackend.model.Player;
import rafael.kiss.oulhostbackend.model.dtos.PlayerDto;
import rafael.kiss.oulhostbackend.repositories.PlayerRepository;

import java.util.List;

@Service
public class PlayerService {

    @Autowired
    private PlayerRepository repository;

    @Autowired
    private CodinameHandler handler;

    public Player createPlayer(PlayerDto dto) {
        Player newPlayer = new Player(dto);
        String codiname = getCodiname(dto.groupType());
        newPlayer.setCodiname(codiname);
        return repository.save(newPlayer);
    }

    private String getCodiname(GroupType groupType){
        return handler.findCodiname(groupType);
    }

    public List<Player> getAllPlayers() {
        return repository.findAll();
    }
}