﻿<%@ page language="java" contentType="text/html; charset=UTF-8"
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
<script type="text/javascript" src="js/borroworg.js"></script>
</head>
<body>
	<table id="dg"></table>
	
	<div id="dd" class="easyui-dialog" title="新增" style="width:400px;"   
        data-options="iconCls:'icon-save',resizable:false,modal:true,closed:true">   
	    <form id="ff" method="post">
	    	<input type="hidden" name="id"/>   
		    <table class="center">
		    	<tr>
		    		<td>机构名称：</td>
		    		<td><input type="text" name="name" class="easyui-textbox" data-options="required:true"></td>
		    	</tr>
		    	<tr>
		    		<td>机构描述：</td>
		    		<td><input type="text" name="remark" class="message" data-options="required:true"></td>
		    	</tr>
		    	<tr>
		    		<td>合作开始时间：</td>
		    		<td><input type="text" name="beginDate" class="easyui-datebox" data-options="required:true"></td>
		    	</tr>
		    	<tr>
		    		<td>合作结束时间：</td>
		    		<td><input type="text" name="endDate" class="easyui-datebox" data-options="required:true"></td>
		    	</tr>
		    	<tr>
		    		<td>机构负责人：</td>
		    		<td><input type="text" name="manager" class="easyui-textbox" data-options="required:true"></td>
		    	</tr>
		    	<tr>
		    		<td>机构联系电话：</td>
		    		<td><input type="text" name="phone" class="easyui-textbox" data-options="required:true"></td>
		    	</tr>
		    </table>  
		</form> 
	</div>
	
</body>
</html>