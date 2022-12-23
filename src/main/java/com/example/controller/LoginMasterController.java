package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.TicketDefectMaster;
import com.example.model.UserMaster;
import com.example.service.LoginService;

@RestController
public class LoginMasterController {
    @Autowired
	private LoginService loginService;
     
    @PostMapping("/login")
	public UserMaster loginUser(@RequestBody UserMaster userMaster) {
		return loginService.loginUser(userMaster);
	}

    @PostMapping("/QACreateDefect")
    public int QACreateDefects(@RequestBody TicketDefectMaster ticketDefectMaster) {
    	return loginService.QACreateDefect(ticketDefectMaster);
    }
    
}
