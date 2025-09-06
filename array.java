public class array {
    
    public static void main(String[] args)
     {
        String[] fruits = {"apple", "banana", "cherry"};
        System.out.println(fruits[1]);
        for (int i=0; i<fruits.length; i++) {
            System.out.println(fruits[i]);
        } 
        // Corrected enhanced for loop syntax
        for (String fruit : fruits) {
            System.out.println(fruit);
       
    }
    // Corrected array declaration syntax multidimensional array
    int[][] numbers = {
        {1, 2, 3},
        {4, 5, 6},
      
    };
    System.out.println(numbers[0][1]);

    for(int[] row : numbers) {
        for(int num : row) {
            System.out.println(num);
        }
    }
}
}
