package com.example.repository;

import java.util.Optional;

import com.example.model.TicketDefectMaster;
import com.example.model.UserMaster;

public interface LoginRepository {

	public UserMaster userLogin(UserMaster userMaster);
	

	  int QACreateDefect(TicketDefectMaster ticketDefectMaster);


}
