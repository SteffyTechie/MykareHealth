package springAPI.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import springAPI.entity.User;
import springAPI.service.UserService;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class Controller {

    @Autowired
    private UserService userService;

    @GetMapping("/register")
    public String showRegistrationForm() {
        // .addAttribute("user", new User());
        return "home";
    }

    @PostMapping("/register")
    public User registerUser(@RequestBody User user) {
        try {
            return userService.registerUser(user);
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    @PostMapping("/validate")
    public User validateUser(@RequestParam String email, @RequestParam String password) {
        try {
            return userService.validateUser(email, password);
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @DeleteMapping
    public String deleteUser(@RequestParam String email) {
        try {
            userService.deleteUser(email);
            return "User deleted successfully";
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}
