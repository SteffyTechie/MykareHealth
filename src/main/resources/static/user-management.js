

class UserManagement {
    constructor() {
        
    }


    init() {
        $(document).ready(() => {
            this.setupFormSubmit();
            this.loadUsers();
        });
    }

   
    setupFormSubmit() {
        $('#registrationForm').on('submit', (event) => {
            event.preventDefault();
            const formData = {
                name: $('#name').val(),
                email: $('#email').val(),
                gender: $('#gender').val(),
                password: $('#password').val()
            };

           
            $.ajax({
                url: '/api/users/register',
                type: 'POST',
                contentType: 'application/json',
                data: JSON.stringify(formData),
                success: (response) => {
                    this.displayMessage(`User ${response.name} registered successfully`, 'green');
                    $('#registrationForm')[0].reset();
                    this.loadUsers(); 
                },
                error: (error) => {
                    this.displayMessage(error.responseText, 'red');
                }
            });
        });
    }

    loadUsers() {
        $.ajax({
            url: '/api/users',
            type: 'GET',
            success: (users) => {
                const userListDiv = $('#userList');
                userListDiv.empty(); 
                users.forEach(user => {
                    const userItem = $(`<div class="user-item">Name: ${user.name}, Email: ${user.email}, Gender: ${user.gender}</div>`);
                    userListDiv.append(userItem);
                });
            },
            error: (error) => {
                console.error('Error fetching users:', error);
            }
        });
    }


    displayMessage(message, color) {
        $('#message').text(message).css('color', color);
    }
}


const userManagement = new UserManagement();
userManagement.init();
