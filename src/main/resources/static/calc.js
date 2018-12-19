function calculateTotal() {
   var calc = document.querySelector("#calc");
   var hrsWorked = document.querySelector('#hrsWorked'); 
   var wage = document.querySelector('#wage');
   var currentPay = document.querySelector('#currentPay'); 
   
   //currentPay.innerHTML = mycurrentPay;
	calc.addEventListener("click", function{
		var myCurrentPay = parseInt(hrsWorked) * parseInt(wage);
		document.getElementById('#currentPay') = myCurrentPay;
		});
	};