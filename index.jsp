
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="style.css" type="text/css">

    <title>Login</title>
  </head>
  <body>
    <%
      if(session.getAttribute("gmail")!=null){
        response.sendRedirect("sendmail.jsp");
      }
    %>
    <div class="justify-content-center">
      <div class="container">
        <div class="form">
          <form class="login-form" action="login" method="post">
            <input type="text" placeholder="Gmail" id="gmail" name="gmail" required />
            <input type="password" id="pass" placeholder="Your Password" name="pass" required />
            <button type="submit">login</button>
          </form>
        </div>
      </div>
    </div>
  </body>
</html>
