<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Thêm Món Ăn</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css">
</head>
<body>
    <h2>Thêm Món Ăn Mới</h2>
    <form:form modelAttribute="thucDon" action="saveThucDon" method="post" enctype="multipart/form-data">
        <table>
            <tr>
                <td>Tên món:</td>
                <td><input type="text" name="tenMon" required /></td>
            </tr>
           <tr>
   
    <tr>
    <td>Loại:</td>
    <td>
        <form:select path="loai" required="true">
            <form:option value="">-- Chọn loại --</form:option>
            <form:option value="Khai vị">Khai vị</form:option>
            <form:option value="Món chính">Món chính</form:option>
            <form:option value="Tráng miệng">Tráng miệng</form:option>
        </form:select>
    </td>
</tr>

    
</tr>

            <tr>
                <td>Giá:</td>
                <td><input type="number" name="gia" required /></td>
            </tr>
            <tr>
                <td>Hình ảnh:</td>
                <td><input type="url" name="fileHinhAnh" required /></td>
            </tr>
            <tr>
                <td>Mô tả:</td>
                <td><input type="text" name="moTa" required /></td>
            </tr>
            <tr>
                <td colspan="2">
                    <input type="submit" value="Thêm món ăn" />
                </td>
            </tr>
        </table>
    </form:form>
    <br>
    <a href="${pageContext.request.contextPath}/thucdon/list">Quay lại danh sách</a>
</body>
</html>
