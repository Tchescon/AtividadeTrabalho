/*
* Com parametros significa que o metodo pode receber informações para usar
* Sem retorno signiica que o metodo executa uma tarefa, mas nãod evolve nada que possa ser utilizado por outra parte do programa
*
*
 */

public class MetodoComParametrosSemRetorno {
    public static void mostrarDobro(int numero) {
        System.out.println(numero * 2);


    }
    public static void main(String[] args) {
        mostrarDobro(5);
    }
}

// mostrarDobro é o nome do nosso metodo
// int numero significa que o metodo recebe um numero inteiro
// void signica que o metodo nao devolve um valor para quem o chamou[
// A linha 15 significa que estamos mandando o numero 5 pra chamada
// o proprio Java entende que o metodo espera um numero inteiro para chamada

/* Finalidade: Mostrar o dobro de um numero
 * Assinatura: public static void mostrarDobro(int numero)
 * Parametros: (int numero)
 * Retorno: Não possui
 * Chamada: mostrarDobro(5);
 */