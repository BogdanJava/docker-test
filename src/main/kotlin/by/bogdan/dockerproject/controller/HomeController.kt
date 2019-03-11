package by.bogdan.dockerproject.controller

import by.bogdan.dockerproject.service.MongoService
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import java.net.InetAddress

@Controller
class HomeController(val mongoService: MongoService) {

    @GetMapping
    fun home(model: Model): String {
        model.addAttribute("ip", InetAddress.getLocalHost().hostAddress)
        model.addAttribute("users", mongoService.getUsers())
        return "home"
    }
}