# CepApi
📦 CepApi
🧭 Sobre o projeto

O CepApi é uma aplicação desenvolvida em Java com Spring Boot que consome a API pública do ViaCEP, permitindo buscar informações de endereços a partir de um CEP informado.

De forma simples, o sistema faz uma requisição à API do ViaCEP e retorna dados como logradouro, bairro, cidade, estado, entre outros.

🚀 Tecnologias utilizadas

☕ Java 17+

🌱 Spring Boot

🌐 RestTemplate (para consumo da API)

🧩 Maven (gerenciador de dependências)

💾 JSON (formato dos dados recebidos)

📁 Estrutura principal do projeto
src/
 └── main/
     ├── java/com/cep/api/
     │   ├── config/        # Configurações (ex: RestTemplate)
     │   ├── controller/    # Controladores REST
     │   ├── dto/           # Objetos de transferência de dados (ViaCepResponse)
     │   ├── exception/     # Tratamento de erros personalizados
     │   └── service/       # Lógica de consumo da API ViaCEP
     └── resources/
         └── application.properties

⚙️ Como executar o projeto
🔹 Pré-requisitos

Java 17 ou superior instalado

Maven configurado

IDE de sua preferência (Eclipse, IntelliJ, VS Code etc.)

🔹 Passos

Clonar o repositório

git clone https://github.com/Barrett0/CepApi.git


Entrar na pasta do projeto

cd CepApi


Rodar o projeto

mvn spring-boot:run


Acessar no navegador ou via Postman:

http://localhost:8080/cep/{CEP}


Exemplo:

http://localhost:8080/cep/01001000

🧠 Exemplo de retorno da API
{
  "cep": "01001-000",
  "logradouro": "Praça da Sé",
  "complemento": "lado ímpar",
  "bairro": "Sé",
  "localidade": "São Paulo",
  "uf": "SP",
  "ibge": "3550308",
  "gia": "1004",
  "ddd": "11",
  "siafi": "7107"
}

💡 Aprendizados

Durante o desenvolvimento deste projeto, foi possível aprender e aplicar:

Criação de endpoints REST com Spring Boot

Consumo de API externa com RestTemplate

Tratamento de exceções personalizadas

Organização de camadas em uma aplicação Java

👨‍💻 Autor

Bruno Barretto
🔗 Meu GitHub
