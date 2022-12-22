import kotlin.math.min

fun main() {
//// 1-masala
////  var a=4
////    if (a>0){`
////   println(a+1)
////    }
////  else {
////      println(a)
////  }
////2-masala
//// var a=-6
////if (a>0){
////    println(a+1)
////}
////
////else{
////    println(a-2)
////}
////    "3-masala"
////    var a = 0
////    if (a > 0) {
////        println(a + 1)
////    } else {
////        if (a == 0)
////            println(10)
////        else
////            println(a - 2)
////    }
////"4-masala"
////var a= readln()!!.toInt()
////var b= readln()!!.toInt()
////var c= readln()!!.toInt()
////var musbatsonlar=0
////    var manfiysonlar=0
////if (a>0) {
////    musbatsonlar++
////}
////    else{
////        manfiysonlar++
////    }
////if (b>0){
////    musbatsonlar++
////}
////    else{
////        manfiysonlar++
////    }
////if (c>0){
////    musbatsonlar++
////}
////    else{
////        manfiysonlar++
////
////    }
////println("musbatsonlar=${musbatsonlar}\nmanfiysonlar=${manfiysonlar}")
// //5-masala
//var a= readln()!!.toInt()
//var b= readln()!!.toInt()
//var c= readln()!!.toInt()
//var musbatsonlar=0
//    var manfiysonlar=0
//if (a>0) {
//    musbatsonlar++
//}
//    else{
//        manfiysonlar++
//    }
//if (b>0){
//    musbatsonlar++
//}
//    else{
//        manfiysonlar++
//    }
//if (c>0){
//    musbatsonlar++
//}
//    else{
//        manfiysonlar++
//
//    }
//println("musbatsonlar=${musbatsonlar}\nmanfiysonlar=${manfiysonlar}")


//    //34-masala
//    var n = readln().toInt()
//    var s = readln().split(" ")
//    for (i in 0 until (n/2+n%2))
//    {
//        if (i!=n-1-i)
//        print("${s[i]} ${s[n-1-i]} ")
//        else
//            print(s[i])
//    }


    var n = readln().toInt()
    var m = readln().toInt()
    var array = Array(n) { IntArray(m) }

    for (i in 0 until array.size) {
        for (j in 0 until array[i].size) {
            array[i][j] = readln().toInt()
        }
    }
    var min=array[0][0]
    var o = 0
    for (i in 0 until array.size) {
        for (j in 0 until array[i].size) {
           if (min>array[i][j])
           {

           }
        }
    }


}