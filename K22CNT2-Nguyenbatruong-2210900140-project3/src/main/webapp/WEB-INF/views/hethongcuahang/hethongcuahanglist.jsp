<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Danh Sách Cửa Hàng</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css">
    <style>
        table {
            width: 100%;
            border-collapse: collapse;
            margin-top: 20px;
        }
        table, th, td {
            border: 1px solid black;
        }
        th, td {
            padding: 10px;
            text-align: center;
        }
        th {
            background-color: #c8102e;
            color: white;
        }
    </style>
</head>
<body>
    <jsp:include page="../menu.jsp" />

    <h2 style="text-align: center; margin-top: 20px;">Danh Sách Cửa Hàng</h2>
    
    <a href="${pageContext.request.contextPath}/hethongcuahang/add" style="display: block; text-align: center; margin-bottom: 10px; text-decoration: none; background: #8b0000; color: white; padding: 10px; width: 200px; margin: auto; border-radius: 5px;">Thêm Cửa Hàng</a>

    <table>
        <tr>
            <th>Tên Cửa Hàng</th>
            <th>Địa Chỉ</th>
            <th>Số Điện Thoại</th>
            <th>Hành Động</th>
        </tr>
        <c:forEach var="cuaHang" items="${listCuaHang}">
            <tr>
                <td>${cuaHang.tenCuaHang}</td>
                <td>${cuaHang.diaChi}</td>
                <td>${cuaHang.soDienThoai}</td>
                <td>
                    <a href="${pageContext.request.contextPath}/hethongcuahang/edit?id=${cuaHang.id}">Sửa</a> |
                    <a href="${pageContext.request.contextPath}/hethongcuahang/delete?id=${cuaHang.id}" onclick="return confirm('Bạn có chắc chắn muốn xóa?');">Xóa</a>
                </td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
