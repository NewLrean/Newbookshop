<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
  <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>首页</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
	<link rel="stylesheet" type="text/css" href="css/style.css"/>

	<script type="text/javascript" src="js/jquery-1.7.1.min.js"></script>
	<script type="text/javascript" src="js/bootstrap-paginator.js"></script>
	
  </head>
  
  <body>
    <div class="position">
	<div class="bread_search" >
		<div class="breadcrumb">
			当前位置：<a href="index.jsp" title="首页">首页</a>
			>搜索结果>
			<a>${title}</a>
		</div>
		<div class="search">
						<form  style="width: 506px; height: 38px;margin-top: -14px;">
							<p class="searchform">
								<input placeholder="请输入内容" type="text" autocomplete="off" value="${title2}" id="title" id="txtsearch"/>
								<button  id="search">搜索</button>
							</p>
						</form>
		</div>				
	</div>
</div>
<div class="tips">
<p >已为您找到<span>${count}</span>个结果</p>
	<div style="float: left;">
		<h4>根据出版社查询</h4>
		<select name="all" id="publisher">
			<option value=>-- 出版社查询 --</option>
			 <c:forEach items="${listpublisher}" var="p" >
				<option  value="${p.id}">${p.name}</option>
			</c:forEach> 
		</select>
	</div>
	<div style="float: left;margin-left: 100px;">
		<h4>根据书的种类查询</h4>
		<select name="all" id="categorie"  >
		<option value=>-- 书的种类查询 --</option>
			 <c:forEach items="${listcategorie}" var="c" >
				<option  value="${c.id }">${c.name }</option>
			</c:forEach> 
		</select>
	</div>
</div>
<div class="boxsea">
	

	<div class="w1180">
		<ul>
		<c:forEach items="${listbook}" var="s" >
			<li>
			<p style="text-align: center;">
					<a href="" title="">
						<img  src="" id="${s.id}" width="100%" height="200px">
					</a>
					</p>
					<p style="height: 30px; line-height: 30px;overflow: hidden;">
						<a href="#" style="color: #bbb; font-size: 14px;">${s.title}</a>
					</p>
					<p style="color: #0e0;">
						￥${s.unitPrice}
					</p>
					
			</li>
			</c:forEach>
		</ul>
	</div>
	
	<div class="wright">
		
		
		
		
		
	</div>
</div>



<script type="text/javascript">
$(function(){



$("#search").on('click',function(){


$.ajax({
            type: "GET",
            url: "Bookservlet",
            data:{
            	'method':'searchbooks',
            	'title':$('#title').val()
            },
            async:false,
            dataType: "text",
            contentType: 'application/xml;charset=gb2312;',
          	success:function(){
          		 window.location.href='login.jsp'; 
          	}
        })
        
})


$("#publisher").on('change',function(){

	$.ajax({
            type: "GET",
            url: "Bookservlet",
            data:{
            	'method':'publisher',
            	'value':$('#publisher').val(),
            	'title':$("#publisher option:selected").text()
            },
            
            dataType: "text",
            contentType: 'application/xml;charset=gb2312;',
          	success:function(){
          		
          		window.location.href='index.jsp';
          		
          	}
        })
        

})


$("#categorie").on('change',function(){

	$.ajax({
            type: "GET",
            url: "${ctx}/Bookservlet",
            data:{
            	'method':'categorie',
            	'value':$('#categorie').val(),
            	'title':$("#categorie option:selected").text()
            },
            
            dataType: "text",
            contentType: 'application/xml;charset=gb2312;',
          	success:function(){
          		
          		window.location.href='index.jsp';
          		
          	}
        })
})

});
</script>
  </body>
</html>
