:gem: **Layered Architecture**

An application can be monolithic or layered.
Enterprise applications are layered by nature.

Layers :
1. Repository Layer
   1. Connects to the database
2. Service Layer
      1. Provides business logic
      2. Takes care of transactions management
3. MVC 
      1. Model View Controller Architecture
      2. Has the UI for the client (View)
      3. Contains data for the view (Model)
      4. Controller helps navigate between views (Controller)
      5. In a traditional MVC
         1. Views are built with JSP
         2. Models are created with POJO
         3. Controllers are created using Servlets
