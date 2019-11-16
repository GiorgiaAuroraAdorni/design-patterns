# Design patterns

> Homework for Software Engineering course @ USI 19/20.

## Authors

* **Giorgia Adorni** 
* **Mattero Basso** 
* **Elia Cereda** 
* **Marco Ferri**

## Design patterns

### Front Controller

Initially, we decided to use the implementation of the Front Controller pattern in order to reduce the amount of repeated boiler plate code. In the current implementation, we have not found many advantages in its use since we didn't found responsabilities to assign to the Front Controller.

### Intercepting Filter

To implement the authorization logic, we used Intercepting Filter pattern in the `AuthFilter` class to verify if the user can access a certain page and otherwise redirects him to the home page.

### Template View

The implementation of the user interface has been speeded up by adopting the Template View pattern. An example of template is the page with the users list.

### Singleton

Since the responsability to memorise the registered users has been assigned to the `UserManager` class. Since we do not have a database, to ensure that a single istance of this class can exists in the application we adopted the Singleton pattern.
