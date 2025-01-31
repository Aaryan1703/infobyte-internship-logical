public class ReverceEachWord {
    public static void main(String[] args) {
        String str="Java is good programing language";
        String[] words=str.split(" ");
        String rstr=" ";
        for (int i = 0; i <words.length ; i++) {
            String word=words[i];
            String nstr=" ";
            char ch;
            for (int j = 0; j <word.length() ; j++) {
                ch=word.charAt(j);
                nstr=ch+nstr;
            }
            rstr=rstr+nstr;
        }
        System.out.println(rstr);
    }
}
