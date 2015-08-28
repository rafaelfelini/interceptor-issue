package interceptor.issue


class FirstInterceptor {

    FirstInterceptor() {
        match(controller: "first")
            .excludes(action:"hello")
    }

    boolean before() {
        println 'in first interceptor'

        true
    }

    boolean after() { true }

    void afterView() {
        // no-op
    }

}
