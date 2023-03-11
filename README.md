# Humanize Number with Java
🌐 _Para a versão em português deste README, [clique aqui](./docs/locales/pt-br/README.md)._


<p align="center">
    Number humanization algorithm for Brazilian scale inspired by <a href="https://github.com/BetoFrega/humaniza-numeros">@BetoFrega/humaniza-numeros</a><br>
    <img src="https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white" alt="Logo Swagger UI"/>
    <img src="https://img.shields.io/badge/JUnit%205-23995d?style=for-the-badge&logo=junit5&logoColor=d14e46" alt="Logo TypeScript" />
    <img alt="GitHub top language" src="https://img.shields.io/github/languages/top/EuCarlos/humanize-numbers-java?color=orange&style=for-the-badge">
    <img alt="GitHub release (latest by date)" src="https://img.shields.io/github/v/release/eucarlos/humanize-numbers-java?style=for-the-badge">
</p>

## Summary
- [1. Installation:](#1-installation)
- [2. Run the project](#2-run-the-project)
- [3. How to contribute to this project?](#4-how-to-contribute-to-this-project)
- [4. How do I report a bug or request a feature?](#5-how-do-i-report-a-bug-or-request-a-feature)

## 1. Installation:
Clone the repo:
```bash
git clone https://github.com/EuCarlos/humanize-numbers-java.git \
  && cd humanize-numbers-java
```
### 2. Run the project
Run the project by starting the App class found at `br.com.carlos.hn` in the `\src` directory and the tests in the `\tests` directory

#### 2.1 Como usar
```java
HumanizeNumbers<Number> hn = new HumanizeNumbers("pt"); // "pt", "en"
String result = hn.execute(11234567, 2);

System.out.println(result); // 11,23 Milhões
```


## 3. How to contribute to this project?
Before starting, check and follow the instructions for contributing to the repository. If not, you can follow the instructions below:

1. Fork the project
2. Create a new branch: git checkout -b nova-branch
3. Commit your changes: git commit -m 'I added something'
4. Push to branch: git push origin nova-branch
5. Open a Pull Request

## 4. How do I report a bug or request a feature?
If you want to report a bug or request a feature, go to [Issue](https://github.com/eucarlos/humanize-numbers-java/issues) on the GitHub Project and add your request.

___

<p align="center">
Created with 💜 by <a href="https://github.com/eucarlos/">Carlos Alves</a></p>

