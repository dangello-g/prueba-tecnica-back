package com.dangelloGarcia.pruebaTecnica.service.impl;

import com.dangelloGarcia.pruebaTecnica.dto.ConsultarClienteDTO;
import com.dangelloGarcia.pruebaTecnica.exception.ConsultarClienteException;
import com.dangelloGarcia.pruebaTecnica.model.Cliente;
import com.dangelloGarcia.pruebaTecnica.service.interfaces.ClienteServicio;
import org.springframework.stereotype.Service;

@Service
public class ClienteServicioImpl implements ClienteServicio {
    @Override
    public Cliente consultarDatosCliente(ConsultarClienteDTO consultarClienteDTO) throws ConsultarClienteException {
        Cliente cliente = Cliente.builder()
                .primerNombre("José")
                .segundoNombre("Luis")
                .primerApellido("Pérez")
                .segundoApellido("González")
                .telefono("123456789")
                .direccion("Calle Falsa 123")
                .ciudad("Bogotá")
                .build();
        return cliente;
    }
}
