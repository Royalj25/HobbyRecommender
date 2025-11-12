# 🧩 Hobby Recommender

This program recommends a **hobby** based on the user's yes/no answers.  
It asks a series of questions about preferences (indoor/outdoor, artistic, technical, social, physical, nature, etc.) and provides a hobby suggestion that fits the answers.

---

## 📂 Files

- [`HobbyRecommender.java`](./HobbyRecommender.java) — main source code file containing the program logic.  
- [`SampleOutput.md`](./SampleOutput.md) — shows multiple example runs of the program with different input paths and the resulting hobby recommendation.

---

## 🧠 Program Description

The `HobbyRecommender` program uses **simple conditional logic** and **nested if-statements** to guide users through a short question flow.  
Each question filters the user’s preferences to narrow down a fitting hobby.

If the user responds **“no”** to finding a new hobby, the program exits immediately with a short message.  
Otherwise, it continues asking personalized questions until a final recommendation is reached — for example, **Painting**, **Programming**, **Go-Karting**, or **Weightlifting**.

The goal is to demonstrate:
- How user input can direct program flow using conditional statements.
- How nested decision structures can be used to simulate interactive choice systems.
- How case-insensitive input improves usability and error tolerance.

---

## ⚙️ How It Works (Step-by-Step Overview) 

You can find sample test inputs and outputs in [`SampleOutput.md`](./SampleOutput.md),
but here’s a general overview of the process:

1. The program welcomes the user and asks if they are interested in finding a new hobby.  
2. If “yes,” it continues through a decision tree of questions (indoor/outdoor, physical/technical/artistic, etc.).  
3. Based on the combination of answers, it prints a specific **hobby recommendation**.  
4. If “no,” the program thanks the user and ends.  
5. The program automatically handles **case-insensitive input**, so answers like “YES,” “Yes,” or “yeS” all work the same.

---

## 👀 Did you check out `CreateNewUser` yet?
- Here is an easier way to get there --> [`CreateNewUser`](https://github.com/Royalj25/CreateNewUser.git)
- Want to return to the main repository? --> Visit the [`Portfolio`](https://github.com/Royalj25/Portfolio.git)
