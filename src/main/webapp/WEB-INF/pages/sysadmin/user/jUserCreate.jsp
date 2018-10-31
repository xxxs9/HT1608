<%@ page language="java" pageEncoding="UTF-8"%>
<%@ include file="../../baselist.jsp"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<title>用户新增</title>
	<script type="text/javascript" src="${ctx}/staticfile/js/datepicker/WdatePicker.js"></script>
</head>

<body>
<form name="icform" method="post">

<div id="menubar">
<div id="middleMenubar">
<div id="innerMenubar">
  <div id="navMenubar">
<ul>
	<li id="save"><a href="#" onclick="formSubmit('save','_self');this.blur();">保存</a></li>
	<li id="back"><a href="#" onclick="window.history.go(-1)">返回</a></li>
	
</ul>
  </div>
</div>
</div>
</div>
   
  <div class="textbox-title">
	<img src="../../staticfile/skin/default/images/icon/currency_yen.png"/>
    用户新增
  </div> 
  
<div>


<div class="eXtremeTable" >
<table id="ec_table" class="tableRegion" width="98%" >
	<tr class="odd">
		<td>用户名:</td>
		<td><input name="username" type="text"/></td>
		<td>密码:</td>
		<td><input name="password" type="password"/></td>
	</tr>
	<tr class="odd">
		<td>所属部门</td>
		<td>
			<select name="dept.deptId" style="width:121px">
				<option value="">---请选择---</option>
				<c:forEach items="${deptList}" var="d">
					<option value="${d.deptId}">${d.deptName}</option>
				</c:forEach>
			</select>
		</td>
		<td>真实姓名</td>
		<td><input name="userInfo.name" type="text"/></td>
	</tr>
	<tr class="odd">
		<td>身份证号:</td>
		<td><input name="userInfo.cardNo" type="text"/></td>
		<td>上级领导</td>
		<td>
			<select name="userInfo.manager.userInfoId" style="width:121px">
				<option value="">---请选择---</option>
				<c:forEach items="${userList}" var="u">
					<option value="${u.userId}">${u.userInfo.name}</option>
				</c:forEach>
			</select>
		</td>
	</tr>
	<tr class="odd">
		<td>入职时间:</td>
		<td>
		<input type="text" style="width:90px;" name="userInfo.joinDate"
	   		onclick="WdatePicker({el:this,isShowOthers:true,dateFmt:'yyyy-MM-dd'});"/>
		<td>薪资:</td>
		<td><input name="userInfo.salary" type="text"/></td>
	</tr>
	<tr class="odd">
		<td>生日:</td>
		<td>
			<input type="text" style="width:90px;" name="userInfo.birthday"
	   		onclick="WdatePicker({el:this,isShowOthers:true,dateFmt:'yyyy-MM-dd'});"/></td>
		<td>性别:</td>
		<td>
			<input name="userInfo.gender" type="radio" value="男"/>男
			<input name="userInfo.gender" type="radio" value="女"/>女
		</td>
	</tr>
	<tr class="odd">
		<td>岗位:</td>
		<td><input name="userInfo.station" type="text"/></td>
		<td>电话:</td>
		<td><input name="userInfo.telephone" type="text"/></td>
	</tr>
	<tr class="odd">
		<td>用户级别:</td>
		<td>
			<select name="userInfo.userLevel" style="width:121px">
				<option value="">---请选择---</option>
				<option value="1">总经理</option>
				<option value="2">副总</option>
				<option value="3">部门经理</option>
				<option value="4">普通用户</option>
			</select>
		</td>
		<td>排序号:</td>
		<td><input name="userInfo.orderNo" type="text"/></td>
	</tr>
	<tr class="odd">
		<td>备注信息:</td>
		<td colspan="3">
			<textarea style="width:100%;height:120px" name="userInfo.remark"></textarea>
		</td>
	</tr>
</table>
</div>
 
</div>
 
 
</form>
</body>
</html>

