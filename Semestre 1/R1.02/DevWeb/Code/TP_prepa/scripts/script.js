let para = document.getElementById("nom");
para.addEventListener("click", updateName);
function updateName() {
let name = prompt("Saisir un nouveau nom");
para.textContent = "Collaborateur : " + name;
}
