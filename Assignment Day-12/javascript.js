//Assignment 1: Create a JavaScript object representing a user with properties for name, email, and age.
// Write functions that manipulate this object, such as changing the name, updating the email, and calculating the user's birth year.

// Creating a user object
let user = {
    name: "mubeen",
    email: "mubeen@example.com",
    age: 24
};

// Function to change the name
function changeName(newName) {
    user.name = newName;
}

// Function to update the email
function updateEmail(newEmail) {
    user.email = newEmail;
}

// Function to calculate the birth year
function calculateBirthYear(currentYear) {
    return currentYear - user.age;
}

console.log("Initial user object:", user);


changeName("Faheem");
console.log("After name change:", user);

updateEmail("faheem@example.com");
console.log("After email update:", user);

let birthYear = calculateBirthYear(2024);
console.log("Birth Year:", birthYear);
