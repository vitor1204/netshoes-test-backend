# netshoes-test
### Leia todo o enunciado e toda a explicação de cada questão.
### Ao finalizar o teste, AGUARDE até que o time da Netshoes solicite para que cada um abra um Pull Request para que seu código seja disponibilizado e avaliado;


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

Outros exemplos podem ser verificados nos testes implementados em `com.netshoes.problems.problem1.impl.SearchVowelTest` 

Regras e orientações:
1. Uma chamada para hasNext() irá retornar se a stream ainda contem caracteres para processar;
2. Uma chamada para getNext() irá retornar o próximo caractere a ser processado na stream;
3. Não será possível reiniciar o fluxo da leitura da Stream;
4. Não poderá ser utilizado nenhum framework/lib Java, apenas código nativo. Dessa forma, não deve ser alterado o arquivo pom.xml do projeto;
5. Não poderá ser alterada a interface `com.netshoes.problems.problem1.api.Stream`;
6. Não poderá ser alterado o nome da classe `com.netshoes.problems.problem1.impl.StreamImpl` ou a assinatura do construtor dessa classe. A implementação do construtor PODE ser alterada;
7. Não poderá ser alterado o nome da classe `com.netshoes.problems.problem1.impl.SearchVowel` ou a assinatura do método "firstChar" contido nessa classe. A implementação PODE (e deve) ser adaptada para que os testes passem;
8. Não devem ser alterados ou adaptados os testes já implementados e disponibilizados pela Netshoes;
9. Caso a Stream não possua caracteres que atendam aos requisitos, deverá ser retornado o caractere 0 (Zero) conforme esperado pelos testes unitários;
10. Não versione os códigos gerados por ferramenta/IDE;
11. A aplicação necessita atender os cenários de testes já implementados propostos;
12. Para verificar se sua implementação está aderente aos testes unitários implementados, utilize o comando maven:<br />
    Se possuir maven instalado e configurado na máquina:
    ```sh
    mvn clean -Dtest=SearchVowelTest test 
    ```
    <br />
    Para executar o maven embedded disponibilizado pela aplicação:
     ```sh
     ./mvnw clean -Dtest=SearchVowelTest test 
     ```

----------
2. Serão informadas duas versões: version1 e version2. Com base nessas versões, deverá ser retornado:
- 1 (um) caso a version1 for maior que a version2 (version1 > version2 return 1)
- 0 (zero) caso forem iguais (version1 == version2 return 0)
- -1 (menos 1) caso a version1 for menor que a version2 (version1 < version2 return -1)

Considere que ambas as Strings informadas estarão sempre preenchidas e conterão apenas dígitos e o caractere ponto (.) <br />
O caractere ponto (.) é utilizado apenas para separar a sequência de números. <br />
Por exemplo: a versão 1.2 é uma versão maior que a versão 1.1 ou 1.1.1 ou 1.1.1.10. <br />
Entretanto a versão 1.2 é anterior a versão 1.2.1 (o código deve retornar -1). <br />
Já as versões 1.2 e 1.2.0 são iguais (o código deve retornar 0). <br />

Outros exemplos podem ser verificados nos testes implementados em `com.netshoes.problems.problem2.impl.CompareVersionImplTest`<br />

Regras e orientações:
1. Não deverá ser alterado o nome da classe `com.netshoes.problems.problem2.impl.CompareVersionImpl ` ou a assinatura do método `public static int compareVersion(String version1, String version2)`;
2. Não poderá ser utilizado nenhum framework/lib Java, apenas código nativo. Dessa forma, não deve ser alterado o arquivo `pom.xml` do projeto;
3. Não devem ser alterados ou adaptados os testes já implementados e disponibilizados pela Netshoes;
4. A aplicação necessita atender os cenários de testes já implementados propostos;
4. Para verificar se sua implementação está aderente aos testes unitários implementados, utilize o comando maven: <br />
    Se possuir maven instalado e configurado na máquina:
     ```sh
     mvn clean -Dtest=CompareVersionImplTest test 
     ```
    <br />
    Para executar o maven embedded disponibilizado pela aplicação:
      ```sh
      ./mvnw clean -Dtest=CompareVersionImplTest test 
      ```

## Boa prova!
