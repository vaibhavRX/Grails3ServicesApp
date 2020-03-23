package com.service.core

import grails.transaction.Transactional
import grails3servicesapp.EmployeeService
import org.springframework.beans.factory.annotation.Autowired

class UserService {

    @Autowired
    EmployeeService employeeService

//    def customEmployeeService

//    static scope = "prototype"

    def testMethod() {
        println "*** testMethod1() executed ***"
//        employeeService.methodTwo()

        employeeService.methodTwo()
    }

    @Transactional
    def transactionExample(){
        /*sql 1*/
        /*sql 2*/ /*Failed*/
        /*sql 3*/
    }
}
