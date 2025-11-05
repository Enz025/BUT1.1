function drawStar(canvas, cx, cy, spikes, outerRadius, innerRadius) {
  let ctx = canvas.getContext("2d");
  let rot = (Math.PI / 2) * 3;
  let x = cx;
  let y = cy;
  let step = Math.PI / spikes;

  ctx.beginPath();
  ctx.moveTo(cx, cy - outerRadius);
  for (i = 0; i < spikes; i++) {
    x = cx + Math.cos(rot) * outerRadius;
    y = cy + Math.sin(rot) * outerRadius;
    ctx.lineTo(x, y);
    rot += step;

    x = cx + Math.cos(rot) * innerRadius;
    y = cy + Math.sin(rot) * innerRadius;
    ctx.lineTo(x, y);
    rot += step;
  }
  ctx.lineTo(cx, cy - outerRadius);
  ctx.closePath();
  ctx.lineWidth = 5;
  ctx.strokeStyle = "#418aed";
  ctx.stroke();
  ctx.fillStyle = "#94b9eb";
  ctx.fill();
}

let canvas = document.getElementById("myCanvas");
drawStar(canvas, 100, 100, 5, 30, 15);
