### Briefly summarize your client, Artemis Financial, and its software requirements. Who was the client? What issue did the company want you to address?
Artemis Financial is a consulting company that develops individualized financial plans for its customers covering savings, retirement, investments, and insurance. The company wanted to modernize its web application by adding secure communication mechanisms, specifically a checksum verification feature and HTTPS support to protect client data in transit.

### What did you do well when you found your client's software security vulnerabilities? Why is it important to code securely? What value does software security add to a company's overall well-being?
Identifying the lack of encryption and secure communication protocols in the existing application was handled well, and appropriate solutions were implemented using SHA-256 hashing and TLS configuration. Coding securely is important because vulnerabilities in financial software can lead to data breaches, regulatory penalties, and loss of client trust, all of which can cause lasting damage to a company's reputation and bottom line.

### Which part of the vulnerability assessment was challenging or helpful to you?
Configuring the HTTPS connection using a self-signed certificate and integrating it properly with Spring Boot was the most challenging part of the process. Running the OWASP dependency-check tool was particularly helpful because it provided a clear picture of which dependencies carried known vulnerabilities.

### How did you increase layers of security? In the future, what would you use to assess vulnerabilities and decide which mitigation techniques to use?
Security was layered by implementing SHA-256 checksum verification for data integrity, converting the application from HTTP to HTTPS using TLS, and running automated static analysis with the OWASP dependency-check tool. In the future, the OWASP Vulnerability Assessment Process Flow and dependency scanning tools would guide which areas to prioritize and which mitigation techniques to apply.

### How did you make certain the code and software application were functional and secure? After refactoring the code, how did you check to see whether you introduced new vulnerabilities?
The application was tested by running it and confirming the hash endpoint returned the correct checksum over HTTPS on port 8443. After refactoring, the OWASP dependency-check tool was run again to confirm that no new vulnerabilities were introduced through the added code.

### What resources, tools, or coding practices did you use that might be helpful in future assignments or tasks?
The OWASP dependency-check Maven plugin, Java Keytool for certificate generation, and the SHA-256 implementation through Java's MessageDigest class were all valuable tools. The OWASP Cheat Sheet Series and NIST documentation were also useful references for making informed security decisions.

### What might you show future employers from this assignment?
This project demonstrates the ability to identify security vulnerabilities in an existing application, implement cryptographic solutions, configure secure server communications, and validate security compliance through automated static analysis, all of which are practical and in-demand skills in software development.
