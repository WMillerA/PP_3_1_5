//package ru.kata.spring.boot_security.demo.controllers;
//
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.*;
//import ru.kata.spring.boot_security.demo.models.Role;
//import ru.kata.spring.boot_security.demo.models.User;
//import ru.kata.spring.boot_security.demo.services.RoleService;
//import ru.kata.spring.boot_security.demo.services.UserService;
//
//import java.security.Principal;
//import java.util.List;
//
//
//@Controller
//@RequestMapping("/admin")
//public class AdminController {
//    private UserService userService;
//
//    private RoleService roleService;
//
//    @Autowired
//    public AdminController(UserService userService, RoleService roleService) {
//        this.userService = userService;
//        this.roleService = roleService;
//    }
//
//    @GetMapping("/")
//    public String printUsers(Model model, Principal principal) {
//        User user = userService.findByUserName(principal.getName());
//        model.addAttribute("user", user);
//        List<User> listOfUsers = userService.getAllUser();
//        model.addAttribute("princip", principal);
//        model.addAttribute("listOfUsers", listOfUsers);
//        return "users";
//    }
//
//    @PostMapping("/addNewUser")
//    public String showCreateUserForm(Model model) {
//        User user = new User();
//        List<Role> roles = roleService.getAllRoles();
//        model.addAttribute("user", user);
//        model.addAttribute("roles", roles);
//        return "redirect:/admin";
//    }
//
//    @GetMapping("/user-creation")
//    public String addUser(@ModelAttribute("user") User user) {
//        userService.add(user);
//        return "redirect:/admin/";
//    }
//
//
//    @PatchMapping("/edit/{id}")
//    public String showEditUserForm(Model model, @PathVariable("id") Long id) {
//        model.addAttribute("user", userService.show(id));
//        return "/edit_user";
//    }
//
//    @PatchMapping("/{id}")
//    public String saveEditUser(@ModelAttribute("user") User user,
//                               @PathVariable("id") Long id) {
//        userService.update(user);
//        return "redirect:/admin/";
//    }
//
//    @GetMapping("/delete/{id}")
//    public String deleteUserForm(@PathVariable("id") Long id, Model model) {
//        model.addAttribute("user", userService.show(id));
//        return "admin";
//    }
//
//    @DeleteMapping("/user-delete")
//    public String deleteUser(Long id) {
//        userService.delete(id);
//        return "redirect:/admin/";
//    }
//
//}
