This repo contains doselect task

Full Stack Project - DoSelectAssignment
Welcome to the DoSelectAssignment project. This repository contains a Spring Boot backend and a frontend component. The project is set up with basic functionality, and some code has been removed for candidates to complete.

Project Setup Instructions
Backend Setup
Clone the Repository
git clone https://github.com/MoAbid951/do_select_assignment.git
cd do_select_assignment/backend

Install Dependencies
Make sure you have Java 11+ and Maven installed.

to run the application run followinjg command in terminal
mvn spring-boot:run

Instructions Backend
All methods logic is removed from controller. you need to write logic for those methods. Note that in controller need to call service methods from service class, we are calling repository methods. in repository also you need to write queries based on method requirements. These methods should interact with your database to perform the required operations.

Instructions Front End
The StudentList component currently accepts students as a prop. Implement logic to fetch student data from the API and pass it to this component.

Running Tests
To run your tests, you can use your IDE’s test runner or run the following command in your terminal: mvn test

Notes:
Backend Setup: Adjust the setup instructions based on your actual requirements and dependencies.
Frontend Setup: Add any necessary instructions if you have a frontend component.
Filling in the Removed Code**: Provide detailed instructions on what needs to be implemented.
Unit Testing: Include specific instructions and tools relevant to your project.
Feel free to adjust any sections based on your project's needs.

front end unit test cases: 

Install Required Packages: Ensure you have Jest and React Testing Library installed. If not, you can add them with:

npm install --save-dev jest @testing-library/react @testing-library/jest-dom


Run your tests using Jest:
npm test
