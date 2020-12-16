package com.test.climentanalysis.web.controller;

import com.test.climentanalysis.biz.StationSelectService;
import com.test.climentanalysis.domain.Station;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@SessionAttributes(types = {Station.class})
@Controller
public class StationSearchController {

    @Autowired
    private StationSelectService stationSelectService;

    @RequestMapping(value = "/stationsearch",method = RequestMethod.POST)
    public ModelAndView stationSearch(double longitude, double latitude,Map<String,Object> map){
    	ModelAndView mv = new ModelAndView();
        String geo_hash = geoHash(longitude,latitude);
        ArrayList<Station> list = (ArrayList)stationSelectService.selectStation(geo_hash);
        Station re = new Station();
        double min = 1000000;
        for(Station station:list){
            if((station.getLatitude() - latitude) * (station.getLatitude() - latitude) + (station.getLongitude() - longitude) * (station.getLongitude() - longitude) < min){
                re = station;
                min = (station.getLatitude() - latitude) * (station.getLatitude() - latitude) + (station.getLongitude() - longitude) * (station.getLongitude() - longitude);
            }
        }
        map.put("station",re);
        mv.setViewName("weather");
        System.out.println(re);
        return mv;
    }
//    public ModelAndView stationSearch(double longitude, double latitude){
//        ModelAndView mv = new ModelAndView();
//        String geo_hash = geoHash(longitude,latitude);
//        System.out.println(" 111  " + geo_hash);
//        ArrayList<Station> list = (ArrayList)stationSelectService.selectStation(geo_hash);
//        Station re = new Station();
//        double min = 1000000;
//        for(Station station:list){
//            if((station.getLatitude() - latitude) * (station.getLatitude() - latitude) + (station.getLongitude() - longitude) * (station.getLongitude() - longitude) < min){
//                re = station;
//                min = (station.getLatitude() - latitude) * (station.getLatitude() - latitude) + (station.getLongitude() - longitude) * (station.getLongitude() - longitude);
//            }
//        }
//        mv.addObject("station",re);
//        mv.setViewName("weather");
//        return mv;
//    }


    public String geoHash(double longitude,double latitude){
        double max_latitude = 90;
        double min_latitude = -90;
        double max_longtitude = 180;
        double min_longtitude = -180;
        double mid_latitude = 0;
        double mid_longtitude = 0;
        int[] latitude_geo = new int[10];
        int[] longtitude_geo = new int[10];
        int i = 0;
        for(int j = 0;j < 10;j ++){
            latitude_geo[j] = 9;
            longtitude_geo[j] = 9;
        }
        while(latitude_geo[9] == 9){
            mid_latitude = (max_latitude + min_latitude) / 2;
            mid_longtitude = (max_longtitude + min_longtitude) / 2;
            if(latitude >= mid_latitude){
                latitude_geo[i] = 1;
                min_latitude = mid_latitude;
            }else{
                latitude_geo[i] = 0;
                max_latitude = mid_latitude;
            }
            if(longitude >= mid_longtitude){
                longtitude_geo[i] = 1;
                min_longtitude = mid_longtitude;
            }else{
                longtitude_geo[i] = 0;
                max_longtitude = mid_longtitude;
            }
            i ++;
        }
        int[] final_geo = new int[20];
        for(int k = 0;k < 10;k ++){
            final_geo[k * 2] = longtitude_geo[k];
            final_geo[k * 2 + 1] = latitude_geo[k];
        }
        int[] final_nums = new int[4];
        for(i = 0;i < 4;i ++){
            final_nums[i] = 0;
            StringBuffer sb = new StringBuffer();
            for(int m = 0;m < 5;m ++){
                sb.append(final_geo[i * 5 + m]);
            }
            String mid_num = sb.toString();
            final_nums[i] = Integer.parseInt(mid_num,2);
        }
        StringBuffer re = new StringBuffer();
        for(int n = 0;n < 4;n ++){
            if(final_nums[n] < 10){
                re.append(final_nums[n]);
            }else if(final_nums[n] >= 10 && final_nums[n] < 17){
                re.append((char)(final_nums[n] - 10 + 'b'));
            }else if(final_nums[n] == 17){
                re.append('j');
            }else if(final_nums[n] == 18){
                re.append('k');
            }else if(final_nums[n] > 18 && final_nums[n] < 21){
                re.append((char)(final_nums[n] - 19 + 'm'));
            }else if(final_nums[n] == 21){
                re.append('p');
            }else{
                re.append((char)(final_nums[n] - 22 + 'q'));
            }
        }
        System.out.println(re);
        return re.toString();
    }
}
