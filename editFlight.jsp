<html>
<head>
<title>FRS</title></head>
<body bgcolor="gainsboro">
<h1 align="center"><font color="saddlebrown">ENTER FLIGHT DETAILS TO BE CHANGED</font></h1>
<p align="center"></p>
<form method="post" action="FlightEdit">
<table>
<img src="images/air12.jpg" width="1080" height="380">
<tr><td> <font size="5">Enter Flight id to be changed </font></td>
<td><input type="text" name="fid" size="20"></td>
</tr>
<tr><td><font size="5"> Enter Flight Source</font></td>
<td><input type="text" name="fsrc" size="30"></td>
</tr>
<tr><td> <font size="5"> Enter Flight Destination</font></td>
<td><input type="text" name="fdes" size="30"></td>
</tr>
<tr><td><font size="5"> Enter Flight Departure Date</font></td>
<td><input type="date" name="depdt"></td>
</tr>
<tr><td><font size="5">Enter Flight Arrival Date</font></td>
<td><input type="date" name="arrdt" size="10"></td>
</tr>
<tr><td><font size="5">Enter Flight Departure Time</font></td>
<td><input type="time" name="deptm" size="10"></td>
</tr>
<tr><td><font size="5">Enter Flight Arrival Time</font></td>
<td><input type="time" name="arrtm" size="10"></td>
</tr>
<tr><td><font size="5">Enter Flight Status</font></td>
<td><input type="text" name="fstatus" size="30"></td>
</tr>
<tr><td><font size="5">Enter the number of seats available</font></td>
<td><input type="number" name="seats" size="3"></td>
</tr>
<tr>
<td align="right" colspan="2"><input name="a" type="submit" id="a" value="Submit">
<input name="reset" id="a" type ="reset" value="Reset"></td></tr>

</table>
</form>
</body></html>