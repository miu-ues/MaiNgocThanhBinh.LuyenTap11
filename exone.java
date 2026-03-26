package Bai1;
public class exone {
    

    public static <E> void printArray(E[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
    
    public static void main(String[] args) {
        Integer[] integerArray = {10, 20, 30, 40, 50};
        
        String[] stringArray = {"Hello", "World", "Java", "Generic"};
        
        System.out.println("Các phần tử trong mảng Integer:");
        printArray(integerArray);
        
        System.out.println("\nCác phần tử trong mảng String:");
        printArray(stringArray);
   

    }
}