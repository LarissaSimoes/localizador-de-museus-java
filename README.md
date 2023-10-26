# Localizador de museus API

Este projeto é uma implementação de uma API para facilitar a busca por museus com base em sua localização. A API permite criar museus, encontrar o museu mais próximo, obter informações sobre museus por ID e listar os tipos de coleções de museus. O projeto utiliza o Spring Boot e é configurado para ser executado em um contêiner Docker.

## Habilidades Demonstradas

Neste projeto, as seguintes habilidades foram demonstradas:

- Criação de classes de Modelo e DTO
- Habilitação do Spring Boot Actuator
- Implementação de métodos em classes de serviço
- Criação de rotas em classes de controle
- Tratamento de exceções com um ControllerAdvice
- Implementação de testes unitários
- Criação de um Dockerfile multi-estágio

## Estrutura do Projeto

A estrutura do projeto é organizada da seguinte forma:

- `src/main/java/com.betrybe.museumfinder`: Contém o código-fonte da aplicação.
  - `controller`: Contém classes de controle que definem as rotas da API.
  - `service`: Contém classes de serviço que implementam a lógica de negócios da aplicação.
  - `model`: Contém classes de modelo que representam os objetos de dados da aplicação.
  - `dto`: Contém classes de DTO (Data Transfer Object) que são usadas para transferir dados entre a API e o cliente.
  - `advice`: Contém a classe `GeneralControllerAdvice` que lida com exceções da API.
- `src/main/resources`: Contém arquivos de configuração da aplicação.
- `src/test/java/com.betrybe.museumfinder`: Contém classes de teste para as classes de controle e serviço.
- `Dockerfile`: Define a configuração para criar uma imagem Docker da aplicação.

## Endpoints da API

A API oferece os seguintes endpoints:

1. **POST /museums**: Cria um novo museu com base nos dados fornecidos.
2. **GET /museums/closest**: Retorna o museu mais próximo com base na localização especificada.
3. **GET /museums/{id}**: Retorna informações detalhadas sobre um museu com o ID especificado.
4. **GET /collection-types**: Retorna uma lista de tipos de coleções de museus disponíveis.


## Como executar o projeto
<br/>

```bash
# Clone ou baixe o repositório
git clone git@github.com:LarissaSimoes/localizador-de-museus-java.git
# Entre no diretório
cd localizador-de-museus-java
# Instale as dependências
mvn install -DskipTests
# Para executar os testes
mvn test
```

<br /><hr /><br />

<p align='center'>
  Desenvolvido por <b>Larissa Simões</b>
  <br/><br/>

  <a href="https://www.linkedin.com/in/dev-larissa-carneiro-simoes/">
    <img alt="linkedIn" height="30px" src="https://i.imgur.com/TQRXxhT.png" />
  </a>
  &nbsp;&nbsp;
</p>
