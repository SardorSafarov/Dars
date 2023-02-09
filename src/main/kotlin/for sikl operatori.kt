import kotlin.math.abs
import kotlin.math.pow

fun main() {

    //1-masala
//    val sp = readln().split(" ")
//    val k = sp[0].toInt()
//    val n = sp[1].toInt()
//    for (i in 1..n)
//        println(k)
    //2-masala
//    val sp = readln().split(" ")
//    val a = sp[0].toInt()
//    val b = sp[1].toInt()
//    for (i in a .. b)
//        println(i)
    //3-masala
//    val sp = readln().split(" ")
//    val a = sp[0].toInt()
//    val b = sp[1].toInt()
//    for (i in (b-1) downTo  (a+1))
//        print("$i ")
    //4-masala
//    val pirce = readln().toInt()
//    for (i in 1..10)
//        println("$i kg konfetni narxi="+pirce*i)
    //5-masala
//    val price = readln().toDouble()
//    for (i in 1..10)
//        println("%.1f kg konfet narxi = %s".format(i/10.0,i*price/10.0))
    //6-masala
//    val price = readln().toDouble()
//    for(i in 12..20)
//        println("%s kg konfet narxi = %.1f so`m".format(i/10.0,price*i/10))
    //7-masala
//    val sp = readln().split(" ")
//    val a = sp[0].toInt()
//    val b = sp[1].toInt()
//    var sum = 0
//    for (i in a+1 until b)
//        sum+=i
//    println(sum)

    //8-masala

//    val sp = readln().split(" ")
//    val a = sp[0].toInt()
//    val b = sp[1].toInt()
//    var sum = 0
//    for (i in a+1 until b)
//        sum*=i
//    println(sum)
    //9-masala
//    val sp = readln().split(" ")
//    val a = sp[0].toInt()
//    val b = sp[1].toInt()
//    var sum = 0
//    for (i in a+1 until b)
//        sum+=i*i
//    println(sum)
    //10-masala
//    val n = readln().toInt()
//    var sum = 0.0
//    for (i in 1..n)
//        sum += 1 / i.toDouble()
//    println(sum)
    //11-masala
//    val n = readln().toInt()
//    var sum =0
//    for (i in n .. 2*n)
//     sum+=i*i
//    println(sum)
    //12-masala
//    val n = readln().toInt()
//    var sum = 1.0
//   for (i in 1..n)
//       sum*=(1+i/10.0)
//    println(sum)
    //13-masala
//    val n = readln().toInt()
//        var sum = 0.0
//        var a =1
//        for (i in 1 .. n){
//            println((a * (1 + i / 10.0)))
//            sum+=(a * (1 + i / 10.0))
//
//            a*=-1
//        }
//
//        println(sum)
    //14-masala
//    val n = readln().toInt()
//    var sum = 0
//    for (i in 1..n)
//        sum+=(2*i-1)
//    println(sum)

    //15-masala
//
//    val (a,n) = readln().split(" ")
//    var s = 1
//    for(i in 1..n.toInt())
//        s*=a.toInt()
//        println(s)

    //16-masala
//    val (a,n) = readln().split(" ")
//    var s = 1
//    for (i in 1..n.toInt())
//    {
//        s*=a.toInt()
//        println(s)
//    }
    //17-masala
//    val (a,n) = readln().split(" ")
//    var s= 0.0
//    for (i in 0..n.toInt())
//        s += a.toDouble().pow(i.toDouble())
//    println("%.0f".format(s))
    //18-masala


//    val (a,n) = readln().split(" ")
//    var s = 1
//    var sum =1.0
//    for(i in 1..n.toInt())
//    {
//        s*=-1*a.toInt()
//        sum+=s
//    }
//    println(sum)


    //19-masala
//    val n = readln().toInt()
//    var s = 1
//    for (i in 1..n)
//        s*=i
//    println(s)

    //20-masala

//    val n = readln().toInt()
//    var s = 1
//    var sum =0
//    for (i in 1..n)
//    {
//        s*=i
//        sum+=s
//
//    }
//    println(sum)

    //21-masala
//    val n = readln().toInt()
//    var s = 1.0
//    var sum =0.0
//    for (i in 1..n)
//    {
//        s*=i
//        sum+=1/s
//
//    }
//    println(sum)

    //22-masala
//    val sp = readln().split(" ")
//    val x = sp[0].toInt()
//    val n = sp[1].toInt()
//    var s= 0.0
//    var xx = 1
//    var f = 1
//    for (i in 1..n)
//    {
//        f*=i
//        xx*=x
//        s+=xx/f*1.0
//    }
//
//    println(s+1)
    // 23-masala
//
//    var n = readln().toInt()
//    var x = readln().toInt()
//    var f = 1
//    var xn = 1
//    var sum = 0.0
//    var s = 1.0
//    for (i in 1..(2*n+1))
//    {
//        f*=i
//        xn*=x
//        if (i%2==1)
//        {
//            s*=xn/f.toDouble()
//            sum+=s
//            if (s>0){
//                s=-1.0
//            }else
//            {
//                s=1.0
//            }
//        }
//
//    }
//    println(sum)
//  24 -masala

    // var n = readln().toInt()
//    var x = readln().toInt()
//    var f = 1
//    var xn = 1
//    var sum = 1.0
//    var s = -1.0
//    for (i in 1..(2*n+1))
//    {
//        f*=i
//        xn*=x
//        if (i%2==0)
//        {
//            s*=xn/f.toDouble()
//            sum+=s
//            if (s>0){
//                s=-1.0
//            }else
//            {
//                s=1.0
//            }
//        }
//
//    }
//    println(sum)

    //25-masala
//    var x = readln().toDouble()
//    var n = readln().toDouble()
//    var xn = 1.0
//    var sum = 0.0
//    for (i in 1..n.toInt()){
//        xn*=x
//        sum+=xn/i
//        xn*=-1
//    }
//    println(sum)



    //26-masala
//    var n = readln().toInt()
//    var x = readln().toDouble()
//    var xn = 1.0
//    var sum= 0.0
//    for (i in 1..2*n+1)
//    {
//        xn*=x
//        if (i%2==1)
//        {
//            sum+=xn/i
//            xn*=-1
//        }
//    }

    //27-masala


//    var x = readln().toDouble()
//    var n = readln().toInt()
//    var summ = 0.0
//    var xn = 1.0
//    var s = 1.0
//    var m = 1.0
//    for (i in 1..2 * n + 1) {
//        xn *= x
//        if (i % 2 == 1) {
//            s *= i
//            m*=i
//            summ += xn * s / m
//            m/=i
//        } else {
//            m *= i
//        }
//        println(summ)
//    }


// 29-masala
//    val (sp1, sp2, sp3) = readln().split(" ")
//    val n = sp1.toInt()
//    val a = sp2.toInt()
//    val b = sp3.toInt()
//    val ab = abs(b-a)
//    val step = ab/n
//    println("Qadam ${step}")
//    for (i in a+step .. b step step)
//        println(i)
    // 30-masala
//    val (sp1, sp2, sp3) = readln().split(" ")
//    val n = sp1.toInt()
//    val a = sp2.toInt()
//    val b = sp3.toInt()
//    val ab = abs(b-a)
//    val step = ab/n
//    println(step)
//    for (i in a+step .. b step step)
//        println(1-Math.sin(i*1.0))

    //31-masala
    var n = readln().toInt()
    var a = 2.0
    for (i in 1..n){
        a = 2+1/a
        println(a)
    }
// 32-masala
//    var n = readln().toInt()
//    var a = 2.0
//    for (i in 1..n){
//        a = (a+1)/i
//        println(a)
//    }

//     33-masala
//    var n = readln().toInt()
//    var a1 =1
//    var a2 =0
//    var a3 =0
//    for (i in 1..n)
//    {
//        a3 = a1+a2
//        a1 = a2
//        a2 = a3
//        println(a3)
//    }
    //36-masala
//    val sp = readln().split(" ")
//    val n = sp[0].toInt()
//    val k = sp[1].toInt()
//    var sum= 1
//    var s=0
//    for (i in  2..n)
//    {
//        s=i
//        for (j in 1 until k)
//            s*=s
//        sum+=s
//    }
//    println(sum)
    //37-masala
//    val sp = readln().split(" ")
//    val n = sp[0].toInt()
//    var sum = 1.0
//    for (i in 2..n) {
//        sum += i.toDouble().pow(i)
//    }
//    println(sum)
    //38-masala

    //39-masala
//    val sp = readln().split(" ")
//    val a = sp[0].toInt()
//    val b = sp[1].toInt()
//    for(i in a..b) {
//        for (j in 1..i)
//            print("$i ")
//    println()
//    }
    //40-masala
//        val sp = readln().split(" ")
//    val a = sp[0].toInt()
//    val b = sp[1].toInt()
//
//    for(i in a until  b) {
//        for (j in 1..(i-a))
//            print("$i ")
//    println()
//    }

//    var d = readln().toInt()
//    var m = readln().toInt()
//    when {
//        m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12 -> {
//            var d1 = d / 10
//            var d2 = d % 10
//            when (d1) {
//                1 -> {
//                    print("O`n")
//                }
//                2 -> {
//                    print("Yigirma")
//                }
//                3 -> {
//                    print("O`ttiz")
//                }
//            }
//            when (d2) {
//                1 -> {
//                    print("birinchi")
//                }
//                2 -> {
//                    print("ikkinchi")
//                }
//                3 -> {
//                    print("uchinchi")
//                }
//                4 -> {
//                    print("to`rtinchi")
//                }
//                5 -> {
//                    print("beshinchi")
//                }
//                6 -> {
//                    print("oltinchi")
//                }
//                7 -> {
//                    print("yettinchi")
//                }
//                8 -> {
//                    print("sakkizinchi")
//                }
//                9 -> {
//                    print("to`qizinchi")
//                }
//            }
//
//
//        }
//        m == 4 || m == 6 || m == 9 || m == 11 -> {
//
//        }
//        m == 2 -> {
//
//        }
//        else -> {
//            println("Noto`g`ri oy kiritildi!!")
//        }
//    }
//    when (m) {
//        1 -> {
//            print("Yanvar")
//        }
//        2 -> {
//            print("Fevral")
//        }
//        3 -> {
//            print("Matr")
//        }
//        4 -> {
//            print("Aprel")
//        }
//        5 -> {
//            print("May")
//        }
//        7 -> {
//            print("Iyunn")
//        }
//        8 -> {
//            print("Avgust")
//        }
//        9 -> {
//            print("Sentabr")
//        }
//
//    }
//
//
//    var a = 1
//    var b = 2
//    var c = 3
//    if (b > a && c > a) {
//        print("Kichigi $a")
//        if (b > c) {
//            print("Kattasi $b")
//        } else {
//            print("Kattasi $c")
//        }
//    }
//    if (a > b && c > b) {
//        print("Kichigi $b")
//        if (a > c) {
//            print("Kattasi $a")
//        } else {
//            print("Kattasi $c")
//        }
//    }
//    if (b > c && a > c) {
//        print("Kichigi $c")
//        if (a > b) {
//            print("Kattasi $a")
//        } else {
//            print("Kattasi $b")
//        }
//    }
//
//
//
//    var y = readln()
//    var k = readln().toInt()
//    when (y) {
//        "s" -> {
//            when (k) {
//                0 -> {
//                    print("Shimol")
//                }
//                1 -> {
//                    print("Sharq")
//                }
//                2 -> {
//                    print("Garb")
//                }
//                else -> {
//                    print("Xato kamanda berildi!!")
//                }
//            }
//        }
//        "j" -> {
//            when (k) {
//                0 -> {
//                    print("Janub")
//                }
//                1 -> {
//                    print("Sharq")
//                }
//                2 -> {
//                    print("G`arb")
//                }
//                else -> {
//                    print("Xato kamanda berildi!!")
//                }
//            }
//        }
//        "q" -> {
//
//        }
//        "g" -> {
//
//        }
//
//    }
//
//
//    var a = readln().toInt() //1
//    var b = readln().toInt() //2
//    var c = readln().toInt() //3
//    var d = readln().toInt() //4
//    if (b == c && b == d && b != a) {
//        print(1)
//    } else
//        if (a == c && a == d && a != b) {
//            print(2)
//        } else
//            if (a == b && a == d && a != c) {
//                print(3)
//            } else if (a == b && a == c && a != d) {
//                print(4)
//            }

//
//   var a = readln().toInt()
//   var b = readln().toInt()
//   var c = readln().toInt()
//   var musbatSonlar = 0
//    if (a>0){
//        musbatSonlar=musbatSonlar+1
//    }
//    if (b>0){
//        musbatSonlar=musbatSonlar+1
//    }
//    if (c>0){
//        musbatSonlar=musbatSonlar+1
//    }
//    println("Musbatsonlar soni ${musbatSonlar}")
//        Int
}