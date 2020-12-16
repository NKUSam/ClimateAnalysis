package com.test.climentanalysis.dao;

import com.test.climentanalysis.domain.Weather;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AirPressureYearDao extends JpaRepository<Weather,String> {
    @Query(value = "SELECT * FROM Weather WHERE stationid= :id AND date LIKE :year",nativeQuery = true)
    public List<Weather> selectById(@Param("id")String id, @Param("year")String year);
}
