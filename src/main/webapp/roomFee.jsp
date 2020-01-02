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
<script type="text/javascript" src="js/roomFee.js"></script>
</head>
<body>
	<table id="dg"></table>
	
	<div id="dd" class="easyui-dialog" title="新增" style="width:400px;"   
        data-options="iconCls:'icon-save',resizable:false,modal:true,closed:true">   
	    <form id="ff" method="post">
	    	<input type="hidden" name="id"/>   
		    <table class="center">
		    	<tr>
		    		<td>房间名称：</td>
		    		<td><input id="cc" class="easyui-combobox" name="roomId" data-options="required:true,valueField:'roomId',textField:'roomName',url:'room/queryAll'" />  
					</td>
		    	</tr>
		    	<tr>
		    		<td>用水费：</td>
		    		<td><input type="text" name="useWater" class="easyui-textbox" data-options="required:true"></td>
		    	</tr>
		    	<tr>
		    		<td>用电费：</td>
		    		<td><input type="text" name="userElectricity" class="easyui-textbox" data-options="required:true"></td>
		    	</tr>
		    	<tr>
		    		<td>基本费用：</td>
		    		<td><input type="text" name="roomFee" class="easyui-textbox" data-options="required:true"></td>
		    	</tr>
		    	<tr>
		    		<td>费用产生日期：</td>
		    		<td><input type="text" name="createDate" class="easyui-datebox" data-options="required:true"></td>
		    	</tr>
		    </table>  
		</form> 
	</div>
	
</body>
</html>