package org.example
import Student

fun main() {
    val students = mutableListOf<Student>();
    students.add(Student("Mamin-Sibiryak","Dmitriy","Narkisovich", telegramValue = "@poet777"));
    students.add(Student("Mahmudov","Ararat","Sarkisovich", gitHubValue = "abu123"));
    students.add(Student("Lermontov","Mihail","Yurevich", emailValue = "literature@gmail.com"));
    students.add(Student("Chernikov","Alexander","Viktorovich", phoneNumberValue = "+79095889812"));
    students.add(Student(hashMapOf(Pair("name","Artur"),Pair("surname","Kharisov"),Pair("patronymic","Marselevich"))));
    students.forEach { it: Student -> println(it) };

    Student.writeToTxt("src/","out.txt",Student.readFromTxt("src/test.txt"))
}
