function clickedAlt() {
    let clicked = document.querySelectorAll("td");

    clicked.forEach(function(e) {
      if (e.classList.contains("cBlack")) {
        e.classList.remove("cBlack");
        e.classList.add("cWhite");
      } else {
        e.classList.remove("cWhite");
        e.classList.add("cBlack");
      }
    });
  }