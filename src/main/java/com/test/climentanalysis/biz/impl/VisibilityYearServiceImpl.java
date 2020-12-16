package com.test.climentanalysis.biz.impl;

import com.test.climentanalysis.biz.VisibilityYearService;
import com.test.climentanalysis.dao.VisibilityYearDao;
import com.test.climentanalysis.domain.Weather;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class VisibilityYearServiceImpl implements VisibilityYearService {
    @Autowired
    private VisibilityYearDao visibilityYearDao;
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
//        list.add(getAYear(id,"'2005%'"));
//        list.add(getAYear(id,"'2006%'"));
//        list.add(getAYear(id,"'2007%'"));
//        list.add(getAYear(id,"'2008%'"));
//        list.add(getAYear(id,"'2009%'"));
//        list.add(getAYear(id,"'2010%'"));
//        list.add(getAYear(id,"'2011%'"));
//        list.add(getAYear(id,"'2012%'"));
//        list.add(getAYear(id,"'2013%'"));
//        list.add(getAYear(id,"'2014%'"));
//        list.add(getAYear(id,"'2015%'"));
//        list.add(getAYear(id,"'2016%'"));
//        list.add(getAYear(id,"'2017%'"));
//        list.add(getAYear(id,"'2018%'"));
        System.out.println(list);
        return list;
    }
    public Weather getAYear(String id,String year){
        int max = -1;
        int min = 1000000;
        int average = 0;
        List<Weather> temp_list = new ArrayList<Weather>();
        temp_list = visibilityYearDao.selectById(id, year);
        for(Weather v:temp_list){
            if(v.getMaxvisibility() > max){
                max = v.getMaxvisibility();
            }
            if(v.getMinvisibility() < min){
                min = v.getMinvisibility();
            }
            average += v.getAvgvisibility();
        }
        if(temp_list.size() != 0) {
        	average /= temp_list.size();
        }
        String year_ = year.substring(0, 4);
        Weather visibility = new Weather();
        if(min == 1000000){
        	min = 0;
        }
        if(max == -1){
        	max = 0;
        }
        visibility.setDate(year_);
        visibility.setMaxvisibility(max);
        visibility.setMinvisibility(min);
        visibility.setAvgvisibility(average);
        return visibility;
    }
}
