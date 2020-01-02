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
<script type="text/javascript" src="js/teacher.js"></script>
</head>
<body>
	<div style="height: 4%">
		姓名：<input id="query_name" class="easyui-textbox" data-options="prompt:'输入姓名搜索'  " style="width:150px">
		职称：<input id="query_skill" class="easyui-textbox" data-options="prompt:'输入职称搜索'  " style="width:150px">
		状态：<select id="query_statue" class="easyui-combobox" style="width:80px;">
				<option value="">全部</option>   
			    <option value="1">在职</option>   
			    <option value="2">离职</option>   
			</select>
		<a id="btn" href="javascript:query()" class="easyui-linkbutton" data-options="iconCls:'icon-search'">搜索</a>  
	</div>
	<div style="height: 95%">
		<table id="dg"></table>
	</div>
	
	<div id="d1" class="easyui-dialog" style="width:400px;"   
        data-options="iconCls:'icon-save',resizable:false,modal:true,closed:true">
        <form id="upload" method="post" enctype="multipart/form-data">
			<input class="easyui-filebox" name="file" value="选择文件" style="width:300px">
		</form>
	</div>
	
	<div id="dd" class="easyui-dialog" title="新增" style="width:400px;"   
        data-options="iconCls:'icon-save',resizable:false,modal:true,closed:true">   
	    <form id="ff" method="post">
	    	<input type="hidden" name="teacherId"/>   
		    <table class="center">
		    	<tr>
		    		<td>姓名：</td>
		    		<td><input type="text" name="teacherName" class="easyui-textbox" data-options="required:true"></td>
		    	</tr>
		    	<tr>
		    		<td>性别：</td>
		    		<td>
		    			<input type="radio" name="teacherSex"  checked="checked" value="1">男
		    			<input type="radio" name="teacherSex" value="0">女
		    		</td>
		    	</tr>
		    	<tr>
		    		<td>联系方式：</td>
		    		<td><input type="text" name="teacherPhone" class="easyui-textbox" data-options="required:true"></td>
		    	</tr>
		    	<tr>
		    		<td>联系地址：</td>
		    		<td><input type="text" name="teacherAddress" class="easyui-textbox" data-options="required:true"></td>
		    	</tr>
		    	<tr>
		    		<td>学历：</td>
		    		<td><input type="text" name="teacherEduLevel" class="easyui-textbox" data-options="required:true"></td>
		    	</tr>
		    	<tr>
		    		<td>职称：</td>
		    		<td><input type="text" name="teacherSkill" class="easyui-textbox" data-options="required:true"></td>
		    	</tr>
		    	<tr>
		    		<td>毕业院校：</td>
		    		<td><input type="text" name="teacherSchoolName" class="easyui-textbox" data-options="required:true"></td>
		    	</tr>
		    	<tr>
		    		<td>所学专业：</td>
		    		<td><input type="text" name="teacherMajorName" class="easyui-textbox" data-options="required:true"></td>
		    	</tr>
		    	<tr>
		    		<td>毕业日期：</td>
		    		<td><input type="text" name="teacherleaveSchoolDate" class="easyui-datebox" data-options="required:true"></td>
		    	</tr>
		    	<tr>
		    		<td>工作职位：</td>
		    		<td><input type="text" name="teacherJob" class="easyui-textbox" data-options="required:true"></td>
		    	</tr>
		    	<tr>
		    		<td>入职日期：</td>
		    		<td><input type="text" name="teacherEntryDate" class="easyui-datebox" data-options="required:true"></td>
		    	</tr>
		    	<tr>
		    		<td>离职日期：</td>
		    		<td><input type="text" name="teacherEndDate" class="easyui-datebox" data-options="required:true"></td>
		    	</tr>
		    	<tr>
		    		<td>状态：</td>
		    		<td>
		    			<input type="radio" name="teacherStatue"  checked="checked" value="1">在职
		    			<input type="radio" name="teacherStatue" value="0">离职
		    		</td>
		    	</tr>
		    	<tr>
		    		<td>头像地址：</td>
		    		<td><input type="text" name="teacherPic" class="easyui-textbox" data-options="required:true"></td>
		    	</tr>
		    </table>  
		</form> 
	</div>
	
</body>
</html>