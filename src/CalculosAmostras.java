public class CalculosAmostras {
    public static void main(String[] args) {
        int[] X = {2, 7, 4, 3, 2};
        int[] Y = {1, 2, 3, 6, 5};

        // a) Soma de X
        int somaX = 0;
        for (int i = 0; i < X.length; i++) {
            somaX += X[i];
        }
        System.out.println("Soma de X: " + somaX);

        // b) Soma do Produto de X e Y
        int somaProdutoXY = 0;
        for (int i = 0; i < X.length; i++) {
            somaProdutoXY += X[i] * Y[i];
        }
        System.out.println("Soma do Produto de X e Y: " + somaProdutoXY);

        // c) Soma dos Quadrados de X e Cubos de Y
        int somaQuadradosX = 0;
        for (int i = 1; i <= 3; i++) {
            somaQuadradosX += X[i] * X[i];
        }

        int somaCubosY = 0;
        for (int i = 3; i <= 2; i++) {
            somaCubosY += Y[i] * Y[i] * Y[i];
        }

        int resultadoC = somaQuadradosX + somaCubosY;
        System.out.println("Soma dos Quadrados de X e Cubos de Y: " + resultadoC);
    }
}
