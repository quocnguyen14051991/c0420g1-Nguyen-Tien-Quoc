function ibm() {
        let chieucao=parseFloat(document.getElementById('chieucao').value);
        let cannang=parseFloat(document.getElementById('cannang').value);
        let ibm=cannang/(2*chieucao);
        if(ibm < 18.5)
        {
            document.getElementById('kq').innerText='Underweight';
        } else if(ibm <25)
        {
            document.getElementById('kq').innerText='Normal';

        }
        else if(ibm<30)
        {
            document.getElementById('kq').innerText='OverWeight';
        }
        else
        {
            document.getElementById('kq').innerText='Obese'
        }

}