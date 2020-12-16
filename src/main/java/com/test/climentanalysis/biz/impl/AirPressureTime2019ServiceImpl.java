package com.test.climentanalysis.biz.impl;

import com.test.climentanalysis.biz.AirPressureTime2019Service;
import com.test.climentanalysis.dao.AirPressureDay2019Dao;
import com.test.climentanalysis.domain.DetailWeather;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AirPressureTime2019ServiceImpl implements AirPressureTime2019Service {
    @Autowired
    private AirPressureDay2019Dao airPressureDay2019Dao;
    @Override
    public List<DetailWeather> getList(String id, String yearAndMonthAndDay) {
        List<DetailWeather> list = airPressureDay2019Dao.selectById(id,yearAndMonthAndDay);
        return list;
    }
}
