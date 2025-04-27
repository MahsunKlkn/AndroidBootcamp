package com.example.androidbootcamp.odev2

fun main(){
    //Fahrenheit Dönüştürme
    var F:Double
    F=x(50);
    println(F)

    //Dikdörtgen alan hesaplama
    var alan1:Int
    alan1=alan(50,60);
    println(alan1)


    //Faktoriyel hesaplama
    var sonuc:Int
    sonuc=faktoriyel(6);
    println(sonuc)


    //Kelimedeki harf sayısını bulma
    var sonuc1:Int
    sonuc1=harfSayma("Mahsun");
    println(sonuc1)


    var sonuc2 : Int
    sonuc2 = maasHesaplama(21)
    println(sonuc2)

    var sonuc3 : Int
    sonuc3 = internetUcretHesaplama(70)
    println(sonuc3)


    var sonuc4 : Int
    sonuc4 = icKenarHesaplama(5)
    println(sonuc4)
}

fun x(C:Int):Double{
    return C*(1.8)+32
    //Fahrenheit Dönüştürme
}

fun alan(a:Int,b:Int):Int{
    return a*b
    //Dikdörtgen alan hesaplama

}

fun faktoriyel(sayi:Int):Int{
    return if (sayi == 0) {
        1
    } else{
        sayi * faktoriyel(sayi-1)
    }
    //Faktoriyel hesaplama
}


fun harfSayma(kelime:String):Int{
        var sayac : Int
        sayac = 0
        for (harf in kelime) {
            if (harf == 'A' || harf == 'a') {
                sayac += 1
            }
        }
    return sayac

    //Kelimedeki harf sayısını bulma
}


fun icKenarHesaplama(x: Int) : Int {
    return (x-2) * 180
}


fun maasHesaplama(gunSayisi : Int) : Int {
    var calismaSaatiUcreti = 10
    var mesaiSaatiUcreti = 20
    var toplamMaas = 0
    if ( gunSayisi > 20) {
        toplamMaas = 20*8*10
        toplamMaas=(gunSayisi-20)*8*20+toplamMaas
        return toplamMaas
    } else {
        toplamMaas =gunSayisi* 10*8
        return toplamMaas
    }
}


fun internetUcretHesaplama(kotaMiktari : Int) : Int {
    var ucret = 100
    if (kotaMiktari > 50) {
        var eklenen = (kotaMiktari - 50) * 4
        ucret += eklenen
    }
    return ucret
}