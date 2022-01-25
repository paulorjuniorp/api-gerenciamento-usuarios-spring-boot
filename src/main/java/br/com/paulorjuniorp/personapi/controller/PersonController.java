package br.com.paulorjuniorp.personapi.controller;

import br.com.paulorjuniorp.personapi.dto.request.PersonDto;
import br.com.paulorjuniorp.personapi.dto.response.MessageResponseDTO;
import br.com.paulorjuniorp.personapi.entity.Person;
import br.com.paulorjuniorp.personapi.exceptions.PersonNotFoundException;
import br.com.paulorjuniorp.personapi.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/v1/people")
public class PersonController {

    @Autowired
    private PersonService personService;

    @GetMapping
    public List<PersonDto> listAll(){
        return personService.listAll();
    }

    @GetMapping("/{id}")
    public PersonDto findPersonById(@PathVariable Long id) throws PersonNotFoundException {
        return personService.findPersonById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public MessageResponseDTO create(@Valid @RequestBody PersonDto personDto) {
        return personService.create(personDto);
    }

    @PutMapping("/{id}")
    public MessageResponseDTO updatePersonById(@PathVariable Long id,@RequestBody @Valid PersonDto personDto) throws PersonNotFoundException {
        return personService.updatePersonById(id, personDto);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public MessageResponseDTO deletePerson(@PathVariable Long id) throws PersonNotFoundException {
        return personService.deletePerson(id);
    }

}
