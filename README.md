# 🤖 AI Log Analyzer

![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.3.1-6DB33F?logo=springboot)
![Java](https://img.shields.io/badge/Java-17-007396?logo=openjdk)
![Build](https://img.shields.io/badge/Build-Maven-C71A36?logo=apachemaven)
![AI](https://img.shields.io/badge/AI-OpenAI-blueviolet?logo=openai)
![Status](https://img.shields.io/badge/Status-Active-success)

AI-powered log analyzer built using Spring Boot and LLM.

---
## 📌 Overview

AI Log Analyzer is a Spring Boot microservice that analyzes application logs using AI and provides:

- Root cause analysis
- Impact assessment
- Fix recommendations
- Confidence score

It helps developers debug production issues faster.

---
## 🚀 Features

- AI-powered log analysis
- Root cause detection
- Suggested fixes
- Structured JSON output
- Production-ready architecture

---


## ⚙️ Tech Stack

| Technology | Version |
|-----------|---------|
| Java | 17 |
| Spring Boot | 3.3.1 |
| Maven | 3.x |
| REST API | Spring Web |
| AI Integration | OpenAI / Free LLM |
| JSON Processing | Jackson |

---

## 🚀 Getting Started

### 1. Clone Repository

```bash
git clone https://github.com/yourusername/ai-log-analyzer.git
cd ai-log-analyzer

---

## ▶️ Run Application

```bash
mvn spring-boot:run
```

---

## 🧪 Test API

```bash
curl -X POST http://localhost:8080/api/v1/ai/logs/analyze \
-H "Content-Type: application/json" \
-d '{"log":"database connection timeout"}'
```

---

## 🧠 Example Response

```json
{
    "confidence": "HIGH",
    "fix": "Increase the connection pool size in application.properties (e.g., spring.datasource.maximum-pool-size=20) and verify PostgreSQL database server status and network connectivity. Additionally, check the database connection timeout configuration (e.g., spring.datasource.tomorrow=30000) and adjust as needed",
    "impact": "Spring Boot application unable to connect to PostgreSQL database, resulting in failed transactions and potential data loss",
    "rootCause": "PostgreSQL database connection timeout due to exhausted connection pool or database unavailability"
}
```
```
