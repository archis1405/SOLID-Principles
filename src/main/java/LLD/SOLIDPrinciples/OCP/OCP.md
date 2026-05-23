# Open/Closed Principle (OCP) — SOLID Design Principles

> **"Software entities (classes, modules, functions, etc.) should be open for extension, but closed for modification."** > — *Bertrand Meyer*

The **Open/Closed Principle (OCP)** is the core foundation of scalable, maintainable, and regression-proof software architecture. It ensures that a system's behavior can be extended without altering its existing, production-tested source code.

---

##  The Core Paradox Explained
At first glance, the principle sounds contradictory. How do you change what a program does without changing its code?

* **Open for Extension:** The *behavior* of the module can be extended. We can make the module behave in new and different ways as the requirements of the application change.
* **Closed for Modification:** Extending the behavior of a module does not result in changes to the *source or binary code* of the module itself.

###  The Secret: Polymorphic Abstraction
We achieve OCP by introducing a **stable contract (Interface or Abstract Class)** between the high-level execution logic and the low-level execution details. The high-level module depends strictly on the interface, meaning its source code is **closed** to changes. New features are introduced by implementing the interface in fresh classes, keeping the architecture **open** to endless growth.

---

##  The Bad Way (Violating OCP)

Consider a `NotificationSender` that directly orchestrates concrete notification classes using conditional branching.

```java
// High-level module tightly coupled to concrete implementations
public class NotificationSender {
    private EmailNotification email = new EmailNotification();
    private SMSNotification sms = new SMSNotification();

    public void sendNotification(String type, String message) {
        if (type.equalsIgnoreCase("EMAIL")) {
            email.sendEmail(message);
        } else if (type.equalsIgnoreCase("SMS")) {
            sms.sendSMS(message);
        }
        //  VIOLATION: To add "PUSH" or "SLACK", we MUST modify this class!
        // This risks introducing regressions into existing Email/SMS channels.
    }
}
```