let data=null;

    const request = new XMLHttpRequest();
    request.onload = function(){

        //exchange data to/from a web server.
        // Parse the data with JSON.parse(), and the data becomes a JavaScript object.
        const parsedData = JSON.parse(request.responseText);
        data=parsedData;
        console.log(parsedData);
        displayrequest(parsedData)
    }
    request.open("GET", "http://localhost:8080/datasearch/6");

    request.send();

    function displayrequest(data){
        document.getElementById("striking_accuracy").innerHTML = data.striking_accuracy;
        document.getElementById("grappling_accuracy").innerHTML = data.grappling_accuracy;
        document.getElementById("wins").innerHTML = data.wins;
        document.getElementById("losses").innerHTML = data.losses;
        document.getElementById("draws").innerHTML = data.draws;
    }
    