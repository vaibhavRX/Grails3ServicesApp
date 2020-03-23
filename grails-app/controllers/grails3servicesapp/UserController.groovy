package grails3servicesapp

import com.service.core.UserService

class UserController {

    UserService userService

    def index() {
        render userService.testMethod()
    }

    def save(UserDTO userDTO){
        userService.saveOrUpdateUser(userDTO)
    }

}
