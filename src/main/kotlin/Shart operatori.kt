import kotlin.math.hypot

fun main() {
//1-masala
//    var a = readln().toInt()
//    if(a>0)
//        a++
//    println(a)
    //2-masala
//    var a = readln().toInt()
//    if(a>0)
//        a++
//    else
//        a-=2
//    println(a)
    //3-masala
//    var a = readln().toInt()
//    when {
//        a > 0 -> println(++a)
//        a < 0 -> println(-2 + a)
//        else -> println(10)
//    }
    //4-masala
//    val sp = readln().split(" ")
//    val a = sp[0].toInt()
//    val b = sp[1].toInt()
//    val c = sp[2].toInt()
//    var s = 0
//    if (a > 0)
//        s++
//    if (b > 0)
//        s++
//    if (c > 0)
//        s++
//    println("masala ta musbat son bor".format(s))
    //5-masala
//    val sp = readln().split(" ")
//    val a = sp[0].toInt()
//    val b = sp[1].toInt()
//    val c = sp[2].toInt()
//    var musbatlarSoni=0
//    var manfiylarSoni=0
//
//    if(a>0)
//        musbatlarSoni++
//    else
//        manfiylarSoni++
//    if(b>0)
//        musbatlarSoni++
//    else
//        manfiylarSoni++
//    if(c>0)
//        musbatlarSoni++
//    else
//        manfiylarSoni++
//    println("Kiritilhan sonlardan masala tasi musbat\nmasala tasi manfiy sonlar".format(musbatlarSoni,manfiylarSoni))
    //6-masala
//    val sp = readln().split(" ")
//    val a = sp[0].toInt()
//    val b = sp[1].toInt()
//    if(a>b)
//        println("Birinchi son katta!!")
//    else
//        println("Ikkinchi son katta!!")
    //7-masala
//    val sp = readln().split(" ")
//    val a = sp[0].toInt()
//    val b = sp[1].toInt()
//    if(a>b)
//        println(1)
//    else
//        println(2)
    //8-masala
//    val sp = readln().split(" ")
//    val a= sp[0].toInt()
//    val b= sp[1].toInt()
//    if(a>b) {
//        println(a)
//        println(b)
//    }else{
//        println(b)
//        println(a)
//    }
    //9-masala
//    val sp = readln().split(" ")
//    var a = sp[0].toInt()
//    var b = sp[1].toInt()
//    var c: Int
//    if (a > b) {
//        c = a
//        a = b
//        b = c
//    }
//    println("a=%s va b=%s".format(a,b))

    //10-masala
//    val sp = readln().split(" ")
//    val a = sp[0].toInt()
//    val b = sp[1].toInt()
//    if (a.equals(b))
//        println(0)
//    else
//        println(a.plus(b))
//    println("a = %s  b = %s".format(a, b))
    //11-masala
//    val sp = readln().split(" ")
//    val a = sp[0].toInt()
//    val b = sp[1].toInt()
//    if(!a.equals(b))
//        println(max(a,b))
//    else
//        println(0)
//    println("a=%s b=%s".format(a,b))
    //12-masala
    //1-usul
//    val sp = readln().split(" ")
//    val a = sp[0].toInt()
//    val b = sp[1].toInt()
//    val c = sp[2].toInt()
//    if(b>a && c>a)
//        println(a)
//    if(a>b && c>b)
//        println(b)
//    if(a>c && b>c)
//        println(c)
    //2-usul
//    val sp = readln().split(" ")
//    val a = sp[0].toInt()
//    val b = sp[1].toInt()
//    val c = sp[2].toInt()
//    println(min(a, min(b,c)))

    //13-masala
//    val sp = readln().split(" ")
//    val a = sp[0].toInt()
//    val b = sp[1].toInt()
//    val c = sp[2].toInt()
//    if ((b<a && a<c) || (c<a && a<b))
//        println(a)
//    if ((a<b && b<c)||(c<b && b<a))
//        println(b)
//    if ((a<c && c<b) || (b<c && c<a))
//        println(c)
    //14-masala
    //1-usul
//    val sp = readln().split(" ")
//    val a= sp[0].toInt()
//    val b= sp[1].toInt()
//    val c= sp[2].toInt()
//    if(a<b && a<c)
//    {
//        println(a)
//        if(b>c)
//            println(b)
//        else
//            println(c)
//    }
//    if(b<a && b<c)
//    {
//        println(b)
//        if(a>c)
//            println(a)
//        else
//            println(c)
//    }
//    if(c<a && c<b)
//    {
//        println(c)
//        if(a>b)
//            println(a)
//        else
//            println(b)
//    }
    //2-usul
//    val sp = readln().split(" ")
//    val a= sp[0].toInt()
//    val b= sp[1].toInt()
//    val c= sp[2].toInt()
//    println("min=%s\nmax=%s".format(min(a, min(b,c)), max(a, max(b,c))))
    //15-masala
    //1-usul
//    val sp = readln().split(" ")
//    val a =sp[0].toInt()
//    val b =sp[1].toInt()
//    val c =sp[2].toInt()
//    if(a>c && b>c)
//        println(a+b)
//    if(a>b && c>b)
//        println(a+c)
//    if(c>a && b>a)
//        println(b+c)
    //2-usul
//    val sp = readln().split(" ")
//    val a =sp[0].toInt()
//    val b =sp[1].toInt()
//    val c =sp[2].toInt()
//    val min  = min(a, min(b,c))
//    if(min==a)
//        println(b+c)
//    if(min==b)
//        println(a+c)
//    if (min==c)
//        println(a+b)
    //16-masala
//    val sp = readln().split(" ")
//    val a = sp[0].toInt()
//    val b = sp[1].toInt()
//    val c = sp[2].toInt()
//    if(a< b && b<c)
//        println("${2*a}\n${2*b}\n${2*c}")
//    else
//        println("${-1*a}\n${-1*b}\n${-1*c}")
    //17-masala
//    val sp = readln().split(" ")
//    val a= sp[0].toInt()
//    val b= sp[1].toInt()
//    val c= sp[2].toInt()
//    if((a<b && b<c) || (a>b && b>c))
//        println("${a*2}\n${b*2}\n${c*2}")
//    else
//        println("${-1*a}\n${-1*b}\n${-1*c}")
    //18-masala
//    val sp = readln().split(" ")
//    val a = sp[0].toInt()
//    val b = sp[1].toInt()
//    val c = sp[2].toInt()
//    if(a.equals(b))
//        println(3)
//    if(a.equals(c))
//        println(2)
//    if(b.equals(c))
//        println(1)
    //19-masala
//    val sp  = readln().split(" ")
//    val a = sp[0].toInt()
//    val b = sp[1].toInt()
//    val c = sp[2].toInt()
//    val d = sp[3].toInt()
//    if(a.equals(b) && b.equals(c))
//        println(4)
//    if(a.equals(b) && b.equals(d))
//        println(3)
//    if (a.equals(c) && c.equals(d))
//        println(2)
//    if (b.equals(c) && c.equals(d))
//        println(1)
    //20-masala
//    val sp = readln().split(" ")
//    val a = sp[0].toInt()
//    val b = sp[1].toInt()
//    val c = sp[2].toInt()
//    val ab = abs(b - a)
//    val ac = abs(c - a)
//    if (ab > ac)
//        println("a nuqtaga $c nuqta eng yaqin $ac")
//    else
//
//        println("a nuqtaga $b nuqta eng yaqin $ab")
    //21-masala
//    val sp = readln().split(" ")
//    val x = sp[0].toInt()
//    val y = sp[1].toInt()
//    if (x != 0 && y != 0)
//        println(3)
//    if (x == 0 && y != 0) {
//        println(2)
//    }
//    if (x != 0 && y == 0)
//        println(1)
//    if (x == 0 && y == 0)
//        println(0)
    //22-masala
//    val sp = readln().split(" ")
//    val x = sp[0].toInt()
//    val y = sp[1].toInt()
//    if (x > 0)
//        if (y > 0)
//            println("Birinchi chorakda")
//        else
//            println("To`rtinchi chorakda")
//    else
//        if (y > 0)
//            println("Ikkinchi chorakda")
//        else
//            println("Uchinchi chorakda")

    //23-masala
//    val sp = readln().split(" ")
//    val x1 = sp[0].toInt()
//    val y1 = sp[1].toInt()
//    val x2 = sp[2].toInt()
//    val y2 = sp[3].toInt()
//    val x3 = sp[4].toInt()
//    val y3 = sp[5].toInt()


    //24-masala
//    val x= readln().toDouble()
//    if (x>0)
//    println(2* sin(x))
//    else
//        println(x-6)

    //25-masala
//    val x = readln().toInt()
//    if(x<-2 || x>2)
//        println(2*x)
//    else
//        println(-3*x)
    //26-masala
//    val x = readln().toInt()
//    when
//    {
//        x<=0-> println(-1*x)
//        x>=2 -> println(4)
//        else -> println(x*x)
//    }
    //27-masala
//    val x = readln().toDouble()
//    if(x<0)
//        println(0)
//    else
//    {
//        val a = x.toInt()%2
//        if (a.equals(1))
//            println(-1)
//        else
//            println(1)
//    }
    //28-masala

//    val a = readln().split(" ")
//    if(!(a.toString().toInt()%4!=0 || (a.toString().toInt()%100==0 && a.toString().toInt()%400!=0)))
//    {
//        print("Kabisa yili")
//    }
//    else
//    {
//        println("Kabisa yili emas")
//    }
    //29-masala
    // val a = readln().toInt()
//    if(a==0)
//        println("son nolga teng!!")
//    else
//    { if(a>0) {
//        print("Musbat ")
//        if (a % 2 == 1)
//            println("toq son")
//        else
//            println("juft son")
//    }else
//    {
//        print("Manfiy ")
//        if (a % 2 == 1)
//            println("toq son")
//        else
//            println("juft son")
//    }
//    }

    //30-masala
//    val a = readln().toInt()
//    print("Berilgan son ")
//    if(a.toString().length == 3)
//    {
//        print("uch xonali ")
//        if(a%2==0)
//            println("Juft son")
//        else
//            println("Toq son")
//    }
//    if(a.toString().length == 2)
//    {
//        print("ikki xonali ")
//        if(a%2==0)
//            println("Juft son")
//        else
//            println("Toq son")
//    }
//    if(a.toString().length == 1)
//    {
//        print("bir xonali ")
//        if(a%2==0)
//            println("Juft son")
//        else
//            println("Toq son")
//    }
}