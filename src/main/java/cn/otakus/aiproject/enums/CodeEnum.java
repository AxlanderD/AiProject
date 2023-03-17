package cn.otakus.aiproject.enums;

/**
 * @author otakus
 * @date 2023/3/17
 * @since 1.0.0
 */
public enum CodeEnum {
    SUCCESS("01","success"),
    FAIL("99","fail");

    /**
     * 标识码
     */
    private String code;

    /**
     * 标识码含义
     */
    private String msg;

    CodeEnum(String code,String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
