package dev.tuzserik.business.logic.of.software.systems.lab2.repositories;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import dev.tuzserik.business.logic.of.software.systems.lab2.model.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, UUID> {
}
