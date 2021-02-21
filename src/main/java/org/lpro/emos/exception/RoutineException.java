package org.lpro.emos.exception;

import lombok.Getter;
import lombok.Setter;
import org.lpro.emos.config.CodeConfig;

/**
 * @author lwm
 * @date 2021-02-21 14:54
 * @description
 */
@Getter
@Setter
public class RoutineException extends RuntimeException {

    private Integer code;
    private String message;

    public RoutineException(CodeConfig codeConfig) {
        super(codeConfig.message);
        this.code = codeConfig.code;
        this.message = codeConfig.message;
    }

}
