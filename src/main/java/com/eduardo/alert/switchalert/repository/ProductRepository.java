package com.eduardo.alert.switchalert.repository;

//  import this so my repository knows which to manage 
import com.eduardo.alert.switchalert.model.Product;
//  to inherit all the crud methods 
import org.springframework.data.jpa.repository.JpaRepository;
//<T,id> the t is the entity the repository manages and ID is the entitys primary key 
// this gives me all the functions without having ot implement them 
public interface ProductRepository extends JpaRepository<Product,Long> {

  
}
