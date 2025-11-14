# Day 1 – JDBC Project  
Repository: [Learning-Advance-Java/AdvJavaDay1/JDBC_Project](https://github.com/ChinmayRandive/Learning-Advance-Java/tree/main/AdvJavaDay1/JDBC_Project)

## Overview  
Welcome to **Day 1** of my Advanced Java journey.  
In this folder I built a JDBC‐based project that demonstrates database connectivity, CRUD operations, and how Java interacts with relational databases.

## Topics Covered  
- Setting up JDBC driver and database connection  
- Performing CRUD (Create, Read, Update, Delete) operations via JDBC  
- Using `Statement` vs `PreparedStatement`  
- Handling exceptions and transactions  
- Best practices for resource closing (try‐with‐resources)  

## Code Summary  
Here’s a quick summary of what each file does:

| File                        | Description                                                                             |
|-----------------------------|-----------------------------------------------------------------------------------------|
| `DBConnectionUtil.java`      | Utility class for opening & closing JDBC connections.                                   |
| `EmployeeDAO.java`           | Data Access Object for Employee table: methods for insert, update, delete, fetch.       |
| `Employee.java`              | Model/entity class representing the Employee record.                                     |
| `JDBCProjectMain.java`       | Main class with `main()` method to demonstrate the workflow: create table, insert records, query, display results. |
| `TransactionDemo.java`        | (Optional) Example of using transaction control: committing/rolling‐back multiple operations. |

*(Add or remove rows according to your actual files.)*

## How to Run  
1. Clone this repository (or just the `JDBC_Project` folder)  
   ```bash
   git clone https://github.com/ChinmayRandive/Learning-Advance-Java.git
   cd Learning-Advance-Java/AdvJavaDay1/JDBC_Project
