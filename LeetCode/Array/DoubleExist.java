public class DoubleExist {
    public boolean checkIfExist(int[] arr) {
        // for each element in the array, check if there is another element that is twice the value
        // if there is, return true
        // if there isn't, return false

        // this loop iterates through each element in the array
        for (int i = 0; i < arr.length; i++) {
            // curr is the current element
            int curr = arr[i];
            // this loop checks if there is another element that is twice the value of the current element
            for (int j = 0; j < arr.length; j++) {
                // if the current element is twice the value of another element, return true
                if (i != j && curr == 2 * arr[j]) {
                    return true;
                }
            }
        }
        return false;           
    }
    public static void main(String[] args) {
        DoubleExist de = new DoubleExist();
        int[] arr = {10,2,5,3};
        System.out.println(de.checkIfExist(arr));
    }
}
