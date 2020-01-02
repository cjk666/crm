package com.entor.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.entor.entity.Teacher;
import com.entor.service.ITeacherService;
import com.entor.util.RandomValueUtil;
import com.entor.util.UUIDUtil;

public class TeacherTest {
	public static void main(String[] args) {
//		Teacher t = new Teacher();
//		t.setTeacherId("13165415613513");
//		t.setTeacherName("马云");
//		t.setTeacherSex(45);
//		t.setTeacherPhone("18176965861");
//		t.setTeacherAddress("广西南宁市西乡塘区");
//		t.setTeacherEduLevel("本科");
//		t.setTeacherSkill("教授");
//		t.setTeacherSchoolName("杭州师范大学");
//		t.setTeacherMajorName("计算机科学技术");
//		t.setTeacherleaveSchoolDate(new Date());
//		t.setTeacherJob("总监");
//		t.setTeacherEntryDate(new Date(15165113121L));
//		t.setTeacherEndDate(new Date());
//		t.setTeacherStatue(1);
//		t.setTeacherPic("d://cjk/1.jpg");
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		ITeacherService service = context.getBean(ITeacherService.class);
//		tdao.add(t);
		
//		System.out.println(service.queryById("13165415613513"));
		
//		List<Teacher> list = service.queryAll();
//		for (Teacher teacher : list) {
//			System.out.println(teacher);
//		}
		
//		List<Teacher> list = service.queryByPage(1, 20);
//		for (Teacher teacher : list) {
//			System.out.println(teacher);
//		}             
		
//		Map<String, Object> map = new HashMap<>();
//		map.put("name", "云");
//		System.out.println(service.queryByMap(map));
		
		
		String[] edus = {"高中","初中","中专","大专","本科","硕士","博士","小学"};
		
		String[] skis = {"讲师","中级讲师","高级讲师","教授","副教授"};
		
		String[] school = {"广西师范大学","广西大学","复旦大学","南方科技大学","香港大学","普林斯顿大学","哈弗大学","中国农业大学","清华大学","剑桥大学"};
		
		String[] major = {"计算机应用技术","计算机信息技术","计算机信息管理","网络技术","电子工程","应用物理","现代通讯技术"};
		
		//假数据
		Random ra = new Random();
		List<Teacher> list = new ArrayList<>();
		for (int j = 0; j < 10; j++) {
			for (int i = 0; i < 1000; i++) {
				Map<String,String> map = RandomValueUtil.getAddress();
				Teacher t = new Teacher();
				t.setTeacherId(UUIDUtil.getUUID());
				t.setTeacherName(map.get("name"));
				t.setTeacherSex(ra.nextInt(2));
				t.setTeacherPhone(map.get("tel"));
				t.setTeacherAddress(map.get("road"));
				t.setTeacherEduLevel(edus[ra.nextInt(edus.length)]);
				t.setTeacherSkill(skis[ra.nextInt(skis.length)]);
				t.setTeacherSchoolName(school[ra.nextInt(school.length)]);
				t.setTeacherMajorName(major[ra.nextInt(major.length)]);
				t.setTeacherleaveSchoolDate(new Date(ra.nextInt()));
				t.setTeacherJob("总监");
				t.setTeacherEntryDate(new Date(ra.nextInt()));
				t.setTeacherEndDate(new Date(ra.nextInt()));
				t.setTeacherStatue(ra.nextInt(2)+1);
				t.setTeacherPic("d://cjk/1.jpg");
				
				list.add(t);
			}
			service.addMore(list);
			list.clear();
		}
		
		
//		Teacher t = new Teacher();
//		t.setTeacherId("13165415613513");
//		t.setTeacherName("马云");
//		t.setTeacherSex(42);
//		t.setTeacherPhone("18176965861");
//		t.setTeacherAddress("广西南宁市西乡塘区");
//		t.setTeacherEduLevel("本科");
//		t.setTeacherSkill("教授");
//		t.setTeacherSchoolName("杭州师范大学");
//		t.setTeacherMajorName("计算机科学技术");
//		t.setTeacherleaveSchoolDate(new Date());
//		t.setTeacherJob("总监");
//		t.setTeacherEntryDate(new Date(15165113121L));
//		t.setTeacherEndDate(new Date());
//		t.setTeacherStatue(1);
//		t.setTeacherPic("d://cjk/1.jpg");
//		
//		service.update(t);
		
//		System.out.println(service.getTotal());
		
//		service.deleteById("13165415613513");
//		service.deleteMore("0714367767a24ec7bd9ade9ea6407599,08706e6ab1f84d3d983d467768dba3a1");
	}

	
}
