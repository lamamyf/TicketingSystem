package com.TicketingSystem.repository;

import com.TicketingSystem.model.Ticket;
import com.TicketingSystem.model.enums.Category;
import com.TicketingSystem.model.enums.TicketStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface TicketRepository extends JpaRepository<Ticket, Long> {
    List<Ticket> findByCategory(Category category);

    List<Ticket> findByStatus(TicketStatus status);

    List<Ticket> findByUserId(Long id);

    Ticket findBySubject(String subject);
}
