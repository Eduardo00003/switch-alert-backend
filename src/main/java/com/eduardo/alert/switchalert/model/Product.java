package com.eduardo.alert.switchalert.model;

import jakarta.persistence.*;


// @Enity marking a java class as JPA entity 
// this lets JPA know to map it to a table
@Entity
public class Product {
  // this makes it the primary key 
  // every entry will have a unique id
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String name;
  @Enumerated(EnumType.STRING)
  private Retailer retailer;
  private String productURL;
  
  private boolean inStock;





  // this empty constructor is required for the requirements of jpa 
  public Product(){}

  public Long getId(){
    return id;
  }
  public String getName(){
    return name;
  }
  public boolean getInstock(){
    return inStock;
  }
  
  public void setID(Long id){
    this.id = id;
  }
  public void setName(String name){
    this.name = name;
  }
  public void setInstock(boolean inStock){
    this.inStock = inStock;
  }
}
