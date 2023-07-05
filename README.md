# trilha-java-basico
Repositório para exemplos do curso de Java Básico

# Documentação
A documentação Web foi criada com o seguinte comando:

```  ~ javadoc -encoding UTF-8 -docencoding ISO-8859-1  -d ../docs  src/*.java ```

[Clique aqui](http://exemplo.com/) para acessar a documentação Web dos Exercicios

## Terminal e Argumentos
1. main args
2. Scanner
3. Execução via IDE
4. Execução via prompt de comando

Nem sempre executamos nosso programa Java pela IDE, já pensou nossos clientes
tendo que instalar o Eclipse ou VsCode para rodar o sistema em sua empresa?

Com a **JVM** devidamente configurada, nós podemos criar um executável do nosso programa e
e disponibilizar o instalador para qualquer sistema operacional.

Nesse caso vamos aprender como executar um programa Java via **terminal** como **MS-DOS** ou **terminal do Vscode**.
Vamos ilustrar como executar um classe, depois de compilada, sem precisar usar IDE.

1. Abra o MS_DOS ou Power Shell
2. Localize o diretório do seu projeto: **cd C:\estudos\dio-trilha-java-basico\java-terminal**
3. Acesse a pasta *bin*: **cd bin**
4. Agora digite o comando: **java MinhaClasse**  (*nome da sua classe sem a extensão* **.class**)

## Argumentos
Quando executamos uma classe que contenha o método main, o mesmo permite que passemos um array [] de
argumentos do tipo String. Logo podemos após a definição da classe a ser executada informar estes parâmetros, exemplo:
