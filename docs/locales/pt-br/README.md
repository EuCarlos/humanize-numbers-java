# Humanize Number with Java

<p align="center">
    Algoritmo de humanização de numeros para escala brasileira inspirado em <a href="https://github.com/BetoFrega/humaniza-numeros">@BetoFrega/humaniza-numeros</a><br>
    <img src="https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white" alt="Logo Swagger UI"/>
    <img src="https://img.shields.io/badge/JUnit%205-23995d?style=for-the-badge&logo=junit5&logoColor=d14e46" alt="Logo TypeScript" />
    <img alt="GitHub top language" src="https://img.shields.io/github/languages/top/EuCarlos/humanize-numbers-java?color=orange&style=for-the-badge">
    <img alt="GitHub release (latest by date)" src="https://img.shields.io/github/v/release/eucarlos/humanize-numbers-java?style=for-the-badge">
</p>

## SUMÁRIO
- [1. Instalação](#1-instalacao)
- [2. Rode o projeto](#2-rode-o-projeto)
- [3. Como contribuir para este projeto?](#3-como-contribuir-para-este-projeto)
- [4. Como faço para relatar um bug ou solicitar um recurso?](#4-como-faco-para-relatar-um-bug-ou-solicitar-um-recurso)

## 1. Instalação:
Clone o repositório:
```bash
git clone https://github.com/EuCarlos/humanize-numbers-java.git \
  && cd humanize-numbers-java
```
### 2. Rode o projeto

Rode o projeto iniciando a classe App que se encontra em `br.com.carlos.hn` no diretorio `\src` e os testes no diretorio `\tests`

#### 2.1 Como usar
```java
HumanizeNumbers<Number> hn = new HumanizeNumbers("pt"); // "pt", "en"
String result = hn.execute(11234567, 2);

System.out.println(result); // 11,23 Milhões
```

## 3. Como contribuir para este projeto?
Antes de começar, verifique e siga as instruções para contribuir com o repositório. Se não, você pode seguir as instruções abaixo:

1. Fork o projeto
2. Crie um novo branch: git checkout -b nova-branch
3. Confirme suas alterações: git commit -m 'Adicionei algo'
4. Push to branch: git push origin nova-branch
5. Abra uma solicitação pull

## 4. Como faço para relatar um bug ou solicitar um recurso?
Se você quiser relatar um bug ou solicitar um recurso, vá para [Issue](https://github.com/eucarlos/humanize-numbers-java/issues) no projeto do GitHub e adicione sua solicitação.

___

<p align="center">
Criado com 💜 por <a href="https://github.com/eucarlos/">Carlos Alves</a></p>

