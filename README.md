
# Desafio - Conta Banco 

Projeto proposto no módulo de sintaxe da formação Java Developer da [DIO](https://web.dio.me/), simulando uma conta bancária. 

Foi criado o projeto **ContaBanco** que recebe dados via terminal contendo as característcias de uma conta em banco, conforme os atributos abaixo:

| Atributo | Exemplo |
| --- | --- |
|Número | 1021 |
| Agência | 067-8 |
| Nome Cliente | MARIA ANDRADE |
| Saldo | 237.48 |

A classe **Usuario.java** possui os atributos do objeto usuário. 

Dentro da classe **ContaTerminal.java** foi instanciado um novo objeto Usuário.

Com a classe Scanner, o sistema pede as informações do usuário conforme exemplo abaixo, atribuindo cada dado ao atributo do objeto instanciado. 

- Programa: "Digite o número da sua agência:"
- Usuário: 1234 (ENTER para o próximo campo)

Depois de todas as informações terem sido inseridas com sucesso, o sistema exibe a mensagem:

- "Olá [Nome do Cliente], obrigada por criar uma conta em nosso banco, sua agência é [Agência], conta [Número] e seu saldo [Saldo] já está disponível para saque."

*Os campos em [] contém as informações inseridas pelo usuário.  


## Aprendizados

Neste projeto exercitei lógica de programação, conhecimentos em Java (fundamentos da linguagem e noções de estrutura de sintaxe) e prática na IDE Eclipse. 
Como desafio adicional, tomei a liberdade de utilizar os fundamentos de POO para abstrair a classe usuário e utilizar seus atribudos na classe ContaTerminal. 


