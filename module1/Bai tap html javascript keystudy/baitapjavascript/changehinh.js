var chag1=1;
var chag2=1;
var chag3=1;
var chag4=1;
var chag5=1;
function change1() {
   var link=document.getElementById('img1');
    ++chag1;
    if(chag1>3)
    {
        chag1=1;
    }
    link.src='part1x' + chag1 +".jpg"
    if ((chag1==chag2)&&(chag2==chag3)&&(chag3==chag4)&&(chag4==chag5))
    {
        alert("dung roi")
    }

}
function chang2() {
    var link =document.getElementById('img2')
    ++chag2;
    if(chag2>3)
    {
        chag2=1
    }
    link.src='part2x' + chag2 + ".jpg"
    if ((chag1==chag2)&&(chag2==chag3)&&(chag3==chag4)&&(chag4==chag5))
    {
        alert("dung roi")
    }

}
function chang3() {
    var link =document.getElementById('img3')
    ++chag3;
    if(chag3>3)
    {
        chag3=1
    }
    link.src='part3x' + chag3 + ".jpg"
    if ((chag1==chag2)&&(chag2==chag3)&&(chag3==chag4)&&(chag4==chag5))
    {
        alert("dung roi")
    }

}
function chang4() {
    var link =document.getElementById('img4')
    ++chag4;
    if(chag4>3)
    {
        chag4=1
    }
    link.src='part4x' + chag4 + ".jpg"
    if ((chag1==chag2)&&(chag2==chag3)&&(chag3==chag4)&&(chag4==chag5))
    {
        alert("dung roi")
    }

}
function chang5() {
    var link =document.getElementById('img5')
    ++chag5;
    if(chag5>3)
    {
        chag5=1
    }
    link.src='part5x' + chag5 + ".jpg"
    if ((chag1==chag2)&&(chag2==chag3)&&(chag3==chag4)&&(chag4==chag5))
    {
        alert("dung roi")
    }

}