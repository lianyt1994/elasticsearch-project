package com.pubinfo.repository;

import com.pubinfo.entity.Subway;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface SubwayRepository extends CrudRepository<Subway, Long>{
    List<Subway> findAllByCityEnName(String cityEnName);
}
