package cn.otakus.aiproject.common;

import cn.otakus.aiproject.enums.CodeEnum;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * @author otakus
 * @date 2023/3/17
 * @since 1.0.0
 */
@Data
@ToString
@EqualsAndHashCode
public class Result<T> {
    private CodeEnum code;
    private String msg;
    private T data;

    public Result(CodeEnum code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }
    
    public static Result<String> getSuccess(String msg) {
    return new Result<>(CodeEnum.SUCCESS, CodeEnum.SUCCESS.getCode(), msg);
    }
}