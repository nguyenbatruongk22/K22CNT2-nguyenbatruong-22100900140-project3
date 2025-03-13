<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Chỉnh Sửa Món Ăn</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css">
</head>
<body>
    <h2>Chỉnh Sửa Món Ăn</h2>
    <form:form modelAttribute="thucDon" action="${pageContext.request.contextPath}/thucdon/update" method="post" enctype="multipart/form-data">
        <table>
            <tr>
                <td>Tên món:</td>
                <td><form:input path="tenMon" /></td>
            </tr>
            <tr>
                <td>Hình ảnh hiện tại:</td>
                <td>
                    <img src="${pageContext.request.contextPath}/uploads/${thucDon.hinhAnh}" width="150px" alt="Hình món ăn">
                </td>
            </tr>
            <tr>
                <td>Chọn ảnh mới:</td>
                <td><input type="file" name="fileHinhAnh" /></td>
            </tr>
            <tr>
                <td>Mô tả:</td>
                <td><form:textarea path="moTa" /></td>
            </tr>
            <tr>
                <td colspan="2">
                    <input type="hidden" name="id" value="${thucDon.id}" />
                    <input type="submit" value="Cập nhật món ăn" />
                </td>
            </tr>
        </table>
    </form:form>
    <br>
    <a href="${pageContext.request.contextPath}/thucdon/list">Quay lại danh sách</a>
</body>
</html>
