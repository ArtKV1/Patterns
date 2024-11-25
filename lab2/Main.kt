package org.example

import DataTable
import Student

fun main() {
    val students = mutableListOf<Student>();
    students.add(Student("Kharisov","Artur","Marselevich"));
    students.add(Student("Mamin-Sibiryak","Dmitriy","Narkisovich", telegramValue = "@poet777"));
    students.add(Student("Mahmudov","Ararat","Sarkisovich", gitHubValue = "abu123"));
    students.add(Student("Lermontov","Mihail","Yurevich", emailValue = "literature@gmail.com"));
    students.add(Student("Chernikov","Alexander","Viktorovich", phoneNumberValue = "+79095889812"));
    students.add(Student(hashMapOf(Pair("name","Kharisov"),Pair("surname","Artur"),Pair("patronymic","Marselevich"))));
    students.forEach { it: Student -> println(it) };

    Student.writeToTxt("src/","out.txt",Student.readFromTxt("src/test.txt"))
    var dat = DataTable(arrayOf(arrayOf(Student("Kharisov","Artur","Marselevich"),3),arrayOf(4,3)))
    var ar = dat.getElement(0,0) as Student
    ar.telegram = "@romadis"
    println(dat.getElement(0,0))
}