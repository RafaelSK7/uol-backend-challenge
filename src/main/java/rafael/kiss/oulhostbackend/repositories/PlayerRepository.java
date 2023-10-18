package rafael.kiss.oulhostbackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import rafael.kiss.oulhostbackend.model.Player;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Long> {
}
