import React, { useState } from "react";

function SentimentForm() {
  const [review, setReview] = useState("");
  const [result, setResult] = useState(null);

  const handleSubmit = async (e) => {
    e.preventDefault();

    try {
      const response = await fetch("http://localhost:8080/api/sentiment/analyze", {
        method: "POST",
        headers: { "Content-Type": "application/json" },
        body: JSON.stringify({ review }),
      });

      const data = await response.json();
      setResult(data.sentiment);
    } catch (error) {
      console.error("Error:", error);
    }
  };

  return (
    <div style={{ maxWidth: "500px", margin: "50px auto", textAlign: "center" }}>
      <h2>🎬 Movie Review Sentiment Analyzer</h2>
      <form onSubmit={handleSubmit}>
        <textarea
          rows="4"
          cols="50"
          placeholder="Type your movie review here..."
          value={review}
          onChange={(e) => setReview(e.target.value)}
          required
          style={{ width: "100%", padding: "10px" }}
        />
        <br />
        <button type="submit" style={{ marginTop: "10px", padding: "10px 20px" }}>
          Analyze
        </button>
      </form>

      {result && (
        <h3 style={{ marginTop: "20px" }}>
          Sentiment: <span style={{ color: result === "positive" ? "green" : "red" }}>{result}</span>
        </h3>
      )}
    </div>
  );
}

export default SentimentForm;
