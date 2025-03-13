<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Chỉnh Sửa Cửa Hàng</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css">
    <style>
        body {
            font-family: Arial, sans-serif;
        }
        .container {
            width: 50%;
            margin: auto;
            padding: 20px;
            border: 1px solid #ccc;
            border-radius: 5px;
            margin-top: 50px;
        }
        label {
            font-weight: bold;
            display: block;
            margin-top: 10px;
        }
        input[type="text"] {
            width: 100%;
            padding: 8px;
            margin-top: 5px;
            border: 1px solid #ccc;
            border-radius: 4px;
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
    <jsp:include page="../menu.jsp" />

    <div class="container">
        <h2 style="text-align: center;">Chỉnh Sửa Cửa Hàng</h2>
        
        <form action="${pageContext.request.contextPath}/hethongcuahang/update" method="post">
            <input type="hidden" name="id" value="${cuaHang.id}">

            <label for="tenCuaHang">Tên Cửa Hàng:</label>
            <input type="text" id="tenCuaHang" name="tenCuaHang" value="${cuaHang.tenCuaHang}" required>

            <label for="diaChi">Địa Chỉ:</label>
            <input type="text" id="diaChi" name="diaChi" value="${cuaHang.diaChi}" required>

            <label for="soDienThoai">Số Điện Thoại:</label>
            <input type="text" id="soDienThoai" name="soDienThoai" value="${cuaHang.soDienThoai}" required>

            <div class="buttons">
                <button type="submit" class="btn btn-save">Lưu</button>
                <a href="${pageContext.request.contextPath}/hethongcuahang/list" class="btn btn-cancel">Hủy</a>
            </div>
        </form>
    </div>
</body>
</html>
