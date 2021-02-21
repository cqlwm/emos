package org.lpro.emos.config;

/**
 * @author lwm
 * @date 2021-02-21 14:54
 * @description
 */
public enum CodeConfig {

    // 200_000=====成功=====
    SUCCESS(200_000, "成功"),

    // 300_000=====  =====

    // 400_000=====请求错误=====

    // 500_000=====系统错误=====
    ERROR(500_000, "失败"),

    UNKNOWN_EXCEPTION(599_999, "未知异常，请及时联系管理员！");

    // 600_000====业务错误====

    public Integer code;
    public String message;

    CodeConfig(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

}
