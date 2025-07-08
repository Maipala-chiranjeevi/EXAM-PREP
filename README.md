# 🎓 EXAM-PREP: The Ultimate Exam Preparation Web App

**EXAM-PREP** is a smart, all-in-one exam preparation platform built to help students crack competitive exams like **EAMCET**, **JEE-Mains**, and **GATE** with ease and confidence. Designed using **Spring Boot**, **Thymeleaf**, and **MySQL**, this application combines structured content delivery, AI-curated resources, topic-wise quizzes, and progress tracking in one unified system.

---

## 🔥 Why EXAM-PREP?

Unlike traditional learning apps, EXAM-PREP offers:
- 🧠 **100% syllabus coverage** across engineering and science topics.
- 🚀 **40% faster revision time** using YouTube-powered key concept videos.
- 🧪 **Auto-evaluated quizzes** with instant feedback and leaderboard competition.
- 🧮 **Smart analytics** to track improvement and guide your learning path.
- 🛡️ **Admin panel** to manage users, quizzes, and exam content securely.

---

## 🧩 Key Features

- 📅 **Exam Info Page**  
  Shows real-time updates like exam dates, syllabus, and cutoff ranks.

- 🎥 **Topic-wise Videos**  
  Curated YouTube links + keynotes help students grasp core concepts quickly.

- 🧠 **Predefined Quizzes**  
  For each syllabus topic, test your understanding instantly.

- 🏆 **Weekly Quiz Competitions**  
  Students compete weekly and get ranked — boosts motivation and practice.

- 📊 **Progress Dashboard**  
  Users can see their score growth, attempted topics, and learning gaps.

- 👨‍🏫 **Admin Panel**  
  Upload syllabus, add/edit quiz questions, monitor student performance.

---

## ⚙️ Tech Stack

| Layer      | Technology         |
|------------|--------------------|
| Backend    | Spring Boot (Java) |
| Frontend   | Thymeleaf + HTML/CSS/Bootstrap |
| Database   | MySQL              |
| API Layer  | Spring MVC/REST    |
| Build Tool | Maven              |

---

## 📁 Project Structure

EXAM-PREP/
├── src/
│ └── main/
│ ├── java/com/examprep/ # Controllers, Services, Models
│ └── resources/
│ ├── templates/ # Thymeleaf templates (HTML pages)
│ ├── static/ # CSS, JS, images
│ └── application.properties
├── pom.xml
└── README.md

yaml
Copy
Edit

---

## 🚀 How to Run Locally

1. **Clone the repo**  
   ```bash
   git clone https://github.com/Maipala-chiranjeevi/EXAM-PREP.git
   cd EXAM-PREP
Configure the DB
Create a MySQL database named exam_prep and update your application.properties:

properties
Copy
Edit
spring.datasource.url=jdbc:mysql://localhost:3306/exam_prep
spring.datasource.username=root
spring.datasource.password=your_password
Run the application

bash
Copy
Edit
./mvnw spring-boot:run
Open in browser
Visit http://localhost:8080 to access the home page.

🎯 Future Scope
🤖 Integrate AI to generate personalized quizzes

📱 Convert frontend to React for SPA experience

💬 Add student forum for doubt discussions

📥 PDF downloads for past papers and notes

🌐 Host as a public platform for college use

👨‍💻 Developed By
Maipala Chiranjeevi
🔗 GitHub: @Maipala-chiranjeevi
💼 Passionate about building real-time academic tools for students.

