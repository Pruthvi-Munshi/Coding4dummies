package LeetCodeProblems;

public class Palindrome {
    public boolean isPalindrome(int x) {
        // needs to be a positive number
        // single digit can be considered a palindrome (x = 1 == true)
        //
        // first read the number
        // needs to make sure user can enter very big number and it still works
        // if x = 121
        // read the first n1 --> n2 --> if n3 is same as n1 then == true
        //
        // You should use the charAt() method, at index 0, to select the first character of the
        // string. NOTE: charAt e tis preferablhan using [ ] (bracket notation) as str. charAt(0
        // returns an empty string ( '' ) for str = '' instead of undefined in case of ''[0] .
        //
        //
        // converts int x to string y
        boolean retVal = false;
        String y = "";

        if(x >= 0){
            y = Integer.toString(x);
        }
        else{
            return false;
        }



        // int x = 121 --> x = "121"
        // charAt(0) return "1", charAt(1) return "2", charAt(2) return "1"
        // create a for loop to go through the string



        // have an if statement saying if charAt(0) == "-" return false
        // i will check the first char of string --> z checks last char of string
        // if they are the same then i checks the second char of string and z checks second last char of string
        // continues until the end
        // should end when i start to check stuff z did already but we can fix it in the end
//        for((int i=0; i < y.length(); i++) && (int z = y.length() - 1; z >= 0; --z)){
//                if(y.charAt(i) != y.charAt(z)){
//                    return false;
//                }
//                else{
//                    i++;
//                    // if string is 122343221
//                    // since i = 1 and z = 1
//                    //
//                }
//        }


        for (int i = 0, z = y.length() - 1; i < y.length() && z >= 0; i++, z--){
            if(y.charAt(i) == y.charAt(z)){
                return retVal;
            }
            else{
                retVal = true;
            }
        }

        return retVal;
    }
}
