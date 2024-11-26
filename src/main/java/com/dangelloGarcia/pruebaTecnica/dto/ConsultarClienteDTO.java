package com.dangelloGarcia.pruebaTecnica.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import org.hibernate.validator.constraints.Length;

public record ConsultarClienteDTO(
    @NotBlank(message = "El tipo de documento debe existir") @Length(min = 1, max = 1) @Pattern(regexp = "^[CP]$", message = "El tipo de documento solo puede ser 'C' de cédula de ciudadanía o 'P' de pasaporte") String tipoDocumento,
    @NotBlank(message = "El número de documento debe existir") @Length(min = 8, max = 11, message = "El número de documento debe tener entre 8 y 11 caracteres") String numeroDocumento
) {
}
