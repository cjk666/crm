var title;
var url;
$(function(){
	$("#dg").datagrid({
	idField:"id",
	url:"fee/queryByPage",
	fitColumns:true,
	fit:true,
	columns:[[  
		{field:'',checkbox:true},  
        {field:'studentName',title:'学生姓名',width:50,align:'center'},    
        {field:'payMoney',title:'缴费金额',width:50,align:'center'},    
        {field:'payType',title:'缴费方式',width:50,align:'center',formatter: function(value,row,index){
			if (value == 1){
				return "全款";
			} else if(value == 2) {
				return "分期";
			}
		}
        },    
        {field:'borrowOrg',title:'缴费机构',width:50,align:'center'},    
        {field:'payDate',title:'缴费时间',width:50,align:'center'},    
        {field:'payStatue',title:'缴费状态',width:50,align:'center',formatter: function(value,row,index){
			if (value == 1){
				return "已缴费";
			} else if(value == 2) {
				return "未缴费";
			}
		}},    
        {field:'createTime',title:'创建时间',width:50,align:'center'}    
    ]],
    pagination:true,
    pageSize:30,
    scrollbarSize:0,
    toolbar: [{
    	text:"新增",
		iconCls: 'icon-add',
		handler: function(){
			title = "新增";
			url = "add";
			//重置form表单数据
			$("#ff").form("reset");
			openDialog();
			getValue();
		}
	},'-',{
    	text:"修改",
		iconCls: 'icon-edit',
		handler: function(){
			title = "修改";
			url = "update";
			updateDialog();
			getValue();
		}
	},'-',{
		text:"删除",
		iconCls: 'icon-remove',
			handler: function(){
				deleteStudent();
			}
		}]
	});
});
//打开对话框
function openDialog(){
	$("#dd").dialog({
	closed:false,
	title:title,
	buttons:[{
		text:'保存',
		iconCls:"icon-save",
		handler:function(){
			saveStudent();
		}
	},{
		text:'关闭',
		iconCls:"icon-cancel",
		handler:function(){
			//关闭对话框
			$("#dd").dialog("close");
			}
		}]
	});
}
function updateDialog(){
	var array = $("#dg").datagrid("getSelections");
	if(array.length!=1){
		$.messager.alert("提示框","修改只能选择一条数据","warning");
		return;
	}
	//加载选择的数据填充到form表单
	$('#ff').form('load',array[0]);
	//默认选中
//	$("#ccOrg").val(array[0].borrowOrg);
	openDialog();
}
//保存学生信息
function saveStudent(){
	$('#ff').form('submit', {    
    url:"fee/"+url,    
    onSubmit: function(){    
    	return $('#ff').form('validate');
    },    
    success:function(result){
    	//把服务器后台返回的json格式字符串转成json对象
    	var data = eval("("+result+")");
    	$.messager.alert("消息框",data.msg,"info");
    	if(data.statue==0){//数据保存成功
    		//关闭对话框
    		$("#dd").dialog("close");
    		//刷新列表
    		$("#dg").datagrid("reload");
	    	}
	    }    
	});
}
//删除学生
function deleteStudent(){
	var array = $("#dg").datagrid("getSelections");
if(array.length==0){
	$.messager.alert("提示框","请选择要删除的数据","warning");
	return;
}
$.messager.confirm("确认框","您确认要删除这"+array.length+"条数据吗？",function(r){
	if(r){//点“确定”按钮
		var ids = "";
		for(var i=0;i<array.length;i++){
			ids += array[i].classesId+",";
		}
		ids = ids.substring(0,ids.length-1);
		$.ajax({
			type:"post",
			url:"fee/deleteMore",
			data:"ids="+ids,
			dataType:"json",
			success:function(result){
				$.messager.alert("消息框",result.msg,"info");
		    	if(result.statue==0){//数据删除成功
		    		//清除选中的记录行
		    		$("#dg").datagrid("clearSelections");
		    		//刷新列表
		    		$("#dg").datagrid("reload");
			    	}
				}
			});
		}
	});
}


//动态获取教师   下拉列表
function getValue(){
	$('#ccStudent').combogrid({    
	    delay: 500,    
	    mode: 'remote',    
	    url: 'studentStudy/queryByMap',    
	    idField: 'id',    
	    textField: 'name',    
	    columns: [[    
	        {field:'name',title:'姓名',width:100,sortable:true},    
	        {field:'sex',title:'性别',width:100,sortable:true,formatter: function(value,row,index){
				if (value==1){
					return "男";
				} else {
					return "女";
				}
			}},   
	        {field:'phone',title:'联系方式',width:100,sortable:true},   
	        {field:'contractDate',title:'合同签订日期',width:100,sortable:true}    
	    ]],
	    panelWidth:400
	});
	
	//数据库获取缴费机构
	$('#ccOrg').combobox({    
	    url:'borroworg/queryAll',    
	    valueField:'id',    
	    textField:'name'
	});
}