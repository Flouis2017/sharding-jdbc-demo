package com.flouis.horizonTableSharding.util;

import com.alibaba.fastjson.JSONObject;

public class ResUtil {

    public static JSONObject response() {
        JSONObject res = new JSONObject();
        res.put("code", 0);
        res.put("msg", "");
        res.put("data", null);
        return res;
    }

}
