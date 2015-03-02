package com.tz
class Department {

    static belongsTo = [parent:Department]
    static hasMany = [children: Department]

    static constraints = {
        parent nullable: true
    }

    String name
    Department parent
    Set<Department> children

}
