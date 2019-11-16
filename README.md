# Design patterns

> Homework for Software Engineering course @ USI 19/20.

## Authors

* **Giorgia Adorni** 
* **Mattero Basso** 
* **Elia Cereda** 
* **Marco Ferri**

## Design pattern

### Template view



### Front controller

Defines a single component which
 Handles all requests
 Executes operations commons to all requests  (avoiding cloning code across controllers)  

example: logging, security, internationalisation, authentication, ...
 Then, executes the specific operation (command) that has been requested 

The command is a parameter 

Handler
 Receives the request from the server
 Executes general/common operations
 Decides the operations to be executed (by examining the information in the request) Delegates the execution to the concrete command 

Concrete command
 Extracts the parameters from the request Invokes appropriate business logic Determines the next view
 Gives control to the view 



Implementations based on FrontController  lead to a structure in which there exists   

a Controller for each logical action of the Web application 

### Intercepting Filter

Useful to manipulate requests and responses before and after they are served 

Often used together with FrontController
 to decorate the functions of the controller with additional functionality 

provided as composable components Logging 

Authentication Data conversion Internationalisation ... 

### Singleton

