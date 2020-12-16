package com.test.climentanalysis.biz.impl;

import com.test.climentanalysis.biz.VisibilityTime2019Service;
import com.test.climentanalysis.dao.VisibilityDay2019Dao;
import com.test.climentanalysis.domain.DetailWeather;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VisibilityTime2019ServiceImpl implements VisibilityTime2019Service {
    @Autowired
    private VisibilityDay2019Dao visibilityDay2019Dao;
    @Override
    public List<DetailWeather> getList(String id, String yearAndMonthAndDay) {
        List<DetailWeather> list = visibilityDay2019Dao.selectById(id,yearAndMonthAndDay);
        return list;
    }
}
