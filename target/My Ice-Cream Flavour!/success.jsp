
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SuccessPage</title>
<style>
.mid
{
  text-align: center;
}
.siz
{
  font-size: 30px;
}
.col
{
  color: red;
}
table, th, td {
   padding: 60px 60px;
   }
button {
    background-color:#FF0033;
    color: white;
    border: none;
    cursor: pointer;
    
}

button:hover {
    opacity: 0.8;
}
</style>
</head>
<body style="background-color: #ffffb3">
<h2>Login successful :)</h2>

<br>
<br><br>
<h1 class="mid col">Enter Your Recipy</h1>
<br>
<br>
<div class="mid siz">
<table>
<tr>
<th>
<form action="SEE" method="post">
  <input type="submit" value="See Recipies">
</form>
</th>
<th>
<form action="ADD" method="post">
<label for="rname">Recipy name:</label><br>
  <input type="text" id="rname" name="rname" value=""><br><br>
 <textarea rows="10" cols="100" name="recipy"></textarea><br>
  <br><input type="submit" value="Add Recipy upto 10 rows">
</form>
</th>
</tr>
</table>
</div>

</body>
</html>
