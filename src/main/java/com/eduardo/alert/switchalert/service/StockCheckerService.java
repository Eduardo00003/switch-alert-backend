package com.eduardo.alert.switchalert.service;


import com.eduardo.alert.switchalert.model.Product;
import com.eduardo.alert.switchalert.repository.ProductRepository;
import com.eduardo.alert.switchalert.repository.SubscriberRepository;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class StockCheckerService {

  private final ProductRepository productRepo;
  private final SubscriberRepository subRepo;
  private final JavaMailSender mailSender;
  

  
}
