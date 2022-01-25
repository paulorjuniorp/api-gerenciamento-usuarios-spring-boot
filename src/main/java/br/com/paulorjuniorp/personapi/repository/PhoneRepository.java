package br.com.paulorjuniorp.personapi.repository;

import br.com.paulorjuniorp.personapi.entity.Phone;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PhoneRepository extends JpaRepository<Phone, Long> {
}