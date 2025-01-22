# Situação-Problema: Sistema de Gestão de Estoque para uma Papelaria

## Contexto
Uma papelaria chamada **Papel & Cia** deseja informatizar o gerenciamento de seus produtos e clientes. Atualmente, o controle de itens como cadernos, canetas e lápis é feito manualmente, o que tem causado erros no estoque e atrasos nas vendas. Para resolver esses problemas, o proprietário quer implementar um sistema simples com base em três classes principais que representem os produtos, os clientes e os pedidos realizados.

## Objetivo
Criar um sistema de gerenciamento básico composto por três classes principais:

1. **Produto**: Representa os itens vendidos pela papelaria.
2. **Cliente**: Armazena os dados dos clientes que compram na loja.
3. **Pedido**: Representa os pedidos feitos pelos clientes, relacionando produtos e quantidades.

A interação entre essas classes deve permitir a simulação de um pedido fe# Situação-Problema: Sistema de Reservas para um Hotel

## Contexto
Um hotel chamado **Hotel Estrela do Mar** deseja informatizar o sistema de reservas para melhorar a gestão de quartos, hóspedes e reservas. Cada aluno será responsável por criar uma classe que representa um elemento do sistema. As classes devem ser interdependentes, ou seja, uma classe depende dos dados fornecidos pelas outras para funcionar corretamente.

## Objetivo
Desenvolver três classes interdependentes, sendo:

1. **Quarto**: Representa os quartos disponíveis no hotel.  
2. **Hospede**: Armazena as informações dos hóspedes que fazem reservas.  
3. **Reserva**: Controla o processo de reserva, relacionando hóspedes e quartos.  

A interação entre essas classes permitirá que os alunos simulem um processo completo de reserva, onde um hóspede escolhe um quarto, e o sistema registra a reserva e atualiza o status de disponibilidade do quarto.

---

## Distribuição das Classes (Cada aluno cria uma classe)

### Classe Quarto
- **Responsável:** Aluno 1
- **Atributos**:
  - `id` (identificador do quarto)
  - `tipo` (tipo do quarto, ex.: solteiro, casal, família)
  - `preco_diaria` (preço da diária)
  - `disponivel` (indica se o quarto está disponível: `True` ou `False`)
- **Métodos**:
  - `marcar_indisponivel()`: Altera o status de disponibilidade para `False`.
  - `marcar_disponivel()`: Altera o status de disponibilidade para `True`.
  - `exibir_detalhes()`: Mostra os dados do quarto.

### Classe Hospede
- **Responsável:** Aluno 2
- **Atributos**:
  - `id` (identificador do hóspede)
  - `nome` (nome completo do hóspede)
  - `telefone` (contato do hóspede)
- **Métodos**:
  - `exibir_hospede()`: Mostra os dados do hóspede.

### Classe Reserva
- **Responsável:** Aluno 3
- **Atributos**:
  - `id` (identificador da reserva)
  - `hospede` (objeto da classe Hospede)
  - `quarto` (objeto da classe Quarto)
  - `diarias` (quantidade de diárias reservadas)
- **Métodos**:
  - `calcular_total()`: Retorna o valor total da reserva (diárias × preço da diária do quarto).
  - `finalizar_reserva()`: Atualiza o status do quarto para indisponível.
  - `exibir_resumo()`: Mostra os detalhes da reserva (hóspede, quarto e valor total).

---

## Resultados Esperados
1. **Criação das classes pelos alunos**:
   - Cada aluno será responsável por criar e implementar sua classe com base no modelo fornecido.
2. **Simulação de uma reserva completa**:
   - **Exemplo de quarto**:
     - Quarto 1: Solteiro, R$ 100 por diária, disponível.
   - **Exemplo de hóspede**:
     - Hóspede: Maria Oliveira, telefone `11 99999-1234`.
   - **Exemplo de reserva**:
     - Maria Oliveira reserva o quarto 1 por 3 diárias.
3. **Interação entre as classes**:
   - O sistema calcula o valor total da reserva (R$ 300) e atualiza o status do quarto para indisponível.
   - Exibe o resumo da reserva:  
     - Hóspede: Maria Oliveira  
     - Quarto: Solteiro  
     - Valor total: R$ 300  

---

## Benefícios do Exercício
Este exercício promove:
1. Colaboração entre alunos, já que cada classe é fundamental para o funcionamento do sistema.
2. Compreensão prática de conceitos como encapsulamento, composição e dependências entre classes.
3. Trabalho em equipe, onde os alunos precisam alinhar os métodos e atributos para garantir a integração do sistema.
ito por um cliente e a atualização do estoque de produtos.

---

## Dados fornecidos para construção das classes

### Classe Produto
- **Atributos**: 
  - `id` (identificador do produto)
  - `nome` (nome do produto)
  - `preco` (preço unitário)
  - `quantidade_estoque` (quantidade disponível no estoque)
- **Métodos**:
  - `reduzir_estoque(quantidade)`: Reduz a quantidade do estoque ao realizar uma venda.
  - `exibir_detalhes()`: Mostra as informações do produto.

### Classe Cliente
- **Atributos**: 
  - `id` (identificador do cliente)
  - `nome` (nome do cliente)
  - `email` (e-mail para contato)
- **Métodos**:
  - `exibir_cliente()`: Mostra os dados do cliente.

### Classe Pedido
- **Atributos**:
  - `id` (identificador do pedido)
  - `cliente` (objeto da classe Cliente)
  - `produtos` (lista de tuplas com produto e quantidade)
- **Métodos**:
  - `adicionar_produto(produto, quantidade)`: Adiciona um produto ao pedido.
  - `calcular_total()`: Retorna o valor total do pedido.
  - `finalizar_pedido()`: Atualiza os estoques dos produtos no pedido e retorna um resumo.

---

## Resultados Esperados
1. **Criar as classes com base no modelo acima.**
2. **Simular a criação de 3 produtos, 2 clientes e 1 pedido.**
   - **Exemplo de produtos**:  
     - Produto 1: Caderno, preço R$ 20, estoque 50 unidades.
     - Produto 2: Caneta Azul, preço R$ 3, estoque 100 unidades.
     - Produto 3: Lápis, preço R$ 1.50, estoque 200 unidades.
   - **Exemplo de clientes**:
     - Cliente 1: João Silva, email `joao@email.com`.
     - Cliente 2: Maria Santos, email `maria@email.com`.
3. **Simular o pedido**:
   - Cliente João Silva compra:
     - 2 cadernos.
     - 5 canetas azuis.
   - O sistema deve calcular o total do pedido, exibir um resumo para o cliente e atualizar o estoque dos produtos.

---

## Benefícios do Exercício
Este exercício permite a prática de conceitos de orientação a objetos, como encapsulamento, composição e interação entre classes, promovendo a aplicação prática de teorias aprendidas em sala de aula.
