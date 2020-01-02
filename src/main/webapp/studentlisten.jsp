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
<script type="text/javascript" src="js/studentlisten.js"></script>
</head>
<body>
	<table id="dg"></table>
	
	<div id="dd" class="easyui-dialog" title="新增" style="width:400px;"   
        data-options="iconCls:'icon-save',resizable:false,modal:true,closed:true">   
	    <form id="ff" method="post">
	    	<input type="hidden" name="id"/>   
		    <table class="center">
		    	<tr>
		    		<td>姓名：</td>
		    		<td><input type="text" name="name" class="easyui-textbox" data-options="required:true"></td>
		    	</tr>
		    	<tr>
		    		<td>性别：</td>
		    		<td>
		    			<input type="radio" name="sex"  checked="checked" value="1">男
		    			<input type="radio" name="sex" value="0">女
		    		</td>
		    	</tr>
		    	<tr>
		    		<td>联系方式：</td>
		    		<td><input type="text" name="phone" class="easyui-textbox" data-options="required:true"></td>
		    	</tr>
		    	<tr>
		    		<td>联系地址：</td>
		    		<td><input type="text" name="address" class="easyui-textbox" data-options="required:true"></td>
		    	</tr>
		    	<tr>
		    		<td>试听日期：</td>
		    		<td><input type="text" name="listenDate" class="easyui-datebox" data-options="required:true"></td>
		    	</tr>
		    	<tr>
		    		<td>试听专业：</td>
		    		<td>
		    			<input id="cc" name="majorId" >  
		    		</td>
		    	</tr>
		    </table>  
		</form> 
	</div>
	
</body>
</html>