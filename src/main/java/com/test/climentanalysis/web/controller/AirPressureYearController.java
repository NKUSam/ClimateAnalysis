package com.test.climentanalysis.web.controller;

import com.test.climentanalysis.biz.AirPressureYearService;
import com.test.climentanalysis.domain.Station;
import com.test.climentanalysis.domain.Weather;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttribute;

import java.util.List;

@RestController
public class AirPressureYearController {
    @Autowired
    private AirPressureYearService airPressureYearService;
    @RequestMapping(value = "/airPressureYear",method = RequestMethod.GET)
    public List<Weather> getAirPressureYear(@SessionAttribute Station station){
        List<Weather> list = airPressureYearService.getList(station.getId());
        return list;
    }
}
