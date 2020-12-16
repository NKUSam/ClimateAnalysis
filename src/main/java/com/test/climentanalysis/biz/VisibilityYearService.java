package com.test.climentanalysis.biz;

import com.test.climentanalysis.domain.Weather;

import java.util.List;

public interface VisibilityYearService {
    public List<Weather> getList(String id);
}
