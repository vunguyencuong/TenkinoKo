/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ACER
 */
public class JsonResult {
    
    private String cod;
    private int message;
    private int cnt;
    private DailyWeather[] list;
    private City city;

    public JsonResult() {
    }

    public String getCod() {
        return cod;
    }

    public int getMessage() {
        return message;
    }

    public int getCnt() {
        return cnt;
    }

    public DailyWeather[] getList() {
        return list;
    }

    public City getCity() {
        return city;
    }
}
