package com.tts.WeatherApp.model;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Data
public class ZipCode {

    private String zipCode;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @CreationTimestamp
    private Date createdAt;

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }


    public ZipCode(){

    }

}
