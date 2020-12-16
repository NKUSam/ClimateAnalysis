package com.test.climentanalysis.web.controller;

import com.test.climentanalysis.biz.VisibilityMonthService;
import com.test.climentanalysis.domain.Station;
import com.test.climentanalysis.domain.Weather;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttribute;

import java.util.List;

@RestController
public class VisibilityMonthController {
    @Autowired
    private VisibilityMonthService visibilityMonthService;

    @RequestMapping(value = "/visibilityMonth",method = RequestMethod.GET)
    public List getVisibilityMonth(@SessionAttribute Station station,String year){
        List<Weather> list = visibilityMonthService.getList(station.getId(),year);
        return list;
    }
}
