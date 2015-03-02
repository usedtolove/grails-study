package com.tz

import grails.transaction.Transactional

@Transactional(readOnly = true)
class EmployeeController {

    static scaffold = true
    
}