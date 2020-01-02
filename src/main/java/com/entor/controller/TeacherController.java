package com.entor.controller;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.alibaba.excel.support.ExcelTypeEnum;
import com.entor.entity.Major;
import com.entor.entity.Result;
import com.entor.entity.Teacher;
import com.entor.service.ITeacherService;
import com.entor.util.EasyExcelUtil;
import com.entor.util.ExcelUtil;
import com.mysql.jdbc.Buffer;

@Controller
@RequestMapping("/Teacher")
public class TeacherController {
	
	@Autowired
	private ITeacherService teacherService;
	
	@RequestMapping("/add")
	@ResponseBody
	public Result add(Teacher teacher) {
		teacherService.add(teacher);
		Result result = new Result();
		result.setMsg("保存数据成功");
		result.setStatue(0);
		return result;
	}
	
	@RequestMapping("/deleteMore")
	@ResponseBody
	public Result deleteMore(String ids) {
		teacherService.deleteMore(ids);
		Result result = new Result();
		result.setMsg("删除成功");
		result.setStatue(0);
		return result;
	}
	
	@RequestMapping("/update")
	@ResponseBody
	public Result update(Teacher teacher) {
		teacherService.update(teacher);
		Result result = new Result();
		result.setMsg("修改数据成功");
		result.setStatue(0);
		return result;
	}
	
	@RequestMapping("/queryByPage")
	@ResponseBody
	public Map<String, Object> queryByPage(@RequestParam(value="page",required=false,defaultValue="1") String page,
			@RequestParam(value="rows",required=false,defaultValue="20") String rows,Teacher teacher){
		List<Teacher> list = teacherService.queryByPage(Integer.parseInt(page), Integer.parseInt(rows),teacher);
		int total = teacherService.getTotal(teacher);
		Map<String, Object> map = new HashMap<>();
		map.put("total", total);
		map.put("rows", list);
		return map;
	}
	
	@RequestMapping("/queryByMap")
	@ResponseBody
	public List<Teacher> queryByMap(String q){
		Map<String, Object> map = new HashMap<>();
		map.put("q", q);
		List<Teacher> list = teacherService.queryByMap(map);
		for (Teacher t : list) {
			System.out.println(t);
		}
		return list;
	}
	
	@RequestMapping("/queryAll")
	@ResponseBody
	public List<Teacher> queryAll(){
		return teacherService.queryAll();
	}
	
	@RequestMapping("/addMore")//文件上传框对应的数据类型是MultipartFile
	@ResponseBody
	public Result uploadFile(@RequestParam(value="file",required=false)MultipartFile file,HttpServletRequest request) {
		//返回提示
		Result result = new Result();
		BufferedInputStream in = null;
		try {
			String path = request.getServletContext().getRealPath("/upload/");
			//上传文件名称
			String fileName = file.getOriginalFilename();
			//上传文件dest
			File dest = new File(path,fileName);
			//上传文件
			file.transferTo(dest);
			in = new BufferedInputStream(new FileInputStream(dest));
			//读入文件，每一行对应一个 Model，获取 Model 列表
			teacherService.addMore(EasyExcelUtil.readExcelWithModel(in, Teacher.class, ExcelTypeEnum.XLSX));
			//成功
			result.setMsg("批量导入成功！");
			result.setStatue(0);
		} catch (Exception e) {
			e.printStackTrace();
			result.setMsg("批量导入失败！");
			result.setStatue(0);
		}finally {
			try {
				if (in != null) {
					in.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return result;
	}
	
	
	@RequestMapping("/downloadModel")
	public ResponseEntity<byte[]> download(HttpServletRequest request) throws IOException{
		return ExcelUtil.getDataExcel(request, "teacher.xlsx", null, Teacher.class);
	}
	
	
	@RequestMapping("/exportAll")
	public ResponseEntity<byte[]> queryAll(HttpServletRequest request) throws IOException{
		return ExcelUtil.getDataExcel(request, null, teacherService.queryAll(), Teacher.class);
	}
	
	
	
	@InitBinder
	public void initBinder(ServletRequestDataBinder binder) {
		//如果客户端传递yyyy-MM-dd格式的字符串，就当做java.util.Date类型处理
		binder.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true));
	}
	
}
