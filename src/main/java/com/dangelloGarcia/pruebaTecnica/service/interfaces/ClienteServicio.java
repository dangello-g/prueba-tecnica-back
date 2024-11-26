package com.dangelloGarcia.pruebaTecnica.service.interfaces;

import com.dangelloGarcia.pruebaTecnica.dto.ConsultarClienteDTO;
import com.dangelloGarcia.pruebaTecnica.exception.ConsultarClienteException;
import com.dangelloGarcia.pruebaTecnica.model.Cliente;

public interface ClienteServicio {
    Cliente consultarDatosCliente(ConsultarClienteDTO consultarClienteDTO) throws ConsultarClienteException;
}
