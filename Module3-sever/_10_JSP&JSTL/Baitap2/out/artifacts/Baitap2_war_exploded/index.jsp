<%--
  Created by IntelliJ IDEA.
  User: KA
  Date: 9/29/2020
  Time: 8:29 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <form action="/calculator" method="post">
    <h2>Simple Calculator</h2>
    <fieldset>
      <legend>Calculator</legend>
      <table>

        <tr>
          <td>First operand</td>
          <td><input type="text" name="first-operand"></td>
        </tr>

        <tr>
          <td>Operator</td>
          <td>
            <select name="operator">
              <option value="+">Addition</option>
              <option value="-">Subtraction</option>
              <option value="*">Multiplication</option>
              <option value="/">Division</option>
            </select>
          </td>
        </tr>
        </tr>

        <tr>
          <td>Second operand</td>
          <td><input type="text" name="second-operand"></td>
        </tr>
        <tr>
          <td style="left: 40px"><input type="submit" value="caculator"></td>
        </tr>
      </table>
    </fieldset>
  </form>
  </body>
</html>
