import java.util.*

fun main(array: Array<String>){
    var scan=Scanner(System.`in`)

   val arr= arrayOf(1,2,3,4,5)
    val arr1= arrayOf(2, 3, 4 ,0 , 4 ,-5);


    print("First Array Sum  ")
        println(sumArray(arr))
    print("Second Array Sum  ")
    println(sumArray(arr1))

}


fun sumArray(array: Array<Int>): Int{
    var sum = 0
    for(number in array){
        sum += number
    }
    return sum
}




   // println("Sum: $Sum{(10, 20, 30, 40)}")



//fun  averagearray( vararg  arr:Int) :Int{
//    var sum=0;
//    arr.forEach {
//     arr->   sum=sum+ arr
//
//    }
//    return sum
//}