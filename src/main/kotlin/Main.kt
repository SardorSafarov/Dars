import kotlin.math.*

fun main(args: Array<String>) {

    //1-masala
//    var a= readln().toInt()
//    println("P=".plus(a*4))
    //2-masala
//    var a= readln().toInt()
//    println("S=".plus(String.format("%.0f  ga teng",Math.pow(a*1.0,2.0))))
    //3-masala
//    var a = readln().toInt()
//    var b = readln().toInt()
//    println(String.format("S=%s ga teng P=%s ga teng",a*b,2*(a+b)))
    //4-masala
//    val d = readln().toDouble()
//    val pi = 3.14
//    println(String.format("L=%.2f",d*pi))
    //5-masala
//    var a = readln().toInt()
//    println(String.format("V=%.0f ga teng S=%s ga teng",Math.pow(a.toDouble(),3.0),6*a*a))

    //6-masala
//    var a= readln().toInt()
//    var b= readln().toInt()
//    var c= readln().toInt()
//    println(String.format("V=%s ga teng  S=%s",a*b*c,2*(a*b+a*c+b*c)))
    //7-masala
//    var r= readln().toDouble()
//    var s= String.format("L=%s ga teng S=%s ga teng",2* PI*r, PI*r*r)
//    println(s)
    //8-masala
//    var split = readln().split(" ")
//    var a = split[0].toInt()
//    var b = split[1].toDouble()
//    var s= String.format("O`rta arifmetigi %s ga teng",(a+b)/2)
//    println(s)
    //9-masala
//    var split = readln().split(" ")
//    var a = split[0].toDouble()
//    var b= split[1].toDouble()
//    println(String.format("%s va %s sonlaingning o`rta geometrigi %.1f ga teng",a,b,sqrt(a*b)))
    //10-masala
//    var sp = readln().split(" ")
//    var a = sp[0].toInt()
//    var b = sp[1].toInt()
//    println(String.format("Yig`indisi = %s \nKo`paytmasi = %s \na ning kvadrati = %s  \nb ning kvadrati = %s",a+b,a*b,a*a,b*b))
    //11-masala
//    var sp = readln().split(" ")
//    var a = sp[0].toDouble()
//    var b = sp[1].toDouble()
//    println(String.format("Yig`indisi = %s\nKo`paytmasi = %s\na ning moduli %s\n b ning moduli %s",a+b,a*b, abs(a), abs(b)))
    //12-masala
//    var sp = readln().split(" ")
//    var a = sp.get(0).toDouble()
//    var b = sp.get(1).toDouble()
//    var c = hypot(a,b)
//    println(String.format("Uchburchakning  p = %s",a+b+c))
    //13-masala
//    var sp = readln().split(" ")
//    var r1 = sp[0].toDouble()
//    var r2 = sp[1].toDouble()
//    var s1 = PI*r1*r1
//    var s2 = PI*r2*r2
//    println("Yuzalar ayirmasi  = ${s2-s1}")
    //14-masala
//    var sp = readln().split(" ")
//    var l =sp[0].toDouble()
//    var r= l/(2* PI)
//    var s = r*r* PI
//    println(String.format("Radius  = %s\nYuzasi = %s",r,s))
    //15-masala
//    var sp = readln().split(" ")
//    var s= sp[0].toDouble()
//    var r= sqrt(s/ PI)
//    println("Radius = $r\nDiametr = ${2*r}")
//    println(String.format("Radius =%.2f\nDiametr = %.2f",r,2*r))
    //16-masala
//    var sp = readln().split(" ")
//    var a= sp.get(0).toDouble()
//    var b= sp.get(1).toDouble()
//    println(abs(b-a))
    //17-masala
//    var sp = readln().split(" ")
//    var a= sp[0].toDouble()
//    var b= sp[1].toDouble()
//    var c= sp[2].toDouble()
//    println(String.format("AC=%s ga teng\nBC=%s\nYugindis=%s",abs(c-a), abs(c-b),abs(c-a)+abs(c-b)))
    //18-masala
//    var sp = readln().split(" ")
//    var a= sp[0].toInt()
//    var b= sp[1].toInt()
//    var c= sp[2].toInt()
//    println(String.format("AC=%s\nBC=%s\nYig`indisi=%s", abs(c-a), abs(b-c), abs(c-a)+ abs(b-c)))
    //19-masala
//
//    var sp = readln().split(" ")
//    val x1= sp[0].toDouble()
//    val y1= sp[1].toDouble()
//    val x2= sp[2].toDouble()
//    val y2= sp[3].toDouble()
//    val a= abs(x2-x1)
//    val b= abs(y2-y1)
//    println("Yuzasi = ${a*b}\nPeremetri = ${2*(a+b)}")
    //20-masala
//    val sp  = readln().split(" ")
//    val x1  = sp[0].toDouble()
//    val y1  = sp[1].toDouble()
//    val x2  = sp[2].toDouble()
//    val y2  = sp[3].toDouble()
//    println("Ikki nuqta o`rtasidagi masofa  = ${hypot(x2-x1,y2-y1)}")
//
    //21-masala
//    val sp = readln().split(" ")
//    val x1 = sp[0].toDouble()
//    val y1 = sp[1].toDouble()
//    val x2 = sp[2].toDouble()
//    val y2 = sp[3].toDouble()
//    val x3 = sp[4].toDouble()
//    val y3 = sp[5].toDouble()
//    var a = hypot(x2-x1,y2-y1)
//    var b = hypot(x3-x2,y3-y2)
//    var c = hypot(x3-x1,y3-y1)
//    var p =(a+b+c)/2
//    println("Yuzasi = ${sqrt(p*(p-a)*(p-b)*(p-c))}\nPeremetri = $p")

    //22-masala
//    val sp = readln().split(" ")
//    var a = sp[0].toInt()
//    var b = sp[1].toInt()
//    a = a + b
//    b = a - b
//    a = a - b
//    println("a=$a\nb=$b")
    //23-masala
//    val sp = readln().split(" ")
//    var a = sp[0].toDouble()
//    var b = sp[1].toDouble()
//    var c = sp[2].toDouble()
//    var x = a
//    var y = b
//    var z = c
//    a = z
//    b = x
//    c = y
//    println("a=$a\nb=$b\nc=$c")
    //24-masala
//    val sp = readLine()!!.split(" ")
//    var a = sp[0].toInt()
//    var b = sp[1].toInt()
//    var c = sp[2].toInt()
//    var x = a
//    var y = b
//    var z = c
//    c = x
//    b = z
//    a = y
//    println("a=$a\nb=$b\nc=$c")
    //25-masala
//    val sp= readln().split(" ")
//    val x= sp[0].toDouble()
//    println("y=${3*x.pow(5)-6*x.pow(2)-7}")
    //26-masala
//    val sp = readln().split(" ")
//    val x = sp[0].toDouble()
//    println("y=${4*(x-3).pow(6)-7*(x-3).pow(3)+2}")
    //27-masala
//    val a= readln().toDouble()
//    println("${a*a}  ${a.pow(4)}  ${a.pow(8)}")
    //28-masala
//    var a = readln().toDouble()
//    println("${a*a}  ${a*a*a}  ${a.pow(5)}  ${a.pow(10)}  ${a.pow(15)}")
    //29-masala
//    var gradus = readLine()!!.toDouble()
//    println("radian = ${gradus/180}*pi")
    //30-masala
//    var radian = readln().toDouble()
//    println("gradus = ${radian*180/ 3.14}")
    //31-masala
//    var ts= readln().toDouble()
//    println("selse =${(ts)*9/5+32}")
    //33-masala
//    val sp = readln().split(" ")
//    val x = sp[0].toDouble()
//    val a = sp[1].toDouble()
//    println("1 kg ->${a} so`m\n$x kg ${x*a} so`m ")

    //34-masala
//    val shokalatsp = readln().split(" ")
//    val konfetsp = readln().split(" ")
//    println(shokalatsp[1].toDouble()/shokalatsp[0].toDouble() - konfetsp[1].toDouble()/konfetsp[0].toDouble())
    //35-masala
    // s=v*t
//    println("Tezliklarni kirtng!!")
//    val tezliksp = readln().split(" ")
//    println("Vaqtlarni kiriting!!")
//    val timeSp = readln().split(" ")
//    val qayiqTezligi = tezliksp[0].toDouble()
//    val suvTezligi = tezliksp[1].toDouble()
//    val vaqt1 = timeSp[0].toDouble()
//    val vaqt2 = timeSp[1].toDouble()
//    print("Qayiq bosib o`tgan yo`l = ${(qayiqTezligi+suvTezligi)*vaqt1+(qayiqTezligi-suvTezligi)*vaqt2}")
    //36-masala
//    println("Mashinalar tezliklarini kiriting!!")
//    val tsp = readln().split(" ")
//    val v1= tsp[0].toDouble()
//    val v2= tsp[1].toDouble()
//    println("Vaqtni kiriting!!!")
//    var t = readln().toDouble()
//    println("Masofani kiriting!!!")
//    var s = readln().toDouble()
//    println("Ular orasidagi masofa ${s+(v1+v2)*t}")
    //37-masala
//    println("mashinalar tezliklarni kiriting!!!")
//    val sp = readln().split(" ")
//    val v1 = sp[0].toInt()
//    val v2 = sp[1].toInt()
//    println("Vaqtni kiriting!!!")
//    val t = readln().toInt()
//    println("Masofani  kiriting!!!")
//    val s = readln().toInt()
//    println("Ular orasidagi masofa ${s-(v1+v2)*t}")
    //38-masala
//    println("Koeffisentlarini kiriting!!")
//    val sp = readln().split(" ")
//    val a = sp[0].toDouble()
//    val b = sp[1].toDouble()
//    println("x = ".plus(-b/a))
    //39-masala
//    println("Koefisentlarini kiriting!!!")
//    val sp = readln().split(" ")
//    val a = sp[0].toDouble()
//    val b = sp[1].toDouble()
//    val c = sp[2].toDouble()
//    val d = b.pow(2) - 4 * a * c
//    val x1 = (-b + sqrt(d))/(2*a)
//    val x2 = (-b - sqrt(d))/(2*a)
//    println("x1 = $x1\nx2 = $x2")
    //40-masala
//    println("Birinchi tenglama koeffisetlarnini kiriting!!!")
//    val sp1 = readln().split(" ")
//    val a1 = sp1[0].toDouble()
//    val b1 = sp1[1].toDouble()
//    val c1 = sp1[2].toDouble()
//    println("Ikkinchi tenglama koeffisetlarnini kiriting!!!")
//    val sp2 = readln().split(" ")
//    val a2 = sp2[0].toDouble()
//    val b2 = sp2[1].toDouble()
//    val c2 = sp2[2].toDouble()
//    val d = a1*b2 - a2*b1
//    val x = (c1*b2 - c2*b1)/d
//    val y = (a1*c2 - a2*c1)/d
//    println("x = $x\ny = $y")

}

