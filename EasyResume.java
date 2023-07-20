import java.io.*;
import java.util.*;

// Resume Class
class Resume {
    private String name;
    private String contactInfo;
    private String education;
    private String workExperience;
    private String skills;

    // Constructor
    public Resume(String name, String contactInfo, String education, String workExperience, String skills) {
        this.name = name;
        this.contactInfo = contactInfo;
        this.education = education;
        this.workExperience = workExperience;
        this.skills = skills;
    }

    // Getters and Setters
    // (Implement these methods based on your specific requirements)
}

// Resume Template Library
class TemplateLibrary {
    private List<String> templates;

    // Constructor
    public TemplateLibrary() {
        // Initialize the list of templates (you can add more templates here)
        templates = new ArrayList<>();
        templates.add("Template 1");
        templates.add("Template 2");
        templates.add("Template 3");
    }

    public List<String> getTemplates() {
        return templates;
    }
}

// Resume Builder Application
public class EasyResume {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to EasyResume - Streamlined Resume Builder\n");

        // Initialize the Template Library
        TemplateLibrary templateLibrary = new TemplateLibrary();

        // Display available templates to the user
        System.out.println("Available Templates:");
        List<String> templates = templateLibrary.getTemplates();
        for (int i = 0; i < templates.size(); i++) {
            System.out.println((i + 1) + ". " + templates.get(i));
        }

        // Prompt user to choose a template
        System.out.print("\nEnter the number of the template you want to use: ");
        int selectedTemplateIndex = scanner.nextInt();

        // Fetch the selected template based on the user's choice
        String selectedTemplate = templates.get(selectedTemplateIndex - 1);

        // Prompt user to enter resume details
        System.out.print("\nEnter your full name: ");
        scanner.nextLine(); // Consume the newline character left by nextInt()
        String name = scanner.nextLine();

        System.out.print("Enter your contact information: ");
        String contactInfo = scanner.nextLine();

        System.out.print("Enter your education history: ");
        String education = scanner.nextLine();

        System.out.print("Enter your work experience: ");
        String workExperience = scanner.nextLine();

        System.out.print("Enter your skills: ");
        String skills = scanner.nextLine();

        // Create a new Resume object with the user's input
        Resume userResume = new Resume(name, contactInfo, education, workExperience, skills);

        // Generate and display the resume
        System.out.println("\nGenerating your resume...\n");
        displayResume(selectedTemplate, userResume);

        System.out.println("\nYour resume has been generated successfully!\n");
    }

    // Method to display the generated resume
    private static void displayResume(String template, Resume resume) {
        System.out.println("Selected Template: " + template);
        System.out.println("Name: " + resume.getName());
        System.out.println("Contact Information: " + resume.getContactInfo());
        System.out.println("Education: " + resume.getEducation());
        System.out.println("Work Experience: " + resume.getWorkExperience());
        System.out.println("Skills: " + resume.getSkills());
        // Add more resume sections as needed
    }
}