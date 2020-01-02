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
<script type="text/javascript" src="js/room.js"></script>
</head>
<body>
	<table id="dg"></table>
	
	<div id="dd" class="easyui-dialog" title="新增" style="width:400px;"   
        data-options="iconCls:'icon-save',resizable:false,modal:true,closed:true">   
	    <form id="ff" method="post">
	    	<input type="hidden" name="roomId"/>   
		    <table class="center">
		    	<tr>
		    		<td>房间名称：</td>
		    		<td><input type="text" name="roomName" class="easyui-textbox" data-options="required:true"></td>
		    	</tr>
		    	<tr>
		    		<td>详细地址：</td>
		    		<td><input type="text" name="roomAddress" class="easyui-textbox" data-options="required:true"></td>
		    	</tr>
		    	<tr>
		    		<td>房间能住总人数：</td>
		    		<td><input type="text" name="roomTotalSize" class="easyui-textbox" data-options="required:true"></td>
		    	</tr>
		    	<tr>
		    		<td>空余床位：</td>
		    		<td><input type="text" name="roomEmptySize" class="easyui-textbox" data-options="required:true"></td>
		    	</tr>
		    	<tr>
		    		<td>房间住宿人性别：</td>
		    		<td>
		    			<input type="radio" name="roomPersonSex"  checked="checked" value="1">男
		    			<input type="radio" name="roomPersonSex" value="2">女
		    		</td>
		    	</tr>
		    	<tr>
		    		<td>房间每月住宿费：</td>
		    		<td><input type="text" name="roomMoney" class="easyui-textbox" data-options="required:true"></td>
		    	</tr>
		    	<tr>
		    		<td>房间押金：</td>
		    		<td><input type="text" name="roomDeposit" class="easyui-textbox" data-options="required:true"></td>
		    	</tr>
		    	<tr>
		    		<td>房东姓名：</td>
		    		<td><input type="text" name="roomManager" class="easyui-textbox" data-options="required:true"></td>
		    	</tr>
		    	<tr>
		    		<td>房东电话：</td>
		    		<td><input type="text" name="roomManagerPhone" class="easyui-textbox" data-options="required:true"></td>
		    	</tr>
		    </table>  
		</form> 
	</div>
	
</body>
</html>