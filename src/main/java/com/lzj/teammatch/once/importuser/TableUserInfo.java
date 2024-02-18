package com.lzj.teammatch.once.importuser;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

/**
 * 表格（Excel）用户信息
 */
@Data
public class TableUserInfo {

    /**
     * 用户昵称
     */
    // @ExcelProperty(index = 1)
    @ExcelProperty("成员昵称")
    private String username;


}