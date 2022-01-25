package br.com.paulorjuniorp.personapi.repository;

import br.com.paulorjuniorp.personapi.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}