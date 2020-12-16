package com.test.climentanalysis.biz.impl;

import com.test.climentanalysis.biz.VisibilityDay2019Service;
import com.test.climentanalysis.dao.VisibilityDay2019Dao;
import com.test.climentanalysis.domain.DetailWeather;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class VisibilityDay2019ServiceImpl implements VisibilityDay2019Service {
    @Autowired
    private VisibilityDay2019Dao visibilityDayDao;
    @Override
    public List<DetailWeather> getList(String id, String yearAndMonth) {
        List<DetailWeather> temp_list = new ArrayList<DetailWeather>();
        List<DetailWeather> list = new ArrayList<DetailWeather>();
        for(int i = 1;i < 32;i ++){
            String str = "";
            if(i < 10){
                str += "0";
            }
            str += i;
            temp_list = visibilityDayDao.selectById(id,yearAndMonth + str);
            int visibility = 0;
            for(DetailWeather v:temp_list) {
                visibility += v.getVisibility();
            }
            DetailWeather d = new DetailWeather();
            d.setVisibility(visibility / temp_list.size());
            list.add(d);
        }
        return list;
    }
}
