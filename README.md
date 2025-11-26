# ATM Machine Simulation 🏧

A simple console-based ATM Machine simulation built in Java. This project demonstrates core Object-Oriented Programming (OOP) concepts such as Classes, Objects, Methods, and Flow Control.

## 🚀 Features

* **PIN Verification:** Secure access using a hardcoded PIN (`1234`).
* **Account Balance Check:** View current account balance.
* **Deposit Money:** Add funds to the account.
* **Withdraw Money:** Withdraw funds with validation (checks for sufficient balance).
* **Menu-Driven Interface:** Interactive console menu for user operations.
* **Recursion:** Uses recursion for the menu loop and invalid PIN re-attempts.

## 🛠️ Technologies Used

* **Language:** Java (JDK 8+)
* **Concepts:** OOPs (Encapsulation, Classes, Objects), Recursion, Conditional Statements.
* **Input Handling:** `java.util.Scanner` class.

## 📂 Project Structure

* `ATMMachine.java`: Contains the `main` method to start the program.
* `ATM`: The helper class containing the logic for banking operations (`checkpin`, `withdrawMoney`, `depositMoney`, etc.).

## 💻 How to Run

1.  **Clone the repository**
    ```bash
    git clone [https://github.com/your-username/your-repo-name.git](https://github.com/your-username/your-repo-name.git)
    ```

2.  **Navigate to the project directory**
    ```bash
    cd your-repo-name
    ```

3.  **Compile the Java file**
    ```bash
    javac ATMMachine/ATMMachine.java
    ```
    *(Note: Ensure your folder structure matches the package declaration `package ATMMachine;`)*

4.  **Run the application**
    ```bash
    java ATMMachine.ATMMachine
    ```

## 📸 Output Example

```text
Enter your pin: 1234

 Enter your choice:
1. Check A/C Balance
2. Withdraw Money
3. Deposit Money
4. EXIT

:- 3

 Enter the amount: 5000

 Money depositly Successful

 Enter your choice:
1. Check A/C Balance...
