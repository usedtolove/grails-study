package com.tz
class Employee {

    static belongsTo = [department:Department]

    static constraints = {
        department nullable: true
    }

    String name
    int age

    Department department
}
