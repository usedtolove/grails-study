package com.tz

import groovy.transform.ToString
/**
 *
 * @author Hu Jing Ling
 * @since 2015/4/22 22:43
 * @version 1.0
 */
//@Validatable
@ToString(includeNames = true)
//class UserSearchForm implements Validateable{
class UserSearchForm {

    String name
    Integer lowerAge
    Integer upperAge

    /*static constraints = {
        lowerAge min:1
    }*/

}
