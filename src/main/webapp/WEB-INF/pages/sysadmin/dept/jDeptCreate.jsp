<%@ page language="java" pageEncoding="UTF-8"%>
<%@ include file="../../baselist.jsp"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<title>部门列表</title>
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
    部门新增
  </div> 
  
<div>


<div class="eXtremeTable" >
<table id="ec_table" class="tableRegion" width="98%" >
	<tr class="odd">
		<td>部门ID</td>
		<td><input name="deptId" type="text"/></td>
	</tr>
	<tr class="odd">
		<td>部门名称</td>
		<td><input name="deptName" type="text"/></td>
	</tr>
	<tr class="odd">
		<td>上级部门</td>
		<td>
			<select name="parentDept.deptId">
				<option value="">---请选择---</option>
				<!--遍历部门list  -->
				<c:forEach items="${dataList}" var="d">
					<option value="${d.deptId}">${d.deptName}</option>
				</c:forEach>
			</select>
		</td>
	</tr>
</table>
</div>
 
</div>
 
 
</form>
</body>
</html>

