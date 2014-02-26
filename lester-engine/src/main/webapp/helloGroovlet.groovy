if (!session) {
  session = request.getSession(true);
}

if (!session.counter) {
  session.counter = 1
}

println """
<html>
    <head>
        <title>Groovy Servlet</title>
    </head>
    <body>
		<p>Hello, ${request.remoteHost}!</p>
		<p>Counter: ${session.counter}, date: ${new Date()}</p>
    </body>
</html>
"""

session.counter = session.counter + 1