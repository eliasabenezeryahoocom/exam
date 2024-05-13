import java.util.Arrays;

public class question4 {


    public class bubble {
        public static void main(String[] args) {
            bubble();

        }
        public static void bubble() {
            int [] array={A,};
            for(int i=0;i< array.length-1;i++) {
                for(int j=0;j< array.length-1-i;j++) {
                    if (array[j]>array[j+1]) {
                        int temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                    }}}
            System.out.println(Arrays.toString(array));}}
}
