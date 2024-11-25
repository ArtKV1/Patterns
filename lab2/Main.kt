package org.example

import Student
import StudentShort

fun main() {
    val stud = Student("Lermontov","Mihail","Yurevich", emailValue = "literature@gmail.com", gitHubValue = "famous007", phoneNumberValue = "+79186916942");
    val data = Student.parseString("Student(id:4,surname:Lermontov,name:Mihail,patronymic:Yurevich,phoneNumber:+79186916942,email:literature@gmail.com,telegram:,gitHub:famous007)")
    println(data)
    println(stud)
    println(Student(data))
    println(Student(Student.parseString("Student(id:1,surname:Romanov,name:Vladislav,patronymic:Vitalevich,phoneNumber:+78005553535,email:romadis@gmail.com,telegram:,gitHub:romadis)")))
    println(stud.getInfo())
    println(StudentShort(4,stud.getInfo()))
    println(StudentShort(stud))
}
