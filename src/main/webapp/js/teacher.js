var title;
var url;
$(function(){
	$("#dg").datagrid({
	idField:"teacherId",
	url:"Teacher/queryByPage",
	fitColumns:true,
	fit:true,
	columns:[[  
		{field:'',checkbox:true},  
        {field:'teacherName',title:'姓名',width:100,align:'center'},    
        {field:'teacherSex',title:'性别',width:50,align:'center',formatter: function(value,row,index){
			if (value==1){
				return "男";
			} else {
				return "女";
			}
		}
		},
        {field:'teacherPhone',title:'联系方式',width:100,align:'center'},
        {field:'teacherAddress',title:'联系地址',width:150,align:'center'},
        {field:'teacherEduLevel',title:'学历',width:50,align:'center'},
        {field:'teacherSkill',title:'职称',width:100,align:'center'},
        {field:'teacherSchoolName',title:'毕业院校',width:100,align:'center'},
        {field:'teacherMajorName',title:'所学专业名称',width:100,align:'center'},
        {field:'teacherleaveSchoolDate',title:'毕业日期',width:100,align:'center'},
        {field:'teacherJob',title:'职位',width:50,align:'center'},
        {field:'teacherEntryDate',title:'入职日期',width:100,align:'center'},
        {field:'teacherEndDate',title:'离职日期',width:100,align:'center'},
        {field:'teacherStatue',title:'教师状态',width:50,align:'center',formatter: function(value,row,index){
			if (value==1){
				return "在职";
			} else {
				return "离职";
			}
		}},
        {field:'teacherPic',title:'教师头像',width:100,align:'center'},
        {field:'createTime',title:'创建时间',width:150,align:'center'}
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
			//清除form表单数据
			$("#ff").form("clear");
			//清除所有选中的行
			$('#dg').datagrid('clearSelections');    
			openDialog();
		}
	},'-',{
    	text:"修改",
		iconCls: 'icon-edit',
		handler: function(){
			title = "修改";
			url = "update";
			updateDialog();
		}
	},'-',{
		text:"删除",
		iconCls: 'icon-remove',
			handler: function(){
				deleteMore();
			}
	},'-',{
		text:"下载模板",
		iconCls: 'icon-add',
			handler: function(){
				location.href="Teacher/downloadModel";
			}
	},'-',{
		text:"批量导入",
		iconCls: 'icon-add',
			handler: function(){
				addMore();
			}
	},'-',{
		text:"全部导出",
		iconCls: 'icon-add',
			handler: function(){
				location.href="Teacher/exportAll";
			}
	}]
	});
});


function addMore(){
	$("#d1").dialog({
		closed:false,
		title:"批量上传",
		buttons:[{
			text:'保存',
			iconCls:"icon-save",
			handler:function(){
				$('#upload').form('submit', {    
				    url:"Teacher/addMore",    
				    success:function(result){
				    	//把服务器后台返回的json格式字符串转成json对象
				    	var data = eval("("+result+")");
				    	$.messager.alert("消息框",data.msg,"info");
				    	if(data.statue==0){//数据保存成功
				    		//关闭对话框
				    		$("#d1").dialog("close");
				    		//刷新列表
				    		$("#dg").datagrid("reload");
					    	}
					    }    
				});
			}
		},{
			text:'关闭',
			iconCls:"icon-cancel",
			handler:function(){
				//关闭对话框
				$("#d1").dialog("close");
				}
			}]
		});
}

//模糊查询
function query(){
	var teacherName = $("#query_name").val();
	var teacherSkill = $("#query_skill").val();
	var teacherStatue = $("#query_statue").val();
	var param = {"teacherName":teacherName,"teacherSkill":teacherSkill,"teacherStatue":teacherStatue}; 
	$("#dg").datagrid("load",param);
}

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
	openDialog();
}
//保存学生信息
function saveStudent(){
	$('#ff').form('submit', {    
    url:"Teacher/"+url,    
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
function deleteMore(){
	var array = $("#dg").datagrid("getSelections");
if(array.length==0){
	$.messager.alert("提示框","请选择要删除的数据","warning");
	return;
}
$.messager.confirm("确认框","您确认要删除这"+array.length+"条数据吗？",function(r){
	if(r){//点“确定”按钮
		var ids = "";
		for(var i=0;i<array.length;i++){
			ids += array[i].teacherId+",";
		}
		ids = ids.substring(0,ids.length-1);
		$.ajax({
			type:"post",
			url:"Teacher/deleteMore",
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