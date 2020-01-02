package com.entor.util;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.FileUtils;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

import com.alibaba.excel.metadata.BaseRowModel;
import com.alibaba.excel.support.ExcelTypeEnum;

public class ExcelUtil {
	
	/**
	 * 
	 * @param request http请求对象
	 * @param fileName 文件名
	 * @param data 要写入excel的以 模型 为单位的数据  为null生成模板
	 * @param clazz 模型的类
	 * @return
	 * @throws IOException
	 */
	public static ResponseEntity<byte[]> getDataExcel(HttpServletRequest request,String fileName,List<? extends BaseRowModel> data,
			Class<? extends BaseRowModel> clazz) throws IOException{
		
			String path = request.getServletContext().getRealPath("/upload/");
			if ("".equals(fileName) || fileName == null) {
				fileName = new Date().getTime()+".xlsx";
			}
			//获取下载文件对象
			File file = new File(path,fileName);
			//data为null生成模板
			EasyExcelUtil.writeExcelWithModel(new FileOutputStream(file), data, clazz, ExcelTypeEnum.XLSX);
			//把文件内容读取到字节数组中
			byte[] b = FileUtils.readFileToByteArray(file);
			//设置头信息
			HttpHeaders headers = new HttpHeaders();//设置响应的文件名
			//设置下载框，解决下载中文文件出现乱码问题
			headers.setContentDispositionFormData("attachment", URLEncoder.encode(fileName, "utf-8"));
			//设置下载文件类型
			headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
			//把字节数组内容输出
			return new ResponseEntity<byte[]>(b,headers, HttpStatus.CREATED);
		
	}
	
}
