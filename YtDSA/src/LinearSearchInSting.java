public class LinearSearchInSting {
    public static void main(String[] args) {
        String name="sandy";
        char ch = 'e';
        boolean rs= SearchString(name,ch);
        System.out.println(rs);


    }



    public static boolean SearchString(String name , char ch) {

//        for ( String nme :name ) {
//            if (nme == ch) {
//                return true;
//
//            }
//            return false;
//
//        }
        for (int i = 0; i <name.length() ; i++) {
            if (ch == name.charAt(i)) {
                return true;

            }

        }
    return false;


    }

}
