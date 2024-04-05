package com.ivan.cronometro.cronometro.repositories;


import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.ivan.cronometro.cronometro.models.TimeModel;

public interface TimesRepository extends CrudRepository<TimeModel,Long>{

    @Query("select t from TimeModel t order by t.time asc")
    public List<TimeModel> findAllOrden();
}
