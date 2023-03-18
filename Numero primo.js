function isPrime(num) {
    // Caso o número seja menor que 2, ele não é
    // considerado primo
    if (num < 2) {
      return false;
    }
    
    // Verifica se o número é divisível apenas por 1 e por si mesmo
    for (let i = 2; i < num; i++) {
      if (num % i === 0) {
        return false;
      }
    }
    
    // Se chegamos até aqui, o número é primo
    return true;
  }
  
  // Exemplo de uso
  console.log(isPrime(17)); // true
  console.log(isPrime(12)); // false
  