package org.example

import Student

fun main() 
{
    val stud = Student("Lermontov","Mihail","Yurevich", emailValue = "literature@gmail.com", gitHubValue = "famous007", phoneNumberValue = "+79186916942");
    println(stud)
    val data = Student.parseString("Student(id:1,surname:Lermontov,name:Mihail,patronymic:Yurevich,phoneNumber:+79186916942,email:literature@gmail.com,telegram:,gitHub:famous007)")
    println(data)
    println(Student(data))
}