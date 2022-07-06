fun main() {

    //1-masala
//    var n = readln().toInt()
//    println("Toplam elementlarni kiriting!!!")
//    var s = true
//    var max =0
//    var min =0
//    for(i in 1..n-2)
//    {
//        var a = readln().toInt()
//        if(s){
//           max = a
//           min = a
//           s = false
//        }
//        if(max<a)
//            max = a
//        if(min>a)
//          min = a
//    }
//    println("To`plamdagi eng katta son $max\nTo`plamdagi eng kichik son $min")
    //2-masala
//    var n = readln().toInt()
//    var max = 0
//    var s = true
//    for (i in 1..n) {
//        println("To`g`ri to`rt burchak tomonlarni kiriting!!")
//        var a = readln().toInt()
//        var b = readln().toInt()
//        if(s){
//            s = false
//            max = a*b
//            continue
//        }
//        if (max<a*b){
//            max = a*b
//        }
//
//    }
//    println("Eng katta yuza $max")

    //3-masala

//        var n = readln().toInt()
//    var max = 0
//    var s = true
//    for (i in 1..n) {
//        println("To`g`ri to`rt burchak tomonlarni kiriting!!")
//        var a = readln().toInt()
//        var b = readln().toInt()
//        if(s){
//            s = false
//            max = 2*(a+b)
//            continue
//        }
//        if (max<2*(a+b)){
//            max = 2*(a+b)
//        }
//
//    }
//    println("Eng katta piremetr $max")

//4-masala
//    var n = readln().toInt()
//    var s = 1
//    println("To`plam elamentlarni kiriting")
//    var min = readln().toInt()
//    for(i in 2..n)
//    {
//        var a = readln().toInt()
//        if(a<min)
//            s=i
//    }
//    println(s)
    //5-masala

//    var n = readln().toInt()
//    var max = 0.0
//    var s = true
//    for (i in 1..n) {
//        println("To`g`ri to`rt burchak tomonlarni kiriting!!")
//        var a = readln().toDouble()
//        var b = readln().toDouble()
//        if (s) {
//            s = false
//            max = a / b
//            continue
//        }
//        if (max < a / b) {
//            max = a / b
//        }
//
//    }
    //6-masala
//    var n = readln().toInt()
//    var min = 0
//    var max = 0
//    var maxTR = 1
//    var minTR = 1
//    var s = true
//    for (i in 1..n) {
//        val a = readln().toInt()
//        if (s) {
//            s = false
//            min = a
//            max = a
//        }
//        if (min > a) {
//            min = a
//            minTR =i
//        }
//        if (max <= a) {
//            max = a
//            maxTR = i
//        }
//    }
//    println("Min tartib raqami $minTR")
//    println("Max tartib raqami $maxTR")
    //7-masala

//        var n = readln().toInt()
//    var min = 0
//    var max = 0
//    var maxTR = 1
//    var minTR = 1
//    var s = true
//    for (i in 1..n) {
//        val a = readln().toInt()
//        if (s) {
//            s = false
//            min = a
//            max = a
//        }
//        if (min >= a) {
//            min = a
//            minTR =i
//        }
//        if (max < a) {
//            max = a
//            maxTR = i
//        }
//    }
//    println("Min tartib raqami $minTR")
//    println("Max tartib raqami $maxTR")
//
    //8-masala
//    var n = readln().toInt()
//    var s = true
//    var tr1 = 1
//    var tr2 = 1
//    var min = 0
//
//    for (i in 1..n) {
//        var a = readln().toInt()
//        if (s) {
//            min = a
//        }
//        if (min > a) {
//            tr1 = i
//            min = a
//        }
//        if (min >= a) {
//            tr2 = i
//            min = a
//        }
//
//    }
//    println("Tartib raqam $tr1\nTartib Raqam oxirgisi $tr2")
    //9-masala
//    var n = readln().toInt()
//    var s = true
//    var tr1 = 1
//    var tr2 = 1
//    var min = 0
//
//    for (i in 1..n) {
//        var a = readln().toInt()
//        if (s) {
//            min = a
//        }
//        if (min < a) {
//            tr1 = i
//            min = a
//        }
//        if (min <= a) {
//            tr2 = i
//            min = a
//        }
//
//    }
//    println("Tartib raqam $tr1\nTartib Raqam oxirgisi $tr2")
    //10-masala
//    var n = readln().toInt()
//    var min = 0
//    var max = 0
//    var trMax= 1
//    var trMin= 1
//    var s = true
//    for (i in 1..n)
//    {
//        var a = readln().toInt()
//        if(s){
//            s = false
//            min =  a
//            max =  a
//            continue
//        }
//        if(a<min){
//            min = a
//            trMin = i
//        }
//        if(max<a)
//        {
//            max = a
//            trMax = i
//        }
//    }
//    if(trMax>trMin)
//        println(trMin)
//    else
//        println(trMax)

    //11-masala
//    var n = readln().toInt()
//    var min = 0
//    var max = 0
//    var trMax= 1
//    var trMin= 1
//    var s = true
//    for (i in 1..n)
//    {
//        var a = readln().toInt()
//        if(s){
//            s = false
//            min =  a
//            max =  a
//            continue
//        }
//        if(a<=min){
//            min = a
//            trMin = i
//        }
//        if(max<=a)
//        {
//            max = a
//            trMax = i
//        }
//    }
//    if(trMax>trMin)
//        println(trMin)
//    else
//        println(trMax)

    //12-masala
//    var n  = readln().toInt()
//    var musbatSon = 0
//    var s = true
//    for(i in 1..n)
//    {
//        var a = readln().toInt()
//        if(a>0){
//            if(s){
//                s=false
//                musbatSon =a
//                continue
//            }
//            if(musbatSon>a){
//                musbatSon =a
//            }
//        }
//    }
//    println(musbatSon)
    //13-masala

//    var n = readln().toInt()
//    var max = 0
//    var trMax = 0
//    var s= true
//    for (i in 1..n){
//        var a = readln().toInt()
//        if(s.and(a%2==1))
//        {
//            s=false
//            trMax = i
//            max =a
//            continue
//        }
//        if(a%2==1 && max<a)
//        {
//            max =a
//            trMax = i
//        }
//    }

//    println(trMax)
//14-masala

//    var b = readln().toInt()
//    var n = readln().toIntOrNull()
//    var min =0
//    var trMin =0
//    var s = true
//    println("To`plam elementlarni kiriting!!")
//    for (i in 1..n!!)
//    {
//        var  a= readln().toInt()
//        if(s && b!!<a){
//            min=a
//            trMin = i
//            s = false
//            continue
//        }
//        if(min>a && b<a)
//        {
//            min =a
//            trMin = i
//        }
//    }
//    if (s){
//        println("0 0")
//    }
//    else
//        println(trMin)

    //15-masala
//    var b = readln().toInt()
//    var c = readln().toInt()
//    var s = true
//    var max = 0
//    var trMax = 0
//    for (i in 1..10) {
//        var a = readln().toInt()
//        if (s && (b < a && a < c)) {
//            max = a
//            trMax = i
//            s = false
//            continue
//        }
//        if (max < a && (c < a && a < b)) {
//            max = a
//            trMax = i
//        }
//    }
//    if (s)
//    {
//       println("0 0")
//    }else
//    {
//        println(trMax)
//
//    }
    //16-masala
//    var n = readln().toInt()
//    println("To`plam elementlarnini kiriting!!")
//    var min = readln().toInt()
//    var tr = 0
//    for (i in 2..n)
//    {
//        var a = readln().toInt()
//        if(min>a)
//        {
//            min = a
//            tr = i-1
//        }
//    }
//    println(tr)
    //17-masala
//    val n = readln().toInt()
//    println("To`plam elementlarnini kiriting!!")
//    var max = readln().toInt()
//    var tr = 0
//    for (i in 2..n)
//    {
//        var a = readln().toInt()
//        if(max<=a)
//        {
//            max = a
//            tr = n-i
//        }
//    }
//    println(tr)
    //18-masala
//    var n = readln().toInt()
//    println("To`plam elementlarini kriting!!!")
//    var max1 = readln().toInt()
//    var tr1= 1
//    var tr2 = 1
//    for (i in 2..n)
//    {
//        var a = readln().toInt()
//        if(a>max1)
//        {
//            max1 = a
//            tr1 = i
//        }
//        if(a>=max1)
//        {
//            max1 = a
//            tr2 = i
//        }
//
//    }
//
//    if(tr1==tr2)
//        println(0)
//    else
//        println(tr2-tr1-1)
    //19-masala
//    var n = readln().toInt()
//    var arr = IntArray(n)
//    for (i in 0 until n){
//        arr[i] = readln().toInt()
//    }
//    arr.sort()
//    var s = 1
//    for (i in 0 until arr.size-1){
//        if(arr[i]==arr[i+1]){
//            s++
//            continue
//        }
//        break
//    }
//    println(s)
    //20-masala


    //21-masala
//    var n  = readln().toDouble()
//    var s= 0.0
//    for (i in 1..n.toInt()){
//        s+= readln().toDouble()
//    }
//    println(s/n)
    //22-masala
//    var n = readln().toInt()
//    var arr = IntArray(n)
//    for(i in arr.indices){
//        arr[i] = readln().toInt()
//    }
//    arr.sort()
//    println("${arr[0]}   ${arr[1]}")
    //23-masala
//
//    var n = readln().toInt()
//    var arr = IntArray(n)
//    for(i in arr.indices){
//        arr[i] = readln().toInt()
//    }
//    arr.sort()
//    println("${arr[arr.lastIndex-1]}   ${arr[arr.lastIndex]}")
    //24-masala
//    var n = readln().toInt()
//    var arr=IntArray(n)
//    for (i in arr.indices){
//        arr[i] = readln().toInt()
//    }
//    var sum = arr[0]+arr[1]
//    for (i in 1 until arr.size-1){
//        if(sum<(arr[i]+arr[i+1])){
//            sum = arr[i]+arr[i+1]
//            }
//    }
//    println(sum)
    //25-masala
//    var n = readln().toInt()
//    var arr = IntArray(n)
//    for (i in arr.indices) {
//        arr[i] = readln().toInt()
//    }
//    var sum = arr[0] * arr[1]
//    var index = 0
//    for (i in 1 until arr.size - 1) {
//        if (sum < (arr[i] * arr[i + 1])) {
//            sum = arr[i] * arr[i + 1]
//            index = i
//        }
//    }
//    println("${index}   ${index+1}")
    //26-masala
//    var n  = readln().toInt()
//    var sum =0
//    var s = readln().toInt()
//    for (i in 2..n){
//        var a = readln().toInt()
//        if(s==a){
//            sum++
//            continue
//        }
//        s = a
//        sum=0
//    }
//    println(sum)
    //27-masala








}