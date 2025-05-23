# Relatório do Projeto: Arquitetura de Computadores

## Introdução

Este projeto foi desenvolvido como parte do curso de Arquitetura de Computadores, com o objetivo de aplicar na prática os conceitos estudados em sala de aula. A proposta envolveu a implementação de uma arquitetura de processador simples, utilizando a linguagem de descrição de hardware Verilog, e a simulação de seu funcionamento por meio de testes específicos.

## Objetivos

* Implementar uma base de cálculos que fornece informações do hardware do computador.
* Persistir dados em um arquivo application/json.
* Trabalhamos em reflexões com a manipulação de tipos genéricos (TypeToken do Gson).
* Simular o funcionamento do processador com um conjunto de instruções de teste.

## Estrutura do Projeto

O projeto está organizado da seguinte forma:

```
comp-architecture/
├── src/
│   └── main/
│       └── java/
│           └── org/
│               └── model/
│                   ├── Architecture.v        
│               └── services/
│                   ├── ArchitectureRepository.v
│                   ├── ArchitectureController.v        
│               └── utils/
│                   ├── JsonUtils.v
│                   ├── CalculatorUtils.v
│
│
├── data.json
├── pom.xml
└── README.md
```

* `Architecture.v`: Implementação da entidade do domínio (Arquitetura) com seus respectivos campos de tratamento.
* `ArchitectureRepository.v`: Implementação de acesso de dados (salvamento e carregamento do arquivo .json).
* `ArchitectureController.v`: Implementação da unidade de controle que roda na classe Main.
* `JsonUtils.v`: Integração da lib Gson para serialização e deserialização do elemento json.
* `Calculator.v`: Implementação de métodos de cálculo.
* `data.json`: Arquivo contendo dados de entrada para os testes.
* `pom.xml`: Arquivo de configuração do Maven para gerenciamento do projeto.

## Implementação

### Valores de Entrada Escolhidos no Teste
```
[
  {
    "processorType":"ARM",
    "busWidthBits":32,
    "busFrequencyHz":800.0,
    "deviceCount":2,
    "cyclesPerTransfer":3,
    "lossRate":0.0
  },

  {
    "processorType":"x86",
    "busWidthBits":64,
    "busFrequencyHz":3.2,
    "deviceCount":4,
    "cyclesPerTransfer":2,
    "lossRate":0.0
  }
]
```


