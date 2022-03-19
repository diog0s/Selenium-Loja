# Automação com Selenium Web Driver

[![Selenium|Web Driver](https://icon-library.com/images/selenium-icon/selenium-icon-1.jpg)](https://www.selenium.dev/documentation/webdriver/)


Um miniprojeto de automação no padrão page object, utilizando o gerenciador de dependências Gradle e o Selenium Web Driver onde é utilizado um site [loja de roupas] para fazer os testes automáticos. Também foi implementado o CI/CD com o Github Actions para que os testes sejam rodados toda vez que for feito um pull ou push na aplicação.


## Testes implementados
##### Uma pequena quantidade de testes foi implementada apenas com intuito de praticar, principalmente a parte do Github Actions.
- testLoginSuccessful(): que verifica o login;
- testLoginWithPasswdWrong(): que verifica login com senha errada;
- testLoginWithEmailWrong(): que verifica login com e-mail errado;
- testPurchasesTshirt(): que testa a compra de uma t-shirt;
- testVerifyCart(): que verifica se o pedido foi adicionado ao carrinho;
- verifyStock(): verifica se há estoque do pedido.

## Instalação & Utilização

Primeiro, clone o projeto e então rode os comandos.

```sh
cd Selenium-Loja
gradle build
./gradlew test
```



## License

MIT

**Free Software, Hell Yeah!**

[//]: # (These are reference links used in the body of this note and get stripped out when the markdown processor does its job. There is no need to format nicely because it shouldn't be seen. Thanks SO - http://stackoverflow.com/questions/4823468/store-comments-in-markdown-syntax)

   [loja de roupas]: <http://automationpractice.com/index.php README.md>


