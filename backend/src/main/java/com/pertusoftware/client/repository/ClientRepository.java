
package com.pertusoftware.client.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pertusoftware.client.entities.Client;

/*Camada de acesso a dados*/
@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

}
