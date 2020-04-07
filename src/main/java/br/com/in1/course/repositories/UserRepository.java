package br.com.in1.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.in1.course.entities.User;
//Não precisa acrescentar a notação de repository porque ja implementa JPARepository
public interface UserRepository extends JpaRepository<User, Long> {

}
