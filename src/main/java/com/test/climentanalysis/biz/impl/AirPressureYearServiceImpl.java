package com.test.climentanalysis.biz.impl;

import com.test.climentanalysis.biz.AirPressureYearService;
import com.test.climentanalysis.dao.AirPressureYearDao;
import com.test.climentanalysis.domain.Weather;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AirPressureYearServiceImpl implements AirPressureYearService {
    @Autowired
    private AirPressureYearDao airPressureYearDao;
    @Override
    public List<Weather> getList(String id) {
        List<Weather> list = new ArrayList<Weather>();
        list.add(getAYear(id,"2005%"));
        list.add(getAYear(id,"2006%"));
        list.add(getAYear(id,"2007%"));
        list.add(getAYear(id,"2008%"));
        list.add(getAYear(id,"2009%"));
        list.add(getAYear(id,"2010%"));
        list.add(getAYear(id,"2011%"));
        list.add(getAYear(id,"2012%"));
        list.add(getAYear(id,"2013%"));
        list.add(getAYear(id,"2014%"));
        list.add(getAYear(id,"2015%"));
        list.add(getAYear(id,"2016%"));
        list.add(getAYear(id,"2017%"));
        list.add(getAYear(id,"2018%"));
        return list;
    }
    public Weather getAYear(String id,String year){
        double max = -1;
        double min = 1000000;
        double average = 0;
        List<Weather> temp_list;
        temp_list = airPressureYearDao.selectById(id,year);
        for(Weather v:temp_list){
            if(v.getMaxairpressure() > max){
                max = v.getMaxairpressure();
            }
            if(v.getMinairpressure() < min){
                min = v.getMinairpressure();
            }
            average += v.getAvgairpressure();
        }
        if(temp_list.size() != 0) {
        	average /= temp_list.size();
        }
        String year_ = year.substring(0, 4);
        Weather airPressure = new Weather();
        if(min == 1000000){
        	min = 0;
        }
        if(max == -1){
        	max = 0;
        }
        airPressure.setDate(year_);
        airPressure.setAvgairpressure(average);
        airPressure.setMaxairpressure(max);
        airPressure.setMinairpressure(min);
        return airPressure;
    }
}
