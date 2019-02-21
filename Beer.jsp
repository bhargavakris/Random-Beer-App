<%@include file="common/header.jspf" %>
<%@include file="common/navigation.jspf" %>
	
	<table class="table table-striped">
		<caption>Random Beer APP</caption>
		<thead>
			<tr>
				<th>Beer name</th>
				<th>Description</th>
				<th>Alcohol percent</th>
				<th>Brewery location</th>
				<th></th>
			</tr>
		</thead>
		<tbody>
			<!--JSTL for loop-->
			<tr>
				<td>${beer_by_id.beer_name}</td>
				<td>${beer_by_id.description}</td>
				<td>${beer_by_id.alcohol_percent}</td>
				<td>${beer_by_id.brewery_location}</td>
				<td><a type="button" class="btn btn-danger" href="/">Show Another Beer</a></td>
			</tr>
		</tbody>
		
	</table>
	<a type="button" class="btn btn-Success" href="http://localhost:8080/swagger-ui.html">Api Documentation using swagger</a>
<%@include file="common/footer.jspf" %>