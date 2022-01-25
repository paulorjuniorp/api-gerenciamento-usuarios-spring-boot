package br.com.paulorjuniorp.personapi.mapper;

import br.com.paulorjuniorp.personapi.dto.request.PersonDto;
import br.com.paulorjuniorp.personapi.entity.Person;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PersonMapper {
    PersonMapper INSTANCE = Mappers.getMapper(PersonMapper.class);

    @Mapping(target = "birthDate", source = "birthDate",dateFormat = "dd-MM-yyyy")
    Person toModel(PersonDto personDto);

    PersonDto toDTO(Person person);
}
