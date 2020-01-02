<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="base.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
	.center{
		margin: 0 auto;
		padding: 20 0;
	}
</style>
<script type="text/javascript" src="js/classesstudy.js"></script>
</head>
<body>
	<table id="dg"></table>
	
	<div id="dd" class="easyui-dialog" title="新增" style="width:400px;"   
        data-options="iconCls:'icon-save',resizable:false,modal:true,closed:true">   
	    <form id="ff" method="post">
	    	<input type="hidden" name="classesId"/>   
		    <table class="center">
		    	<tr>
		    		<td>班级名称：</td>
		    		<td><input type="text" name="classesName" class="easyui-textbox" data-options="required:true"></td>
		    	</tr>
		    	<tr>
		    		<td>所学专业：</td>
		    		<td><input id="ccMajor" name="majorId" ></td>
		    	</tr>
		    	<tr>
		    		<td>班主任：</td>
		    		<td><input class="ccTeacher" name="managerId" ></td>
		    	</tr>
		    	<tr>
		    		<td>代课老师：</td>
		    		<td><input class="ccTeacher" name="teacherId"></td>
		    	</tr>
		    	<tr>
		    		<td>上课教室：</td>
		    		<td><input type="text" name="classesRoom" class="easyui-textbox" data-options="required:true"></td>
		    	</tr>
		    	<tr>
		    		<td>首次开班时间：</td>
		    		<td><input type="text" name="beginDate" class="easyui-datebox" data-options="required:true,editable:false"></td>
		    	</tr>
		    	<tr>
		    		<td>最后一次合班时间：</td>
		    		<td><input type="text" name="lastJoinDate" class="easyui-datebox" data-options="required:true,editable:false"></td>
		    	</tr>
		    	<tr>
		    		<td>合班次数：</td>
		    		<td><input type="text" name="joinCount" class="easyui-textbox" ></td>
		    	</tr>
		    	<tr>
		    		<td>预计结课时间：</td>
		    		<td><input type="text" name="endDate" class="easyui-datebox" data-options="required:true,editable:false"></td>
		    	</tr>
		    	<tr>
		    		<td>最后结课时间：</td>
		    		<td><input type="text" name="lastEndDate" class="easyui-datebox" data-options="required:true,editable:false"></td>
		    	</tr>
		    </table>  
		</form> 
	</div>
	
</body>
</html>