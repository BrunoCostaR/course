package br.com.in1.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.in1.course.entities.Order;
//Não precisa acrescentar a notação de repository porque ja implementa JPARepository
public interface OrderRepository extends JpaRepository<Order, Long> {

}
