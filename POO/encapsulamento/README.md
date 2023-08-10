## Encapsulamento

O encapsulamento é outro conceito POO que representa ocultação de dados. Isso significa que as variáveis 
são encapsuladas na classe e outras classes não podem acessá-las diretamente. Podemos acessá-los apenas 
por meio dos métodos de classe pública. Desta forma, podemos ocultar dados importantes e restringir sua 
modificação.

## Como conseguir o encapsulamento 

Podemos alcançar o encapsulamento das maneiras abaixo.
* Declarar variáveis como ***private***. Não podemos acessar variáveis privadas diretamente de outras 
classes.
* Executar os métodos ***getter*** e ***setter***. Podemos usá-los para ler e escrever os valores.

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).
