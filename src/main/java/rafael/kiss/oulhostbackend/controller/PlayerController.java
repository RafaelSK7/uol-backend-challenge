package rafael.kiss.oulhostbackend.controller;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import rafael.kiss.oulhostbackend.model.Player;
import rafael.kiss.oulhostbackend.model.dtos.PlayerDto;
import rafael.kiss.oulhostbackend.service.PlayerService;

import java.util.List;

@RestController
@RequestMapping("/players")
public class PlayerController {

    @Autowired
    private PlayerService service;


    @PostMapping
    public ResponseEntity<Player> createPlayer(@RequestBody @Valid PlayerDto dto){
        Player newPlayer = service.createPlayer(dto);
        return new ResponseEntity<>(newPlayer, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Player>> getAllPlayers(){
        return new ResponseEntity<>(service.getAllPlayers(), HttpStatus.OK);
    }

}
