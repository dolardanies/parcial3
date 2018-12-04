function getConver(tipo, valor) {
    alert(tipo + valor );
    axios.get('/temp/' + tipo + '/' + valor).then(function(response){ 
        par= document.getElementById("Data");
        var datos = response.data;        
        var fila = document.createElement("P");
        fila.innerHTML = response.data;
        par.appendChild(fila);
    }).catch(function (error) {
        console.log(error);    
        alert(" No es posible la conversion por problemas internos");
    });
}