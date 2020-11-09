import java.util.*
import kotlin.collections.HashMap

fun main(args : Array<String>){
    val Scanner =Scanner(System.`in`)
    println("Enter the Size if Array")
    val size=Scanner.nextInt();
    println("Enter the Array Element")
    val  arr=Array(size){0}
    for(i in 0 until size){
        arr[i]=Scanner.nextInt()
    }
//    for(i in 0 until size) {
//        val a = 0;
////println(""+arr[i]+"jane"+a++)    }
//
//    }
//    for(i in 0..5){
//        for(j in i+1..5 ){
//
//        }
//    }
    val map=HashMap<Int, Int>();
for(i in arr){
    if(map.containsKey(i)){
        var count =map.get(i)!!
        map.put(i,++count);
    }else{
        map.put(i,1);
    }}
map.forEach { (key, value )->
    if(value==1){
        println(key)
    }




    }
}