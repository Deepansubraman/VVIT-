public class secondLargest{
    public static void main(String[] args) {
        int[] arr = {10, 25, 8, 40, 15};

        int largest = arr[0];
        int secondLargest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                int temp = largest;
                largest = arr[i];
                secondLargest = temp;
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }

        System.out.println("Largest = " + largest);
        System.out.println("Second Largest = " + secondLargest);
    }
}