<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Danh Sách Món Ăn</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css">
</head>
<body>
    <h2>Danh Sách Món Ăn</h2>
    
    <a href="${pageContext.request.contextPath}/thucdon/add">Thêm Món Ăn</a>
    <br><br>

    <table border="1" cellpadding="5" cellspacing="0">
        <tr>
            <th>Tên Món</th>
            <th>Hình Ảnh</th>
            <th>Mô Tả</th>
            <th>Hành Động</th>
        </tr>
        <c:forEach var="thucDon" items="${listThucDon}">
            <tr>
                <td>${thucDon.tenMon}</td>
                <td>
                    <img src="${pageContext.request.contextPath}/uploads/${thucDon.hinhAnh}" width="100px" alt="Hình món ăn">
                </td>
                <td>${thucDon.moTa}</td>
                <td>
                    <a href="${pageContext.request.contextPath}/thucdon/edit?id=${thucDon.id}">Sửa</a> |
                    <a href="${pageContext.request.contextPath}/thucdon/delete?id=${thucDon.id}" onclick="return confirm('Bạn có chắc chắn muốn xóa?');">Xóa</a>
                </td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
