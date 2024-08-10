<html>
    <head>   
        <script>
            var counter = 0;
            function countClicks()
            {   
                counter = counter + 1;
                document.getElementById("num_of_clicks").innerHTML = "Number of Mouse clicks: " + counter; 
            }
        </script>      
    </head>
    <body onclick="countClicks()">
        <!-- HTML page body --> 
        <p id="num_of_clicks"></p>
    </body>
</html> 