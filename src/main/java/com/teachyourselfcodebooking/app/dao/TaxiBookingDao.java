package com.teachyourselfcodebooking.app.dao;

import com.teachyourselfcodebooking.app.entity.Taxi;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface TaxiBookingDao extends CrudRepository<Taxi, Integer> {

}
