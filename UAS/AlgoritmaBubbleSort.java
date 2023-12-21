public class AlgoritmaBubbleSort {
    public static void main(String[] args) {
        int nilai[] = {55, 22, 88, 44, 66};
        bubbleSortAscInt(nilai);
    }

    public static void bubbleSortAscInt (int[] bilangan){
        System.out.println("\n+================================================+");
        System.out.println("| Mencoba Algoritma Bubble Sort Menggunakan Java |");
        System.out.println("+================================================+");
        System.out.println("\n=== SEBELUM ===\n");
        for (int bil : bilangan){
            System.out.print(bil + ", ");
        }

        for (int i = 0; i < bilangan.length; i++ ){
            for(int j = 0; j < bilangan.length-1; j++){

                if (bilangan[j] > bilangan[j+1]){
                    int tampungan = bilangan[j];
                    bilangan[j] = bilangan[j+1];
                    bilangan[j+1] = tampungan;
                }
            }
        }

        System.out.println("\n\n=== SESUDAH ===\n");
        for (int bil : bilangan){
            System.out.print(bil + ", ");
            
        }
        System.out.println("\n");
    }
}