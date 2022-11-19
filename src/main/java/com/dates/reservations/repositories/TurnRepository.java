/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.dates.reservations.repositories;

import com.dates.reservations.models.Turn;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 *
 * @author a1023942826
 */
@Repository
public interface TurnRepository extends JpaRepository<Turn, Long> {

    @Query(
            value = "SELECT *"
            + "FROM turnos\n"
            + "INNER JOIN servicios\n"
            + "ON turnos.id_servicio = servicios.id_service\n"
            + "INNER JOIN comercios\n" 
            + "ON servicios.id_comercio = comercios.id_store"
            , nativeQuery  = true

    )
    List<Turn> getInfoTurnsDashboard();

}
