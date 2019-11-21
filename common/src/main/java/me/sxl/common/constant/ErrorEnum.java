package me.sxl.common.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum  ErrorEnum {

    GLOBAL_SEARCH_ERROR(1001, "搜索结果出错"),
    GLOBAL_INSERT_ERROR(1002, "新增失败"),
    GLOBAL_UPDATE_ERROR(1003, "修改失败"),
    GLOBAL_DELETE_ERROR(1004, "删除失败"),

    REQ_DECODE_ERROR(10001, "参数解析错误");

    private int code;

    private String msg;

}