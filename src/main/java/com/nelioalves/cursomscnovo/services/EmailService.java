package com.nelioalves.cursomscnovo.services;

import org.springframework.mail.SimpleMailMessage;

import com.nelioalves.cursomscnovo.domain.Pedido;

public interface EmailService {

	void sendOrderConfimationEmail(Pedido obj);
	
	void sendMail(SimpleMailMessage msg);
	
}
