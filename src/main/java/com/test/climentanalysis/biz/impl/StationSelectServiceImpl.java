package com.test.climentanalysis.biz.impl;

import com.test.climentanalysis.biz.StationSelectService;
import com.test.climentanalysis.dao.StationDao;
import com.test.climentanalysis.domain.Station;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StationSelectServiceImpl implements StationSelectService{
    @Autowired
    private StationDao stationDao;

    @Override
    public List<Station> selectStation(String geoHash) {
        int i = 4;
        List<Station> list = null;
        while(true){
            list = stationDao.selectByGeoHash(geoHash);
            if(list != null){
                if(list.size() != 0){
                    break;
                }
            }
            if(i == 0){
                break;
            }
            char[] arr = geoHash.toCharArray();
            StringBuffer sb = new StringBuffer();
            int j;
            for(j = 0;j < i - 1;j ++){
                sb.append(arr[j]);
            }
            sb.append('%');
            i --;
            geoHash = sb.toString();
            System.out.println(geoHash);
        }
        return list;
    }
}
