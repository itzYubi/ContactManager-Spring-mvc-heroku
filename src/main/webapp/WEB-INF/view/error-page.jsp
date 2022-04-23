<jsp:include page="/header" />
<div class="container-fluid p-4">
	<h3>Sorry! your request could not be processed because of the error below!</h3>
	
	<div class="alert alert-danger p-4">
		${errMsg }
	</div>
</div>
<jsp:include page="/footer" />