package com.teachyourselfcodebooking.app.Service;

import com.teachyourselfcodebooking.app.dao.TaxiBookingDao;
import com.teachyourselfcodebooking.app.entity.Taxi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class TaxiBookingService {
    @Autowired
    TaxiBookingDao taxiBookingDao;
    public Taxi createBooking(Taxi taxi){
        return taxiBookingDao.save(taxi);
    }
}
