package com.abing.blog.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * Description: Result
 *
 * @author LiBingxiang
 * @version 1.0
 * @date 2019/12/13 15:39
 * @since JDK 1.8
 */
@Data
@ApiModel(description = "响应类")
public class Result<T> {
    @ApiModelProperty("响应码")
    private Integer code;

    @ApiModelProperty("响应数据")
    private T data;

    @ApiModelProperty("响应信息")
    private String massage;

    public Result() {
        this.code = ResultCode.OK;
        this.data = null;
        this.massage = "请求成功";
    }

    public void setError(Integer code, String error) {
        this.setCode(code);
        this.setMassage(error);
    }
}
