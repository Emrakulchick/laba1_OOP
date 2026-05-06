
public class Matrix_operations {
    public short[][] xor(short[][] matrix_a, short[][] matrix_b){
        short[][] matrix_c = new short[matrix_a.length][matrix_a[0].length]; // new - виділяю місце в пам'яті для нового об'єкту, щоб я міг туди класти числа(поки в матриці в мене всі 0)
        for(int i = 0;  i < matrix_a.length; i++){
            for(int j = 0; j < matrix_a[i].length; j++){
                matrix_c[i][j] = (short) (matrix_a[i][j] ^ matrix_b[i][j]);
            }
        }
        return matrix_c;
    }

    public int sum(short[][] matrix){
        int sum_element = 0;
        for (short[] shorts : matrix) {
            int min = shorts[0];
            for (int j = 1; j < matrix[0].length; j++) { // зап за matrix[0].length або matrix_a[i].length
                if (shorts[j] < min) {
                    min = shorts[j];
                }
            }
            sum_element += min;
        }
        return sum_element;
    }
}