<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Snap</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css"
 rel="stylesheet"
  integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM" 
  crossorigin="anonymous">
</head>
<body>

<div class="container w-50 border border-dark border-5 mt-5">

<form action= "register" method="post">

<div class="mb-3" >
  <label class="form-label">UserId</label> <input type="tel" 
  class="form-control"  name="userId"><div class="mb-3">
  <label class="form-label">email</label> <input type="text" 
  class="form-control"  placeholder="" name="email">
</div>
<div class="mb-3">
  <label class="form-label">UserName</label> <input type="text" 
  class="form-control"  placeholder="" name="userName">
</div>
<div class="mb-3">
  <label class="form-label">password</label> <input type="password" 
  class="form-control"  placeholder="" name="password">
</div>

<div class="mb-3">
  <label class="form-label">phoneNumber</label> <input type="tel" 
  class="form-control"  placeholder="" name="phoneNumber">
</div>

<div class="mb-3">
  <label class="form-label">address</label> <input type="text" 
  class="form-control"  placeholder="" name="address">
</div>

<div class="mb-3">
  <label class="form-label">country</label> <input type="text" 
  class="form-control"  placeholder="" name="country">
</div>

<div class="mb-3">
  <label class="form-label">gender</label> <input type="text" 
  class="form-control"  placeholder="" name="gender">
</div>

<div class="mb-3">
  <label class="form-label">dob</label> <input type="text" 
  class="form-control"  placeholder="" name="dob">
</div>

<div class="mb-3">
  <label class="form-label">accountType</label> <input type="text" 
  class="form-control"  placeholder="" name="accountType">
</div>
<input type="submit" class="btn btn-success mb-3"/>


</form>
</body>
</html>