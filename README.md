# Hibernate User Password Manager

## Overview
This is a simple console-based application built using Java and Hibernate to manage user passwords. It allows users to register, login, view their passwords, and update their passwords for various platforms like Facebook, Instagram, Snapchat, etc.

## Features
- **User Registration:** Allows users to register by providing basic information like name, email, phone, and password.
- **User Login:** Users can login using their email and password.
- **Password Management:** Users can view their passwords and update passwords for different platforms.

## Technologies Used
- Java
- Hibernate
- MySQL (or your preferred database)
- Maven (for dependency management)

## How to Run
1. Clone the repository to your local machine.
2. Set up your database and configure the Hibernate properties in `hibernate.cfg.xml`.
3. Compile the Java classes.
4. Run the `Main` class to start the application.

## Usage
- Upon starting the application, you'll be prompted to choose between registration and login.
- If you choose registration, you'll be asked to provide your details.
- If you choose login, you'll need to enter your email and password.
- After login, you can choose to view your passwords or update them.

## Database Schema
- **User**
  - id (int, primary key)
  - name (varchar)
  - email (varchar, unique)
  - phone (bigint)
  - password (varchar)

## Dependencies
- Hibernate Core
- MySQL Connector (or your preferred database connector)
- Apache Commons (for utility functions)
- JUnit (for testing)

## Future Improvements
- Implement password encryption for improved security.
- Add support for more password management features.
- Enhance user interface for better user experience.
```Welcome
enter 
1.Resister 
2.Login
1
Enter the id
1
enter the name
Omkar
enter the phone
1234567890
enter the email
omkar@example.com
enter password
password123
user registered successfully

Welcome
enter 
1.Resister 
2.Login
2
enter email
omkar@example.com
enter password
password123
user login successful
1.to view password 
2.to update password
1
User ID: 1
Facebook Password: null
Instagram Password: null
Snapchat Password: null
X Password: null

Welcome
enter 
1.Resister 
2.Login
2
enter email
omkar@example.com
enter password
password123
user login successful
1.to view password 
2.to update password
2
1.to update fbPassword 
2.update instaPassword 
3.update Snapchat password 
4.to update x password
1
enter fbPassword
fbpassword123
data updated successfully
password updated isfbpassword123

Welcome
enter 
1.Resister 
2.Login
2
enter email
omkar@example.com
enter password
password123
user login successful
1.to view password 
2.to update password
1
User ID: 1
Facebook Password: fbpassword123
Instagram Password: null
Snapchat Password: null
X Password: null

Welcome
enter 
1.Resister 
2.Login
2
enter email
omkar@example.com
enter password
password123
user login successful
1.to view password 
2.to update password
2
1.to update fbPassword 
2.update instaPassword 
3.update Snapchat password 
4.to update x password
2
enter instaPassword
instapassword123
data updated successfully
password updated isinstapassword123
```

