# Sistema Bancário - Desafio 1

## Descrição
Este desafio consiste em implementar um sistema bancário que permita criar contas com as seguintes informações:
- Nome do titular
- Número da conta
- Saldo

O programa deve fornecer métodos para:
- Consultar o saldo.
- Realizar saques e depósitos.

**Importante:** Garanta que os atributos da conta estejam encapsulados e sejam acessados apenas por métodos específicos.

---

## Funcionalidades
1. **Consultar Saldo**  
   Permite verificar o saldo atual da conta.

2. **Realizar Depósitos**  
   Adiciona um valor ao saldo da conta.

3. **Realizar Saques**  
   Subtrai um valor do saldo da conta, desde que o saldo seja suficiente. Caso contrário, exibe uma mensagem de erro.

---

## Regras de Negócio
- O saldo inicial da conta deve ser definido no momento da criação.
- Não é permitido realizar saques que deixem o saldo negativo.
- Todas as operações devem atualizar o saldo e exibir o resultado da operação.

---

## Entrada e Saída

### Entrada
1. Nome do titular.
2. Número da conta.
3. Saldo inicial.
4. Operações (saques e/ou depósitos).

### Saída
- Saldo atualizado após cada operação.
- Mensagem de erro caso a operação não seja válida (ex.: "Saque inválido: Saldo insuficiente").

---

## Exemplos de Entrada e Saída

| Entrada                          | Saída                                   |
|----------------------------------|-----------------------------------------|
| João<br>123<br>500.00<br>100.00 200.00 | Saldo Atualizado: 600.00               |
| Maria<br>456<br>300.00<br>400.00       | Saque inválido: Saldo insuficiente<br>Saldo Atual: 300.00 |
| Carlos<br>789<br>0.00<br>50.00         | Saque inválido: Saldo insuficiente<br>Saldo Atual: 0.00   |

---

## Testes
Certifique-se de testar o programa com os exemplos fornecidos acima e com outros casos possíveis, como:
- Depósitos e saques consecutivos.
- Saques com valores iguais ao saldo disponível.
- Operações com valores inválidos (ex.: negativos).

---

## Observações
- Utilize o conceito de **encapsulamento** para proteger os atributos da conta.
- Certifique-se de que os métodos sejam claros e sigam boas práticas de programação.