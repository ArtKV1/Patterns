package org.example

import DataListStudentShort
import Student
import StudentShort

fun main() {
    val students = mutableListOf<Student>();
    students.add(Student("Kharisov","Artur","Marselevich"));
    students.add(Student("Mamin-Sibiryak","Dmitriy","Narkisovich", telegramValue = "@poet777"));
    students.add(Student("Mahmudov","Ararat","Sarkisovich", gitHubValue = "abu123"));
    students.add(Student("Lermontov","Mihail","Yurevich", emailValue = "literature@gmail.com"));
    students.add(Student("Chernikov","Alexander","Viktorovich", phoneNumberValue = "+79095889812"));
    students.add(Student(hashMapOf(Pair("name","Artur"),Pair("surname","Kharisov"),Pair("patronymic","Marselevich"))));
    students.forEach { it: Student -> println(it) };

    Student.writeToTxt("src/","out.txt",Student.readFromTxt("src/test.txt"))
    var dat = DataListStudentShort(students.map { StudentShort(it) }.toTypedArray<StudentShort>())
    println(dat.getData())
}