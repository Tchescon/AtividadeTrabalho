
/*
* Sem parametros significa que o metodo não precisa receber nenhuma informação para funcionar
* Sem retorno signiica que o metodo executa uma tarefa, mas nãod evolve nada que possa ser utilizado por outra parte do programa
* O void significa que o metodo nao devolve um resultado como um numero ou texto para quem o chamou
* o void é uma função sem retorno
 */
public class SemParametrosSemRetorno {
    public static void mostrarMensagem() {
        System.out.printf("Olá Mundo!! ");

    }
    public static void main(String[] args) {
        mostrarMensagem(); //Chamada do metodo
    }
}
//Os parenteses vazios indicam que ele ja sabe o que fazer
//Nesse caso, mostrar a mensagem

/* Finalidade: Mostrar uma mensagem de texto
* Assinatura: public static void mostrarMensagem()
* Parametros: Não possui
* Retorno: Não possui
* Chamada: mostrarmensagem();
 */