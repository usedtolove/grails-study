package com.tz

import grails.rest.RestfulController

class UserController extends RestfulController{

//    static allowedMethods = RestfulController.allowedMethods + [search: "POST"]
    //static allowedMethods = [index:"GET", save: "POST", update: "PUT", patch: "PATCH", delete: "DELETE", search:"POST"]

    static responseFormats = ['json', 'xml']

    UserController() {
        super(User)
    }

    def search(UserSearchForm form) {
        println form
        respond User.findAllByNameIlikeAndAgeBetween("%"+form.name+"%", form.lowerAge, form.upperAge, [sort:"name", order:"asc"])
    }

}
