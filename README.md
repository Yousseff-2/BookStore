# 📘 Quantum Book Store

Welcome to **Quantum Book Store**, an online bookstore application that supports different types of books such as paper books, eBooks, and demo/showcase books.

---

##  Features

-  Manage inventory of:
  - **Paper books** (with stock & shipping)
  - **eBooks** (with file type & sent via email)
  - **Demo/Showcase books** (not for sale)
-  Add, remove, and list books
-  Email functionality for sending eBooks
-  Automatically remove outdated books
-  Object-Oriented Design using Inheritance

---

##  Project Structure

```
BookStore/
├── .idea/ # IntelliJ project settings
├── Assets/ # Screenshots used in README
│ ├── 1.png
│ ├── 2.png
│ ├── 3.png
│ ├── 4.png
│ ├── 5.png
│ ├── 6.png
│ ├── 11.png
│ └── 22.png
├── Bookstore/ # Main source folder
│ ├── model/ # Book classes (PaperBook, EBook, DemoBook)
│ ├── service/ # EmailService, etc.
│ └── Main.java # Application entry point
├── out/ # Compiled output (by IntelliJ)
├── README.md # Project documentation
└── .gitignore # Git ignore rules
```

---

##  Technologies Used

- Java
- IntelliJ IDEA

---



## Test Cases

### ✅ Add Books Test
![Add Books](assets/1.png)

---

### ✅ Buy Paper Book Test
![Buy Paper Book](assets/2.png)

---

### ✅ Buy EBook Test
![Buy EBook](assets/3.png)

---

### ✅ Remove Books Test
![Remove Book](assets/4.png)

---

### ✅ Buy Demo Book Test
![Buy Demo Book](assets/5.png)

---

### ✅ Buy More Than The Stock Test
![Buy More Than The Stock](assets/6.png)

---

### Output Of All Tests In Arrange
![Output Page 1](assets/11.png)  
![Output Page 2](assets/22.png)


## How to Run

1. Clone the repo:
   ```bash
   git clone https://github.com/Yousseff-2/BookStore.git
   cd BookStore
   ```

2. Open the project in **IntelliJ IDEA**

3. Build and run `Main.java` from the `src` directory

---


