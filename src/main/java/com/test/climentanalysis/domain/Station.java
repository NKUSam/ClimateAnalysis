package com.test.climentanalysis.domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Station implements Serializable {
    @Id
    private String id;
    private Double longitude;//经度
    private Double latitude;//纬度
    private Integer height;

    public Station() {
    }

    @Override
	public String toString() {
		return "Station [id=" + id + ", longitude=" + longitude + ", latitude=" + latitude + ", height=" + height + "]";
	}

	public Station(String id, Double longitude, Double latitude, Integer height) {
        this.id = id;
        this.longitude = longitude;
        this.latitude = latitude;
        this.height = height;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }
}
