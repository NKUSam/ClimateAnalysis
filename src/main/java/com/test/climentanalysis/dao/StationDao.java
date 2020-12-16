package com.test.climentanalysis.dao;

import com.test.climentanalysis.domain.Station;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StationDao extends JpaRepository<Station,String> {
    @Query(value = "SELECT * FROM station WHERE geoHash LIKE :geoHash",nativeQuery = true)
    public List<Station> selectByGeoHash(@Param("geoHash")String geoHash);
}
