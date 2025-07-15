package com.eduardo.alert.switchalert.model;
import jakarta.persistence.*;

@Entity
public class Subscriber {
  @Id
  // strategy is a key word so we need to use it to get the identity
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String email;
  private boolean notified = false;
  // required for jpa
  public Subscriber(){}

  public Long getId(){
    return id;
  }
  public String getEmail(){
    return email;
  }
  public boolean isNotified(){
    return notified;
  }

  public void setId(Long id){
    this.id = id;
  }
  public void setEmail(String email){
    this.email = email;
  }
  public void setNotified(boolean n){
    this.notified = n;
  }
}
