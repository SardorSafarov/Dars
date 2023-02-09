import java.math.BigInteger
import kotlin.math.hypot

fun main() {
    //1-masala
//    val a = readln().toInt()
//    when(a)
//    {
//        1-> println("Dushanba")
//        2-> println("Seshanba")
//        3-> println("Chorshanba")
//        4-> println("Payshanba")
//        5-> println("Juma")
//        6-> println("Shanba")
//        7-> println("Yakshanba")
//        else-> println("Bunday kun yo`q")
//    }
    //2-masala
//    val a = readln().toInt()
//    when(a)
//    {
//        1-> println("yomon")
//        2-> println("qoniqarsiz")
//        3-> println("qoniqarli")
//        4-> println("yaxshi")
//        5-> println("a`lo")
//        else-> println("Bunday baho yo`q")
//    }
    //3-masala
//    val a = readln().toInt()
//    when(a)
//    {
//        in 1..2-> println("qish")
//        in 3..5-> println("bahor")
//        in 6..8-> println("yoz")
//        in 9..11-> println("kuz")
//         12-> println("qish")
//        else-> println("Bundayi yo`q")
//    }
    //4-masala
//    val a = readln().toInt()
//    when(a)
//    {
//        1-> println(31)
//        2-> println(28)
//        3-> println(31)
//        4-> println(30)
//        5-> println(30)
//        6-> println(30)
//        7-> println("30")
//        8-> println("31")
//        9-> println("30")
//        10-> println("31")
//        11-> println("30")
//        12-> println("31")
//        else-> println("Bunday oy yo`q")
//    }
    //5-masala
//    val sp  = readln().split(" ")
//    val a= sp[0].toInt()
//    val b= sp[1].toInt()
//    val amal= sp[2]
//    when(amal)
//    {
//        "+"-> println(a+b)
//        "-"-> println(a-b)
//        "*"-> println(a*b)
//        "/"-> println(a/b)
//        else-> println("Bundayi yo`q")
//    }
    //6-masala
//    val sp  = readln().split(" ")
//    val birlik= sp[0]
//    val b= sp[1].toDouble()
//    when(birlik)
//    {
//        "1"-> println("%s desimetr %.1f metr".format(b,b/10))
//        "2"-> println("%s kilometr %.1f metr".format(b,b*1000))
//        "3"-> println("%s metr %.1f metr".format(b,b))
//        "4"-> println("%s millimetr %.1f metr".format(b,b/1000))
//        "5"-> println("%s santimetr %.1f metr".format(b,b/100))
//        else-> println("Bundayi yo`q")
//    }
    //7-masala
//    val sp  = readln().split(" ")
//    val birlik= sp[0]
//    val b= sp[1].toDouble()
//    when(birlik)
//    {
//        "1"-> println("%s kg %.s kg".format(b,b))
//        "2"-> println("%s mgr %.s kg".format(b,b/1000000))
//        "3"-> println("%s gramm %.s kg".format(b,b/1000))
//        "4"-> println("%s t %.s kg".format(b,b*1000))
//        "5"-> println("%s sentner %.s kg".format(b,b*100))
//        else-> println("Bundayi yo`q")
//    }
    //8-masala
//    val sp = readln().split(" ")
//    val day = sp[0].toInt()
//    val moth = sp[1].toInt()
//    when(day)  {
//        1-> print("Birinchi ")
//    }


    //10-masala
//    val sp = readln().split(" ")
//    val a = sp[0]
//    val b = sp[1].toInt()
//    when(a)
//    {
//        "s"-> print("Shimolga ")
//        "j" -> print("Janubga ")
//        "q" -> print("Sharqga ")
//        "g" -> print("G`arbga ")
//        else -> print("error")
//    }
//    when(b)
//    {
//        1-> print("Chapga burul")
//        2-> print("O`ngga burul")
//        0-> print("Harakatni davom ettir")
//        else-> print("error")
//    }
    //   11-masala
//    val sp = readln().split(" ")
//    val a = sp[0]
//    val k1 = sp[1].toInt()
//    val k2 = sp[2].toInt()
//    when(a)
//    {
//        "s"->{
//            when(k1){
//                0->{
//                    when(k2){
//                        0-> println("Janub")
//                        1-> println("Shimol")
//                        2 -> println("Sharq")
//                        else -> println("Xato")
//                    }
//                }
//                1->{
//                    when(k2)
//                    {
//                        0-> println("Shimol")
//                        1-> println("janub")
//                        2-> println("G`arb")
//                        else -> println("Xato")
//                    }
//                }
//                2->{
//                    when(k2)
//                    {
//                        0-> println("Sharq")
//                        1-> println("G`arb")
//                        2-> println("Shimol")
//                        else -> println("Xato")
//                    }
//                }
//                else -> println("Xato")
//            }
//        }
//        "j"->{
//            when(k1){
//                0->{
//                    when(k2){
//                        0-> println("Shimol")
//                        1-> println("Janub")
//                        2 -> println("G`arb")
//                        else -> println("Xato")
//                    }
//                }
//                1->{
//                    when(k2)
//                    {
//                        0-> println("janub")
//                        1-> println("Shimol")
//                        2-> println("G`arb")
//                        else -> println("Xato")
//                    }
//                }
//                2->{
//                    when(k2)
//                    {
//                        0-> println("G`arb")
//                        1-> println("Sharq")
//                        2-> println("Janub")
//                        else -> println("Xato")
//                    }
//                }
//                else -> println("Xato")
//            }
//        }
//        "q"->{
//            when(k1){
//                0->{
//                    when(k2){
//                        0-> println("G`arb")
//                        1-> println("Sharq")
//                        2 -> println("Shimol")
//                        else -> println("Xato")
//                    }
//                }
//                1->{
//                    when(k2)
//                    {
//                        0-> println("Sharq")
//                        1-> println("G`arb")
//                        2-> println("Shimol")
//                        else -> println("Xato")
//                    }
//                }
//                2->{
//                    when(k2)
//                    {
//                        0-> println("Janub")
//                        1-> println("Shimol")
//                        2-> println("Sharq")
//                        else -> println("Xato")
//                    }
//                }
//                else -> println("Xato")
//            }
//        }
//        "g"->{
//            when(k1){
//                0->{
//                    when(k2){
//                        0-> println("Sharq")
//                        1-> println("G`arb")
//                        2 -> println("Shimol")
//                        else -> println("Xato")
//                    }
//                }
//                1->{
//                    when(k2)
//                    {
//                        0-> println("Sharq")
//                        1-> println("G`arb")
//                        2-> println("Janub")
//                        else -> println("Xato")
//                    }
//                }
//                2->{
//                    when(k2)
//                    {
//                        0-> println("Shimol")
//                        1-> println("Janub")
//                        2-> println("G`arb")
//                        else -> println("Xato")
//                    }
//                }
//                else -> println("Xato")
//            }
//        }
//        else -> println("Xato!!")
//    }

    //12-masala
//    val sp = readln().split(" ")
//    val a = sp[0].toInt()
//    val x = sp[1].toDouble()
//    when(a)
//    {
//        1->
//        {
//            println("Radius berildi!!\nD=%s\nL=%s\nS=%s".format(x*2,2*PI*x,PI*x*x))
//        }
//        2->
//        {
//            println("Diametr berildi!!\nR=%s\nL=%s\nS=%s".format(x/2,PI*x,PI*x*x/4))
//        }
//        3->{
//            println("Uzunlik berildi!!\nR=%s\nD=%s\nS=%s".format(x/(2*PI),x/ PI,PI*x/(2*PI)*x/(2*PI)))
//        }
//        4->{
//            println("Yuza berildi!!\nR=%s\nD=%s\nL=%s".format(sqrt(x/ PI),sqrt(x/ PI)*2,PI*sqrt(x/ PI)*2))
//        }
//    }
    //13-masala
//    val sp = readln().split(" ")
//    val n = sp[0].toInt()
//    val x = sp[1].toDouble()
//    when(n)
//    {
//        1->
//        {
//            val a = x
//            val c = x* sqrt(2.0)
//            val h = c/2
//            val s = h*c/2
//
//            println("Katet berildi!!\na=%s\nc=%s\nh=%s\ns=%s".format(a,c,h,s))
//        }
//        2->
//        {
//            val c = x
//            val a = c/ sqrt(2.0)
//            val h = c/2
//            val s = h*c/2
//            println("Gepotenuza berildi!!\na=%s\nc=%s\nh=%s\ns=%s".format(a,c,h,s))
//        }
//        3->{
//            val h = x
//            val c = x*2
//            val a = c/ sqrt(2.0)
//            val s = h*c/2
//            println("Halandlik berildi!!\na=%s\nc=%s\nh=%s\ns=%s".format(a,c,h,s))
//        }
//        4->{
//            val s = x
//            val c = sqrt(s)*4
//            val h = c/2
//            val a = c/ sqrt(2.0)
//
//            println("Yuza berildi!!\na=%s\nc=%s\nh=%s\ns=%s".format(a,c,h,s))
//        }
//    }
    //14-masala
//    val sp = readln().split(" ")
//    val n = sp[0].toInt()
//    val x = sp[1].toDouble()
//    when(n)
//    {
//        1->
//        {
//          val a = x
//          val r1 = a* sqrt(3.0)/6
//          val r2 = r1*2
//          val s = a*a* sqrt(3.0)/4
//            println("Tomoni berildi!!\na=%s\nr1=%s\nr2=%s\ns=%s".format(a,r1,r2,s))
//        }
//        2->
//        {
//            val r1 = x
//            val a = r1*6/ sqrt(3.0)
//            val r2 = r1*2
//            val s = a*a* sqrt(3.0)/4
//            println("Ichki chizilgan aylana radiusi berildi!!\na=%s\nr1=%s\nr2=%s\ns=%s".format(a,r1,r2,s))
//        }
//        3->{
//            val r2 = x
//            val r1 = r2/2
//            val a = r1*6/ sqrt(3.0)
//            val s = a*a* sqrt(3.0)/4
//            println("Tashqi chizilgan aylana radiusi berildi!!\na=%s\nr1=%s\nr2=%s\ns=%s".format(a,r1,r2,s))
//        }
//        4->{
//            val s = x
//            val a = sqrt(s)*4/ sqrt(3.0)
//            val r1 = a* sqrt(3.0)/6
//            val r2 = r1*2
//            println("Tashqi chizilgan aylana radiusi berildi!!\na=%s\nr1=%s\nr2=%s\ns=%s".format(a,r1,r2,s))
//        }

//    }
    //15-masala
//    val sp = readln().split(" ")
//    val n = sp[0].toInt()
//    val m = sp[1].toInt()
//    when (n){
//        6-> print("olti")
//        7-> print("yetti")
//        8-> print("sakiz")
//        9-> print("to`qqiz")
//        10-> print("O`n")
//        11-> print("Valet")
//        12-> print("Dama")
//        13-> print("Qirol")
//        14-> print("Tuz")
//    }
//    print(" ")
//    when(m){
//        1-> print("G`isht")
//        2-> print("Olma")
//        3-> print("Chillik")
//        4-> print("Qarg`a")
//    }
    //16-masala
//    val sp = readln().split(" ")
//    val age = sp[0].toInt()
//    val a = age/10
//    val b = age%10
//    when(a){
//        2-> print("Yigirma")
//        3-> print("O`ttiz")
//        4-> print("Qirq")
//        5-> print("Ellik")
//        6-> print("Oltmish")
//    }
//    print(" ")
//    when(b)
//    {
//        1-> print("Bir")
//        2-> print("ikki")
//        3-> print("uch")
//        4-> print("To`rt")
//        5-> print("Besh")
//        6-> print("Olti")
//        7-> print("Yetti")
//        8-> print("Sakkiz")
//        9-> print("To`qqiz")
//    }
//
//    println(" yosh")
    //17-masala

//    val sp = readln().split(" ")
//    val age = sp[0].toInt()
//    val a = age / 10
//    val b = age % 10
//    when (a) {
//        1-> print("O`n")
//        2 -> print("Yigirma")
//        3 -> print("O`ttiz")
//        4 -> print("Qirq")
//        5 -> print("Ellik")
//        6 -> print("Oltmish")
//    }
//    when (b) {
//        1 -> print(" Birta")
//        2 -> print(" ikkita")
//        3 -> print(" uchta")
//        4 -> print(" To`rtta")
//        5 -> print(" Beshta")
//        6 -> print(" Oltita")
//        7 -> print(" Yettita")
//        8 -> print(" Sakkizta")
//        9 -> print(" To`qqizta")
//        0-> print("ta")
//    }
//    print(" masala")
    //18-masala
//    val sp = readln().split(" ")
//    val n = sp[0].toInt()
//    val a = n / 100
//    val b = (n / 10) % 10
//    val c = n % 10
//    if (n == 100)
//        print("Yuz")
//    else {
//        when (a) {
//            1 -> print("Bir")
//            2 -> print("Ikki")
//            3 -> print("Uch")
//            4 -> print("To`rt")
//            5 -> print("Besh")
//            6 -> print("Olti")
//            7 -> print("Yetti")
//            8 -> print("Sakkiz")
//            9 -> print("To`qqiz")
//        }
//        print(" yuz ")
//        when (b) {
//            1 -> print("O`n")
//            2 -> print("Yigirma")
//            3 -> print("O`ttiz")
//            4 -> print("Qirq")
//            5 -> print("Ellik")
//            6 -> print("Oltmish")
//            7 -> print("Yetmish")
//            8 -> print("Sakkson")
//            9 -> print("To`qson")
//        }
//        when (c) {
//            1 -> print(" Bir")
//            2 -> print(" ikki")
//            3 -> print(" uch")
//            4 -> print(" To`rt")
//            5 -> print(" Besh")
//            6 -> print(" Olti")
//            7 -> print(" Yetti")
//            8 -> print(" Sakkiz")
//            9 -> print(" To`qqiz")
//        }
//    }
    //19-masala
//
//    val year = readln()
//    val end = year.last()
//    when {
//        end.equals('1') || end.equals('6') -> print("sariq ")
//        end.equals('2') || end.equals('7') -> print("oq ")
//        end.equals('3') || end.equals('8') -> print("qora ")
//        end.equals('4') || end.equals('9') -> print("yashil ")
//        end.equals('5') || end.equals('0') -> print("qizil ")
//    }
//    when(year.toInt()%12)
//    {
//        4-> print("sichqon")
//        5-> print("sigir")
//        6-> print("yo`lbars")
//        7-> print("quyon")
//        8-> print("ajdar")
//        9-> print("ilon")
//        10-> print("ot")
//        11-> print("qo`y")
//        0-> print("maymun")
//        1-> print("tovuq")
//        2-> print("it")
//        3-> print("to`ng`iz")
//    }
    //20-masala
//    val sp = readln().split("-")
//    val date1 = sp[0].split(".")
//    val date2 = sp[1].split(".")
//    val day1 = date1[0].toInt()
//    val month1 = date1[1].toInt()
//    val day2 = date2[0].toInt()
//    val month2 = date2[1].toInt()
//    when {
//        (month1 == 1 && month2 == 2) && (day1 >= 20 && day2 <= 18) -> print("Qovg`a")
//        (month1 == 2 && month2 == 3) && (day1 >= 19 && day2 <= 20) -> print("Baliq")
//        (month1 == 3 && month2 == 4) && (day1 >= 21 && day2 <= 19) -> print("Qo`y")
//        (month1 == 4 || month2 == 5) && (day1 >= 20 && day2 <= 20) -> print("Buzoq")
//        (month1 == 5 || month2 == 6) && (day1 >= 21 && day2 <= 21) -> print("Egizaklar")
//        (month1 == 6 || month2 == 7) && (day1 >= 22 && day2 <= 22) -> print("Qisqichbaqa")
//        (month1 == 7 || month2 == 8) && (day1 >= 23 && day2 <= 22) -> print("Arslon")
//        (month1 == 8 || month2 == 9) && (day1 >= 23 && day2 <= 22) -> print("Parizod")
//        (month1 == 9 || month2 == 10) && (day1 >= 23 && day2 <= 22) -> print("Tarozi")
//        (month1 == 10 || month2 == 11) && (day1 >= 23 && day2 <= 22) -> print("Chayon")
//        (month1 == 11 || month2 == 12) && (day1 >= 23 && day2 <= 21) -> print("O`qotar")
//        (month1 == 12 || month2 == 1) && (day1 >= 22 && day2 <= 19) -> print("Echki")
//        else -> print("Bunday burj oralig`i yo`q")
//    }


//    var a = readln().toInt()
//    var n = readln().toInt()
//    var pi = 3.14
//    when(n){
//        1->{
//            var r = a
//            var d = 2*r
//            var l = 2*pi*r
//            println(r)
//            println(d)
//            println(l)
//        }
//        2->{
//            var d = a
//            var r = d/2
//            var l = 2*pi*r
//            println(r)
//            println(d)
//            println(l)
//        }
//        3->{
//            var l = a
//            var r = l/(2*pi)
//            var d = 2*r
//            println(r)
//            println(d)
//            println(l)
//        }
//    }


    //20- masala
//    var d = readln().toInt()
//    var m = readln().toInt()
//    when{
//        (m == 1 || m==2) && (d>=20 || 18>=d)->{
//            print("Qovg`a burji")
//        }
//        (m==2 || m==3)&&(d>=19 ||20>=d)->{
//            print("Baliq burji")
//        }
//    }






    //1-mavzu Izohlar
    //

    /*

    */
    //2-mavzu chop etish operatorlari
//    println("Zomin")
//    print("tumani")
    //3-mavzu o`zgaruvchilar

    //4-mavzu matemetik funksiyalar
    //Math.sqrt()  ildiz
    //Math.abs()   modul

    //5-mavzu Mantiqiy tiplar
    //  mantiqiy amallar
    // qo`shish ||
    // ko`pytish &&
    // inkor  !
    //6-mavzu   shart operator
//    if (){
//
//    }else
//    {
//
//    }
    //7-mavzu tanlash operatorlar
//    var a = 4
//    when(a)
//    {
//        1->{
//
//        }
//
//
//    }



    var s = readLine()!!
    var a = s[s.lastIndex].toInt()

    println(a%2)









}