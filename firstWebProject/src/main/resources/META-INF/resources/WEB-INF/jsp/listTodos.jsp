<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
	<link href = "webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel ="stylesheet">
	<title> list Todos Page</title>
</head>
<body>
	<div class = "container">
		<div> Welcome ${name} !!! Below is the list of Todos </div>
		<h1>Your To-dos</h1>
		<table class = "table">
				<thead>
					<tr>
						<th>Description</th>
						<th>Target Date</th>
						<th>Is Done?</th>
						<th></th>
						<th></th>
					</tr>
				</thead>
				<tbody>		
					<c:forEach items="${todos}" var="todo">
						<tr>
							<td>${todo.description}</td>
							<td>${todo.targetDate}</td>
							<td>${todo.done}</td>
						</tr>
					</c:forEach>
				</tbody>		
		</table>
		<a href = "add-todo" class = "btn btn-success">Add Todo</a>
			<script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
			<script src="webjars/jquery/3.6.0/jquery.min.js"></script>
	</div>
</body>
<html>