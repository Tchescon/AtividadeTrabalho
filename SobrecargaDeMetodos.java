/*
*Sobrecarga e quando criamos dois ou mais metodos com o mesmo nome , mas co parametros diferentes
* ele permite que metodos com mesmo nome realizem tarefas semelhantes, mas recebam quantidades ou tipos diferentes de informações
* o java identifica de acordo com a quantidade ou tipos diferentes de informações
*
*
 */

public class SobrecargaDeMetodos {
    public  static int somar(int a, int b) {
        return a + b;
    }
    public  static int somar(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        System.out.println(somar(2,4));
        System.out.println(somar(2, 4, 6));
    }
}

/* Finalidade: Somar dois ou tres numeros usando o mesmo nome de metodo
 * Assinatura: somar(int a, int b) e somar(int a, int b, int c)
 * Parametros: dois numeros no primeiro metodo e tres no segundo
 * Retorno:ambos retornam numero inteiro(int)
 * Chamada: (somar(2,4)) ou (somar(2, 4, 6));
 */
