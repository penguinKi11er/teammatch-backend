package com.lzj.teammatch.once.importuser;

import com.alibaba.excel.EasyExcel;

import java.util.List;

/**
 * 导入/读取 Excel
 */
public class ImportExcel {

    /**
     * 读取数据
     */
    public static void main(String[] args) {
        // todo 记得改测试文件的路径
        String fileName = "";
//        readByListener(fileName);
        synchronousRead(fileName);
    }

    /**
     * 监听器读取
     *
     * @param fileName
     */
    public static void readByListener(String fileName) {
        EasyExcel.read(fileName, TableUserInfo.class, new TableListener()).sheet().doRead();
    }


    /**
     * 同步读
     *
     * @param fileName
     */
    public static void synchronousRead(String fileName) {
        // 这里 需要指定读用哪个class去读，然后读取第一个sheet 同步读取会自动finish
        List<TableUserInfo> totalDataList =
                EasyExcel.read(fileName).head(TableUserInfo.class).sheet().doReadSync();
        for (TableUserInfo tableUserInfo : totalDataList) {
            System.out.println(tableUserInfo);
        }
    }

}
