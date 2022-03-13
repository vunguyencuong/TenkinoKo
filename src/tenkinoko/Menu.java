/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tenkinoko;

import controller.HandleAPI;
import model.DailyWeather;
import model.JsonResult;
import model.Weather;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 *
 * @author ACER
 */
public class Menu {
    
    private GUI gui;
    private JsonResult result;
    private ArrayList<Weather> listResult;
    private int idx = 0;
    
    public Menu()
    {
        gui = new GUI();
        prepare();
    }
    
    public GUI getGUI()
    {
        return gui;
    }
    
    private void prepare()
    {
        gui.getBtn_find().setActionCommand("find");
        gui.getBtn_find().addActionListener(new ButtonClick());
        
        gui.getBtn_next().setActionCommand("next");
        gui.getBtn_next().addActionListener(new ButtonClick());
        
        gui.getBtn_back().setActionCommand("back");
        gui.getBtn_back().addActionListener(new ButtonClick());
    }
    
    private void show()
    {
        String date = "Ngày: "  + result.getList()[idx].getDt_txt();
        String city = "Thành phố: " + result.getCity().getName();
        String weath = "Thời tiết: " + result.getList()[idx].getWeather()[0].getDescription();
        String nhietDo = "Nhiệt độ: " + result.getList()[idx].getMain().getTemp() + " độ C";
        String apSuat = " Áp Suất: " + result.getList()[idx].getMain().getPresure();
        String doAm = " Độ ẩm: " + result.getList()[idx].getMain().getHumidity() + "%";
        String winSpeed = " Tốc độ gió: " + result.getList()[idx].getWind().getSpeed() + "km/h";
        String clouds = " Mây: " + result.getList()[idx].getClouds().getAll() + "%";
        
        gui.getLb_apSuat().setText(apSuat);
        gui.getLb_city().setText(city);
        gui.getLb_cloud().setText(clouds);
        gui.getLb_date().setText(date);
        gui.getLb_doAm().setText(doAm);
        gui.getLb_nhietDo().setText(nhietDo);
        gui.getLb_weather().setText(weath);
        gui.getLb_windSpeed().setText(winSpeed);
    }
    
     public class ButtonClick implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            String command = ae.getActionCommand();
            if (command.equals("find")) {
                find();
                idx = 0;
            } else if (command.equals("next")) {
                idx = idx == 39 ? idx : idx + 1;
            } else if (command.equals("back")) {
                idx = idx == 0 ? idx : idx - 1;
            }
            show();
        }

        private void find() {
            result = HandleAPI.getJsonData((String) gui.getCb_city().getSelectedItem());
        }
    }
    
}
