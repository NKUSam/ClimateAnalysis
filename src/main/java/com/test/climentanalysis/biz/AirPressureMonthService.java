package com.test.climentanalysis.biz;

import com.test.climentanalysis.domain.Weather;

import java.util.List;

public interface AirPressureMonthService {
    public List<Weather> getList(String id,String year);
}
