import React, { useState } from 'react';
import './styles.css';
import FAQ from './FAQ.html';

function App() {
  const [tab, setTab] = useState('FAQ');

  const handleTabChange = (newTab) => {
    setTab(newTab);
  };

  return (
    <body class="FAQ">
    <header class="cabecalho">
        <nav class="cabecalho__menu">
            <a class="cabecalho__menu__link" href="index.html">início</a>
            <a class="cabecalho__menu__link" href="cadastro.html">cadastro</a>
            <a class="cabecalho__menu__link inicio__link" href="FAQ.html">FAQ</a>
        </nav>
    </header>

    <main>

        <div class="container__FAQ_left">
            <img class="imagem__FAQ" src="img/audiow 2.png">
        </div>
        <div class="container__FAQ_right">
            <div>
                <p class="titulo_FAQ">COMO PODEMOS DE AJUDAR?</p1>
            </div>
            <form>
                <div>
                    <input type="text" class="txtAjuda" placeholder="Descreva o seu problema">
                </div>
                <div class="tabela">
                    <table>
                        <tr>
                            <th class="titulo-tabela" colspan="2">Perguntas frequentes</th>
                            
                            </tr>
                        <tr>
                            <th>Perguntas</th>
                            <th>Respostas</th>
                        </tr>
                        <tr>
                            <td>Onde escutar?</td>
                            <td>Pode escutar no site ou ...</td>                            
                        </tr>
                        <tr>
                            <td>Tem conta pago?</td>
                            <td>Tem varios tipos de pag...</td>                           
                        </tr>
                    </table>
                </div>
            </form>

        </div>


    </main>


</body>

</html>
  );
}

export default App;
