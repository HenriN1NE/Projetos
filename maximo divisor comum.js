// Função para calcular o MDC de dois números
function calcularMDC(a, b) {
    // Enquanto b for diferente de zero, calculamos o resto da divisão de a por b
    // e atualizamos a e b para a próxima iteração
    while (b !== 0) {
      var resto = a % b;
      a = b;
      b = resto;
    }
    // No final, o MDC está armazenado em "a"
    return a;
  }
  
  // Exemplo de uso
  console.log(calcularMDC(24, 36)); // saída: 12
  