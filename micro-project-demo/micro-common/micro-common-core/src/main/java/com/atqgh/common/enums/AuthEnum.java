package com.atqgh.common.enums;

import java.util.Objects;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 安全认证相关.
 * @author Mubai
 * @date 2022/7/9 4:26 下午
 **/
@Getter
@AllArgsConstructor
public enum AuthEnum {

    AUTH_NO_TOKEN(401, "Token已过期或有误"),

    AUTH_NO_ACCESS(403, "无访问权限"),

    AUTH_NONEXISTENT(404, "请求路径不存在");

    private Integer key;

    private String value;

    /**
     * 根据key获取value.
     * @param key key
     * @return value
     */
    public static String getValue(Integer key) {
        for (AuthEnum value : AuthEnum.values()) {
            if (Objects.equals(key, value.getKey())) {
                return value.getValue();
            }
        }
        return null;
    }

}
