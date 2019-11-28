package edu.ustc.utils;

import org.springframework.core.convert.converter.Converter;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 字符串转日期
 * @author USTC_WZH
 * @create 2019-11-22 15:51
 */
public class StringToDateConverter implements Converter<String, Date> {

    /**
     * @param s 传入的字符串
     * @return
     */
    @Override
    public Date convert(String s) {

        //判断
        if (s == null){
            throw new RuntimeException("请您传入数据");
        }

        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");

        try {
            //把字符串转换为日期
            return df.parse(s);
        } catch (Exception e) {
            throw new RuntimeException("数据类型转换出现错误");
        }

    }
}
