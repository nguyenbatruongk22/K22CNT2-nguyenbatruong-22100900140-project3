<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Danh Sách Liên Hệ</title>
    <link rel="stylesheet" type="text/css" href="<c:url value='/resources/css/style.css' />">
</head>
<body>

    <h2>Danh Sách Liên Hệ</h2>

    <table border="1" cellpadding="5" cellspacing="0">
        <tr>
            <th>ID</th>
            <th>Họ và Tên</th>
            <th>Email</th>
            <th>Số Điện Thoại</th>
            <th>Nội Dung</th>
            <th>Ngày Gửi</th>
            <th>Hành Động</th>
        </tr>
        <c:forEach var="lienHe" items="${lienHeList}">
            <tr>
                <td>${lienHe.id}</td>
                <td>${lienHe.hoTen}</td>
                <td>${lienHe.email}</td>
                <td>${lienHe.soDienThoai}</td>
                <td>${lienHe.noiDung}</td>
                <td>${lienHe.ngayGui}</td>
                <td>
                    <a href="${pageContext.request.contextPath}/lienhe/edit/${lienHe.id}">Sửa</a> | 
                    <a href="${pageContext.request.contextPath}/lienhe/delete/${lienHe.id}" onclick="return confirm('Bạn có chắc muốn xóa?')">Xóa</a>
                </td>
            </tr>
        </c:forEach>
    </table>

    <br>
    <a href="${pageContext.request.contextPath}/lienhe/lienheadd">Thêm Mới Liên Hệ</a>

</body>
</html>
