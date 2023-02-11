// Fetch Wolverhampton weather data from API
let cityName = 'Inaruwa'
let apiUrl = `https://api.openweathermap.org/data/2.5/weather?q=${cityName}&appid=21f1316c26550d3547d01bab151e8fb3`;
fetch(apiUrl)
  
  // Convert response string to json object
  .then(response => response.json())
  .then(response => {
 
    // Display whole API response in browser console (take a look at it!)
    console.log(response);

    //temperature convert to celcius from kelvin
    const temp= response.main.temp;
    const celcius= Math.trunc(temp-273.15);

   //live date
   const dt = response.dt
   const day = new Date(dt*1000); 
 
    
    // Copy one element of response to our HTML paragraph
    document.getElementById("text").innerHTML = response.weather[0].description; // Name  of the city
    document.getElementById("im").src = "http://openweathermap.org/img/wn/"+response.weather[0].icon+"@2x.png"; //weather icon
    document.getElementById("deg1").innerHTML = celcius+"°C";// temperature in degree 
    document.getElementById("temp2").innerHTML = "Temperature in degrees :"+" "+celcius+"°C"; // temperature in degrees in weather details
    document.getElementById("pressure").innerHTML = "Pressure in hPa :"+" "+response.main.pressure+"hPa"; // Pressure value in weather details
    document.getElementById("humidity").innerHTML = "Humidity in % :"+" "+response.main.humidity+"%"; // Humidity value in weather details
    document.getElementById("windspeed").innerHTML = "Wind Speed in m/s :"+" "+response.wind.speed +"m/s"; // Wind speed value in weather details 
    document.getElementById("directionspeed").innerHTML = "Direction in Degrees :"+" "+response.wind.deg+"°"; // Direction in degrees in weather details 
    document.getElementById("date").innerHTML = day.toDateString(); //date and day 



  })
  .catch(err => {
  
    // Display errors in console
    console.log(err);
});   
