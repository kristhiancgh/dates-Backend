/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.dates.reservations.repositories;

import com.dates.reservations.models.ServiceModel;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 *
 * @author a1023942826
 */

@Repository
public interface ServiceRepository extends JpaRepository<ServiceModel, Long>{
    
   @Query("SELECT s FROM ServiceModel s WHERE s.store.idStore = ?1")
   List<ServiceModel> findByStore(Long idStore);
    
}
