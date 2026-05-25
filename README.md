readme_content = """# 🚀 API REST Spring Boot - Gerenciamento de Produtos

Este projeto consiste em uma API REST corporativa para gerenciamento de produtos, desenvolvida em **Java 21** com o ecossistema **Spring Boot 3**. O projeto representa uma transição e evolução de uma arquitetura anterior construída em Node.js (Express), elevando o nível de robustez, tipagem estática e resiliência de infraestrutura.

---

## Filosofia de Desenvolvimento: IA-Augmented & Low-Code/No-Code

O grande diferencial deste projeto, assim como as demais aplicações que desenvolvo, é a utilização estratégica de **Inteligência Artificial Generativa e ferramentas de Code Generation (como Gemini, Claude, Cursor e Copilots)**. 

Em vez de focar no trabalho mecânico de digitação de sintaxes repetitivas (*boilerplate code*), aplico conceitos de **Engenharia de Prompts** e metodologias híbridas de **Low-Code/No-Code** para alavancar a produtividade. A IA atua como um copiloto técnico de alta velocidade, permitindo que o foco humano seja direcionado para o que realmente importa no mercado:
* 🛠️ **Arquitetura de Software e Modelagem de Dados.**
* 🔄 **Lógica de Negócios e Fluxo de Requisições.**
* 📦 **Infraestrutura, DevOps e Estratégia de Implantação no Cliente.**

---

## 🛠️ Tecnologias e Ferramentas Utilizadas (Stack)

### **Backend & Núcleo**
* **Java 21:** Versão moderna com recursos avançados de performance e estabilidade.
* **Spring Boot 3.x:** Framework base para inversão de controle, injeção de dependências e configuração ágil.
* **Spring Web:** Criação de endpoints RESTful eficientes utilizando anotações nativas (`@RestController`, `@PostMapping`, etc.).
* **Spring Data JPA / Hibernate:** Mapeamento Objeto-Relacional (ORM) para comunicação abstrata e segura com o banco de dados.

### **Banco de Dados & Testes**
* **MySQL:** Banco de dados relacional para persistência dos dados dos produtos.
* **XAMPP (phpMyAdmin):** Servidor local para gerenciamento e visualização das tabelas MySQL.
* **Postman:** Ferramenta para testes de carga, validação de payloads JSON e checagem de status HTTP.

### **Infraestrutura & Deploy**
* **Apache Maven:** Gerenciador de dependências e automação do ciclo de vida do build.
* **NSSM (Non-Sucking Service Manager):** Wrapper profissional para encapsulamento de executáveis Java no Windows.

---

## 🔄 Fluxo de Desenvolvimento e Recursos da API

A API foi desenvolvida seguindo o padrão de arquitetura em camadas (**Controller -> Repository -> Model**), garantindo o desacoplamento do código:

1. **`Model (Produto.java)`**: Define a entidade e o mapeamento com a tabela `produtos` do MySQL.
2. **`Repository (ProdutoRepository.java)`**: Interface que herda `JpaRepository`, fornecendo operações de CRUD automáticas sem necessidade de queries manuais.
3. **`Controller (ProdutoController.java)`**: Centraliza os endpoints REST, capaz de processar as seguintes operações:
   * 🔍 **`GET /api/produtos`**: Retorna a listagem completa de itens cadastrados no MySQL.
   * 📥 **`POST /api/produtos`**: Configurado de forma avançada para receber e processar **Listas de Objetos JSON (`List<Produto>`)** em lote de uma só vez, utilizando o método `.saveAll()`.
   * ✏️ **`PUT /api/produtos/{id}`**: Atualiza os dados de um item específico no banco baseado no ID da URL.
   * ❌ **`DELETE /api/produtos/{id}`**: Remove o registro do banco de dados de maneira cirúrgica.

---

## 📦 Implantação e Deploy Profissional (Serviço do Windows)

Um dos maiores marcos do projeto foi o processo de transição do ambiente de desenvolvimento (IDE) para o de produção (Servidor do Cliente). A aplicação não roda em uma janela aberta de prompt de comando; ela foi transformada em um **Serviço Nativo do Windows (`services.msc`)**.

### **O Fluxo de Deploy Utilizado:**
1. **Compilação Limpa:** Executado o comando `mvn clean package` via Maven para gerar um arquivo único e compactado de produção: **`api-spring-produtos-0.0.1-SNAPSHOT.jar`**.
2. **Instalação de Infraestrutura:** Utilização do utilitário **NSSM** para registrar o arquivo `.jar` diretamente no núcleo de serviços do sistema operacional Windows:
3. **Resiliência e Automação: O serviço foi configurado no modo Automático. Caso o servidor/computador do cliente seja reiniciado, o Windows inicializa a API Spring Boot em background automaticamente antes mesmo do login do usuário, garantindo alta disponibilidade (High Availability).

Lições Aprendidas
- Ciclo de Manutenção: Compreensão prática do bloqueio de arquivos do Windows em tempo de execução. Para aplicar atualizações (bugfixes ou novas features), o serviço deve ser temporariamente pausado no services.msc para liberar a substituição do arquivo .jar.

- Interoperabilidade: A API Java se conectou e manipulou com sucesso o mesmo banco de dados MySQL que antes era alimentado por uma aplicação Node.js, provando o poder e a universalidade do padrão RESTful.

- Agilidade com IA: A demonstração prática de que programadores que utilizam ferramentas de IA de forma direcionada atingem níveis de entrega e segurança arquitetural infinitamente superiores e mais velozes.
"""
