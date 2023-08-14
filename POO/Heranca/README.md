## Herança

Herança é um dos recursos mais importantes de um sistema de Programação Orientado a Objetos (POO).

## O que é Herança

Quando uma classe pode reutilizar os métodos e variáveis de outra classe, chamamos esse conceito em 
POO como Herança. Esta classe pode reutilizar os dados e funções de outras classes estendendo a classe 
usando a palavra-reservada **extends**. A classe pai é chamada de classe base ou superclasse e a classe que 
estende a classe pai é chamada de classe filho ou subclasse ou classe derivada. Em outras palavras, usando 
este conceito de POO, podemos definir uma nova classe usando a classe existente, herdando todos os 
atributos (variáveis) e métodos.

## Terminologias na herança de Java
* **Superclasse** - É a classe `principal` ou classe `base` da qual uma nova classe herda as propiedades ou métodos.
* **Subclasse** - A classe que estende a classe pai é uma subclasse ou classe `filho`.
* **extends** - Palavra-reservada que suporta herança
* **super** - Palavra-reservada que denota um método construtor ou variável da classe principal. 

## Caracteristicas da Herança
* Capacidade de reutilizar o código existente de uma classe
* Suporta substituição de método
* Permite chamar métodos da superclasse dentro de métodos de uma subclasse usando **paçavra-reservada super**.
* Não permite herdar a classe final ou substituir métodos finais.
* Suporta herança múltipla usando interfaces.
#
### Classe Abstrata

### Método Abstrato

### Classe Final

### Método Final


## Tipos de Herança
Existem diferentes tipos de herança, conforme descrito abaixo:
![image](https://github.com/JonasMoreira5/trilha-java-basico/assets/98792997/9148d0e0-2577-4569-a1d1-97b89a8a66b7)

### Herança Simples
Tipo de herança onde uma classe estende outra classe. A partir da representação pictórica (representação 
visual), podemos entender que a classe A é a classe base e a classe B é a subclasse.

![image](https://github.com/JonasMoreira5/trilha-java-basico/assets/98792997/41c9b384-1939-4a50-98bf-a7cd5f35f306)
### Herança multinível
Nesse tipo de herança em java, a própria classe filho se torna uma classe pai de outra classe. No diagrama 
abaixo, podemos entender que a classe A é a classe pai e a classe B é a classe filho. Mas a classe B 
novamente é a classe-pai da classe C, que é a classe-filho. 

![image](https://github.com/JonasMoreira5/trilha-java-basico/assets/98792997/353999d9-d673-4fc5-9c7e-906e36005302)

### Herança hierárquica 
Nesse tipo de herança em java, a mesma classe pai pode ter várias classes filho. A partir da imagem abaixo, 
podemos entender que a classe A é a classe pai tanto da classe B quanto da classe C. Em simples palavras, 
a classe A é o pai e a classe B e C são os irmãos. 

![image](https://github.com/JonasMoreira5/trilha-java-basico/assets/98792997/bc66c82e-6049-401d-a4f0-be6f1c513d9f)



