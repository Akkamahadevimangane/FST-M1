''' numbers = input("Enter a sequence of comma separated values: ").split(", ")

sum = 0
for number in numbers:
  sum += int (number)

print(sum) '''


# Ask the user to enter a sequence of comma-separated numbers
user_input = input("Enter a sequence of comma-separated numbers: ")

# Convert the input string into a list of integers
numbers = [int(num.strip()) for num in user_input.split(",")]

# Calculate the sum of the list
total_sum = sum(numbers)

# Display the result
print(f"The sum of the numbers is: {total_sum}")