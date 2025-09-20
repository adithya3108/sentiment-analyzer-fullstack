# 🎬 Sentiment Analyzer – Fullstack Project  

## 📌 Overview  
This is a **fullstack Sentiment Analysis application** built with:  
- 🧠 **ML Model (Python, Scikit-learn, Colab)** – Trained on IMDB reviews  
- 🔗 **Flask Microservice** – Serves predictions from the trained model  
- ☕ **Spring Boot Backend** – Main backend that talks to Flask  
- 💻 **React Frontend** – User interface for submitting reviews  

---

```
sentiment-analyzer-fullstack/
│
├── ml_model/                 # ML model training & serving
│   ├── train_model.ipynb     # Colab notebook for training
│   ├── sentiment_model.pkl   # Saved ML model
│   ├── vectorizer.pkl        # Saved TF-IDF vectorizer
│   ├── app.py                # Flask API to serve model
│
├── sentiment-analyzer-backend/   # Spring Boot backend
│   ├── src/main/java/com/example/sentiment/...
│   ├── pom.xml
│
├── sentiment-frontend/       # React frontend
│   ├── src/
│   ├── package.json
│
└── README.md
```


---

## ⚙️ Step 1 – Train the Model  

1. Open the `train_model.ipynb` notebook in Google Colab.  
2. Load the IMDB Dataset (`IMDB_Dataset.csv`).  
3. Preprocess the text using TF-IDF vectorization.  
4. Train a Logistic Regression model on the dataset.  
5. Save the trained model as `sentiment_model.pkl` and the vectorizer as `vectorizer.pkl`.  
6. Place both files in the `ml_model/` folder.  

---

## ⚙️ Step 2 – Run Flask ML Service  

- Start the Flask microservice located in the `ml_model/` folder.  
- The service will serve predictions for movie reviews.  
- Users can send a review to the service and receive a **Positive** or **Negative** sentiment response.  

---

## ⚙️ Step 3 – Run Spring Boot Backend  

- Start the Spring Boot backend.  
- The backend handles requests from the frontend and forwards them to the Flask ML service.  
- Users can send a review to the backend and receive a sentiment response.  
- Ensure that the Flask ML service is running for the backend to work.  

---

## ⚙️ Step 4 – Run React Frontend  

- Start the React frontend.  
- Open the application in a web browser.  
- Users can enter a movie review and click **Analyze** to see the sentiment result.  
- Ensure that the Spring Boot backend is running so the frontend can fetch predictions.  

---

## 🚀 Usage Flow  

1. User enters a review in the frontend.  
2. The frontend sends the request to the Spring Boot backend.  
3. The backend forwards the request to the Flask ML microservice.  
4. The Flask service predicts the sentiment using the trained model.  
5. The result is returned to the frontend and displayed to the user.  

---

## 🌟 Features  

- Fullstack integration of React, Spring Boot, and Python ML model.  
- Modular design allows the ML service to be replaced with a more advanced model.  
- Can be extended to include confidence scores, multi-class sentiment, or database storage.  

---

 
