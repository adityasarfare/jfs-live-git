**What is a Servlet?**
1. Servlets are server side java programs
2. Runs on a Servlet Container
3. The container manages the lifecycle of a servlet.
4. The life cycle methods are present inside the servlet interface.

**Servlet API**

javax.servlet.Servlet interface
Defines methods that all servlets must implement.

javax.servlet.GenericServlet implements Servlet
Defines a generic, protocol-independent servlet. 

public abstract class HttpServlet extends GenericServlet
Provides an abstract class to be subclassed to create an HTTP servlet suitable for a Web site.

**HTTP Verbs**
GET
The GET method requests a representation of the specified resource. Requests using GET should only retrieve data.
POST
The POST method is used to submit an entity to the specified resource, often causing a change in state or side effects on the server.
PUT
The PUT method replaces all current representations of the target resource with the request payload.
DELETE
The DELETE method deletes the specified resource.