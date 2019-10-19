package com.coolweather.android.gson;

/**
 * Created by 阿~聂 on 2019/10/17.
 */

public class AQI {

    public AQICity city;

    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
