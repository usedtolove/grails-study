package com.tz

import grails.transaction.Transactional

@Transactional(readOnly = true)
class DepartmentController {

    static scaffold = true

}