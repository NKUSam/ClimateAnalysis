package com.test.climentanalysis.biz;

import com.test.climentanalysis.domain.Station;

import java.util.List;

public interface StationSelectService {
    public List<Station> selectStation(String geoHash);
}
