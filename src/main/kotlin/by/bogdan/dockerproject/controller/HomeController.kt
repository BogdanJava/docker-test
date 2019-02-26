package by.bogdan.dockerproject.controller

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import java.net.InetAddress

@Controller
class HomeController {

    @GetMapping("/")
    fun home(model: Model): String {
        val host = InetAddress.getLocalHost()
        model.addAttribute("ip", String.format("%d.%d.%d.%d", host.hostAddress))
        return "home"
    }
}