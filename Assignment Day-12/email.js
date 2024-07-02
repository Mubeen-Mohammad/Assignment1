document.getElementById('emailForm').addEventListener('submit', function(event) {
    event.preventDefault(); // Prevent the form from submitting

    const emailInput = document.getElementById('email');
    const errorMessage = document.getElementById('errorMessage');
    const email = emailInput.value;

    // Regular expression for validating email address
    const emailRegex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;

    if (emailRegex.test(email)) {
        errorMessage.textContent = ''; // Clear any previous error message
        alert('Email is valid');
    } else {
        errorMessage.textContent = 'Please enter a valid email format';
    }
});
