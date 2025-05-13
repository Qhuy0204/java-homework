<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head><title>Chuyển đổi nhiệt độ</title></head>
<body>
    <h2>Chuyển đổi nhiệt độ</h2>
    <form action="convert" method="post">
        Nhập nhiệt độ: <input type="text" name="temperature" />
        <select name="type">
            <option value="CtoF">C to F</option>
            <option value="FtoC">F to C</option>
        </select>
        <input type="submit" value="Chuyển đổi" />
    </form>

    <c:if test="${not empty error}">
        <p style="color:red">${error}</p>
    </c:if>

    <c:if test="${not empty result}">
        <p style="color:green">${result}</p>
    </c:if>

    <hr/>
    <p>Số lượng request: ${applicationScope.requestCount}</p>
</body>
</html>
