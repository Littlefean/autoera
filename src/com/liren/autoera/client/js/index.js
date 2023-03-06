window.onload = function () {

    let groundCanvasEle = document.querySelector(".ground");
    let ctx = groundCanvasEle.getContext("2d");

    drawRectFill(ctx, 20, 50, 100, 100, "red", 5);
}