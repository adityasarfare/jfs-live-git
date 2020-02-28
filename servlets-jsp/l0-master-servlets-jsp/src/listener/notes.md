# Recipe : Handle the session created and destroyed events.
# Ingredients
1. Two JSP's to create and destroy the session.
2. javax.servlet.http.HttpSessionListener
3. configuration in web.xml

# Preparation
1. Create the JSP's. (createSession and destroySession)
2. Implement HttpSessionListener interface and override the sessionCreated and sessionDestroyed life cycle methods.
3. Configure the SessionListener in web.xml
4. Run and test.