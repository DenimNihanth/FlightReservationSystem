<!DOCTYPE html>
<html >
  <head>
  <link rel="shortcut icon" type="image/x-icon" href="images/favicon.ico" />`
    <meta charset="UTF-8">
    <title>Fake My Trip</title>
    
    
    <link rel="stylesheet" href="css/normalize.css">

   

        <link rel="stylesheet" href="css/style.css">
		
		<script langauge="javascript">
 
</script>
    
    
    
  </head>

  <body>
  
    <div class="logmod">
  <div class="logmod__wrapper">
  <a href="merchhome.jsp?type=Travel">
    <span class="logmod__close">Close</span></a>
    <div class="logmod__container">
     <div class="head">WELCOME TRAVEL MERCHANT 
</div>
 <%System.out.println("test1"); %>
	  	  <div class="sminputs"></div>
	  
      <div class="logmod__tab-wrapper">
	
      <div id="form2" name="form2">
	  <%System.out.println("test2"); %>
         <div class="logmod__heading">
          <span class="logmod__heading-subtitle">Enter the details of <strong>Your Travel Deal</strong></span>
          <%System.out.println("test3"); %>
        </div> 
        <div class="logmod__form">
          <form accept-charset="utf-8" action="TraMerchAdd" class="simform" method="post">
           
			
            <div class="sminputs">
              <div class="input string optional">
                <label class="string optional" for="transtype">Type of Transport*</label>
                <select class="string optional" id="user-transtype" name="transtype">
				<option value="Railway" class="options">Railway</option>
				<option value="Airlines" class="options">Airlines</option>
				<option value="Bus" class="options">Bus</option>
				</select>
              </div>
              <div class="input string optional">
                <label class="string optional" for="user-trancompname">Name of Company*</label>
                <input class="string optional" maxlength="255" id="user-name" placeholder="Company Name" type="text" size="30" required="required" name="name" />
              </div>
            </div>
			
			 <div class="sminputs">
              <div class="input string optional">
                <label class="string optional" for="tkttype">Ticket Type*</label>
                <select class="string optional" id="user-tkttype" name="tkttype">
				<option value="Business" class="options">Business</option>
				<option value="Economy" class="options">Economy</option>
				<option value="General" class="options">General</option>
				</select>
              </div>
              <div class="input string optional">
                <label class="string optional" for="user-tktrate">Rate of Ticket*</label>
                <input class="string optional" maxlength="255" id="user-tktrate" placeholder="Ticket Rate" type="number" size="7" required="required" name="tktrate" />
              </div>
            </div>
			
			 <div class="sminputs">
              <div class="input string optional">
                <label class="string optional" for="src">Source*</label>
                <select class="string optional" id="user-src" name="src">
				<option value="Mumbai" class="options">Mumbai</option>
				<option value="Kolkata" class="options">Kolkata</option>
				<option value="Goa" class="options">Goa</option>
				<option value="LasVegas" class="options">LasVegas</option>
				<option value="Sydney" class="options">Sydney</option>
				<option value="London" class="options">London</option>
				<option value="HongKong" class="options">HongKong</option>
				<option value="Singapore" class="options">Singapore</option>
				</select>
              </div>
			   <div class="input string optional">
                <label class="string optional" for="dest">Destination*</label>
                <select class="string optional" id="user-dest" name="dest">
				<option value="Mumbai" class="options">Mumbai</option>
				<option value="Kolkata" class="options">Kolkata</option>
				<option value="Goa" class="options">Goa</option>
				<option value="LasVegas" class="options">LasVegas</option>
				<option value="Sydney" class="options">Sydney</option>
				<option value="London" class="options">London</option>
				<option value="HongKong" class="options">HongKong</option>
				<option value="Singapore" class="options">Singapore</option>
				</select>
              </div>
			  </div>
			  <div class="sminputs">
              <div class="input string optional">
                <label class="string optional" for="user-time">Travel Duration*</label>
                 <select class="string optional" id="user-dur" name="time">
				<option value="1" class="options">1 Day</option>
				<option value="2" class="options">2 Day</option>
				<option value="3" class="options">3 Day</option>
				<option value="4" class="options">4 Day</option>
				<option value="5" class="options">5 Day</option>
				<option value="6" class="options">6 Day</option>
				</select>
              </div>
			   <div class="input string optional">
                <label class="string optional" for="user-meal">Meal*</label>
                 <select class="string optional" id="user-meal" name="meal">
				<option value="Yes" class="options">Yes</option>
				<option value="No" class="options">No</option>
				<option value="Maybe" class="options">Maybe</option>
				</select>
              </div>
			</div>
			
			
            <div class="simform__actions">
              <input class="sumbit" name="commit" type="submit" value="Create Deal" />
              <span class="simform__actions-sidetext">
			  
			
			  
			  
			  </span>
            </div> 
          </form>
        </div> 
        
      </div>
      
      </div>
    </div>
  </div>
</div>
    <script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>

        <script src="js/index.js"></script>

    
    
    
  </body>
</html>
