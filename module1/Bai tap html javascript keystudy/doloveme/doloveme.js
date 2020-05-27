function doloveme() {
    var x1 = Math.round(Math.random() * window.innerWidth);
    var x2 = Math.round(Math.random() * window.innerHeight);
    document.getElementById('no').style.left = x1 + 'px';
    document.getElementById('no').style.top = x2 + 'px';

}