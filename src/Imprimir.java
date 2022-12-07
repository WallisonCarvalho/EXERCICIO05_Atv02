
public class Imprimir {
    public void Mensagem(int n) {
        int teste = 25;
        n = teste;

        for (int i = 1; i <= n; i++) {

            for (int x = 1; x <= i; x++) {
                System.out.print(x);
            }
            System.out.println();
        }
    }

}
