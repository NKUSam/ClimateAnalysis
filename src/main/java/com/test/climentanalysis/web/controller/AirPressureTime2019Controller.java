package com.test.climentanalysis.web.controller;


import com.test.climentanalysis.biz.AirPressureTime2019Service;
import com.test.climentanalysis.domain.DetailWeather;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AirPressureTime2019Controller {
    @Autowired
    private AirPressureTime2019Service airPressureTime2019Service;
    @RequestMapping(value = "/airpressureTime",method = RequestMethod.POST)
    public List<DetailWeather> getAirPressureDay(String id, String yearAndMonthAndDay){
        List<DetailWeather> list = airPressureTime2019Service.getList(id,yearAndMonthAndDay);
        return list;
    }
}
