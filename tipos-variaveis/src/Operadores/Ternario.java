package Operadores;

public class Ternario {
    public static void main(String[] args) {
   
    // O operador ternario é representado pelos simbolos ?:
    /*
     * <Expressão Condicional>  ?  <Caso condição seja true> :
     * <caso condiçõa seja false
     */

    // Exemplo
    int a,b;

    a = 6;
    b = 6;
    //String resultado = "";
    // EXEMPLO DE CONDICIONAL UTILIZANDO UMA ESTRUTURA IF/ELSE
    /*
     if(a==b)
        resultado = "verdadeiro";
    else
        resultado = "falso";
     */
    
    //  OUTRO FORMATO
    String resultado = a==b ? "verdadeiro" : "falso";
    
        System.out.println(resultado);


    }
}
