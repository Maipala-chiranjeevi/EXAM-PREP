package com.example.serving_web_content;

import com.example.serving_web_content.model.User;
import com.example.serving_web_content.service.UserService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class GreetingController {

    @Autowired
    private UserService userService;

    @GetMapping("/")
    public String greeting() {
        return "greeting";
    }


    @PostMapping("/login")
    public String processLogin(@RequestParam String username,
                               @RequestParam String password,
                               HttpSession session,
                               Model model) {
        User user = userService.findByUsername(username);
        if (user != null && user.getPassword().equals(password)) {
            session.setAttribute("username", username); // basic session tracking
            return "redirect:/dashboard";
        } else {
            model.addAttribute("error", "Invalid username or password.");
            return "greeting";
        }
    }

    @GetMapping("/register")
    public String registerForm(Model model) {
        model.addAttribute("user", new User());
        return "register";
    }

    @PostMapping("/register")
    public String registerUser(@ModelAttribute User user, Model model) {
        if (userService.findByUsername(user.getUsername()) != null) {
            model.addAttribute("error", "Username already exists!");
            return "register";
        }
        userService.save(user);
        return "redirect:/";
    }

    @GetMapping("/dashboard")
    public String dashboard(HttpSession session) {
        if (session.getAttribute("username") == null) {
            return "redirect:/"; // redirect to login if not logged in
        }
        return "dashboard";
    }

    @GetMapping("/logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "redirect:/";
    }

    @GetMapping("/gate")
    public String gatePage(HttpSession session) {
        if (session.getAttribute("username") == null) {
            return "redirect:/";
        }
        return "gate";
    }

    @GetMapping("/jee")
    public String jeePage(HttpSession session) {
        if (session.getAttribute("username") == null) {
            return "redirect:/";
        }
        return "jee";
    }

    @GetMapping("/ssc")
    public String sscPage(HttpSession session) {
        if (session.getAttribute("username") == null) {
            return "redirect:/";
        }
        return "ssc";
    }

    @GetMapping("/toefl")
    public String toeflPage(HttpSession session) {
        if (session.getAttribute("username") == null) {
            return "redirect:/";
        }
        return "toefl";
    }
}
