package interceptor.issue

class FirstController {

    def index() {
        println controllerName + " "+ actionName
        render controllerName + " "+ actionName
    }

    def hello() {
        println controllerName + " "+ actionName
        render controllerName + " "+ actionName
    }

}
