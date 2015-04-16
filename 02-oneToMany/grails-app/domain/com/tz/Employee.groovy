package com.tz
class Employee {

    UUID id
    String name;
    Integer age;

    static hasOne = [dept : Department]

    static belongsTo = Department

    static mapping = {
        id generator: "uuid2", type: "uuid-char", length: 36
    }

    static constraints = {
        name blank:false
        age nullable: false
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                '}';
    }
}
