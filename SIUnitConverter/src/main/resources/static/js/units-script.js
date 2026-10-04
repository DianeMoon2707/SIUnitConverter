async function loadUnitsOfABaseUnit()
{	
	const baseUnit = document.getElementById("base-units").value;
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
		units = await response.json();
		changeSourceAndTargetOptions(units);
		setMinimumNumberForInput(baseUnit);
	}
}

function changeSourceAndTargetOptions(units)
{
	const sourceSelect = document.getElementById("source-unit-select");
	const targetSelect = document.getElementById("target-unit-select");

	sourceSelect.innerHTML = "";
	targetSelect.innerHTML = "";
	
	units.forEach(unit =>
	{
		sourceSelect.appendChild(createOption(unit));
		targetSelect.appendChild(createOption(unit));
	});
}

function createOption(unit)
{
	const option = document.createElement("option");
	option.value = unit;
	option.textContent = unit;
	
	return option;
}

function setMinimumNumberForInput(baseUnit)
{
	const sourceInput = document.getElementById("source-unit-input");
	
	if(baseUnit === "TEMPERATUR")
	{
		sourceInput.removeAttribute("min");
	}
	else
	{
		sourceInput.setAttribute("min", "0");
	}
}