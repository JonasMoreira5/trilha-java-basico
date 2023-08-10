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

     ![image](https://github.com/JonasMoreira5/trilha-java-basico/assets/98792997/51825231-9aff-41f0-b7fb-b24e70a6b017)


## Vantagens do encapsulamento
1. Fornece segurança ao não permitir que classes externas modifiquem os campos privados.
2. Podemos ter métodos somente leitura ou gravação, portanto, fornecendo restrições para outras
classes acessá-los. Isso significa que, se uma classe tem apenas o método getter, só podemos ler as 
variáveis. Da mesma forma, podemos ter apenas o método setter para apenas definir valores a 
variável.
3. Fornece flexibilidade e capacidade de reutilização por meio dos métodos getter e setter
4. Os detalhes de implementação não são visíveis para outras classes.
5. Fácil para teste de unidade
