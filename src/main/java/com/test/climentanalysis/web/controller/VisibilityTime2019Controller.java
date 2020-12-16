package com.test.climentanalysis.web.controller;

import com.test.climentanalysis.biz.VisibilityTime2019Service;
import com.test.climentanalysis.domain.DetailWeather;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class VisibilityTime2019Controller {
    @Autowired
    private VisibilityTime2019Service visibilityTime2019Service;
    @RequestMapping(value = "/visibility2019Time",method = RequestMethod.POST)
    public List<DetailWeather> getVisibilityDay(String id, String yearAndMonthAndDay){
        List<DetailWeather> list = visibilityTime2019Service.getList(id,yearAndMonthAndDay);
        return list;
    }
}
