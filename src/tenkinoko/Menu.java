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
    private demo dgui;
    private JsonResult result;
    private ArrayList<Weather> listResult;
    private int idx = 0;
    
    public Menu()
    {
        gui = new GUI();
        dgui = new demo();
        prepare();
    }
    
    public GUI getGUI()
    {
        return gui;
    }
    
    public demo getDGUI()
    {
        return dgui;
    }
            
    
    private void prepare()
    {
       // gui.getBtn_find().setActionCommand("find");
       // gui.getBtn_find().addActionListener(new ButtonClick());
        dgui.getBtn_find().setActionCommand("find");
        dgui.getBtn_find().addActionListener(new ButtonClick());
        
        dgui.getBtn_next().setActionCommand("next");
        dgui.getBtn_next().addActionListener(new ButtonClick());
        
        dgui.getBtn_back().setActionCommand("back");
        dgui.getBtn_back().addActionListener(new ButtonClick());
    }
    
    private void show()
    {
        /*
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
*/
        String date = result.getList()[idx].getDt_txt();
        String city = result.getCity().getName();
        String weath = result.getList()[idx].getWeather()[0].getDescription();
        String nhietDo = String.valueOf(result.getList()[idx].getMain().getTemp());
        String doAm = result.getList()[idx].getMain().getHumidity() + "%";
        String winSpeed = result.getList()[idx].getWind().getSpeed() + "km/h";
        String clouds = result.getList()[idx].getClouds().getAll() + "%";
       
        dgui.getLb_city().setText(city);
        dgui.getLb_cloud().setText(clouds);
        dgui.getLb_date().setText(date);
        dgui.getLb_humidity().setText(doAm);
        dgui.getLb_nhietDo().setText(nhietDo);
        dgui.getLb_wind().setText(winSpeed);
        dgui.getLb_weather().setText(weath);
    }
    
     public class ButtonClick implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            String command = ae.getActionCommand();
            if (command.equals("find")) {
                find();
                //
                String city1 = dgui.getLb_city1().getText();
                String city2 = dgui.getLb_city2().getText();
                dgui.getLb_city1().setText(result.getCity().getName());
                dgui.getLb_city2().setText(city1);
                dgui.getLb_city3().setText(city2);
                idx = 0;
            } else if (command.equals("next")) {
                idx = idx == 39 ? idx : idx + 1;
            } else if (command.equals("back")) {
                idx = idx == 0 ? idx : idx - 1;
            }
            show();
        }

        private void find() {
            result = HandleAPI.getJsonData((String) dgui.getTf_timKiem().getText());
        }
    }
    
}
