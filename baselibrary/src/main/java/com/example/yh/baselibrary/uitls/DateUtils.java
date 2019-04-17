package com.example.yh.baselibrary.uitls;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {

    /**
     * @return：获取当前时间
     */
    public static String getNowDate() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sdf.format(new Date());
    }

}
