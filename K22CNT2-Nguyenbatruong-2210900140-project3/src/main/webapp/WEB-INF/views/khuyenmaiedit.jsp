<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Chỉnh Sửa Khuyến Mãi</title>
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
        input[type="text"], textarea, input[type="date"] {
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
  

    <div class="container">
        <h2 style="text-align: center;">Chỉnh Sửa Khuyến Mãi</h2>
        
        <form action="${pageContext.request.contextPath}/khuyenmai/update" method="post">
            <input type="hidden" name="id" value="${khuyenMai.id}">

            <label for="tenKhuyenMai">Tên Khuyến Mãi:</label>
            <input type="text" id="tenKhuyenMai" name="tenKhuyenMai" value="${khuyenMai.tenKhuyenMai}" required>

            <label for="moTa">Mô Tả:</label>
            <textarea id="moTa" name="moTa" rows="4" required>${khuyenMai.moTa}</textarea>

            <label for="ngayBatDau">Ngày Bắt Đầu:</label>
            <input type="date" id="ngayBatDau" name="ngayBatDau" value="${khuyenMai.ngayBatDau}" required>

            <label for="ngayKetThuc">Ngày Kết Thúc:</label>
            <input type="date" id="ngayKetThuc" name="ngayKetThuc" value="${khuyenMai.ngayKetThuc}" required>

            <div class="buttons">
                <button type="submit" class="btn btn-save">Lưu</button>
                <a href="${pageContext.request.contextPath}/khuyenmai/list" class="btn btn-cancel">Hủy</a>
            </div>
        </form>
    </div>
</body>
</html>
