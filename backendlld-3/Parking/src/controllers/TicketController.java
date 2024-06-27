package controllers;

import dtos.IssueTicketRequestDTO;
import dtos.IssueTicketResponseDTO;
import enums.ResponseStatus;
import models.Ticket;
import services.TicketService;

public class TicketController {

    private TicketService ticketService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    public IssueTicketResponseDTO bookTicket(IssueTicketRequestDTO requestDto) {
        IssueTicketResponseDTO responseDTO = new IssueTicketResponseDTO();

        try {
            Ticket ticket = ticketService.bookTicket(requestDto.getGateId(), requestDto.getVehicleType(), requestDto.getVehicleNumber(), requestDto.getOwnerName());
            responseDTO.setResponseStatus(ResponseStatus.SUCCESS);
            responseDTO.setTicket(ticket);
            return responseDTO;
        }
        catch(Exception e) {
            responseDTO.setResponseStatus(ResponseStatus.FAILURE);
            return responseDTO;
        }
    }
}
