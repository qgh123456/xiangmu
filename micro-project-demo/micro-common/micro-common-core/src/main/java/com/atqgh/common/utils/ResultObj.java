package com.atqgh.common.utils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.atqgh.common.enums.ResultCodeEnum;
import java.util.HashMap;
import org.apache.http.HttpStatus;

/**
 * 返回数据.
 *
 *
 * @author Mubai
 */
public class ResultObj extends HashMap<String, Object> {

    private static final long serialVersionUID = 1L;

    public ResultObj() {
        put("code", ResultCodeEnum.SUCCESS.getCode());
        put("msg", "success");
    }

    /**
     * 是指参数.
     * @param data 数据
     * @return 结果
     */
    public ResultObj setData(Object data) {
        put("data", data);
        return this;
    }

    /**
     * 错误参数.
     * @return 结果
     */
    public static ResultObj error() {
        return error(HttpStatus.SC_INTERNAL_SERVER_ERROR, "未知异常，请联系管理员");
    }

    /**
     * 错误参数.
     * @param msg 消息
     * @return 结果
     */
    public static ResultObj error(String msg) {
        return error(HttpStatus.SC_INTERNAL_SERVER_ERROR, msg);
    }

    /**
     * 错误结果.
     * @param code 编码
     * @param msg 消息
     * @return 结果
     */
    public static ResultObj error(int code, String msg) {

        ResultObj r = new ResultObj();
        r.put("code", code);
        r.put("msg", msg);
        return r;
    }

    /**
     * 成功.
     * @param msg 消息
     * @return 结果
     */
    public static ResultObj ok(String msg) {
        ResultObj r = new ResultObj();
        r.put("msg", msg);
        return r;
    }

    /**
     * 成功.
     * @return 结果
     */
    public static ResultObj ok() {

        return new ResultObj();
    }

    /**
     * 设置值.
     * @param key key
     * @param value value
     * @return 结果
     */
    @Override
    public ResultObj put(String key, Object value) {
        super.put(key, value);
        return this;
    }

    /**
     * 获取编码.
     * @return 编码
     */
    public Integer getCode() {

        return (Integer) this.get("code");
    }

    /**
    * 利用fastjson进行反序列化.
    *
    * @param typeReference 转换的目标对象
    * @param <T> 目标对象类型
    * @return 结果
    */
    public <T> T getData(TypeReference<T> typeReference) {
        String key = "data";
        return getData(key, typeReference);
    }

    /**
    * 利用fastjson进行反序列化.
    * @param key key
    * @param typeReference 类型
    * @param <T> 参数类型
    * @return 结果
    */
    public <T> T getData(String key, TypeReference<T> typeReference) {
        // 默认是map
        Object data = get(key);
        String jsonString = JSON.toJSONString(data);
        T t = JSON.parseObject(jsonString, typeReference);
        return t;
    }

}
