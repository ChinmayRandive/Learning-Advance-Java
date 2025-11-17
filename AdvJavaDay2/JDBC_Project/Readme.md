# Day 2 – JDBC Project (Advanced Java)  
Repository: `Learning-Advance-Java/AdvJavaDay2/JDBC_Project`

## Overview  
On **Day 2** of Advanced Java, I extended my JDBC project to include more advanced database operations and structure. This iteration focuses on better design (e.g., DAO pattern), transaction handling, and perhaps connection pooling or prepared statements.

## Topics Covered  
- DAO (Data Access Object) pattern for cleaner separation of DB operations  
- Using `PreparedStatement` to prevent SQL injection  
- Transaction management (commit / rollback)  
- Handling resource cleanup with `try-with-resources`  
- (Optional) Connection pooling (if implemented)  
- Exception handling and custom DB exceptions  

## Project Structure & Code Summary  
Here is a summary of the key files in this project:

| File | Description |
|---|---|
| `DBUtil.java` | Utility class for obtaining and closing database connections. |
| `Employee.java` | Entity class representing an Employee. |
| `EmployeeDAO.java` | DAO interface declaring database operations (CRUD). |
| `EmployeeDAOImpl.java` | Implementation of `EmployeeDAO` using JDBC. |
| `JDBCMain.java` | Main class to run the application and demo CRUD + transaction operations. |
| `TransactionExample.java` | Demonstrates transaction usage: commit, rollback on failures. |
| `DBException.java` | Custom exception class for handling JDBC-related exceptions. |

*(Modify the above rows as per the exact file names and structure in your project.)*

## How to Set Up & Run  
1. **Clone the repository**  
   ```bash
   git clone https://github.com/ChinmayRandive/Learning-Advance-Java.git  
   cd Learning-Advance-Java/AdvJavaDay2/JDBC_Project  
