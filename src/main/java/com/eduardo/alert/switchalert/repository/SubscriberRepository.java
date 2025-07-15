package com.eduardo.alert.switchalert.repository;

import com.eduardo.alert.switchalert.model.Subscriber;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

// extending it gives us access to all the crud ooperations in Jpa
public interface SubscriberRepository extends JpaRepository<Subscriber,Long> {
  // the template <action>By<Property><Operator>
  // this is a deribed query
  List<Subscriber> findByNotifiedFalse();

}
