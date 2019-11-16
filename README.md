# Design patterns

> Homework for Software Engineering course @ USI 19/20.

## Authors

* **Giorgia Adorni** 
* **Matteo Basso** 
* **Elia Cereda** 
* **Marco Ferri**

## Introduction

A complete implementation of the server has been developed exploiting separation of concerns and design patterns described later in this document.

Users can be divided into two categories: readers and admins. The role of the user determine the pages he can see.

Four pages are available:
- Home page: simple home page accessible by everyone.
- Login: page used to login into the system.
- Registration: allows the registration of new users (readers only).
- User list: accessible only by admins, shows the complete list of registered users.

## Design patterns

### Front Controller

Initially, we decided to use the implementation of the Front Controller pattern in order to reduce the amount of repeated boilerplate code. In the current implementation, we have not found many advantages in its usage since we did not find responsibilities to assign to the Front Controller.

### Intercepting Filter

To implement the authorization logic, we used Intercepting Filter pattern in the `AuthFilter` class to verify if the user can access a certain page and otherwise redirects him to the home page. This is particularly convenient to have the authorization logic in one place, disconnected from the commands and controller, since it represents something that must be done before dispatching the request.

### Template View

The implementation of the user interface has been speeded up by adopting the Template View pattern. An example of template is the page with the users list.

### Singleton

The responsibility to memorize the registered users has been assigned to the `UserManager` class. Since we do not have a database, to ensure a single instance of this class can exist in the application we adopted the Singleton pattern.

## Other implementation details

In order to keep track of the logged user, an `AuthManager` class has been developed. It is able to store the information of the current user into the `HttpSession` and to use it when needed.