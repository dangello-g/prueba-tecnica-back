package com.dangelloGarcia.pruebaTecnica.model;

import com.fasterxml.jackson.annotation.JsonView;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Cliente {
    public interface sinDocumento {}

    @JsonView(sinDocumento.class)
    private String primerNombre;

    @JsonView(sinDocumento.class)
    private String segundoNombre;

    @JsonView(sinDocumento.class)
    private String primerApellido;

    @JsonView(sinDocumento.class)
    private String segundoApellido;

    @JsonView(sinDocumento.class)
    private String telefono;

    @JsonView(sinDocumento.class)
    private String direccion;

    @JsonView(sinDocumento.class)
    private String ciudad;

    private String tipoDocumento;
    private String numeroDocumento;

}
