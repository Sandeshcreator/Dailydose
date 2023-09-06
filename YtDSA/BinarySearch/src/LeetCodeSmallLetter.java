public class LeetCodeSmallLetter {
    public static void main(String[] args) {
      String []  letters = {"c","f","j"};
        String target = "a";
        //System.out.println(nextGreatestLetter(letters,target));

    }

    public static char nextGreatestLetter(char[] letters, char target) {

        int start=0;
        int end= letters.length-1;

        while (start<=end){

            int mid = (start+end)/2;
            if (letters[mid]>target){
                end=mid-1;
            } else if (letters[mid]<target) {
                start=mid+1;
                  }else {
                return (char) mid;
            }

        }
        // If 'start' is out of bounds, then wrap around to the beginning
        if (start >= letters.length) {
            return letters[0];
        }

        return letters[start];

    }
}
