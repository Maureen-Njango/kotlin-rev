//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
   // val name ="Ian"
   // val age=21
//    val friend="Wanjiku"
//    val sentence="My name is "
    println(workers("wanjiru", 10, "kabete"))
    println(Students("Mbira", 50, "Juja"))
    println(empoyee("flo",40, "swiminmg"))
    println(new("Wanjiku", 22, 10))
    }
fun workers(name:String,age:Int, location:String):String{
    var info = "I am $name and i am $age  from $location"
    return info


}
fun Students(name:String, age:Int, location:String):String{
    val pupils = "I am $name from $location and i am $age years old"
    return pupils

}
fun empoyee(name:String, age:Int, hobby:String):String {
    val sentence = "My name is $name aged $age and i love $hobby"
    return sentence

}
fun new(name: String, age: Int, time:Int):String{
    val sent = "Hello, my name is $name aged $age i will be there at $time:00pm"
    return sent
}