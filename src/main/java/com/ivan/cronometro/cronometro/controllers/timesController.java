package com.ivan.cronometro.cronometro.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ivan.cronometro.cronometro.models.TimeModel;
import com.ivan.cronometro.cronometro.servicios.TimesService;
import java.util.List;
@RestController
@RequestMapping("/cronometro")
public class timesController {

    @Autowired
    TimesService timesService;

    @GetMapping("/insert/{time}")
    public void insert(@PathVariable float time){
        timesService.insertar(new TimeModel(time));
    }

    @GetMapping("/showAll")
    public List<TimeModel> showAll(){
        
        return timesService.showAll();
    }

    @GetMapping("/delete")
    public void delete(){
        timesService.deleteAll();
    }
}
