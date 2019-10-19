package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 阿~聂 on 2019/10/17.
 */

public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;
    public Update update;
    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
