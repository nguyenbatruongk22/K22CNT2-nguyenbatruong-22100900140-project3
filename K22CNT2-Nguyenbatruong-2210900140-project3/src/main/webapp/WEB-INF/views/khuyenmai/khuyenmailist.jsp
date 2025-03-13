<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Danh Sách Khuyến Mãi</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css">
    <style>
        body {
            font-family: Arial, sans-serif;
        }
        .container {
            width: 80%;
            margin: auto;
            margin-top: 50px;
        }
        h2 {
            text-align: center;
        }
        table {
            width: 100%;
            border-collapse: collapse;
            margin-top: 20px;
        }
        th, td {
            border: 1px solid #ddd;
            padding: 10px;
            text-align: center;
        }
        th {
            background-color: #f4f4f4;
        }
        .btn {
            padding: 5px 10px;
            text-decoration: none;
            color: white;
            border-radius: 3px;
            border: none;
            cursor: pointer;
        }
        .btn-edit {
            background-color: #007bff;
        }
        .btn-delete {
            background-color: #dc3545;
        }
        .btn-add {
            display: block;
            width: fit-content;
            background-color: #28a745;
            color: white;
            padding: 10px;
            text-decoration: none;
            border-radius: 5px;
            margin: 20px 0;
        }
    </style>
</head>
<body>
    <jsp:include page="../menu.jsp" />

    <div class="container">
        <h2>Danh Sách Khuyến Mãi</h2>
        
        <a href="${pageContext.request.contextPath}/khuyenmai/add" class="btn-add">+ Thêm Khuyến Mãi</a>

        <table>
            <thead>
                <tr>
                    <th>STT</th>
                    <th>Tên Khuyến Mãi</th>
                    <th>Mô Tả</th>
                    <th>Ngày Bắt Đầu</th>
                    <th>Ngày Kết Thúc</th>
                    <th>Thao Tác</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="khuyenMai" items="${khuyenMaiList}" varStatus="status">
                    <tr>
                        <td>${status.index + 1}</td>
                        <td>${khuyenMai.tenKhuyenMai}</td>
                        <td>${khuyenMai.moTa}</td>
                        <td>${khuyenMai.ngayBatDau}</td>
                        <td>${khuyenMai.ngayKetThuc}</td>
                        <td>
                            <a href="${pageContext.request.contextPath}/khuyenmai/edit?id=${khuyenMai.id}" class="btn btn-edit">Sửa</a>
                            <a href="${pageContext.request.contextPath}/khuyenmai/delete?id=${khuyenMai.id}" class="btn btn-delete" onclick="return confirm('Bạn có chắc chắn muốn xóa khuyến mãi này?');">Xóa</a>
                        </td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </div>
</body>
</html>
