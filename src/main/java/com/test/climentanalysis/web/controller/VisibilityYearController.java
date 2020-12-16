package com.test.climentanalysis.web.controller;

import com.test.climentanalysis.biz.VisibilityYearService;
import com.test.climentanalysis.domain.Station;
import com.test.climentanalysis.domain.Weather;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttribute;

import java.util.List;

@RestController
public class VisibilityYearController {
    @Autowired
    private VisibilityYearService visibilityYearService;
    
    @RequestMapping(value = "/visibilityYear",method = RequestMethod.GET)
    public List<Weather> getVisibilityYear(@SessionAttribute Station station){
        List<Weather> list = visibilityYearService.getList(station.getId());
        System.out.println(list);
        return list;
    }
}
