// função que retorna o número fibonacci para determinado valor de n
function fibonacci(n) {
    if (n <= 1) {
    return n;
    } else {
    return fibonacci(n - 1) + fibonacci(n - 2);
    }
    }
    
    // chamada da função para imprimir os 10 primeiros números fibonacci
    for (var i = 0; i < 10; i++) {
    console.log(fibonacci(i));
    }