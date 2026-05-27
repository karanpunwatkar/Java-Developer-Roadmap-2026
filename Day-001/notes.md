# Day 001 Notes — Java Basics
## Date: 27 May 2026
## Goal:
Started the Java Backend Developer journey and learned the fundamentals of Java programming.

---

# 1. Introduction to Java

Java is a high-level, object-oriented programming language developed by Sun Microsystems.

It is widely used for:
- Backend Development
- Enterprise Applications
- Banking Systems
- Android Development
- APIs and Microservices

One of the biggest advantages of Java is:
# "Write Once, Run Anywhere"

This means Java code can run on multiple operating systems because of JVM.

---

# 2. JDK vs JRE vs JVM

This is one of the most important Java interview concepts.

---

## JVM (Java Virtual Machine)

JVM is responsible for running Java bytecode.

Functions of JVM:
- Executes Java programs
- Converts bytecode into machine code
- Makes Java platform independent

Without JVM:
Java programs cannot run.

---

## JRE (Java Runtime Environment)

JRE provides the environment required to run Java applications.

JRE contains:
- JVM
- Libraries
- Supporting files

JRE is mainly used for:
# Running Java programs

---

## JDK (Java Development Kit)

JDK is used for developing Java applications.

JDK contains:
- JRE
- Compiler (javac)
- Development tools

JDK is required for:
# Writing + Compiling + Running Java programs

---

# Java Execution Flow

```txt
Main.java
   ↓
javac compiler
   ↓
Main.class
   ↓
JVM
   ↓
Output