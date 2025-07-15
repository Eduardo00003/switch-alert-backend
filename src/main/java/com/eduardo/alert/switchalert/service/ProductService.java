package com.eduardo.alert.switchalert.service;

import com.eduardo.alert.switchalert.model.Product;
import com.eduardo.alert.switchalert.repository.ProductRepository;  
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class ProductService {
  // ProductRepository provides the CRUD operations 
  private final ProductRepository repo;

  public ProductService(ProductRepository repo){
    this.repo = repo;
  }
  public List<Product> listAll(){
    return repo.findAll();
  }

  public Product get(Long id){
    return repo.findById(id).orElseThrow(()-> new RuntimeException("Product not found"));
  }

  public Product create(Product p){
    return repo.save(p);
  }

  public void delete(Long id){
    repo.deleteById(id);
  }

}
