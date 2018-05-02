<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"
  import="java.util.*, com.tw.model.Employee" %>
<!DOCTYPE html>

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>员工列表</title>

    	<style type="text/css">
    		table{
    			text-align: center;
    			border-collapse: collapse;
    		}

    		th{
    			background-color:#000;
    			color:#FFF;
    		}

    		th, td{
    			padding:15px 80px;
    		}

    		table,table tr th, table tr td {
    			border:1px solid #000;
    		}
    	</style>
    	<script type="text/javascript">
    		window.onload = function color(){
    			var table = document.getElementById("employees");
    			var rows = table.getElementsByTagName("tr");
    			for(var i=0;i<rows.length;i++){
    				if (i%2==0){
    					rows[i].style.backgroundColor = "#FFF"
    				}else{
    					rows[i].style.backgroundColor = "#EEE";
    				}
    			}
    		}
    	</script>

</head>
<body>
    <table id="employees">
        <tr>
            <th>编号</th>
            <th>姓名</th>
            <th>年龄</th>
            <th>性别</th>
        </tr>
        <%
            List<Employee> employees = (ArrayList<Employee>) request.getAttribute("employees");
            for(Employee employee : employees){
        %>
        <tr>
            <td><%=employee.getId() %></td>
            <td><%=employee.getName() %></td>
            <td><%=employee.getAge() %></td>
            <td><%=employee.getGender() %></td>
        </tr>
        <%
            }

        %>
    </table>
</body>
</html>