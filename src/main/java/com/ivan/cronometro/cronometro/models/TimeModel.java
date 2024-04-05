package com.ivan.cronometro.cronometro.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Times")
public class TimeModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private float time;

    public TimeModel(){

    }

    public TimeModel(long id,float time){
        this.id=id;
        this.time=time;
    }
    public TimeModel(float time){
        this.time=time;
    }

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public float getTime() {
        return time;
    }
    public void setTime(float time) {
        this.time = time;
    }

    
}
