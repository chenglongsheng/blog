package cn.cls.blog.vo;

import cn.cls.blog.enums.StatusCodeEnum;
import lombok.Data;

import static cn.cls.blog.enums.StatusCodeEnum.FAIL;
import static cn.cls.blog.enums.StatusCodeEnum.SUCCESS;

/**
 * 统一返回接口类
 *
 * @param <T> 返回数据类型
 */
@Data
public class R<T> {
    /**
     * 返回状态
     */
    private Boolean status;
    /**
     * 返回码
     */
    private Integer code;
    /**
     * 返回信息
     */
    private String message;
    /**
     * 返回数据
     */
    private T data;

    public static <T> R<T> ok() {
        return result(true, null, SUCCESS.getCode(), SUCCESS.getDesc());
    }

    public static <T> R<T> ok(T data) {
        return result(true, data, SUCCESS.getCode(), SUCCESS.getDesc());
    }

    public static <T> R<T> ok(T data, String message) {
        return result(true, data, SUCCESS.getCode(), message);
    }

    public static <T> R<T> fail() {
        return result(false, null, FAIL.getCode(), FAIL.getDesc());
    }

    public static <T> R<T> fail(StatusCodeEnum statusCodeEnum) {
        return result(false, null, statusCodeEnum.getCode(), statusCodeEnum.getDesc());
    }

    public static <T> R<T> fail(String message) {
        return result(message);
    }

    public static <T> R<T> fail(T data) {
        return result(false, data, FAIL.getCode(), FAIL.getDesc());
    }

    public static <T> R<T> fail(T data, String message) {
        return result(false, data, FAIL.getCode(), message);
    }

    public static <T> R<T> fail(Integer code, String message) {
        return result(false, null, code, message);
    }

    private static <T> R<T> result(String message) {
        R<T> r = new R<>();
        r.setStatus(false);
        r.setCode(FAIL.getCode());
        r.setMessage(message);
        return r;
    }

    private static <T> R<T> result(Boolean status, T data, Integer code, String message) {
        R<T> r = new R<>();
        r.setStatus(status);
        r.setData(data);
        r.setCode(code);
        r.setMessage(message);
        return r;
    }

}
