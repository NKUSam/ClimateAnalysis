package com.test.climentanalysis.web.controller;

import com.test.climentanalysis.biz.AirPressureDay2019Service;
import com.test.climentanalysis.domain.DetailWeather;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AirPressureDay2019Controller {
    @Autowired
    private AirPressureDay2019Service airPressureDayService;
    @RequestMapping(value = "/airPressureDay",method = RequestMethod.POST)
    public List<DetailWeather> getAirPressureDay(String id,String yearAndMonth){
        List<DetailWeather> list = airPressureDayService.getList(id,yearAndMonth);
        return list;
    }
}
