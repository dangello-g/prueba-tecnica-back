package com.dangelloGarcia.pruebaTecnica.controller.exception;

import com.dangelloGarcia.pruebaTecnica.dto.MensajeDTO;
import com.dangelloGarcia.pruebaTecnica.dto.ValidacionDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.ArrayList;
import java.util.List;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<MensajeDTO<List<ValidacionDTO>>> validationException(MethodArgumentNotValidException validException){

        List<ValidacionDTO> errors = new ArrayList<>();
        BindingResult result = validException.getBindingResult();

        for (FieldError fieldError: result.getFieldErrors()) {
            errors.add(new ValidacionDTO(fieldError.getField(), fieldError.getDefaultMessage()));
        }

        return ResponseEntity.badRequest().body(new MensajeDTO<>(true, errors));
    }
}
