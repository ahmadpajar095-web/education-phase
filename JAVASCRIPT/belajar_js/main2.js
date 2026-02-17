const btn = document.querySelector('.link')
const btn3 = document.getElementById('konto')
function gantiwarna(element) {
    if (element.style.background == "gold") {
        element.style.background= ""
        element.style.textDecoration = "none"

    }else {
        element.style.background= "gold"
        element.style.textDecoration = "underline"
    }

}