function fetchData(a){

    parsedData="";
    const request = new XMLHttpRequest();
    request.onload = function(){
        parsedData = JSON.parse(request.responseText);
        console.log("DATA:", parsedData);
    }
    request.open("GET", "http://localhost:8080/datasearch/" + a);
    console.log("received")
    request.send();
    console.log("sent");
    return parsedData;
 }

function displayStats(){

    data=""
    
    if ("HENRY CEJUDO"  == "HENRY CEJUDO"){
         data=fetchData(1)
    }

    console.log("djsadajkdjkajk");
    console.log(data);

    document.getElementById("striking_accuracy").innerHTML = data.striking_accuracy;
    document.getElementById("grappling_accuracy").innerHTML = data.grappling_accuracy;
    document.getElementById("wins").innerHTML = data.wins;
    document.getElementById("losses").innerHTML = data.losses;
    document.getElementById("draws").innerHTML = data.draws;


    // var element=document.createElement("H1");
    //     element.innerHTML=parsedData.striking_accuracy;
    //     element.innerHTML=parsedData.grappling_accuracy;
        
    //     document.body.appendChild(element);

    
    // data.innerHTML = data.striking_accuracy;
    // fetch fighter data {1,2,3,4,5}
    // for each field fill it with the fighters data


}
