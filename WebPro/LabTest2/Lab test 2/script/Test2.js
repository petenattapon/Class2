function toggleDisplay() {
    const btn1 = document.getElementById("hide");
    const btn2 = document.getElementById("show");
    const square = document.getElementById("square");
  
    btn1.addEventListener("click", function() {
      square.style.display = "none";
    });
  
    btn2.addEventListener("click", function() {
      square.style.display = "block";
    });
  }

  
  