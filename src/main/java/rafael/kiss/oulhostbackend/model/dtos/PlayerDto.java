package rafael.kiss.oulhostbackend.model.dtos;

import rafael.kiss.oulhostbackend.model.GroupType;

public record PlayerDto(

        String name,
        String email,
        String phoneNumber,
        GroupType groupType
) {
}
