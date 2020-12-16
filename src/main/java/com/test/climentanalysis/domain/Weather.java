package com.test.climentanalysis.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Weather implements Serializable {
	@Id
    private String id;
	private String stationid;
    private String date;
    private Integer winddirect;
    private Double maxwindspeed;
    private Double minwindspeed;
    private Double avgwindspeed;
    private Integer maxcloudheight;
    private Integer mincloudheight;
    private Integer avgcloudheight;
    private Integer maxvisibility;
    private Integer minvisibility;
    private Integer avgvisibility;
    private Double maxairtemperature;
    private Double minairtemperature;
    private Double avgairtemperature;
    private Double maxdewtemperature;
    private Double mindewtemperature;
    private Double avgdewtemperature;
    private Double maxairpressure;
    private Double minairpressure;
    private Double avgairpressure;
	
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getStationid() {
		return stationid;
	}

	public void setStationid(String stationid) {
		this.stationid = stationid;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Integer getWinddirect() {
		return winddirect;
	}

	public void setWinddirect(Integer winddirect) {
		this.winddirect = winddirect;
	}

	public Double getMaxwindspeed() {
		return maxwindspeed;
	}

	public void setMaxwindspeed(Double maxwindspeed) {
		this.maxwindspeed = maxwindspeed;
	}

	public Double getMinwindspeed() {
		return minwindspeed;
	}

	public void setMinwindspeed(Double minwindspeed) {
		this.minwindspeed = minwindspeed;
	}

	public Double getAvgwindspeed() {
		return avgwindspeed;
	}

	public void setAvgwindspeed(Double avgwindspeed) {
		this.avgwindspeed = avgwindspeed;
	}

	public Integer getMaxcloudheight() {
		return maxcloudheight;
	}

	public void setMaxcloudheight(Integer maxcloudheight) {
		this.maxcloudheight = maxcloudheight;
	}

	public Integer getMincloudheight() {
		return mincloudheight;
	}

	public void setMincloudheight(Integer mincloudheight) {
		this.mincloudheight = mincloudheight;
	}

	public Integer getAvgcloudheight() {
		return avgcloudheight;
	}

	public void setAvgcloudheight(Integer avgcloudheight) {
		this.avgcloudheight = avgcloudheight;
	}

	public Integer getMaxvisibility() {
		return maxvisibility;
	}

	public void setMaxvisibility(Integer maxvisibility) {
		this.maxvisibility = maxvisibility;
	}

	public Integer getMinvisibility() {
		return minvisibility;
	}

	public void setMinvisibility(Integer minvisibility) {
		this.minvisibility = minvisibility;
	}

	public Integer getAvgvisibility() {
		return avgvisibility;
	}

	public void setAvgvisibility(Integer avgvisibility) {
		this.avgvisibility = avgvisibility;
	}

	public Double getMaxairtemperature() {
		return maxairtemperature;
	}

	public void setMaxairtemperature(Double maxairtemperature) {
		this.maxairtemperature = maxairtemperature;
	}

	public Double getMinairtemperature() {
		return minairtemperature;
	}

	public void setMinairtemperature(Double minairtemperature) {
		this.minairtemperature = minairtemperature;
	}

	public Double getAvgairtemperature() {
		return avgairtemperature;
	}

	public void setAvgairtemperature(Double avgairtemperature) {
		this.avgairtemperature = avgairtemperature;
	}

	public Double getMaxdewtemperature() {
		return maxdewtemperature;
	}

	public void setMaxdewtemperature(Double maxdewtemperature) {
		this.maxdewtemperature = maxdewtemperature;
	}

	public Double getMindewtemperature() {
		return mindewtemperature;
	}

	public void setMindewtemperature(Double mindewtemperature) {
		this.mindewtemperature = mindewtemperature;
	}

	public Double getAvgdewtemperature() {
		return avgdewtemperature;
	}

	public void setAvgdewtemperature(Double avgdewtemperature) {
		this.avgdewtemperature = avgdewtemperature;
	}

	public Double getMaxairpressure() {
		return maxairpressure;
	}

	public void setMaxairpressure(Double maxairpressure) {
		this.maxairpressure = maxairpressure;
	}

	public Double getMinairpressure() {
		return minairpressure;
	}

	public void setMinairpressure(Double minairpressure) {
		this.minairpressure = minairpressure;
	}

	public Double getAvgairpressure() {
		return avgairpressure;
	}

	public void setAvgairpressure(Double avgairpressure) {
		this.avgairpressure = avgairpressure;
	}

	@Override
	public String toString() {
		return "Weather [id=" + id + ", stationid=" + stationid + ", date=" + date + ", winddirect=" + winddirect
				+ ", maxwindspeed=" + maxwindspeed + ", minwindspeed=" + minwindspeed + ", avgwindspeed=" + avgwindspeed
				+ ", maxcloudheight=" + maxcloudheight + ", mincloudheight=" + mincloudheight + ", avgcloudheight="
				+ avgcloudheight + ", maxvisibility=" + maxvisibility + ", minvisibility=" + minvisibility
				+ ", avgvisibility=" + avgvisibility + ", maxairtemperature=" + maxairtemperature
				+ ", minairtemperature=" + minairtemperature + ", avgairtemperature=" + avgairtemperature
				+ ", maxdewtemperature=" + maxdewtemperature + ", mindewtemperature=" + mindewtemperature
				+ ", avgdewtemperature=" + avgdewtemperature + ", maxairpressure=" + maxairpressure
				+ ", minairpressure=" + minairpressure + ", avgairpressure=" + avgairpressure + "]";
	}
	
	public Weather() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Weather(String id, String stationid, String date, Integer winddirect, Double maxwindspeed,
			Double minwindspeed, Double avgwindspeed, Integer maxcloudheight, Integer mincloudheight,
			Integer avgcloudheight, Integer maxvisibility, Integer minvisibility, Integer avgvisibility,
			Double maxairtemperature, Double minairtemperature, Double avgairtemperature, Double maxdewtemperature,
			Double mindewtemperature, Double avgdewtemperature, Double maxairpressure, Double minairpressure,
			Double avgairpressure) {
		super();
		this.id = id;
		this.stationid = stationid;
		this.date = date;
		this.winddirect = winddirect;
		this.maxwindspeed = maxwindspeed;
		this.minwindspeed = minwindspeed;
		this.avgwindspeed = avgwindspeed;
		this.maxcloudheight = maxcloudheight;
		this.mincloudheight = mincloudheight;
		this.avgcloudheight = avgcloudheight;
		this.maxvisibility = maxvisibility;
		this.minvisibility = minvisibility;
		this.avgvisibility = avgvisibility;
		this.maxairtemperature = maxairtemperature;
		this.minairtemperature = minairtemperature;
		this.avgairtemperature = avgairtemperature;
		this.maxdewtemperature = maxdewtemperature;
		this.mindewtemperature = mindewtemperature;
		this.avgdewtemperature = avgdewtemperature;
		this.maxairpressure = maxairpressure;
		this.minairpressure = minairpressure;
		this.avgairpressure = avgairpressure;
	}
}
