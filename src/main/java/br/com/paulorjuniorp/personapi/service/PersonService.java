package br.com.paulorjuniorp.personapi.service;

import br.com.paulorjuniorp.personapi.dto.request.PersonDto;
import br.com.paulorjuniorp.personapi.dto.response.MessageResponseDTO;
import br.com.paulorjuniorp.personapi.entity.Person;
import br.com.paulorjuniorp.personapi.exceptions.PersonNotFoundException;
import br.com.paulorjuniorp.personapi.mapper.PersonMapper;
import br.com.paulorjuniorp.personapi.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PersonService {

    private final PersonMapper personMapper = PersonMapper.INSTANCE;

    @Autowired
    private PersonRepository personRepository;

    public MessageResponseDTO create(PersonDto personDto){
        Person personToSave = personMapper.toModel(personDto);

        personRepository.save(personToSave);

        return createMessageResponse("Usuário criado com o ID" + personToSave.getId());
    }

    public List<PersonDto> listAll() {
        List<Person> persons = personRepository.findAll();

        return persons.stream()
                .map(personMapper::toDTO)
                .collect(Collectors.toList());
    }

    public PersonDto findPersonById(Long id) throws PersonNotFoundException {
        Person person = verifyId(id);

        return personMapper.toDTO(person);
    }

    private Person verifyId(Long id) throws PersonNotFoundException {
       return personRepository.findById(id).orElseThrow(() -> new PersonNotFoundException(id));
    }

    public MessageResponseDTO updatePersonById(Long id, PersonDto personDto) throws PersonNotFoundException {
        verifyId(id);

        Person personToUpdate = personMapper.toModel(personDto);

        personRepository.save(personToUpdate);

        return createMessageResponse("Atualização realizada com sucesso");
    }

    public MessageResponseDTO deletePerson(Long id) throws PersonNotFoundException {
        verifyId(id);
        personRepository.deleteById(id);

        return createMessageResponse("Usuário deletado com sucesso");
    }

    private MessageResponseDTO createMessageResponse(String Usuário_deletado_com_sucesso) {
        return MessageResponseDTO.builder().message(Usuário_deletado_com_sucesso).build();
    }

}
