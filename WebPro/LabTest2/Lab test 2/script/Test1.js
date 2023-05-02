function changeImg(fileName) {
  const img = document.querySelector("#imgShow");

  img.setAttribute("src", fileName);
}

function paragraph() {
  const persons = [
    {
      word: " I'm down and out and I feel like. Not waking up today. And things will never come my way",
      name: "H 3 F",
    },
    {
      word: " How I only understand love Like drops of water in the ocean",
      name: "plastic plastic",
    },
    {
      word: " Wandering the streets all through the night Searching for the one to make me right",
      name: "Phum Viphurit",
    },
    {
      word: " Country roads, take me home To the place I belong West Virginia, mountain mama Take me home, country roads",
      name: "John Denver",
    },
    {
      word: " ใช้ชีวิตเหมือนกลอนเปล่า",
      name: "klee bho",
    },
  ];

  let randWords = persons[Math.floor(Math.random() * persons.length)];
  let html =
    "<blockquote>" +
    randWords.word +
    "</blockquote>" +
    "<p>" +
    randWords.name +
    "</p>";

  document.getElementById("random_quotes").innerHTML = html;
}

paragraph();

function updateDate() {
  const date = document.lastModified;
  document.getElementById("result").innerHTML = "อัพเดทล่าสุด : " + date;
}
updateDate() ;