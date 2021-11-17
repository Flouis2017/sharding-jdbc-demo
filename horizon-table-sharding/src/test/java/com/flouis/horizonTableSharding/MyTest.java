package com.flouis.horizonTableSharding;

import cn.hutool.json.JSONObject;
import com.google.common.collect.Maps;
import org.junit.jupiter.api.Test;

public class MyTest {

	@Test
	public void defaultTest() {
		System.out.println(System.currentTimeMillis());
	}

	@Test
	public void hutoolTest() {
		JSONObject jsonObject = new JSONObject(Maps.newHashMap(), false);
		jsonObject.set("name", "Flouis").set("age", null).set("gender", "Male");
		System.out.println(jsonObject.toJSONString(0));
	}

}
