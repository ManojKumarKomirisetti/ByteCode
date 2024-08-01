function text()
{
    document.getElementById("script").innerHTML = "Manoj came here via bus ";
}

function aSYNC()
{
    document.getElementById("script").innerHTML = "then the JavaScript file will be loaded asynchronously. This means that the browser will send the request to load the JavaScript file, and then keep on loading the rest of the HTML page. The browser will not wait for the JavaScript file.";
}

function dEFER()
{
    document.getElementById("script").innerHTML = "it will defer or delay the loading of the JavaScript file until the complete webpage is loaded. After the webpage is loaded then the browser will send the request for loading the JavaScript file."
}