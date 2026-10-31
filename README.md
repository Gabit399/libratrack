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

## Run locally (after implementation)

1. Create database: `createdb libratrack`
2. Set `spring.datasource.username` / `password` in `application.yml`
3. `./mvnw spring-boot:run` → http://localhost:8080

## Links

- Proposal: [docs/LibraTrack_Proposal.pdf](docs/LibraTrack_Proposal.pdf)
- UX/UI design: https://claude.ai/artifact/Se3B8pGnVpLR2x7LY9ba5Y
