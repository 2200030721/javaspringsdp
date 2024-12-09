package com.example.farmingapp.controller;

import com.example.farmingapp.entity.Admin;
import com.example.farmingapp.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AdminController {

    @Autowired
    private AdminService adminService;

    @GetMapping("/admin/login")
    public String showAdminLoginPage() {
        return "admin_login";  // renders admin_login.html
    }

    @PostMapping("/admin/login")
    public String loginAdmin(String email, String password) {
        // Your login logic here, possibly redirect to admin dashboard
        return "admin_dashboard";  // Redirect to dashboard
    }

    @GetMapping("/admin/signup")
    public String showAdminSignupPage() {
        return "admin_signup";  // renders admin_signup.html
    }

    @PostMapping("/admin/signup")
    public String registerAdmin(Admin admin) {
        adminService.registerAdmin(admin);
        return "admin_login";  // Redirect to login page after signup
    }

@Controller
public class PageController {

    @GetMapping("/AboutUs")
    public String aboutUsPage() {
        return "About"; // This corresponds to the AboutUs.html in resources/templates
    }
    @PostMapping("/About Us")
    public String registerAdmin(Admin admin) {
        adminService.registerAdmin(admin);
        return "About Us";  // Redirect to login page after signup
    }
}
   
}
