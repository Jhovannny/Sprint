package jhovanny.edu.mx.utvt.data.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import jhovanny.edu.mx.utvt.data.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
