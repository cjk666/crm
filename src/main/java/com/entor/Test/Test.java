package com.entor.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.format.datetime.DateFormatter;

import com.alibaba.excel.support.ExcelTypeEnum;
import com.entor.entity.Teacher;
import com.entor.entity.Teacher;
import com.entor.service.ITeacherService;
import com.entor.service.ITeacherService;
import com.entor.service.impl.TeacherServiceImpl;
import com.entor.util.EasyExcelUtil;
import com.entor.util.UUIDUtil;

public class Test {
	
	@Autowired
	private static ITeacherService service;
	
	 public static void main(String[] args) throws Exception {
		 ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		 service = context.getBean(ITeacherService.class);
         writeExcel();
//         readExcel();
		 
    }

    /**
     * 	写入Excel
     * 
     * @throws FileNotFoundException
     * @author Lynch
     */
    private static void writeExcel() throws FileNotFoundException {
    	//获取数据
        List<Teacher> list =  service.queryAll();
        //程序开始时间
        long beginTime = System.currentTimeMillis();
        
        OutputStream out = new FileOutputStream("D:/teacher.xlsx");
        
        EasyExcelUtil.writeExcelWithModel(out, list, Teacher.class, ExcelTypeEnum.XLSX);
        //程序结束时间
        long endTime = System.currentTimeMillis();
        //打印程序耗时
        System.out.println(String.format("总共耗时 %s 毫秒", (endTime - beginTime)));
        //清空集合
        list = null;
    }

    /**
     * 	读取Excel
     * 
     * @throws FileNotFoundException
     * @author Lynch
     */
    @SuppressWarnings("unused")
	private static void readExcel() throws FileNotFoundException {
        try {
            InputStream inputStream=new FileInputStream("D:/a1.xlsx");
            //读入文件，每一行对应一个 Model，获取 Model 列表
            List<Teacher> list = EasyExcelUtil.readExcelWithModel(inputStream, Teacher.class, ExcelTypeEnum.XLSX);
            for (Teacher teacher : list) {
				System.out.println(teacher);
			}
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
	
}
