package com.test.climentanalysis.biz;

import com.test.climentanalysis.domain.DetailWeather;

import java.util.List;

public interface AirPressureTime2019Service {
    public List<DetailWeather> getList(String id, String yearAndMonthAndDay);
}
