// const btn1 = document.querySelector('#btn1')
// const tombol2 = document.querySelector('.btn2')
// const isi = document.querySelector('.isi')


// tombol2.style.background = 'yellow'
// btn1.style.padding = '20px'
// btn1.style.fontSize= '20px'

// let sudahklik = false

// function diklik() {
//     if (sudahklik == false) {
//         btn1.style.background = ''
//         sudahklik = true
//     }else {
//         btn1.style.background = 'aqua'
//         sudahklik = false
//     }
// }

// btn1.onclick = diklik()

const btn1 = document.querySelector('#btn1');
const tombol2 = document.querySelector('.btn2');
const isi = document.querySelector('.isi');


// styling awal
tombol2.style.background = 'yellow';
btn1.style.padding = '20px';
btn1.style.fontSize = '20px';

let sudahKlik = false; // flag untuk cek status klik
function dklik() {
    if (btn1.textContent == 'diklik') {
        btn1.textContent = 'klik saya 1';
        isi.textContent = 'tombol belum diklik';
        btn1.style.background = '';
        sudahKlik = false; // reset status
    } else {
        btn1.textContent = 'diklik';
        isi.textContent = 'tombol diklik';
        btn1.style.background = 'aqua';
        sudahKlik = true; // tandai sudah diklik
    }
}

function gantibiru() {
    if (!sudahKlik) {
        btn1.style.background = 'aqua';
    }
}

function warnadefault() {
    if (!sudahKlik) {
        btn1.style.background = '';
    }
}