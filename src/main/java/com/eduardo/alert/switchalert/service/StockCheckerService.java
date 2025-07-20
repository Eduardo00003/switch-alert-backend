package com.eduardo.alert.switchalert.service;


import com.eduardo.alert.switchalert.model.Product;
import com.eduardo.alert.switchalert.model.Retailer;

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

  // this will inject the right beans 
  public StockCheckerService(ProductRepository productRepo,SubscriberRepository subRepo,JavaMailSender mailSender){
    this.productRepo = productRepo;
    this.subRepo = subRepo;
    this.mailSender = mailSender;
 }   
  @Scheduled(fixedRateString = "S{stock.check.interval:600000}")
  public void checkAll(){
    productRepo.findAll().forEach(this::checkOne);
  }

  private void checkOne(Product p){
    boolean available = false;

    switch (p.getRetailer()){
      case BESTBUY:
        available = checkBestBuy(p.getProductUrl());
        break;
      case AMAZON: 
        available = checkAmazon(p.getProductUrl());
        break;
      case TARGET:
        available = checkTarget(p.getProductUrl());
        break;
      default:
        available = false;
    }
  }

  if (available && !p.isInStock()){
    p.setinStock(true);
    productRepo.save(p);
    notifySubscribers(p);
  }
  else if(!available && p.isInStock()){
    p.setinStock(false);
    productRepo.save(p);
  }
}