package com.tz

import groovy.transform.ToString

@ToString(includeNames = true)
class User {

    String name
    Integer age

    static constraints = {
        name nullable:false, unique: true
        age nullable: false
    }

}
