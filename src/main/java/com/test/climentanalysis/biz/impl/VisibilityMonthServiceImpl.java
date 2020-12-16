package com.test.climentanalysis.biz.impl;

import com.test.climentanalysis.biz.VisibilityMonthService;
import com.test.climentanalysis.dao.VisibilityMonthDao;
import com.test.climentanalysis.domain.Weather;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class VisibilityMonthServiceImpl implements VisibilityMonthService {
    @Autowired
    private VisibilityMonthDao visibilityMonthDao;
    @Override
    public List<Weather> getList(String id,String year) {
        List<Weather> list = new ArrayList<Weather>();
        list.add(visibilityMonthDao.selectById(id,year + "01"));
        list.add(visibilityMonthDao.selectById(id,year + "02"));
        list.add(visibilityMonthDao.selectById(id,year + "03"));
        list.add(visibilityMonthDao.selectById(id,year + "04"));
        list.add(visibilityMonthDao.selectById(id,year + "05"));
        list.add(visibilityMonthDao.selectById(id,year + "06"));
        list.add(visibilityMonthDao.selectById(id,year + "07"));
        list.add(visibilityMonthDao.selectById(id,year + "08"));
        list.add(visibilityMonthDao.selectById(id,year + "09"));
        list.add(visibilityMonthDao.selectById(id,year + "10"));
        list.add(visibilityMonthDao.selectById(id,year + "11"));
        list.add(visibilityMonthDao.selectById(id,year + "12"));
        return list;
    }
}
