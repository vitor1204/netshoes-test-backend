# netshoes-test
### Leia todo o enunciado e toda a explicação de cada questão.


1. Dada uma stream, encontre o primeiro caractere Vogal, após uma consoante, onde a mesma é antecessora a uma vogal e que não se repita no resto da stream. 
O término da leitura da stream deve ser garantido através do método hasNext(), ou seja, retorna falso para o término da leitura da stream.

Exemplo 1:
Input:  aAbBABacafe
Output: e
No exemplo, ‘e’ é o primeiro caractere Vogal da stream que não se repete após a primeira Consoante ‘f’o qual tem uma vogal ‘a’ como antecessora.

Exemplo 2:
Input:  hJuBtoErougixcfu
Output: i
No exemplo, ‘i’ é o primeiro caractere Vogal da stream que não se repete após a primeira Consoante ‘g’o qual tem uma vogal ‘u’ como antecessora.
Nesse exemplo 'E' NÃO é a resposta correta pois embora não se repita no restante da stream, sua antecessora não é uma consoante.

Outros exemplos podem ser verificados nos testes implementados em ```com.netshoes.problems.problem1.impl.SearchVowelTest``` 

Regras e orientações:
1. Uma chamada para hasNext() irá retornar se a stream ainda contem caracteres para processar.
2. Uma chamada para getNext() irá retornar o próximo caractere a ser processado na stream.
3. Não será possível reiniciar o fluxo da leitura da Stream
4. Não poderá ser utilizado nenhum framework/lib Java, apenas código nativo. Dessa forma, não deve ser alterado o arquivo pom.xml do projeto
5. Não poderá ser alterada a interface ```com.netshoes.problems.problem1.api.Stream```
6. Não poderá ser alterado o nome da classe ```com.netshoes.problems.problem1.impl.StreamImpl``` ou a assinatura do construtor dessa classe. A implementação do construtor pode ser alterada.
7. Não poderá ser alterado o nome da classe ```com.netshoes.problems.problem1.impl.SearchVowel``` ou a assinatura do método "firstChar" contido nessa classe. A implementação pode (e deve) ser adaptado para que os testes passem.
8. Não devem ser alterados ou adaptados os testes já implementados e disponibilizados pela Netshoes;
9. Caso a Stream não possua caracteres que atendam aos requisitos, deverá ser retornado o caractere 0 (Zero) conforme esperado pelos testes unitários.
10. Não versione os códigos gerados por ferramenta/IDE
11. A aplicação necessita atender os cenários de testes já implementados propostos;
12. Não devem ser alterados ou adaptados os testes já implementados e disponibilizados pela Netshoes;
13. Para verificar se sua está aderente aos testes unitários implementados, utilize o comando maven:
    Se possuir maven instalado e configurado na máquina:
    ```mvn clean test ```
    Para executar o maven embedded disponibilizado pela aplicação:
     ```./mvnw clean test ```
14. Ao finalizar, espere que o time da Netshoes irá solicitar para que seja aberto um PR para que seu código seja disponibiliozado e avaliado;

----------
2. 