# SpringBoot_Lesson1_Sample1

https://www.youtube.com/watch?v=Grqtfa4xkvg&t=35s

## Propmt for the Code Agent (Codex, Gemini Code Assistant or Copilot)

**Context**:

You are an expert Java developer. We are creating a simple command-line application to demonstrate the problem of tight coupling. 

We will not use Spring or any frameworks for this part. The application will have a message service that is directly created by the main application class.

**Task**:

Create a simple Maven project with two Java classes.

**Constraints**:

- Java 17

- No Spring dependencies.

**Steps**:

1.  Generate a `pom.xml` for a basic Java 17 project.

2.  Create a `MessageService.java` class with a single method `public String getMessage()` that returns "Hello, world!".

3.  Create a `MainApplication.java` class with a `main` method.

4.  Inside the `main` method, instantiate `MessageService` using the `new` keyword (e.g., `MessageService service = new MessageService();`).

5.  Print the result of calling the `getMessage()` method to the console.

6.  Provide the command to compile and run this application using Maven.

**Deliverables**:

- `pom.xml`

- `src/main/java/com/example/demo/MessageService.java`

- `src/main/java/com/example/demo/MainApplication.java`

- The `mvn` command to execute the application.

**Acceptance Criteria**:

•	The project compiles successfully.

•	Running the main method in your IDE or via the command line prints "Hello, world!" to the console.

•	The MainApplication class explicitly contains the line new MessageService().
