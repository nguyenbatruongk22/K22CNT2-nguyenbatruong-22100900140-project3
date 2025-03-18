<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Thêm Liên Hệ</title>
    <link rel="stylesheet" type="text/css" href="<c:url value='/resources/css/style.css' />">
</head>
<body>

    <h2>Thêm Liên Hệ</h2>

    <form:form action="${pageContext.request.contextPath}/lienhe/save" method="post" modelAttribute="command">
        <table>
            <tr>
                <td>Họ và Tên:</td>
                <td><form:input path="hoTen" required="true"/></td>
            </tr>
            <tr>
                <td>Email:</td>
                <td><form:input path="email" type="email" required="true"/></td>
            </tr>
            <tr>
                <td>Số Điện Thoại:</td>
                <td><form:input path="soDienThoai" required="true"/></td>
            </tr>
            <tr>
                <td>Nội Dung:</td>
                <td><form:textarea path="noiDung" rows="5" required="true"/></td>
            </tr>
            <tr>
                <td colspan="2">
                    <input type="submit" value="Lưu"/>
                    <a href="${pageContext.request.contextPath}/lienhe/lienhelist">Quay lại danh sách</a>
                </td>
            </tr>
        </table>
    </form:form>

</body>
</html>
