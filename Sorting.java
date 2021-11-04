public class Sorting {

    public static void output(int[] a){
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
    public static int[] selection1(int[] a){
        for(int i = 0; i < a.length-1; i++){
            int min = i;
            int tmp;
            for(int j = i + 1; j < a.length; j++){
                if(a[j] < a[min])
                    min = j;
            }
            tmp = a[i];
            a[i] = a[min];
            a[min] = tmp;
        }
        return a;
    }

    public static int[] selection2(int[] a) {
        for (int i = a.length-1; i >= 1; i--) {
            int max = i;
            int tmp;
            for (int j = 0; j < i; j++) {
                if (a[j] > a[max]) 
                    max = j;
            }
            tmp = a[max];
            a[max] = a[i]; 
            a[i] = tmp;
        }
        return a;
    }
    

    public static int[] bubble1(int[] a){
        for(int i = 1; i < a.length; i++){
            int tmp;
            for(int j = 0; j < a.length - i; j++){
                if(a[j] > a[j+1]){
                    tmp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = tmp;
                }
            }
        }
        return a;
    }

    public static int[] bubble2(int[] a){
        for(int i = a.length - 1; i > 0; i--){
            int tmp;
            for(int j = a.length - 1; j > 0; j--){
                if(a[j] < a[j-1]){
                    tmp = a[j];
                    a[j] = a[j-1];
                    a[j-1] = tmp;
                }
            }
        }
        return a;
    }

    public static int[] insertion1(int[] a){
        for(int i = 1; i < a.length; i++){
            int next = a[i];
            int j;
            for(j = i-1; next < a[j] && j>=0; j--){
                a[j+1] = a[j]; 
            }
            a[j+1] = next;
        }
        return a;
    }

    public static int[] insertion2(int[] a){
        for(int i = a.length - 2; i > 0; i--){
            int down = a[i];
            int j;
            for(j = a.length - 1; down > a[j] && j < a.length; j++){
                a[j-1] = a[j];
            }
            a[j-1] = down;
            output(a);
        }
        return a;
    }
    
    public static void main(String[] args) {
        int[] a = {2, 8, 3, 10, 5};
        output(a);
        //output(selection1(a));
        //output(selection2(a));
        //output(bubble1(a));
        //output(bubble2(a));
        //output(insertion1(a));
        output(insertion2(a));
    }
}
