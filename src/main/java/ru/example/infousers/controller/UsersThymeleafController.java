package ru.example.infousers.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.example.infousers.service.UserService;

import java.util.List;

@Controller
@RequestMapping("/allUsers")
public class UsersThymeleafController {

    private final UserService userService;

    @Autowired
    public UsersThymeleafController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public String getAllUsers(Model model) {
        model.addAttribute("users", userService.getAllUsers());
        return "allUsers";
    }
}
