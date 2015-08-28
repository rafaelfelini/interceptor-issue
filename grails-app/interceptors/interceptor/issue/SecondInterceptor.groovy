package interceptor.issue


class SecondInterceptor {

    SecondInterceptor() {
        match(controller: "second")
            .excludes(action:"hello")
    }

    boolean before() {
        println 'in second interceptor'

        true
    }

    boolean after() { true }

    void afterView() {
        // no-op
    }

}
