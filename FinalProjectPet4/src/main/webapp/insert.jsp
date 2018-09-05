<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>Insert title here</title>
</head>
<body>
	<form action="insert2.do">
		<table border="1" bordercolor="red">
			<tr>
				<td bgcolor="pink">아이디</td>
				<td bgcolor="yellow"><input type="text" name="id"></td>
			</tr>
			<tr>
				<td bgcolor="pink">비밀번호</td>
				<td bgcolor="yellow"><input type="text" name="pw"></td>
			</tr>
			<tr>
				<td bgcolor="pink">이름</td>
				<td bgcolor="yellow"><input type="text" name="name"></td>
			</tr>
			<tr>
				<td bgcolor="pink">전화번호</td>
				<td bgcolor="yellow"><input type="text" name="tel"></td>
			</tr>
		</table>
		<input type="submit" value="서버로 전송.">
	</form>
	<script type="text/javascript">
	var mapOptions = {
		    center: new naver.maps.LatLng(37.3595704, 127.105399),
		    zoom: 10
		};
		var map = new naver.maps.Map('map', mapOptions);
	</script>
	<div id="map" style="width:100%;height:400px;"></div>
</body>
</html>