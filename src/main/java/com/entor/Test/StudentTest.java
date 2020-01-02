package com.entor.Test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.entor.entity.ClassesStudy;
import com.entor.entity.StudentStudy;
import com.entor.entity.view.VClassesListen;
import com.entor.entity.view.VClassesStudy;
import com.entor.service.IClassesListenService;
import com.entor.service.IClassesStudyService;
import com.entor.service.IStudentStudyService;
import com.entor.service.ITeacherService;

public class StudentTest {
	
	public static void main(String[] args) {
//		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//		IStudentStudyService service = context.getBean(IStudentStudyService.class);
//		
//		List<StudentStudy> list = service.queryByPage(1, 10);
//		for (StudentStudy s : list) {
//			System.out.println(s);
//		}
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		IClassesListenService service = context.getBean(IClassesListenService.class);
		List<VClassesListen> list = service.queryByPage(1, 10);
		for (VClassesListen vcs : list) {
			System.out.println(vcs);
		}
		
	}
	
}
