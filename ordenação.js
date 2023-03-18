function quicksort(array) {
    // Se o array estiver vazio ou com apenas um elemento, retorna o array
    if (array.length <= 1) {
      return array;
    }
  
    // Seleciona um elemento como pivô (geralmente o primeiro elemento)
    const pivot = array[0];
  
    // Separa os elementos menores e maiores que o pivô em dois arrays
    const menores = [];
    const maiores = [];
    for (let i = 1; i < array.length; i++) {
      if (array[i] < pivot) {
        menores.push(array[i]);
      } else {
        maiores.push(array[i]);
      }
    }
  
    // Recursivamente ordena os arrays menores e maiores usando quicksort
    return [...quicksort(menores), pivot, ...quicksort(maiores)];
  }
  
  // Exemplo de uso
  const meuArray = [5, 3, 6, 2, 10];
  console.log(quicksort(meuArray)); // Imprime [2, 3, 5, 6, 10]
  