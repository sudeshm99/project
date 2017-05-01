<%-- 
    Document   : sendNews
    Created on : Apr 25, 2017, 3:03:31 AM
    Author     : root
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
    <%@include file="adminDash.jsp" %>
    <div style="margin-top: 100px;margin-left: 420px" class="container">
  <h3>Send SMS Alert</h3>
  <form action="NewsHandler" method="post" >
    <div class="form-group">
      <label for="area">Area office:</label>
      <select style="width: 156px" class="form-control" id="area_list">
        <option>Matara</option>
        <option>Colombo</option>
        <option>Kandy</option>
        <option>Kurunagala</option>
      </select>
    </div>
    <div class="form-group">
      <label for="transformer">Transformer Id:</label>
      <select style="width: 156px" class="form-control" id="transformer_list">
        <option>1</option>
        <option>2</option>
        <option>3</option>
        <option>4</option>
      </select>
    </div>
     <div class="form-group"> 
      <p>
          <label>Message</label>
      </p>
      <textarea style="width: 156px;margin-top: -8px;"row="8" col="10" name="message" id="message">
          
      </textarea>
      </div>
      <button style="margin-left: 97px" type="submit" class="btn btn-default">Send</button>   
  </form>
</div>

</body>
</html>



 