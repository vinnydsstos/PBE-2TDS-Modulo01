# Situação-Problema: Sistema de Gestão de Estoque para uma Papelaria

## Contexto
Uma papelaria chamada **Papel & Cia** deseja informatizar o gerenciamento de seus produtos e clientes. Atualmente, o controle de itens como cadernos, canetas e lápis é feito manualmente, o que tem causado erros no estoque e atrasos nas vendas. Para resolver esses problemas, o proprietário quer implementar um sistema simples com base em três classes principais que representem os produtos, os clientes e os pedidos realizados.

## Objetivo
Criar um sistema de gerenciamento básico composto por três classes principais:

1. **Ex01.Produto**: Representa os itens vendidos pela papelaria.
2. **Ex01.Cliente**: Armazena os dados dos clientes que compram na loja.
3. **Ex01.Pedido**: Representa os pedidos feitos pelos clientes, relacionando produtos e quantidades.

A interação entre essas classes deve permitir a simulação de um pedido feito por um cliente e a atualização do estoque de produtos.

---

## Dados fornecidos para construção das classes

### Classe Ex01.Produto
- **Atributos**: 
  - `id` (identificador do produto)
  - `nome` (nome do produto)
  - `preco` (preço unitário)
  - `quantidade_estoque` (quantidade disponível no estoque)
- **Métodos**:
  - `reduzir_estoque(quantidade)`: Reduz a quantidade do estoque ao realizar uma venda.
  - `exibir_detalhes()`: Mostra as informações do produto.

### Classe Ex01.Cliente
- **Atributos**: 
  - `id` (identificador do cliente)
  - `nome` (nome do cliente)
  - `email` (e-mail para contato)
- **Métodos**:
  - `exibir_cliente()`: Mostra os dados do cliente.

### Classe Ex01.Pedido
- **Atributos**:
  - `id` (identificador do pedido)
  - `cliente` (objeto da classe Ex01.Cliente)
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
     - Ex01.Produto 1: Caderno, preço R$ 20, estoque 50 unidades.
     - Ex01.Produto 2: Caneta Azul, preço R$ 3, estoque 100 unidades.
     - Ex01.Produto 3: Lápis, preço R$ 1.50, estoque 200 unidades.
   - **Exemplo de clientes**:
     - Ex01.Cliente 1: João Silva, email `joao@email.com`.
     - Ex01.Cliente 2: Maria Santos, email `maria@email.com`.
3. **Simular o pedido**:
   - Ex01.Cliente João Silva compra:
     - 2 cadernos.
     - 5 canetas azuis.
   - O sistema deve calcular o total do pedido, exibir um resumo para o cliente e atualizar o estoque dos produtos.

