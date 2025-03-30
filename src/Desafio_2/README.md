# Sistema Bancário - Desafio 2

## Descrição
Este desafio consiste em criar um sistema bancário que suporte dois tipos de contas: **Conta Corrente** e **Conta Poupança**. Ambas devem herdar de uma classe base `Conta` e implementar suas próprias regras para saques:

- **Conta Corrente**: Permite saques mesmo com saldo negativo, até um limite de cheque especial.
- **Conta Poupança**: Não permite saldo negativo.

---

## Funcionalidades
1. **Criar Conta**  
   Permite criar contas do tipo Corrente ou Poupança com as informações iniciais.

2. **Consultar Saldo**  
   Exibe o saldo atual da conta.

3. **Realizar Depósitos**  
   Adiciona um valor ao saldo da conta.

4. **Realizar Saques**  
   Subtrai um valor do saldo da conta, respeitando as regras específicas de cada tipo de conta:
   - Conta Corrente: Permite saldo negativo até o limite do cheque especial.
   - Conta Poupança: Não permite saldo negativo.

---

## Regras de Negócio
- **Conta Corrente**:
  - O saldo pode ficar negativo até o limite do cheque especial.
  - Caso o saque exceda o limite, exibe a mensagem:  
    `"Saque inválido: Excede limite"`.
- **Conta Poupança**:
  - Não permite saldo negativo.
  - Caso o saque exceda o saldo disponível, exibe a mensagem:  
    `"Saque inválido: Saldo insuficiente"`.

---

## Entrada e Saída

### Entrada
1. Tipo da conta (Corrente ou Poupança).
2. Informações iniciais:
   - Nome do titular.
   - Número da conta.
   - Saldo inicial.
   - Limite de cheque especial (apenas para Conta Corrente).
3. Sequência de operações (saques e/ou depósitos).

### Saída
- Saldo atualizado após cada operação.
- Mensagens indicando operações inválidas, como:
  - `"Saque inválido: Excede limite"`
  - `"Saque inválido: Saldo insuficiente"`

---

## Exemplos de Entrada e Saída

| Tipo da Conta | Entrada                                                                 | Saída                                                                                     |
|---------------|-------------------------------------------------------------------------|-------------------------------------------------------------------------------------------|
| Corrente      | João<br>123<br>100.00<br>200.00<br>150.00                               | Saque realizado: 150.00<br>Saldo Atual: -50.00                                           |
| Corrente      | Maria<br>456<br>100.00<br>50.00<br>200.00                               | Saque inválido: Excede limite<br>Saldo Atual: 100.00                                     |
| Poupança      | Carlos<br>789<br>50.00<br>60.00                                        | Saque inválido: Saldo insuficiente<br>Saldo Atual: 50.00                                 |

---

## Testes
Certifique-se de testar o programa com os exemplos fornecidos acima e com outros casos possíveis, como:
- Saques consecutivos que atingem o limite do cheque especial (Conta Corrente).
- Saques com valores iguais ao saldo disponível (Conta Poupança).
- Operações com valores inválidos (ex.: negativos).
- Depósitos e saques alternados.

---

## Observações
- Utilize o conceito de **herança** para implementar a classe base `Conta` e as classes derivadas `ContaCorrente` e `ContaPoupanca`.
- Certifique-se de que os métodos sejam claros, sigam boas práticas de programação e respeitem os princípios de **encapsulamento**.