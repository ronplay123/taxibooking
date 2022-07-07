package com.teachyourselfcodebooking.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GeneratorType;
@Entity
@Table(name="taxiBooking")
public class Taxi {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="taxi_bookingId")
    private Integer TaxiBookingId;
    @Column(name="passenger_name")
    private String passengerName;
    @Column(name="passenger_num")
    private Integer passengerNumber;

    @Column(name="passenger_email")
    private String passengerEmail;
        public Integer getTaxiBookingId() {
        return TaxiBookingId;
    }
    public void setTaxiBookingId(Integer taxiBooking) {
        this.TaxiBookingId = taxiBooking;
    }
    public String getPassengerName() {
        return passengerName;
    }
    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }
    public Integer getPassengerNumber() {
        return passengerNumber;
    }
    public void setPassengerNumber(Integer passengernumber) {
        this.passengerNumber = passengerNumber;
    }
    public String getPassengerEmail() {
        return passengerEmail;
    }
    public void setPassengerEmail(String passengerEmail) {
        this.passengerEmail = passengerEmail;
    }

}
