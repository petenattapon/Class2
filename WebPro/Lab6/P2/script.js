function clicked() {
    let button = document.querySelector('button');
    let ul = document.querySelector('ul')

    function changeText() { 
      if (button.textContent === ">> Click for show details") {
        button.textContent = "X Click for hidden details";
        ul.style.display = 'block'
      } else {
        button.textContent = ">> Click for show details";
        ul.style.display = 'none'
      }
      button.removeEventListener('click', changeText);

    }


    button.addEventListener('click', changeText);

    
}