package com.test.climentanalysis.domain;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class DetailWeather implements Serializable{
	@Id
	private Integer id;
	private String stationid;
	private String date;
	private String time;
	private Integer winddirect;
	private Double windspeed;
	private Integer cloudheight;
	private Integer visibility;
	private Double airtemperature;
	private Double dewtemperature;
	private Double airpressure;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
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
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public Integer getWinddirect() {
		return winddirect;
	}
	public void setWinddirect(Integer winddirect) {
		this.winddirect = winddirect;
	}
	public Double getWindspeed() {
		return windspeed;
	}
	public void setWindspeed(Double windspeed) {
		this.windspeed = windspeed;
	}
	public Integer getCloudheight() {
		return cloudheight;
	}
	public void setCloudheight(Integer cloudheight) {
		this.cloudheight = cloudheight;
	}
	public Integer getVisibility() {
		return visibility;
	}
	public void setVisibility(Integer visibility) {
		this.visibility = visibility;
	}
	public Double getAirtemperature() {
		return airtemperature;
	}
	public void setAirtemperature(Double airtemperature) {
		this.airtemperature = airtemperature;
	}
	public Double getDewtemperature() {
		return dewtemperature;
	}
	public void setDewtemperature(Double dewtemperature) {
		this.dewtemperature = dewtemperature;
	}
	public Double getAirpressure() {
		return airpressure;
	}
	public void setAirpressure(Double airpressure) {
		this.airpressure = airpressure;
	}
	
	@Override
	public String toString() {
		return "DetailWeather [id=" + id + ", stationid=" + stationid + ", date=" + date + ", time=" + time
				+ ", winddirect=" + winddirect + ", windspeed=" + windspeed + ", cloudheight=" + cloudheight
				+ ", visibility=" + visibility + ", airtemperature=" + airtemperature + ", dewtemperature="
				+ dewtemperature + ", airpressure=" + airpressure + "]";
	}
	
	public DetailWeather() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public DetailWeather(Integer id, String stationid, String date, String time, Integer winddirect, Double windspeed,
			Integer cloudheight, Integer visibility, Double airtemperature, Double dewtemperature, Double airpressure) {
		super();
		this.id = id;
		this.stationid = stationid;
		this.date = date;
		this.time = time;
		this.winddirect = winddirect;
		this.windspeed = windspeed;
		this.cloudheight = cloudheight;
		this.visibility = visibility;
		this.airtemperature = airtemperature;
		this.dewtemperature = dewtemperature;
		this.airpressure = airpressure;
	}

}
