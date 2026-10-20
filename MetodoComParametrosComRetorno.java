/*
 * Com parametros significa que o metodo pode receber informações para usar
 * Com retorno significa que return deve estar presente,alem disso, ele retorna algo que
 * pode ser usado posteriormente no codigo
 *
 */


public class MetodoComParametrosComRetorno {

    public static int somar(int a, int b) {
        return a + b;
    }
    public static void main(String[] args) {
        int resultado = somar(5,3);
        System.out.println(resultado);
    }
}
// Usavamos void para mostrar o resultado diretamente na tela
// Agora usamos int e return para devolver o resultado que pode ser guardado e utilizado depois

/* Finalidade: Somar dois numeros e devolver o resultado
 * Assinatura: public static int somar(int a, int b)
 * Parametros: dois numeros inteiros (a e b)
 * Retorno: devolve a soma (return a + b)
 * Chamada: int resultado = somar(5,3);
 */