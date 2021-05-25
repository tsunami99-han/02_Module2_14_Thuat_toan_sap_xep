public class InsertionSort {
    public static void insertionSort(int[] arr) {
        int min;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Insertion"+i);
            min=i;
            for (int j=i+1;j<arr.length;j++){
                if (arr[min]>=arr[j]){
                    min=j;
                }
            }
            System.out.println("Nếu min khác i đổi vị trí 2 phân tử : min="+min + " i="+i  );
            if (min!=i){
                int temp=arr[i];
                arr[i]=arr[min];
                arr[min]=temp;
                System.out.println("Đổi phần tử tại vị trí min và i!");
            }
        }
    }

    public static void main(String[] args) {
        int[] num={1,9,4,7,1,56,7,8,84,1,99,4545,1214,5,7,8,41,4,6,9,7};
        insertionSort(num);
        for (int i:num){
            System.out.print(i + " ");
        }
    }
}
