package com.test.climentanalysis.dao;


import com.test.climentanalysis.domain.DetailWeather;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface VisibilityDay2019Dao extends JpaRepository<DetailWeather,Integer> {
    @Query(value = "SELECT visibility,time FROM DetailWeather WHERE stationid= :id AND date=:yearandmonthandday",nativeQuery = true)
    public List<DetailWeather> selectById(@Param("id")String id, @Param("yearandmonthandday")String yearAndMonthAndDay);
}
