package com.first;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Translate {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        Date date = c.getTime();
        System.out.println("date"+ date);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String now = sdf.format(date);
        System.out.println(new StringBuilder().append("当前时间: ").append(now).toString());

        // 将字符串转成时间
        String currentDate = "2019年4月1日 1点30分20秒";
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日 HH点mm分ss秒");
        Date date2 = null;
        try {
            date2 = sdf2.parse(currentDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(new StringBuilder().append("当前时间：").append(date2).toString());
    }
}
