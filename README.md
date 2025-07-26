# 📝 Online Quiz System

A full-stack Online Quiz Management System built using **Spring Boot (Backend)**, **ReactJS (Frontend)**, and **MySQL** as the database.

---

## 🛠️ Tech Stack

| Layer       | Technology          |
|-------------|---------------------|
| Frontend    | React.js, Axios, Bootstrap |
| Backend     | Spring Boot, Spring Data JPA |
| Database    | MySQL |
| Build Tools | Maven (Java), npm (React) |
| Language    | Java 21, JavaScript |
| Deployment  | Localhost (Can be extended to Render/AWS) |

---

## 📂 Project Structure

quizsystem/
│
├── backend/ # Spring Boot App (Quiz APIs)
│ └── src/main/java/com/quiz/...
│ └── application.properties
│
├── frontend/ # React App
│ └── src/
│ └── package.json
│
└── README.md


---

## 📸 Screenshots

![Quiz Front-End](screenshots/online-quiz-system-frontend-screenshot.png)

---

## 🚀 Features

- Create, view, and delete quiz questions (Admin)
- Take quizzes (User)
- API-driven architecture with React frontend
- RESTful services
- Clean UI with Bootstrap

---

## 🎯 Endpoints (Spring Boot API)

| Method | Endpoint           | Description           |
|--------|--------------------|-----------------------|
| GET    | `/api/questions`   | Get all questions     |
| POST   | `/api/questions`   | Add a question        |
| DELETE | `/api/questions/{id}` | Delete a question |

---

## 🧪 Running the Project

### Backend (Spring Boot)

```bash
cd backend
mvn clean install
mvn spring-boot:run


---

## 🔄 After creating it:

1. Save this as `README.md` in your root folder.
2. Run:
   ```bash
   git add README.md
   git commit -m "Added README file"
   git push
