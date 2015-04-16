package com.tz
class Department {

    String name;
    String desc;

    static hasMany = [employees: Employee]

    static constraints = {
        name blank: false, unique: true
        desc nullable: true, maxSize: 1000
    }

    static mapping = {
        table "tbl_department"
        name column: "dept_name"
        desc column: "dept_desc"
    }

    @Override
    String toString() {
        return name
    }
}
