package com.test.climentanalysis.web.controller;

import com.test.climentanalysis.biz.AirPressureMonthService;
import com.test.climentanalysis.domain.Station;
import com.test.climentanalysis.domain.Weather;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttribute;

import java.util.List;

@RestController
public class AirPressureMonthController {
    @Autowired
    private AirPressureMonthService airPressureMonthService;
    @RequestMapping(value = "/airPressureMonth",method = RequestMethod.GET)
    public List getAirPressureMonth(@SessionAttribute Station station, String year){
        List<Weather> list = airPressureMonthService.getList(station.getId(),year);
        return list;
    }
}
