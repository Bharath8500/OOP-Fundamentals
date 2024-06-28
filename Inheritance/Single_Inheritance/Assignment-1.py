import matplotlib.pyplot as plt
import numpy as np
scores = [85, 90, 78, 92, 88, 85, 75, 95, 89, 82, 91, 86, 79, 88, 94, 87, 83, 81, 93, 84, 88, 87, 90, 82, 86, 91, 87, 88, 89, 84]

plt.hist(scores, bins=8, edgecolor='k', alpha=0.7)
plt.xlabel('Scores')
plt.ylabel('Frequency')
plt.title('Histogram of Exam Scores')
plt.show()
mean_score = np.mean(scores)
std_deviation = np.std(scores)

print(f"Mean: {mean_score}")
print(f"Standard Deviation: {std_deviation}")
z = (90 - mean_score) / std_deviation

# Using a standard normal distribution table or calculator, find the cumulative probability for z.
cumulative_prob = 1 - 0.8159  # For z ≈ 0.25

percentage_above_90 = cumulative_prob * 100
print(f"Percentage of students scoring above 90: {percentage_above_90:.2f}%")
