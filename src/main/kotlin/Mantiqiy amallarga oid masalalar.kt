import kotlin.math.hypot

fun main() {
    //1-masala
//    val a= readln().toInt()
//    println(a>0)
    //2-masala
    //  val a = readln().toInt()
//    println(a%2==1)
    //3-masala
//    val a = readln().toInt()
//    println(a%2==0)
    //4-masala
//    val sp = readln().split(" ")
//    val a= sp[0].toInt()
//    val b= sp[1].toInt()
//    println(a>2 && b<=3)
    //5-masala
//    val sp = readln().split(" ")
//    val a = sp[0].toInt()
//    val b = sp[1].toInt()
//    println(a >= 0 && b < -2)
    //6-masala
//    val sp = readln().split(" ")
//    val a= sp[0].toInt()
//    val b= sp[1].toInt()
//    val c= sp[2].toInt()
//    println(a<=b && b<=c)
    //7-masala
//        val sp = readln().split(" ")
//    val a= sp[0].toInt()
//    val b= sp[1].toInt()
//    val c= sp[2].toInt()
//    println(a<b && b<c)
    //8-masala
//    val sp = readln().split(" ")
//    val a = sp[0].toInt()
//    val b = sp[1].toInt()
//    println(a%2==1 && b%2==1)
    //9-masala
//    val sp = readln().split(" ")
//
//    val a = sp[0].toInt()
//    val b = sp[1].toInt()
//    println(a%2==1 || b%2==1)
    //10-masala
//    val sp = readln().split(" ")
//    val a= sp[0].toInt()
//    val b= sp[1].toInt()
//    println((a%2==1 && b%2==0) || (a%2==0 && b%2==1))
    //11-masala
//    val sp = readln().split(" ")
//    val a= sp[0].toInt()
//    val b= sp[1].toInt()
//    println((a%2==0 && b%2==0) || (a%2==1 && b%2==1))
    //12-masala
//    val sp = readln().split(" ")
//    val a = sp[0].toInt()
//    val b = sp[1].toInt()
//    val c = sp[2].toInt()
//    println(a>0 && b>0 && c>0)
    //13-masala
//    val sp = readln().split(" ")
//    val a = sp[0].toInt()
//    val b = sp[1].toInt()
//    val c = sp[2].toInt()
//    println(a > 0 || b > 0 || c > 0)
    //14-masala
//    val sp = readln().split(" ")
//    val a = sp[0].toInt()
//    val b = sp[1].toInt()
//    val c = sp[2].toInt()
//    println((a>0 && b<0 && c<0) || (a<0 && b>0 && c<0) || (a<0 && b<0 && c>0))
    //15-masala
//    val sp = readln().split(" ")
//    val a =sp[0].toInt()
//    val b =sp[1].toInt()
//    val c =sp[2].toInt()
//    println((a>0 && b>0 && c<0) ||(a>0 && b<0 && c>0) ||(a<0 && b>0 && c>0) )

    //16-masala
//    val a = readln().toInt()
//    println(a%2==0 && a.toString().length==2)

    //17-masala
//    val a = readln().toInt()
//    println(a%2==0 && a.toString().length==3)
    //18-masala
//    val sp = readln().split(" ")
//    val a = sp[0].toInt()
//    val b = sp[1].toInt()
//    val c = sp[2].toInt()
//    println((a==1 && a==b) || (b==1 && b==c) || (c==1 && c==a))
    //19-masala
//    val sp = readln().split(" ")
//    val a= sp[0].toInt()
//    val b= sp[1].toInt()
//    val c= sp[2].toInt()
//    println((a*-1==b) || (b*-1==c) || (c*-1==a))
    //20-masala
//    val a = readln()
//    println(a[0] != a[1] && a[1] != a[2] && a[0] != a[2])
    //21-masala
//    val a = readln()
//    val x = a[0].toIntt()
//    val y = a[1].toIntt()
//    val z = a[2].toIntt()
//    println(x<y && y<z)
    //22-masala
//    val a = readln()
//    val x = a[0].toIntt()
//    val y = a[1].toIntt()
//    val z = a[2].toIntt()
//    println((x<y && y<z)||(x>y && y>z))
    //23-masala
//    val a = readln()
//    println(a.toInt()==a.reversed().toInt())
    //24-masala
//    val sp = readln().split(" ")
//    val a = sp[0].toDouble()
//    val b = sp[1].toDouble()
//    val c = sp[2].toDouble()
//    val d = b*b-4*a*c
//    println("%s*x^2+%s*x+%s=0 tenglamani haqiqiy ildizga ega %s".format(a,b,c,d>=0))
    //25-masala1
//    val sp = readln().split(" ")
//    val x = sp[0].toInt()
//    val y = sp[1].toInt()
//    println(x<0 && y>0)
    //26-masala
//    val sp = readln().split(" ")
//    val x = sp[0].toInt()
//    val y = sp[1].toInt()
//    println(x>0 && y<0)
    //27-masala
//    val sp = readln().split(" ")
//    val x= sp[0].toInt()
//    val y= sp[1].toInt()
//    println((x<0 && y>0)||(x<0 && y<0))
    //28-masala
//    val sp  = readln().split(" ")
//    val x= sp[0].toInt()
//    val y= sp[1].toInt()
// println((x>0 && y>0) || (x<0 && y<0))
    //29-masala
//    val sp = readln().split(" ")
//    val x = sp[0].toInt()
//    val y = sp[1].toInt()
//    val x1 = sp[2].toInt()
//    val y1 = sp[3].toInt()
//    val x2 = sp[4].toInt()
//    val y2 = sp[5].toInt()
//    println((x1<x && x<x2) && (y2<y && y<y1))
    //30 - masala
//    val sp = readln().split(" ")
//    val a = sp[0].toInt()
//    val b = sp[1].toInt()
//    val c = sp[2].toInt()
//    println(a.equals(b) && b.equals(c) && c.equals(a))
    //31-masala
//    val sp = readln().split(" ")
//    val a = sp[0].toInt()
//    val b = sp[1].toInt()
//    val c = sp[2].toInt()
//    println(a.equals(b) || b.equals(c) || c.equals(a))
    //32-masala
//    val sp = readln().split(" ")
//    val a= sp[0].toDouble()
//    val b= sp[1].toDouble()
//    val c= sp[2].toDouble()
//    println(c== hypot(a,b))
   //33-masala
//    val sp = readln().split(" ")
//    val a= sp[0].toInt()
//    val b= sp[1].toInt()
//    val c= sp[2].toInt()
//    println(a.plus(b)>c && b.plus(a)>c && c.plus(b)>a)
    //34-masal
//    val sp = readln().split(" ")
//    val x= sp[0].toInt()
//    val y= sp[1].toInt()
//    println(x.plus(y)%2==1)
    //35-masala
//    val sp = readln().split(" ")
//    val x1 = sp[0].toInt()
//    val y1 = sp[0].toInt()
//    val x2 = sp[0].toInt()
//    val y2 = sp[0].toInt()
//    println((x1.plus(y1)%2 ==1 && x2.plus(y2)%2==1)||(x1.plus(y1)%2 ==0 && x2.plus(y2)%2==0))
    //36-masala
//    val sp = readln().split(" ")
//    val x1 = sp[0].toInt()
//    val y1 = sp[1].toInt()
//    val x2 = sp[2].toInt()
//    val y2 = sp[3].toInt()
//    println(x1.equals(x2) || y1.equals(y2))
    //37-masala
//    val sp = readln().split(" ")
//    val x1 = sp[0].toInt()
//    val y1 = sp[1].toInt()
//    val x2 = sp[2].toInt()
//    val y2 = sp[3].toInt()
//    println(!(x1==x2 && y1==y2) && ((x1+1==x2 || x1-1==x2 || x1 == x2) && (y1+1==y2 || y1-1==y2 || y1==y2)))
    //38-masala











    //20-masala
//    val n = readln().toInt()
//    val a = n/100
//    val b = (n/10)%10
//    val c = n%10
//    println("Yuzlar xonasidagi = $a\nO`nlar = $b\nBirlar xonasidagi = $c")
//
//    println(a!=b && a!=c && b!=c)





















}