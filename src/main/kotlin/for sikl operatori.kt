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
//    var s =1.0
//    for (i in 1..n.toInt())
//        s+=(-1.0).pow(i.toDouble())*a.toDouble().pow(i.toDouble())
//        println(s)
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
// 29-masala
//    val (sp1, sp2, sp3) = readln().split(" ")
//    val n = sp1.toInt()
//    val a = sp2.toInt()
//    val b = sp3.toInt()
//    val ab = abs(b-a)
//    val step = ab/n
//    println(step)
//    for (i in a+step .. b step step)
//        println(i)
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

















}
