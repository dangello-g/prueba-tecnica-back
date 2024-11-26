package com.dangelloGarcia.pruebaTecnica.dto;

import jakarta.validation.constraints.NotBlank;

public record ValidacionDTO(
        @NotBlank(message = "El campo debe existir") String campo,
        @NotBlank(message = "El error debe existir") String error
) {
}
