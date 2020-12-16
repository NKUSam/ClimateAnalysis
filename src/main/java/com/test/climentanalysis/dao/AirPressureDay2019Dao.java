package com.test.climentanalysis.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.test.climentanalysis.domain.DetailWeather;

import java.util.List;

@Repository
public interface AirPressureDay2019Dao extends JpaRepository<DetailWeather,Integer> {
    @Query(value = "SELECT maxairpressure,minairpressure FROM Weather WHERE stationid= :id AND date=:yearandmonthandday",nativeQuery = true)
    public List<DetailWeather> selectById(@Param("id")String id, @Param("yearandmonthandday")String yearAndMonth);
}
