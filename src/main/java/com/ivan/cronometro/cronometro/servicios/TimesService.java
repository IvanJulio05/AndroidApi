package com.ivan.cronometro.cronometro.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ivan.cronometro.cronometro.models.TimeModel;
import com.ivan.cronometro.cronometro.repositories.TimesRepository;

@Service
public class TimesService {

    @Autowired
    TimesRepository timesRepository;

    public void insertar(TimeModel time){
        timesRepository.save(time);
    }

    public List<TimeModel> showAll(){
        return (List<TimeModel>) timesRepository.findAllOrden();
    }

    public void deleteAll(){
        timesRepository.deleteAll();
    }
}
