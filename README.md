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
### Sobre o Uso de Inteligência Artificial
A utilização de ferramentas de Inteligência Artificial, em especial modelos de linguagem como o ChatGPT (modelo GPT-4o Mini), teve um papel central no desenvolvimento deste projeto. Apesar de ainda não oficialmente matriculada no curso – tendo aprendido exclusivamente por meio de cursos e estudos autodirigidos – venho consolidando meu conhecimento de forma ativa, curiosa e exploratória. Este repositório representa a versão mais atual e madura do meu aprendizado em Java.

Durante a implementação do projeto, adotei o uso de IA como principal apoio pedagógico e técnico. Ao invés de seguir cegamente tutoriais, utilizei os cursos como ponto de partida e, a partir deles, formulei perguntas direcionadas ao modelo de linguagem. Essa abordagem me permitiu compreender trechos de código de forma aprofundada, justificar decisões técnicas, explorar diferentes soluções para um mesmo problema e, principalmente, fortalecer a conexão entre novos conceitos e aprendizados anteriores.

A prática contínua de revisar, questionar e refatorar o código com auxílio da IA contribuiu diretamente para o desenvolvimento de um raciocínio computacional mais crítico. Percebi um aumento significativo na produtividade e na qualidade do meu aprendizado ao aplicar esse modelo interativo de estudo, especialmente em projetos práticos. O hábito de questionar o porquê de cada linha e buscar alternativas melhores tornou-se parte do meu processo natural de aprendizagem.


### Análise dos Resultados Obtidos
Durante a evolução do projeto (ideias de projetos para o envio desse trabalho estão nos repositórios anteriores a esse), foi possível observar uma melhoria significativa na escalabilidade do sistema ao substituir o uso de arquivos .txt por arquivos .json para armazenamento de dados. Essa mudança está diretamente relacionada às diferenças estruturais entre os dois formatos.

A lógica inicialmente implementada com arquivos .txt exigia dois métodos distintos: um responsável por escrever os elementos em uma linha, e outro, estático, utilizado para reconstruir objetos a partir da leitura do arquivo. Esse segundo método dependia da quebra da linha lida em um array (do tipo string, se necessário, com parsing), cujos índices eram passados como argumentos para o construtor da entidade correspondente. Embora funcional, essa abordagem se mostrou limitada e suscetível a erros com alterações na ordem ou no número de atributos (muito comum NullPointerException). Além disso, é de se esperar comportamentos inesperados ao persistir dados comsumidos de uma api em um arquivo .txt

Com a adoção do formato .json, houve um avanço considerável em termos de flexibilidade e manutenção do código. Utilizando a biblioteca Gson, adicionada ao projeto via Maven (com pom.xml), tornou-se possível serializar objetos diretamente em arquivos .json e, da mesma forma, desserializá-los com facilidade. Essa estrutura baseada em chave-valor não apenas torna os dados mais legíveis e organizados, mas também facilita a inclusão ou modificação de atributos sem a necessidade de alterar a lógica central de leitura e escrita.

Essa transição demonstrou-se especialmente vantajosa no contexto de escalabilidade: conforme a complexidade das entidades aumentou, a estrutura JSON se adaptou de forma mais eficiente, sem comprometer a integridade ou a legibilidade dos dados. Assim, o uso dessa tecnologia representou um ganho técnico importante no desenvolvimento da escalabilidade do projeto.





