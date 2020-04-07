package br.com.in1.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.in1.course.entities.OrderItem;
//Não precisa acrescentar a notação de repository porque ja implementa JPARepository
public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
