
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="style.css" type="text/css">
    <title>sendmail</title>
  </head>
  <body>
    <%
    if(session.getAttribute("gmail")==null){
      response.sendRedirect("login_error.html");
    }
    %>
    <div class="justify-content-center">
      <div class="container">
        <div class="form">
          <form class="login-form"  action="mail" method="post">
            <input type="text" placeholder="To" name="to" required />
            <input type="text" placeholder="Subject" name="subject" required />
            <textarea name="message" id="" cols="30" rows="5" placeholder="Body"></textarea>
            <button type="submit">send</button>
            <button onclick="logout();" style="margin-top:10px; background-color: red !important;">Logout</button>
          </form>
          <script>
            function logout(){
              window.location.href="logout";
            }
          </script>
        </div>
      </div>
    </div>
  </body>
</html>
