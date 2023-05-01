package lewinke.example

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.HttpStatus

@Controller("/micronautTest")
class MicronautTestController {

    @Get(uri="/", produces=["text/plain"])
    fun index(): String {
        return "Example Response"
    }
}