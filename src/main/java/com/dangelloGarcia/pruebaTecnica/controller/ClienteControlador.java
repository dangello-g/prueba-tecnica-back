package com.dangelloGarcia.pruebaTecnica.controller;

import com.dangelloGarcia.pruebaTecnica.dto.ConsultarClienteDTO;
import com.dangelloGarcia.pruebaTecnica.model.Cliente;
import com.dangelloGarcia.pruebaTecnica.service.interfaces.ClienteServicio;
import com.fasterxml.jackson.annotation.JsonView;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/cliente")
@RequiredArgsConstructor
public class ClienteControlador {
    @Autowired
    private final ClienteServicio clienteServicio;

    @GetMapping("/consultar")
    @JsonView(Cliente.sinDocumento.class)
    public Cliente consultarDatosCliente(@RequestParam String tipoDocumento, @RequestParam String numeroDocumento) {
        ConsultarClienteDTO consultarClienteDTO = new ConsultarClienteDTO(
                tipoDocumento,
                numeroDocumento
        );
        return clienteServicio.consultarDatosCliente(consultarClienteDTO);
    }
}
