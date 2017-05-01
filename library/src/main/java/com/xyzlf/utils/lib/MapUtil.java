package com.xyzlf.utils.lib;

import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class MapUtil {

    public static String mapToJson(Map<String, String> map) {
        if (null != map) {
            JSONObject jsonObject = new JSONObject(map);
            return jsonObject.toString();
        }
        return "";
    }

    public static List<String> getKeysForMap(Map<String, String> map) {
        if (map == null)
            return null;
        Iterator<String> iterable = map.keySet().iterator();
        List<String> keys = new ArrayList<>();
        while (iterable.hasNext()) {
            keys.add(iterable.next());
        }
        return keys;
    }

}
