### Diagrama UML - Iphone
```mermaid
classDiagram
    class iPhone {
        
    }

    class ReprodutorMusical {
        +tocar()
        +pausar()
        +selecionarMusica(musica: String)
    }

    class AparelhoTelefonico {
        +ligar(numero: String)
        +atender()
        +iniciarCorreioVoz()
    }

    class NavegadorInternet {
        +exibirPagina(url: String)
        +adicionarNovaAba()
        +atualizarPagina()
    }

    iPhone --|> ReprodutorMusical : Implements
    iPhone --|> AparelhoTelefonico : Implements
    iPhone --|> NavegadorInternet : Implements

### Explicação do Código Mermaid:

1. **Classe `iPhone`**: Inclui todos os métodos especificados para as funcionalidades do iPhone.
2. **Classes `ReprodutorMusical`, `AparelhoTelefonico`, `NavegadorInternet`**: Contêm métodos relacionados às suas respectivas funcionalidades.
3. **Relacionamentos**: As setas `--|>` indicam que a classe `iPhone` implementa as interfaces ou funcionalidades das outras classes.