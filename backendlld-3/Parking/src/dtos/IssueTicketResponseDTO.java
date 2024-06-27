package dtos;

import enums.ResponseStatus;
import models.Ticket;

public class IssueTicketResponseDTO {
    // what do we need in return when we are getting a ticket
    // we need Ticket and response for that ticket

    private Ticket ticket;
    private ResponseStatus responseStatus;

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public ResponseStatus getResponseStatus() {
        return responseStatus;
    }

    public void setResponseStatus(ResponseStatus responseStatus) {
        this.responseStatus = responseStatus;
    }
}
