package br.com.paulorjuniorp.personapi.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class PersonNotFoundException extends Throwable {
    public PersonNotFoundException(Long id) {
        super("Usuário com ID " + id + " não encontrado!");
    }
}
