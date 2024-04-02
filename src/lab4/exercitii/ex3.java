package lab4.exercitii;

public class ex3 {
    public static void main(String[] args){
        String sir = "abracadabra";
        sir = sir.toLowerCase();

        int[] viz = new int[26];

        for (int i = 0; i < sir.length(); i++) {
            char ch = sir.charAt(i);
            int index = ch - 'a';
            viz[index]++;
        }
        for(int i = 0; i < 26; i++) {

            if (viz[i] > 0){
                char lit = (char) (i + 'a');
                System.out.println(lit + ": " + viz[i]);
            }

        }
    }
}
