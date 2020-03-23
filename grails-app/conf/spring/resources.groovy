import grails3servicesapp.EmployeeService

// Place your Spring DSL code here
beans = {

    customEmployeeService(EmployeeService){
        bean().scope = 'prototype'
    }
}
