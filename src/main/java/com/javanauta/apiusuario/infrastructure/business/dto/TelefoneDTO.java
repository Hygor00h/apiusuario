package com.javanauta.apiusuario.infrastructure.business.dto;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TelefoneDTO {

    private String numero;
    private String ddd;
}
