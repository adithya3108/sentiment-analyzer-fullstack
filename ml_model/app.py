# app.py - Flask microservice for Sentiment Analysis
from flask import Flask, request, jsonify
import pickle

app = Flask(__name__)

# Load model + vectorizer
with open("sentiment_model.pkl", "rb") as f:
    model = pickle.load(f)

with open("vectorizer.pkl", "rb") as f:
    vectorizer = pickle.load(f)

@app.route("/predict", methods=["POST"])
def predict():
    data = request.get_json()
    review = data.get("review", "")

    # Transform input
    review_vec = vectorizer.transform([review])
    prediction = model.predict(review_vec)[0]

    return jsonify({"sentiment": prediction})

if __name__ == "__main__":
    app.run(host="0.0.0.0", port=5000, debug=True)
