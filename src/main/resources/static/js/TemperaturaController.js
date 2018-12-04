function getConver(tipo, valor) {
    axios.get('/temp' + tipo + '/' + valor).then(function(response){
        par= document.getElementById("Data").innerHTML = "";
        var fila = document.createElement("P");
        fila.innerHTML = response.data[c];
        par.appendChild(fila); 
        console.log(response.data[c]);
    }).catch(function (error) {
        console.log(error);
        console.log(response.data[c]);
        console.log(response.data);
        alert(" No es posible la conversion por problemas internos");
    });
}