fun main(){
    names("Almomd","Apples","Avocados","Kiwi")
    towns(arrayOf("harare","mumbai","dodoma","jakarta"))
    mean(arrayOf(32,17,4,213,78,43,90,31,3,73,11,158,62))
    var y = info(arrayOf("Hawi","Elma","Amelea"))
    println(y)


}
fun names(a:String,b:String,c:String,d:String){
    var  info = arrayOf(a,b,c,d)
    println(info.toString())
}
fun towns(cities:Array<String>){
    cities.forEach {  cities->
        println(cities.capitalize())
    }
}
fun mean(num:Array<Int>){
    var sum = num[1]+num[4]
    println(sum)
    println(num.indexOf(158))
    println(num.sortedArray().contentToString())
}

fun info(name:Array<String>):String{
    var stmt = name.contentToString()
    return stmt
}