package com.first.collection.map;

import java.util.*;

public class TestHashMap {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        Set<String> keys = map.keySet();
        map.put("1", "lxs");
        System.out.println("map.get(0): "+ map.get("1"));
        Map<String, String> cloneMap = (Map<String, String>) ((HashMap<String, String>) map).clone(); // 返回此 HashMap 实例的浅表副本：并不复制键和值本身。
        System.out.println(cloneMap == map);
        cloneMap.put("2", "zal");
        System.out.println("map.get(\"2\");" + map.get("2"));

        Map<String, String> map2 = new HashMap<String, String>(){{
            put("2", "zal");
            put("3", "test");
        }};

        map.putAll(map2);
        System.out.println("map.values() = " + map.values());
        System.out.println("map.keySet() = " + map.keySet());
        System.out.println("map.isEmpty() = "  + map.isEmpty() );
        System.out.println(map.entrySet());

        long bs = Calendar.getInstance().getTimeInMillis();
        Iterator iterator = map.entrySet().iterator();
        while(iterator.hasNext()) {
            Map.Entry entry = (Map.Entry) iterator.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            System.out.println(key + " : " + value);
        }
        System.out.println(Calendar.getInstance().getTimeInMillis() - bs);

        long bs2 = Calendar.getInstance().getTimeInMillis();
        Iterator iterator1 = map.keySet().iterator();
        while (iterator1.hasNext()) {
            Object key = iterator1.next();
            Object val = map.get(key);
            System.out.println(key + " : " + val);
        }
        System.out.println(Calendar.getInstance().getTimeInMillis() - bs2);

        map.remove("3");
        System.out.println(map);

        System.out.println("map.containsKey(\"1\"): "+map.containsKey("1"));
        System.out.println("map.containsValue(\"lxs\"): " + map.containsValue("lxs"));

        for (String value : map.values()) {
            System.out.println("value: " + value);
        }

        for (String s : map.keySet()) {
            System.out.println("key: " + s);
        }


        keys.forEach(System.out::println);

        String isReplaceSuccess = map.replace("1", "test");
        System.out.println("map -> " + isReplaceSuccess + " " + map);

        Set<Map.Entry<String, String>> entries= map.entrySet();
        entries.forEach(entry -> {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println("key=" + key + ", value=" + value);
        });

        map.forEach(( key, value) -> {
            System.out.println(key + ": " + value);
        });

    }
}
