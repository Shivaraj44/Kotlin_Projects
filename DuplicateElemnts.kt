import java.util.*

fun main(args : Array<String>) {
    val Scanner = Scanner(System.`in`)
    println("Enter the Size if Array")
    val size = Scanner.nextInt();
    println("Enter the Array Element")
    val arr = Array(size) { 0 }
    for (i in 0 until size) {
        arr[i] = Scanner.nextInt()
    }

    for(i in 0..arr.size){
for(j in i+1..arr.size-1 ){
    if(arr[i]==arr[j]){
        println(arr[j])
        println(arr[i])
    }
}

    //    println(arr[i])
    }
}
