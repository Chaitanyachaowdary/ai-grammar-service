AI Grammar Correction Service

A Spring Boot backend application that demonstrates AI integration in a clean, scalable architecture by providing a Grammar Correction REST API.

--------------------------------------------------
FEATURES
--------------------------------------------------
- Grammar correction using AI
- RESTful API design
- Clean layered architecture
- DTO-based request/response handling
- Centralized exception handling
- Graceful fallback mechanism when AI quota is unavailable
- Easy to extend with other AI capabilities

--------------------------------------------------
TECH STACK
--------------------------------------------------
- Java 21
- Spring Boot 4
- Spring Web
- Jakarta Bean Validation
- Maven
- Embedded Tomcat

--------------------------------------------------
ARCHITECTURE OVERVIEW
--------------------------------------------------
Controller -> Service -> AI Client

Controller:
- Handles HTTP requests and responses
- Exposes REST endpoints

Service:
- Contains business logic
- Orchestrates AI calls

AI Client:
- Encapsulates AI integration logic
- Designed to be replaceable (OpenAI / Mock)

--------------------------------------------------
AI INTEGRATION
--------------------------------------------------
AI Service: OpenAI (Chat Completions API)
Model: gpt-3.5-turbo

Fallback Strategy:
If OpenAI API quota or billing is unavailable, the application gracefully falls back to a mock grammar correction logic to ensure API stability.

--------------------------------------------------
API DETAILS
--------------------------------------------------
Endpoint:
POST /api/v1/ai/grammar

Request:
{
  "text": "he dont knows how to speaks english"
}

Response:
{
  "originalText": "he dont knows how to speaks english",
  "correctedText": "He don't know how to speak english"
}

--------------------------------------------------
CONFIGURATION
--------------------------------------------------
application.properties

spring.application.name=ai-grammar-service
server.port=8080

openai.api.key=YOUR_API_KEY
openai.api.url=https://api.openai.com/v1/chat/completions
openai.model=gpt-3.5-turbo

--------------------------------------------------
HOW TO RUN
--------------------------------------------------
mvn clean spring-boot:run

Application runs at:
http://localhost:8080

--------------------------------------------------
TESTING
--------------------------------------------------
Use Postman:
POST http://localhost:8080/api/v1/ai/grammar
Header: Content-Type: application/json

--------------------------------------------------
DESIGN DECISIONS
--------------------------------------------------
- AI logic isolated in client layer
- Clean separation of concerns
- Graceful error handling and fallback
- Pluggable AI provider design

--------------------------------------------------
FUTURE ENHANCEMENTS
--------------------------------------------------
- Text summarization
- Grammar score & suggestions
- Chat-based AI API
- Multiple AI provider support

--------------------------------------------------
AUTHOR
--------------------------------------------------
Chaitanya Yelamasetty
Backend Developer | Java | Spring Boot

--------------------------------------------------
