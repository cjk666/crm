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
<script type="text/javascript" src="js/fee.js"></script>
</head>
<body>
	<table id="dg"></table>
	
	<div id="dd" class="easyui-dialog" title="新增" style="width:400px;"   
        data-options="iconCls:'icon-save',resizable:false,modal:true,closed:true">   
	    <form id="ff" method="post">
	    	<input type="hidden" name="id"/>   
		    <table class="center">
		    	<tr>
		    		<td>学生姓名：</td>
		    		<td><input id="ccStudent" name="studentId"></td>
		    	</tr>
		    	<tr>
		    		<td>缴费金额：</td>
		    		<td><input type="text" name="payMoney" class="easyui-textbox" data-options="required:true"></td>
		    	</tr>
		    	<tr>
		    		<td>缴费方式：</td>
		    		<td>
		    			<input type="radio" name="payType"  checked="checked" value="1">全款
		    			<input type="radio" name="payType" value="2">分期
					</td>
		    	</tr>
		    	<tr>
		    		<td>缴费机构：</td>
		    		<td><input id="ccOrg" name="borrowOrgId"></td>
		    	</tr>
		    	<tr>
		    		<td>缴费时间：</td>
		    		<td><input type="text" name="payDate" class="easyui-datebox" data-options="required:true,editable:false"></td>
		    	</tr>
		    	<tr>
		    		<td>缴费状态：</td>
		    		<td>
		    			<input type="radio" name="payStatue"  checked="checked" value="1">已缴费
		    			<input type="radio" name="payStatue" value="2">未缴费
					</td>
		    	</tr>
		    </table>  
		</form> 
	</div>
	
</body>
</html>