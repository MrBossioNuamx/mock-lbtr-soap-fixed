# LBTR SOAP Mock Service

This project is a **Spring Boot** application designed to mock the SOAP Web Services of the **BCRP LBTR (Liquidación Bruta en Tiempo Real)** system.

It allows developers to test SOAP clients without connecting to the actual BCRP test or production environments. The application uses **Excel files** as a lightweight database to manage users, sessions, and operation data.

## ? Features

*   **Authentication Service:**
    *   `logon`: Validates credentials against an Excel file and returns a unique Session ID (SID).
    *   `logoff`: Invalidates active sessions.
*   **Query Service (Consultas):**
    *   `lbtr_OperacionesRecibidas`: Returns a list of operations matching the requested date, reading data from an Excel file.
*   **Transfer Service (Transferencias):**
    *   `instruirTransferenciaCavali`: Validates the session and digital signature, prints the received payload to the console, and returns a success response.
*   **Session Management:** Handles session expiration (TTL) and validation.

## ?? Prerequisites

*   **Java 8** (JDK 1.8)
*   **Maven** 3.6+

## ?? Configuration & Setup

### 1. Excel Data Sources
The application relies on three Excel files located in the `excel/` directory at the root of the project. You must ensure these files exist and are formatted correctly:

*   **`auth.xlsx`**: Contains valid user credentials (`codigo`, `password`, `ksim`, `firma`).
*   **`sessions.xlsx`**: Stores active sessions (leave this file empty with just the header row; the app writes to it).
*   **`lbtr_OperacionesRecibidas.xlsx`**: Contains the mock data for operations.
    *   *Note:* The service filters this file by the **Date** provided in the SOAP request. Ensure the dates in the Excel file match the date you are querying.

### 2. Port Configuration
The application runs on port **8090** by default. You can change this in `src/main/resources/application.properties`.

## ?? How to Run

Open a terminal in the project root and run:

```bash
mvn spring-boot:run
```

## ? Endpoints (WSDL)

Once the application is running, the WSDL definitions are available at:

*   **Authentication:** `http://localhost:8090/soap/auth?wsdl`
*   **Queries:** `http://localhost:8090/soap/consultas?wsdl`
*   **Transfers:** `http://localhost:8090/soap/transferencia?wsdl`

## ? Testing

A **Postman Collection** (`LBTR_Mock_Test.postman_collection.json`) is included in the root of the repository. You can import this into Postman to easily test the full flow:

1.  **Logon:** Authenticates and automatically saves the `sessionId`.
2.  **Operaciones Recibidas:** Queries data using the saved session.
3.  **Instruir Transferencia:** Simulates a transfer instruction.
4.  **Logoff:** Closes the session.
