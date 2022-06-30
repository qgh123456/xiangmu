package com.atqgh.common.utils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import java.util.HashMap;
import java.util.Map;
import org.apache.http.HttpStatus;

/**
 * 返回数据
 *
 * @author Mark sunlightcs@gmail.com
 */
public class ResultObj extends HashMap<String, Object> {
	private static final long serialVersionUID = 1L;

	public ResultObj setData(Object data) {
		put("data",data);
		return this;
	}

	//利用fastjson进行反序列化
	public <T> T getData(TypeReference<T> typeReference) {
		Object data = get("data");	//默认是map
		String jsonString = JSON.toJSONString(data);
		T t = JSON.parseObject(jsonString, typeReference);
		return t;
	}

	//利用fastjson进行反序列化
	public <T> T getData(String key, TypeReference<T> typeReference) {
		Object data = get(key);	//默认是map
		String jsonString = JSON.toJSONString(data);
		T t = JSON.parseObject(jsonString, typeReference);
		return t;
	}

	public ResultObj() {
		put("code", 0);
		put("msg", "success");
	}

	public static ResultObj error() {
		return error(HttpStatus.SC_INTERNAL_SERVER_ERROR, "未知异常，请联系管理员");
	}
	
	public static ResultObj error(String msg) {
		return error(HttpStatus.SC_INTERNAL_SERVER_ERROR, msg);
	}
	
	public static ResultObj error(int code, String msg) {
		ResultObj r = new ResultObj();
		r.put("code", code);
		r.put("msg", msg);
		return r;
	}

	public static ResultObj ok(String msg) {
		ResultObj r = new ResultObj();
		r.put("msg", msg);
		return r;
	}
	
	public static ResultObj ok(Map<String, Object> map) {
		ResultObj r = new ResultObj();
		r.putAll(map);
		return r;
	}
	
	public static ResultObj ok() {

		return new ResultObj();
	}

	public ResultObj put(String key, Object value) {
		super.put(key, value);
		return this;
	}

	public Integer getCode() {

		return (Integer) this.get("code");
	}



}
