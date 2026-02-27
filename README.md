```markdown
# 🤖 AI Log Analyzer

![Spring Boot](https://img.shields.io/badge/SpringBoot-3.3.1-brightgreen)
![Java](https://img.shields.io/badge/Java-17-orange)
![AI](https://img.shields.io/badge/AI-Groq-blue)
![License](https://img.shields.io/badge/license-MIT-green)

AI-powered log analyzer built using Spring Boot and LLM.

---

## 🚀 Features

- AI-powered log analysis
- Root cause detection
- Suggested fixes
- Structured JSON output
- Production-ready architecture

---

## 📁 Project Structure

```text
src/main/java/com/loganalyzer
│
├── controller
│   └── LogAnalysisController.java
│
├── service
│   └── AIAnalysisService.java
│
├── config
│   └── RestTemplateConfig.java
│
├── model
│   └── AnalysisResponse.java
│
└── LogAnalyzerApplication.java
```

---

## ▶️ Run Application

```bash
mvn spring-boot:run
```

---

## 🧪 Test API

```bash
curl -X POST http://localhost:8080/api/analyze \
-H "Content-Type: application/json" \
-d '{"log":"database connection timeout"}'
```

---

## 🧠 Example Response

```json
{
  "rootCause": "Connection pool exhausted",
  "impact": "Service unavailable",
  "fix": "Increase connection pool size",
  "confidence": "HIGH"
}
```
```
