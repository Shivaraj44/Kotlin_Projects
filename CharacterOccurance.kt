import java.util.*
import kotlin.collections.HashMap

fun main(asrg:Array<String>){
    var scan=Scanner(System.`in`)
    val s: String=scan.nextLine()
    val charHashmap: HashMap<Char,Int> =HashMap<Char, Int>()
    var v:Char
    for(i in s.indices){
        v=s[i]
        if(charHashmap.containsKey(v))
        {
            charHashmap[v] = charHashmap[v]!!+1

        }else{
            charHashmap[v]=1
        }
    }
    println(charHashmap)
}