package repositories;

import models.Ticket;

public interface TicketRepository {
    Ticket saveTicket(Ticket ticket);
}
