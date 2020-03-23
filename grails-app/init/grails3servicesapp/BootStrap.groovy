package grails3servicesapp

import com.service.core.BootstrapService

class BootStrap {

   BootstrapService bootstrapService

    def init = { servletContext ->
        println "Bootstrap called"
        bootstrapService.serviceMethod()
    }
    def destroy = {
    }
}
