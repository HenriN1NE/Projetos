function contarElementos(array) {
    var contagem = {};
  
    // Loop pelo array e contar cada elemento
    for (var i = 0; i < array.length; i++) {
      var elemento = array[i];
      if (elemento in contagem) {
        contagem[elemento]++;
      } else {
        contagem[elemento] = 1;
      }
    }
  
    return contagem;
  }
  
  // Exemplo de uso
  var meuArray = [1, 2, 2, 3, 3, 3];
  var resultado = contarElementos(meuArray);
  console.log(resultado); // Imprime {1: 1, 2: 2, 3: 3}
  