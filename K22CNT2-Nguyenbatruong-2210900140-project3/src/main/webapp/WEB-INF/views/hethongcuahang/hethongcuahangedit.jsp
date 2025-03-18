<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
    <title>Chỉnh Sửa Cửa Hàng</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            background-color: #f4f4f4;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }
        h2 {
            text-align: center;
            color: #333;
        }
        form {
            background-color: #fff;
            padding: 20px;
            border-radius: 8px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
            width: 400px;
        }
        input[type="text"], input[type="tel"], textarea {
            width: 100%;
            padding: 10px;
            margin: 10px 0;
            border: 1px solid #ddd;
            border-radius: 4px;
            box-sizing: border-box;
        }
        input[type="submit"] {
            background-color: #007BFF;
            color: white;
            padding: 10px 20px;
            border: none;
            border-radius: 4px;
            cursor: pointer;
            width: 100%;
        }
        input[type="submit"]:hover {
            background-color: #0056b3;
        }
        a {
            text-decoration: none;
            color: #007BFF;
            display: inline-block;
            margin-top: 15px;
            text-align: center;
        }
        a:hover {
            color: #0056b3;
        }
    </style>
</head>
<body>

    <div>
        <h2>Chỉnh Sửa Cửa Hàng</h2>
        <form action="${pageContext.request.contextPath}/hethongcuahang/editsave" method="post">
            <!-- Ẩn ID cửa hàng -->
            <input type="hidden" name="id" value="${command.id}" />

            Tên Cửa Hàng: <input type="text" name="tenCuaHang" value="${command.tenCuaHang}" required/><br/>
            Địa Chỉ: <textarea name="diaChi" rows="3" required>${command.diaChi}</textarea><br/>
            Số Điện Thoại: <input type="tel" name="soDienThoai" value="${command.soDienThoai}" required/><br/>
            Giờ Mở Cửa: <input type="text" name="gioMoCua" value="${command.gioMoCua}" required/><br/>
            Giờ Đóng Cửa: <input type="text" name="gioDongCua" value="${command.gioDongCua}" required/><br/>
            <input type="submit" value="Cập Nhật"/>
        </form>
        <br/>
        <a href="${pageContext.request.contextPath}/hethongcuahang/hethongcuahanglist">Quay lại danh sách</a>
    </div>
</body>
</html>
