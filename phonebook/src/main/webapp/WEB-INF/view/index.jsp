<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1"/>
<title>PhoneDirectory</title>
<link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
  
  </style>
  <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
  <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
	<script type="text/javascript">
		$(function() {
			$("#Contact_Name").autocomplete({
				source: "contactNamesAutocomplete", 
				minLength: 1,
	
			});
		});
	</script>

</head>
<body>

<br/>

<form>

  <label>Contact Name:</label>
  <input id="Contact_Name" type="text">
</form>

</body>
</html>