import java.lang.Integer.min
import kotlin.math.E
import kotlin.math.abs
import kotlin.math.sqrt

fun main() {
    //1-masala
//    val sp = readln().split(" ")
//    var a= sp[0].toInt()
//    var b= sp[1].toInt()
//    while (b>=a)
//    {
//        b-=a
//    }
//    println(b)
    //2-masala
//    val sp = readln().split(" ")
//    var a = sp[0].toInt()
//    var b = sp[1].toInt()
//    var s = 0
//    while (b >= a) {
//        s++
//        b -= a
//    }
//    println(s)
    //3-masala
//    val sp = readln().split(" ")
//
//
//    var n = sp[1].toInt()
//    var k = sp[0].toInt()
//    var s = 0
//    while (n >= k) {
//        s++
//        n -= k
//    }
//    println("Butun qismi = $s\nQoldiq qismi = $k")

    //4-masala

//    val n = readln().toInt()
//    if(n.toString().toInt() == 1)
//        println("Ha")
//    else
//    {
//        var s =3
//        while (s<n.toString().toInt())
//        {
//            s*=2
//        }
//        if(s==n.toString().toInt())
//            println("Ha")
//        else
//            println("Yoq")
//
//    }
    //5-masala

//    val n = readln().toInt()
//    if (n.toString().toInt() == 1)
//        println("0")
//    else {
//        var s = 2
//        var k = 1
//        while (s < n.toString().toInt()) {
//            s *= 2
//            k++
//
//        }
//        println("$k darajadagi")
//    }
    //6-masala
//
//    var n = readln().toInt()
//    var s= n
//    if(n%2==0)
//    {
//        while (n>2)
//        {
//            s*=(n-2)
//            n-=2
//        }
//
//
//    }
//    else
//    {
//        while (n>1)
//        {
//            s*=(n-2)
//            n-=2
//        }
//    }
//    println(s)

    //7-masala
//    val n =readln().toInt()
//    var k=1
//    while (k*k <=n )
//    {
//        k++
//    }
//    println(k)
    //  println(sqrt(readln().toDouble()).toInt()+1)
    //8-masala
    //  println(sqrt(readln().toDouble()).toInt())
    //9-masala
//    val n  = readln().toInt()
//    var k=1
//    var s=3
//    while (s<=n){
//        s*=3
//        k++
//    }
//    println(k)
    //10-masala
//        val n  = readln().toInt()
//    var k=0
//    var s=3
//    while ((s<=n)){
//        s*=3
//        k++
//    }
//    println(k)
    //11-masala
//    val n = readln().toInt()
//    var k = 0
//    var sum=0
//    while (sum<n)
//    {
//        k++
//        sum+=k
//    }
//
//    println(k)
    //12-masala
//        val n = readln().toInt()
//    var k = 0
//    var sum=0
//    while (sum<n)
//    {
//        k++
//        sum+=k
//    }
//
//    if(sum==n)
//        println(k)
//    else
//        println(k-1)
    //13-masala

//    val n = readln().toInt()
//    var k = 0.0
//    var sum=0.0
//    while (sum<n)
//    {
//        k++
//        sum+=1/k
//    }
//    println(k)
//14-masala
//    val n = readln().toDouble()
//    var k = 0.0
//    var sum = 0.0
//    while (sum < n) {
//        k++
//        sum += 1 / k
//    }
//
//    if (sum == n)
//        println(k)
//    else
//        println(k - 1)
    //15-masala
//    val (s1, p1) = readln().split(' ')
//    var s = s1.toDouble()
//    val p = p1.toDouble()
//    var k = 0
//    while (s<s1.toDouble()*2)
//    {
//        s+=s*p/100
//        k++
//    }
//    println("Oy = $k\nSuma = $s")

    //16-masala
//    val p = readln().toDouble()
//    var sum =0.0
//    var s = 10.0
//    var  k =0
//    while (sum<200.0)
//    {
//        sum+=s
//        println(sum)
//        s+=s*p/100
//        println(s)
//        k++
//    }
//    println("Oy $k\n$sum")

    //17-masala
//    val sp = readln().split(' ')
//    var n = sp[0].toInt()
//    var m = sp[1].toInt()
//    var k = 0
//    var q = 0
//    while (n >= m) {
//        n -= m
//        k++
//    }
//    println("Butun qismi = $k\nQoldiq qismi = ${n}")
    //18-masala
//    println(readln().reversed())
    //19-masala
//    val s = readln()
//    var sum =0
//    var k =0
//    s.forEach {
//        k++
//        sum+=it.toString().toInt()
//    }
//    println("Yig`indi = $sum\nRaqamlar soni = $k")
    //20-masala
    //  println(readln().contains('2'))
    //21-masala
//   readln().forEach {
//      if(it.toString().toInt()%2==1)
//      {
//          println(true)
//
//      }
//  }
//22-masala
//    val n = readln().toInt()
//    var s = 0
//    for(i in 2..sqrt(n.toDouble()).toInt())
//    {
//        if(n%i==0)
//        {
//            s++
//            break
//
//        }
//    }
//    if(s==0){
//        println("Tup son")
//    }
//    else
//        println("Tup emas")
    //23-masala
//    val sp = readln().split(' ')
//    val a = sp[0].toInt()
//    val b = sp[1].toInt()
//    val min = min(a,b)
//    var ekub = 1
//    for(i in 1..min)
//    {
//        if(a%i==0 && b%i==0)
//            ekub = i
//    }
//    println(ekub)
    //24-masala
//    val n = readln().toInt()
//    var a =0
//    var b =1
//    var s =0
//        while (s<n) {
//            s = a + b
//            a = b
//            b = s
//        }
//    if(s==n)
//        println("Yes")
//    else
//        println("No")
    //25-masala
//    val n = readln().toInt()
//    var f1=0
//    var f2=1
//    var f3=0
//    while (!(f3>n))
//    {
//        f3 = f1+f2
//        f1=f2
//        f2=f3
//    }
//    println(f3)
    //26-masala
//    val n = readln().toInt()
//    var f1 = 0
//    var f2 = 1
//    var f3 = 0
//    while (!(n==f3))
//    {
//        f3 = f1+f2
//        f1=f2
//        f2=f3
//    }
//    println("$f1\n$f3\n${f1+f2}")
    //27-masala
//    val n = readln().toInt()
//    var f1 = 0
//    var f2 = 1
//    var f3 = 0
//    var k =2
//    when
//    {
//        n==1-> k=2
//            else-> {
//                while (!(n == f3)) {
//                    f3 = f2 + f1
//                    f1 = f2
//                    f2 = f3
//                    k++
//                }
//            }
//    }
//    println(k)


////30-masala
//    val sp = readln().split(' ')
//    var a = sp[0].toInt()
//    var b = sp[1].toInt()
//    var c = sp[2].toInt()
//    if(a>=c && b>=c)
//    {
//        println((a-c+1)*(b-c+1))
//    }else
//        println("Bunday kvadrat sig`maydi")



//[28,29]







  Long










}
