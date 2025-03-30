Descrição
Implemente um sistema bancário que permita criar contas com informações como nome do titular, número da conta e saldo. O programa deve fornecer métodos para:

Consultar o saldo.
Realizar saques e depósitos.
Garanta que os atributos da conta estejam encapsulados e sejam acessados apenas por métodos específicos.

Entrada
Consultar o saldo.
Realizar saques e depósitos.
Saída
Saldo atualizado após cada operação ou mensagem de erro caso a operação não seja válida (ex.: Saque invalido: Saldo insuficiente), conforme tabela de exemplos.

Exemplos
A tabela abaixo apresenta exemplos com alguns dados de entrada e suas respectivas saídas esperadas. Certifique-se de testar seu programa com esses exemplos e com outros casos possíveis.

Entrada	Saída
João
123
500.00
100.00 200.00	Saldo Atualizado: 600.00
Maria
456
300.00
400.00	Saque invalido: Saldo insuficiente
Saldo Atual: 300.00
Carlos
789
0.00
50.00	Saque invalido: Saldo insuficiente
Saldo Atual: 0.00