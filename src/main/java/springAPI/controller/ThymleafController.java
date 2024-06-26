package springAPI.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import springAPI.entity.User;
import springAPI.service.UserService;

@Controller
public class ThymleafController {

    @Autowired
    private UserService userService;
    
    @GetMapping("/home")
    public String gethome() {
       // model.addAttribute("user", new User());
        return "home";
    }
    

    @GetMapping("/user")
    public String getuser() {
       // model.addAttribute("user", new User());
        return "user";
    }
    
    @GetMapping("/delete")
    public String getdelete() {
       // model.addAttribute("user", new User());
        return "delete";
    }

//    
//    @GetMapping("/register")
//    public String showRegistrationForm() {
//       // model.addAttribute("user", new User());
//       return "register";
//       }
//
//    @PostMapping("/register")
//   public String registerUser(@ModelAttribute User user, Model model) {
//    	try {
//    }
//            userService.registerUser(user);
//            model.addAttribute("message", "User registered successfully");
//        } catch (Exception e) {           
//        	//model.addAttribute("message", e.getMessage());
//        }
//       return "register";
//   }
//
//    @GetMapping("/users")
//    public String getAllUsers(Model model) {
//        model.addAttribute("users", userService.getAllUsers());
//        return "users";
//    }
//    @GetMapping("/delete")
//    public String deleteUserForm() {
//       return "deleteUser";
//    }
//    @PostMapping("/delete")
//    public String deleteUser(@RequestParam String email, Model model) {
//        try {
//userService.deleteUser(email);
//           model.addAttribute("message", "User deleted successfully");
//       } catch (Exception e) {
//            model.addAttribute("message", e.getMessage());
//        }
//        return "deleteUser";
//    }
//}
}
