$(document).ready(function(){
	
	
  var inputValues = {
	  
			  "staff_slots":"re49aedb9f89c8daefae8b83a9c4d351cf2a8039c",
			  "duration":"45",
			  "staff_count":"rc9ee7160648b32ed8f30e100caa6464e9031cc1b",
			  "dateStr" : "11/24/2017"
			  
  }	
	
	
	$.ajax({
		
		url :"/TestProject",
		type : "POST",
		contentType : "application/json",
		data :inputValues,
		success : function(result){
			
		},
		error :function(result){
			console.log("Inside the error function");
		}
		
		
		
		
	})
	
	
})
