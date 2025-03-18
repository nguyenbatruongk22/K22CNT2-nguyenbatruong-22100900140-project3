<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Danh Sách Hệ Thống Cửa Hàng</title>
    <style>
        body {
            font-family: Arial, sans-serif;
        }
        h2 {
            text-align: center;
            margin-top: 20px;
        }
        table {
            width: 80%;
            margin: 20px auto;
            border-collapse: collapse;
        }
        table, th, td {
            border: 1px solid #ccc;
        }
        th, td {
            padding: 10px;
            text-align: center;
        }
        th {
            background-color: #c8102e;
            color: #fff;
        }
        a {
            text-decoration: none;
            color: #007bff;
        }
    </style>
</head>
<body>
    <h2>Danh Sách Hệ Thống Cửa Hàng</h2>
    <table>
        <thead>
            <tr>
                <th>ID</th>
                <th>Tên Cửa Hàng</th>
                <th>Địa Chỉ</th>
                <th>Số Điện Thoại</th>
                <th>Giờ Mở Cửa</th>
                <th>Giờ Đóng Cửa</th>
                <th>Hành Động</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="ht" items="${heThongCuaHangList}">
                <tr>
                    <td>${ht.id}</td>
                    <td>${ht.tenCuaHang}</td>
                    <td>${ht.diaChi}</td>
                    <td>${ht.soDienThoai}</td>
                    <td>${ht.gioMoCua}</td>
                    <td>${ht.gioDongCua}</td>
                    <td>
                        <a href="${pageContext.request.contextPath}/hethongcuahang/edit/${ht.id}">Sửa</a> |
                       <a href="${pageContext.request.contextPath}/hethongcuahang/delete/${ht.id}" onclick="return confirm('Bạn có chắc chắn muốn xóa?');">Xóa</a>

                    </td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
    <div style="text-align: center; margin-top: 20px;">
        <a href="${pageContext.request.contextPath}/hethongcuahang/hethongcuahangadd" style="background: #8b0000; color: #fff; padding: 10px 20px; border-radius: 5px;">Thêm Cửa Hàng</a>
    </div>
</body>
</html>
