# 🚀 AI Log Analyzer Service

![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.3.1-6DB33F?logo=springboot)
![Java](https://img.shields.io/badge/Java-17-007396?logo=openjdk)
![Build](https://img.shields.io/badge/Build-Maven-C71A36?logo=apachemaven)
![AI](https://img.shields.io/badge/AI-OpenAI-blueviolet?logo=openai)
![Status](https://img.shields.io/badge/Status-Active-success)
![License](https://img.shields.io/badge/License-MIT-green)

---

## 📌 Overview

AI Log Analyzer is a Spring Boot microservice that analyzes application logs using AI and provides:

- Root cause analysis
- Impact assessment
- Fix recommendations
- Confidence score

It helps developers debug production issues faster.

---

## 🧠 Features

✔ AI-based log analysis  
✔ Root cause detection  
✔ Suggested fixes  
✔ REST API support  
✔ Production-ready structure  
✔ Clean JSON responses  
✔ Easily pluggable AI provider  

---

## 🏗 Architecture
Client
│
▼
Spring Boot REST API
│
▼
AI Service Layer
│
▼
OpenAI / Free AI Provider
│
▼
Analysis Response (JSON)

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

## 📂 Project Structure

src/main/java/com/loganalyzer
│
├── controller
│ └── LogAnalysisController.java
│
├── service
│ └── AIAnalysisService.java
│
├── config
│ └── RestTemplateConfig.java
│
├── model
│ └── AnalysisResponse.java
│
└── LogAnalyzerApplication.java


---

## 🚀 Getting Started

### 1. Clone Repository

```bash
git clone https://github.com/yourusername/log-analyzer-ai.git
cd log-analyzer-ai
server.port=8080
