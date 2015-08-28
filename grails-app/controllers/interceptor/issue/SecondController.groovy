package interceptor.issue

class SecondController {

    def index() {
        println controllerName + " "+ actionName
        render controllerName + " "+ actionName
    }

    def hello() {
        println controllerName + " "+ actionName
        render controllerName + " "+ actionName
    }

}
