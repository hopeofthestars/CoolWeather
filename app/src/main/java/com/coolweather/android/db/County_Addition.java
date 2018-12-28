package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by A555L on 2018/12/28.
 */

public class County_Addition extends DataSupport {
    private int id;
    private String CountyWeatherId;
    private String CountyWeather;
    private String WeatherName;
    private Boolean Def;

    public int getId() {
        return id;
    }

    public String getCountyWeather() {
        return CountyWeather;
    }

    public String getCountyWeatherId() {
        return CountyWeatherId;
    }

    public Boolean getDef() {
        return Def;
    }

    public String getWeatherName() {
        return WeatherName;
    }

    public void setCountyWeather(String countyWeather) {
        this.CountyWeather = countyWeather;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCountyWeatherId(String countyWeatherId) {
        this.CountyWeatherId = countyWeatherId;
    }

    public void setDef(Boolean def) {
        this.Def = def;
    }

    public void setWeatherName(String countyName) {
        this.WeatherName = countyName;
    }
}
