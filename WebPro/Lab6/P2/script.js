function clicked() {
    let button = document.querySelector('button');
    let ul = document.querySelector('ul')

    function changeText() { 
      if (button.textContent === ">> Show details") {
        button.textContent = "  Hide details";
        ul.style.display = 'block'
      } else {
        button.textContent = ">> Show details";
        ul.style.display = 'none'
      }
      button.removeEventListener('click', changeText);

    }


    button.addEventListener('click', changeText);

    
}