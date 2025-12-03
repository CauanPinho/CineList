🎬 CineList — Sistema de Gerenciamento de Filmes (CRUD em Java)

O CineList é um projeto desenvolvido em Java utilizando conceitos fundamentais da linguagem, como orientação a objetos, encapsulamento, construtores, ArrayList e manipulação de dados via console.

O sistema permite que o usuário cadastre filmes, liste todos os filmes, procure por título, atualize informações e remova registros.
Tudo isso por meio de um menu interativo em modo texto.

📌 Funcionalidades

O CineList implementa um CRUD completo:

✔️ Create — Cadastrar filme

Adiciona um novo filme com:

ID

Título

Gênero

Ano

✔️ Read — Listar filmes

Exibe todos os filmes cadastrados com suas informações.

✔️ Search — Procurar por título

Permite pesquisa por palavra-chave, ignorando maiúsculas/minúsculas (case-insensitive).

✔️ Update — Atualizar dados

O usuário pode atualizar:

Título

Gênero

Ano

Com opção de:

Deixar em branco para manter

Digitar 0 para não alterar o ano

✔️ Delete — Remover filme

Remove um filme da lista informando o ID.

🧩 Estrutura do Projeto
src/
 └── main/
      └── java/
           ├── Application.java          # Arquivo principal (menu e lógica)
           └── entities/
                └── Movie.java          # Classe que representa um filme

💡 Conceitos aplicados

Programação Orientada a Objetos

Encapsulamento

Getters e Setters

Construtores

Estruturas de repetição (while, for, for-each)

Estruturas de decisão (switch-case)

Coleções (ArrayList)

Manipulação de strings (toLowerCase, contains)

Controle de fluxo com boolean

Scanner para entrada do usuário

Organização de código em pacotes

🛠️ Tecnologias utilizadas

Java 17+ (ou compatível)

IntelliJ IDEA (opcional, mas recomendado)

Execução via terminal

▶️ Como executar o projeto
1) Navegue até a pasta do projeto
cd src/main/java

2) Compile os arquivos
javac Application.java entities/Movie.java

3) Execute o programa
java Application

📷 Demonstração do Menu
=== MENU ===
1 - CADASTRAR FILME
2 - LISTAR FILMES
3 - PROCURAR FILME POR TÍTULO
4 - ATUALIZAR CADASTRO DO FILME
5 - REMOVER FILME
6 - SAIR

🚀 Próximas melhorias (roadmap)

 Persistir filmes em arquivo .txt ou .json

 Criar interface gráfica (JavaFX ou Swing)

 Adicionar classificação indicativa

 Exportar lista de filmes

 Melhorar validações de entrada

 Criar testes automatizados

👤 Autor

Desenvolvido por Cauan Pinho
Projeto utilizado para estudo prático e registro profissional no GitHub.

⭐ Gostou do projeto?

Considere deixar uma estrela no repositório! Isso ajuda muito. 🙌
