# Projeto iPhone

Este projeto implementa uma simulação básica das funcionalidades do iPhone, conforme apresentado no lançamento original do dispositivo em 2007. O projeto é dividido em várias interfaces que representam diferentes funcionalidades e uma classe `iPhone` que implementa essas interfaces.

## Funcionalidades

### Reprodutor Musical

A interface `ReprodutorMusical` define os métodos para controlar a reprodução de músicas:

- `tocar()`: Inicia a reprodução de uma música.
- `pausar()`: Pausa a música em reprodução.
- `selecionarMusica(String musica)`: Seleciona uma música específica para reprodução.

### Aparelho Telefônico

A interface `AparelhoTelefonico` define os métodos para o funcionamento básico de um telefone:

- `ligar(String numero)`: Realiza uma chamada para o número especificado.
- `atender()`: Atende uma chamada.
- `iniciarCorreioVoz()`: Inicia o correio de voz.

### Navegador na Internet

A interface `NavegadorInternet` define os métodos para navegação na web:

- `exibirPagina(String url)`: Exibe uma página web especificada pela URL.
- `adicionarNovaAba()`: Adiciona uma nova aba no navegador.
- `atualizarPagina()`: Atualiza a página atual.

### iPhone

A classe `iPhone` implementa as três interfaces acima (`ReprodutorMusical`, `AparelhoTelefonico` e `NavegadorInternet`). Esta classe simula um dispositivo iPhone com todas as funcionalidades básicas.

## Diagrama UML

```mermaid
classDiagram
    class ReprodutorMusical {
        +tocar()
        +pausar()
        +selecionarMusica(String musica)
    }

    class AparelhoTelefonico {
        +ligar(String numero)
        +atender()
        +iniciarCorreioVoz()
    }

    class NavegadorInternet {
        +exibirPagina(String url)
        +adicionarNovaAba()
        +atualizarPagina()
    }

    class iPhone {
    }

    iPhone --|> ReprodutorMusical
    iPhone --|> AparelhoTelefonico
    iPhone --|> NavegadorInternet
