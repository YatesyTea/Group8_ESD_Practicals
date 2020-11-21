# JSP Book Notes

[toc]

## Chapter 2 Notes

Servlet

* No Main method, is called by container.
* Almost all are HttpServlets
* In real world almost all override doget and dopost
* printwriter is used to write html text to response object

Servlets have 3 names:

* URL name (everyone sees this)
* Internal name (also a fake name)
* Actual file name

Mapping the name rather than dir, it's easier to move things around at a later date.

Deployments descriptors:

a lot is within the <webapp> tag.

![Servlet Mapping](jspBookNotes.assets\servletMapping.jpg)

Only has the class name, rather than the actual dir that it's in, this is due to the container having a specific place to hold it during runtime.

### MVC

Model - Plain old Java Files

> Interacts with the DB
> Holds real business logic
> Shopping cart contents and what to do with it would be part of this

View - The JSP Files

> Displays to the user, takes user input.

Controller - The Sevlet

> Interacts with Model and View
> Tells model to update itself and makes new JSP available for view if required.

### Responsibility

<img src="jspBookNotes.assets\partResponsibilities" alt="Part Responsibilities" style="zoom:150%;" />

