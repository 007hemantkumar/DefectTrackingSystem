package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.AdminTicketResponse;
import com.example.model.TicketDefectMaster;
import com.example.service.TicketDefectService;

@RestController
public class TicketDefectConroller {
@Autowired
	private TicketDefectService ticket;
@PostMapping("/saveTicket")
public int getDefectTicket(@RequestBody TicketDefectMaster ticketDefectMaster) {
	return ticket.saveDefect(ticketDefectMaster);
}
	
@PutMapping("/updateTicket")
public long updateDefect(@RequestBody TicketDefectMaster ticketDefectMaster) {
	 
	return ticket.updateDefectQA(ticketDefectMaster);	
	 
}
@DeleteMapping("/deleteTicket/{id}")
public int deleteDefect(@PathVariable Long id ) {
	return ticket.deletDefect(id);
}
@GetMapping("/showAllTickets")
public List<AdminTicketResponse> showAllTickets(){
	return ticket.showAllTickets();
}
@GetMapping("/showAllTicketsToQa/{id}")
public List<TicketDefectMaster> showAllTicketsToQa(@PathVariable Long id){
	return ticket.showAllTicketsToQa(id);
}

}
