

function fibonacci (n){

    if(n<=1){
        return n;
    }
    else{
        return fibonacci(n-1)+fibonacci(n-2);
    }
    
    
    }
    
    
    console.log("Hello world");
   
    var n =11
    
    for (var i = 0; i<n; i++){
        console.log(fibonacci(i));
    }

