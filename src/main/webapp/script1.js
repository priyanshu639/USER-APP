document.getElementById('loginForm').addEventListener('submit', function (e) {
    e.preventDefault();

    let isValid = true;
    const email = document.getElementById('email');
    const password = document.getElementById('password');
    const emailError = document.getElementById('emailError');
    const passwordError = document.getElementById('passwordError');

    emailError.textContent = '';
    passwordError.textContent = '';

    if (!email.value.includes('@')) {
        emailError.textContent = 'Invalid email format.';
        isValid = false;
    }

    if (password.value.length < 6) {
        passwordError.textContent = 'Password must be at least 6 characters.';
        isValid = false;
    }

    if (isValid) {
        alert('Login successful!');
    }
});
