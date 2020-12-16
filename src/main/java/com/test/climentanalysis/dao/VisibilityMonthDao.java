package com.test.climentanalysis.dao;

import com.test.climentanalysis.domain.Weather;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VisibilityMonthDao extends JpaRepository<Weather,String> {
    @Query(value = "SELECT * FROM Weather WHERE stationid= :id AND date=:yearandmonth",nativeQuery = true)
    public Weather selectById(@Param("id")String id, @Param("yearandmonth")String yearAndMonth);
}
