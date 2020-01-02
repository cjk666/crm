package com.entor.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.entor.entity.Result;
import com.entor.entity.BorrowOrg;
import com.entor.service.IBorrowOrgService;

@Controller
@RequestMapping("/borroworg")
public class BorrowOrgController {
	
	@Autowired
	private IBorrowOrgService borrowOrgService;
	
	@RequestMapping("/add")
	@ResponseBody
	public Result add(BorrowOrg borrowOrg) {
		borrowOrgService.add(borrowOrg);
		Result result = new Result();
		result.setMsg("保存数据成功");
		result.setStatue(0);
		return result;
	}
	
	@RequestMapping("/deleteMore")
	@ResponseBody
	public Result deleteMore(String ids) {
		borrowOrgService.deleteMore(ids);
		Result result = new Result();
		result.setMsg("删除成功");
		result.setStatue(0);
		return result;
	}
	
	@RequestMapping("/update")
	@ResponseBody
	public Result update(BorrowOrg borrowOrg) {
		borrowOrgService.update(borrowOrg);
		Result result = new Result();
		result.setMsg("修改数据成功");
		result.setStatue(0);
		return result;
	}
	
	@RequestMapping("/queryByPage")
	@ResponseBody
	public Map<String, Object> queryByPage(@RequestParam(value="page",required=false,defaultValue="1") String page,
			@RequestParam(value="rows",required=false,defaultValue="20") String rows){
		List<BorrowOrg> list = borrowOrgService.queryByPage(Integer.parseInt(page), Integer.parseInt(rows));
		int total = borrowOrgService.getTotal();
		Map<String, Object> map = new HashMap<>();
		map.put("total", total);
		map.put("rows", list);
		return map;
	}
	
	@RequestMapping("/queryAll")
	@ResponseBody
	public List<BorrowOrg> queryAll(){
		List<BorrowOrg> list = borrowOrgService.queryAll();
		return list;
	}
	
	@InitBinder
	public void initBinder(ServletRequestDataBinder binder) {
		//如果客户端传递yyyy-MM-dd格式的字符串，就当做java.util.Date类型处理
		binder.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true));
	}
	
}
