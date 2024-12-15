fun main() {
    val age : Int // Declaration of the variable age
    age = 25      // Assignment of value 25
    println(age)

    var name : String
    name = "Damian"
    println(name)
    name = "Alicia"
    println(name)

    //Byte (1Byte = 8bit)
    val b1: Byte = 127 
    val b2: Byte = -128
    val ub: UByte = 255U
    //short (2Byte = 16bit)
    val s1: Short = 32767
    val s2: Short = -32768
    val us: UShort= 65535U
    //Int (4Byte = 32bit)
    val i1: Int = 2147483647
    val i2: Int = -2147483648
    val ui: UInt = 4294967295U
    //long (8Byte = 64bit)
    val l1: Long = 9223372036854775807
    val l2: Long = -9223372036854775807
    val ul: ULong = 18446744073709551615U



    val articleText: String = """On the website kotlintutorial.de you will find a free 
Kotlin course with numerous practical exercises that will 
give you the opportunity to learn programming in Kotlin.  
This course is a great opportunity to gain hands-on experience
with Kotlin and learn how to use it for developing various 
applications, including apps, web applications, and backend 
systems. Whether you're a beginner or an experienced programmer,
this Kotlin course is designed to help you improve your skills 
and master this powerful programming language."""
    println(articleText)
}