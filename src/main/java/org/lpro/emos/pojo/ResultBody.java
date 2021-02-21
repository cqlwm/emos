package org.lpro.emos.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.lpro.emos.config.CodeConfig;

/**
 * @author lwm
 * @date 2021-02-21 15:06
 * @description
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResultBody<T> {

    private boolean success;

    private Integer code;

    private String message;

    private T content;

    public ResultBody(boolean success, CodeConfig code, T content) {
        this.success = success;
        this.code = code.code;
        this.message = code.message;
        this.content = content;
    }

    public ResultBody(boolean success, CodeConfig code) {
        this.success = success;
        this.code = code.code;
        this.message = code.message;
    }

    public static <W> ResultBody ok(W content) {
        return new ResultBody<W>(true, CodeConfig.SUCCESS, content);
    }

    public static <W> ResultBody ok(CodeConfig codeConfig, W content) {
        return new ResultBody<W>(true, codeConfig, content);
    }

    public static <W> ResultBody error(CodeConfig codeConfig, W content) {
        return new ResultBody<W>(false, codeConfig, content);
    }

    public static ResultBody error(CodeConfig codeConfig) {
        return new ResultBody(false, codeConfig);
    }

}
