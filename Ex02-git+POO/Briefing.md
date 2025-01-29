# Situação-Problema: Sistema de Reservas para um Hotel

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

