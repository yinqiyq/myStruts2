<%--
  Created by IntelliJ IDEA.
  User: YQ
  Date: 2020/4/29
  Time: 23:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<s:head/>
<body>
<!--
<form action="addProduct" method="POST">

    <input type="text" name="product.name" value="${param.name}">
    <br/>
    <input type="submit" value="submit">
</form>



<form action="addProduct" method="POST">
    name:<input type="text" name="product.name">
    <br/>
    age:<input type="text" name="product.age">
    <br/>
    <input type="submit" value="submit">
    </form>
  -->

  <s:form action="addProduct">

    <s:textfield name="product.name" label="product name" />
    <s:submit value="Submit" />

</s:form>


</body>
</html>
