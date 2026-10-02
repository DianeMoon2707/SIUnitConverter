async function loadUnitsOfABaseUnit()
{
	const baseUnit = document.getElementById("base-units").innerHTML;
	
	console.log(baseUnit);
	
	let units = [];
	
	const response = await fetch(`/index/units?baseUnit=${baseUnit}`);
	
	if(!response.ok)
	{
		console.error("Es liegen leider keine Einheiten zu dieser Basiseinheit vor.");
		units = [];
		return;
	}
	else
	{
		console.log("Hier");
		units = await response.json();
	}
}