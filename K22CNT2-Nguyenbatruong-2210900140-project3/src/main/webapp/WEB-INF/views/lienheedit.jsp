<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Chỉnh Sửa Liên Hệ</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css">
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }
        .container {
            width: 50%;
            background: white;
            padding: 20px;
            border-radius: 5px;
            box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.1);
        }
        h2 {
            text-align: center;
            color: #333;
        }
        label {
            font-weight: bold;
            display: block;
            margin-top: 10px;
        }
        input[type="text"], input[type="email"], input[type="tel"], textarea {
            width: 100%;
            padding: 10px;
            margin-top: 5px;
            border: 1px solid #ddd;
            border-radius: 4px;
            box-sizing: border-box;
        }
        .buttons {
            margin-top: 20px;
            display: flex;
            justify-content: space-between;
        }
        .btn {
            padding: 10px 20px;
            text-decoration: none;
            color: white;
            border-radius: 5px;
            border: none;
            cursor: pointer;
        }
        .btn-save {
            background-color: #28a745;
        }
        .btn-cancel {
            background-color: #dc3545;
        }
    </style>
</head>
<body>
    <div class="container">
        <h2>Chỉnh Sửa Thông Tin Liên Hệ</h2>
        
        <form action="${pageContext.request.contextPath}/lienhe/editsave" method="post">
            <!-- ID liên hệ ẩn -->
            <input type="hidden" name="id" value="${command.id}">
            
            <label for="hoTen">Họ và Tên:</label>
            <input type="text" id="hoTen" name="hoTen" value="${command.hoTen}" required>

            <label for="email">Email:</label>
            <input type="email" id="email" name="email" value="${command.email}" required>

            <label for="soDienThoai">Số Điện Thoại:</label>
            <input type="tel" id="soDienThoai" name="soDienThoai" value="${command.soDienThoai}" required>

            <label for="noiDung">Nội Dung:</label>
            <textarea id="noiDung" name="noiDung" rows="4" required>${command.noiDung}</textarea>

            <div class="buttons">
                <button type="submit" class="btn btn-save">Lưu Thay Đổi</button>
                <a href="${pageContext.request.contextPath}/lienhe/list" class="btn btn-cancel">Hủy</a>
            </div>
        </form>
    </div>
</body>
</html>
