package com.test.climentanalysis.biz.impl;

import com.test.climentanalysis.biz.AirPressureDay2019Service;
import com.test.climentanalysis.dao.AirPressureDay2019Dao;
import com.test.climentanalysis.domain.DetailWeather;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AirPressureDay2019ServiceImpl implements AirPressureDay2019Service {
    @Autowired
    private AirPressureDay2019Dao airPressureDayDao;
    @Override
    public List<DetailWeather> getList(String id, String yearAndMonth) {
        List<DetailWeather> temp_list = new ArrayList<DetailWeather>();
        List<DetailWeather> list = new ArrayList<DetailWeather>();
        for(int i = 1;i < 32;i ++){
            String str = "";
            if(i < 10){
                str += "0";
            }
            str += i;
            temp_list = airPressureDayDao.selectById(id,yearAndMonth + str);
            double air_pressure = 0;
            for(DetailWeather a:temp_list) {
                air_pressure += a.getAirpressure();
            }
            DetailWeather d = new DetailWeather();
            d.setAirpressure(air_pressure / temp_list.size());
            list.add(d);
        }
        return list;
    }
}
