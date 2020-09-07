package com.service.pay.utils;

import com.scottxuan.base.utils.JsonUtils;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author : pc
 * @date : 2020/9/7
 */
public class WeChatXmlUtil {
    public static String beanToXml(Object object) {
        Field[] fields = object.getClass().getDeclaredFields();
        StringBuilder xmlBuilder = new StringBuilder();
        for (int i = 0; i < fields.length; i++) {
            xmlBuilder.append(buildSingleXml(fields[i].getName(), getFieldValueByName(fields[i].getName(), object)));
        }
        return xmlBuilder.toString();
    }

    private static Object getFieldValueByName(String fieldName, Object o) {
        try {
            String firstLetter = fieldName.substring(0, 1).toUpperCase();
            String getter = "get" + firstLetter + fieldName.substring(1);
            Method method = o.getClass().getMethod(getter, new Class[]{});
            Object value = method.invoke(o, new Object[]{});
            return value;
        } catch (Exception e) {
            return null;
        }
    }

    private static StringBuilder buildSingleXml(String fieldName, Object value) {
        StringBuilder singleXml = new StringBuilder();
        singleXml.append("<xml>");
        singleXml.append("<").append(fieldName).append("><![CDATA[");
        if (value instanceof String) {
            singleXml.append(value);
        } else {
            singleXml.append(JsonUtils.toJsonString(value));
        }
        singleXml.append("]]></").append(fieldName).append(">");
        singleXml.append("</xml>");
        return singleXml;
    }

    public static <T> T xmlToBean(String result, Class<T> response) {
        return null;
    }
}
