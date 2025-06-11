package com.myApp.portfolio;


import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myApp.portfolio.model.Contact;
import com.myApp.portfolio.model.Education;
import com.myApp.portfolio.model.Project;
import com.myApp.portfolio.model.Skill;

@RestController
@RequestMapping("/api")
public class PortfolioController {

    @GetMapping("/education")
    public List<Education> getEducation() {
        return List.of(
            new Education("B.Tech in Computer Science & Engineering", "Narsimha Reddy Engineering College", "2021 – 2025", "CGPA: 7.9/10"),
            new Education("Intermediate (M.P.C.)", "Masterminds Junior College", "2021", "87.8%"),
            new Education("Secondary Education", "Sharada High School", "2019", "GPA: 9.0/10")
        );
    }

    @GetMapping("/skills")
    public List<Skill> getSkills() {
        return List.of(
            new Skill("Core Java (J2SE)"),
            new Skill("C, Python"),
            new Skill("HTML & CSS (Basics)"),
            new Skill("SQL, PL/SQL"),
            new Skill("Windows, Linux"),
            new Skill("Eclipse, Oracle, Visual Studio")
        );
    }

    @GetMapping("/projects")
    public List<Project> getProjects() {
        return List.of(
            new Project("Abnormal Event Detection", "Real-time video anomaly detection using OpenCV & TensorFlow/Keras within Django & Flask frameworks."),
            new Project("QR Code Attendance System", "Contactless employee attendance management with Java, Servlets, JSP, MySQL & QR Code API.")
        );
    }

    @GetMapping("/contact")
    public List<Contact> getContacts() {
        return List.of(
            new Contact("phone", "+91 8555893298"),
            new Contact("email", "saberhussain.gsm@gmail.com"),
            new Contact("linkedin", "https://www.linkedin.com/in/saber-hussain-550345325")
        );
    }
}