# Enterprise Payroll Management System (BHEL Architecture)

A robust, decentralized desktop-driven enterprise payroll system engineered to handle complex institutional human resource metrics, salary calculations, and administrative data processing.

This architecture moves organizations away from volatile spreadsheet-based tracking into a structured relational mapping framework, ensuring complete transactional consistency and comprehensive auditing capabilities.

---

## 🏗️ Technical Architecture & Data Layer

The system decouples data storage from presentation logic, combining a swift, heavy-component Java Swing frontend with a local database engine for optimized record indexing.

```text
  [ Administrative Client ]
             │
             ▼
   ( Java Swing Engine ) ────► Handles GUI Input Form Fields
             │
             ▼
     ( SQLite Driver )   ────► Validates Constraints & Structures Rules
             │
             ▼
    [ empnet.sqlite ]    ────► Implements Persistent Ledger Tracking

```

---

## 📋 Folder Structural Integrity

To maintain a clean portfolio presence, configure your local directory layout to mirror this repository map:

```text
Enterprise-Payroll-System/            
│
├── src/                              
│   └── employee/
│       └── payroll/
│           └── system/
│               ├── db.java                   # Relational Database Connection Utility
│               ├── Emp.java                  # Context Token Session Management
│               ├── EmployeePayrollSystem.java # Core Entry Runtime Main Class
│               ├── login.java / .form        # Dual-Tier Credentials Gatekeeper
│               ├── MainMenu.java / .form     # Administrative Core Routing Hub
│               ├── addEmployee.java / .form  # Employee Onboarding Dashboard
│               ├── Allowance.java / .form    # Bonus & Compensations Engine
│               ├── Audit_details.java / .form# Structural Session Log Auditor
│               ├── employeeDeductions.java   # Net Salary Deduction Pipeline
│               ├── searchEmployee.java       # Personal Profiles Modification Matrix
│               ├── searchEmpSalarySlip.java  # Cryptographic Slip Generator (PDF)
│               ├── updateSalary.java / .form # Baseline Wage Scaling Engine
│               ├── users.java / .form        # Credentials Provisioning Console
│               └── Images/                   # Local Graphical User Interface Assets
│
├── empnet.sqlite                     # Active Persistent Relational Database
└── README.md                         # Project Operations Document

```

---

## 🚀 Core Features & Business Logic

* **Cryptographic PDF Reporting**: Programmatically reads transaction balances out of the database and converts raw figures into formalized document sheets via PDF compiling engines (`itextpdf`).
* **Session Tracking Log Audits**: Actively records user interaction metadata. Any alterations made to baseline corporate financial records are dynamically traced to preserve system internal integrity.
* **Granular Role Isolation**: Enforces specialized permission boundaries via structural role queries (`Admin` vs. `User`) when managing data modifications.
* **Automated Computations Engine**: Instantly computes baseline scaling equations taking parameters like Gross Pay, statutory allowances, and insurance deductions into account before updating balances.

---

## 🛠️ Getting Started

### Prerequisites

* **Java Development Kit (JDK 8 or higher)**.
* Standard cross-platform command line shell or any IDE that processes standard Java projects.

### Compilation and Setup

1. Clone this repository locally.
2. Link your environment build path dependencies to target the necessary integration binaries (`sqlitejdbc`, `rs2xml`, `itextpdf`, and `jdatepicker`).
3. Place the `empnet.sqlite` database asset directly into your project root execution path directory.
4. Execute the system entry point:
```bash
javac employee/payroll/system/login.java
java employee/payroll/system/login

```
