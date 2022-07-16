package com.atqgh.common.enums;

import lombok.Getter;

/**
 * 结果.
 *
 * @author qiguohui
 * @since 2019/6/24
 */
@Getter
public enum ResultCodeEnum {

    SUCCESS(true, 20000, "成功"),

    UNKNOWN_REASON(false, 20001, "未知错误"),

    BAD_SQL_GRAMMAR(false, 21002, "sql语法错误"),

    JSON_PARSE_ERROR(false, 21003, "json解析异常"),

    PARAM_ERROR(false, 21004, "输入的参数不符合规范"),

    FILE_UPLOAD_ERROR(false, 21005, "文件上传错误"),

    EXCEL_DATA_IMPORT_ERROR(false, 21006, "Excel数据导入错误"),

    BUSINESS_REQUEST_FAILED(false, 21007, "业务请求失败");

    /**
     * 成功.
     */
    private Boolean success;

    // 返回码
    private Integer code;

    // 返回消息
    private String message;

    ResultCodeEnum(Boolean success, Integer code, String message) {
        this.success = success;
        this.code = code;
        this.message = message;
    }

}
