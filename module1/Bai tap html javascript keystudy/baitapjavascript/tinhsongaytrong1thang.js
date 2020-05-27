function tinhsongaytrong1thang() {
    let thang=parseInt(document.getElementById('nhap').value);
    switch (thang) {
        case 2:
            document.getElementById('ketqua').innerText='thang' + " " + document.getElementById('nhap').value+ " " +"  có 28 hoac 29 ngay"
            break;
        case 1 : case 3: case 5: case 7: case 8: case 10: case 12:
            document.getElementById('ketqua').innerText='thang' + " " + document.getElementById('nhap').value+ " " +"  có 31 ngay"
            break;
        case 4 :case 6 : case 9 : case 11:
            document.getElementById('ketqua').innerText='thang' + " " + document.getElementById('nhap').value+ " " +"  có 30 ngay"
            break;
        default:
            document.getElementById('ketqua').innerText='Nhap Sai Roi'

    }
switch (thang) {

}
}