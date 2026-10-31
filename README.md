# LibraTrack — University Library Management System

Final Exam Project · Development of Web Applications in Java Spring

LibraTrack is a Spring Boot web application where readers search the library catalog, reserve books and track due dates, and librarians manage books and loans.

## Author

**Gabit Mukan** — individual project (UX/UI, backend, database, frontend, testing)

## Tech stack

Java 21 · Spring Boot 3 · Spring MVC · Thymeleaf · Spring Data JPA / Hibernate · PostgreSQL · Spring Security · Spring Validation · Lombok · Maven · JUnit 5 / Mockito · Postman

## Architecture

```
Frontend (Thymeleaf + JS) → Controller → Service → Repository → PostgreSQL
```

## Planned package structure

```
src/main/java/kz/libratrack
├── config/        SecurityConfig
├── controller/    CatalogController, LoanController, AdminController, AuthController
│   └── api/       BookRestController, LoanRestController
├── service/       BookService, LoanService, UserService
├── repository/    BookRepository, LoanRepository, UserRepository, GenreRepository
├── entity/        User, Book, Genre, Loan, Role, LoanStatus
└── dto/           BookDto, LoanDto, RegisterForm, BookForm
src/main/resources
├── templates/     login, register, catalog, book-details, loans, profile, admin/*
├── static/        css/, js/
└── application.yml
```

## Run locally

Requirements: JDK 21+ (Maven is included as `./mvnw`).

1. Open the project in IntelliJ IDEA (it is detected as a Maven project).
2. Run `src/main/java/kz/libratrack/LibraTrackApplication.java` (green ▶ next to `main`), or in a terminal: `./mvnw spring-boot:run`
3. Open http://localhost:8080

By default the `dev` profile uses an in-memory H2 database with demo books (H2 console: http://localhost:8080/h2-console, JDBC URL `jdbc:h2:mem:libratrack`).

To use PostgreSQL: create the database `libratrack` and run with the `postgres` profile:
`SPRING_PROFILES_ACTIVE=postgres DB_USERNAME=postgres DB_PASSWORD=secret ./mvnw spring-boot:run`

## Links

- Proposal: [docs/LibraTrack_Proposal.pdf](docs/LibraTrack_Proposal.pdf)
- UX/UI design: https://gabit399.github.io/libratrack/docs/prototype/
