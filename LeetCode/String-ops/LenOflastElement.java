public class LenOflastElement {
    public int lengthOfLastWord(String s) {
        if(s.length() == 0)
            return 0;
        s.trim();
        String[] str = s.split(" ");
        
        return str[str.length - 1].length();
    
        // String str = s.trim();
        // int count = 0;
        // for(int i=str.length()-1;i>=0;i--){
        //     if(str.charAt(i) != ' '){
        //         count++;
        //     }else{
        //         break;
        //     }
        // } 
        // return count;
    }


    public static void main(String[] args) {
        String s = "Hello World";
        LenOflastElement obj = new LenOflastElement();
        System.out.println(obj.lengthOfLastWord(s));
    }
}
