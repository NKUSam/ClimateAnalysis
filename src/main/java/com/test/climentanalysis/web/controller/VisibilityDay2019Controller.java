package com.test.climentanalysis.web.controller;

import com.test.climentanalysis.biz.VisibilityDay2019Service;
import com.test.climentanalysis.domain.DetailWeather;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class VisibilityDay2019Controller {
    @Autowired
    private VisibilityDay2019Service visibilityDayService;
    @RequestMapping(value = "/visibility2019Day",method = RequestMethod.POST)
    public List<DetailWeather> getVisibilityDay(String id,String yearAndMonth){
        List<DetailWeather> list = visibilityDayService.getList(id,yearAndMonth);
        return list;
    }
}
