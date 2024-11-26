package com.dangelloGarcia.pruebaTecnica.dto;

import jakarta.validation.constraints.NotBlank;

public record MensajeDTO<T>(
        @NotBlank(message = "El error debe existir") boolean error,
        @NotBlank(message = "La respuesta debe existir") T respuesta
) {
}
