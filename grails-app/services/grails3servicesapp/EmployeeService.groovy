package grails3servicesapp

import grails.transaction.Transactional

@Transactional
class EmployeeService {

    def methodTwo() {
        "Method execution in Employee Service."
    }
}
