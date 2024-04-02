package lab4.exercitii;



public class ex2 {
    public static void main(String[] args){
        String sir = "This is 1 string";

        sir = sir.toLowerCase();

        int vowels = 0, cons = 0, digits = 0, spaces = 0;

        for (int i = 0; i < sir.length(); i++)
        {
            char ch = sir.charAt(i);
            if (Character.isLetter(ch))
            {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                {
                    vowels ++;
                }
                else cons++;
            }
            else if(Character.isDigit(ch))
                digits++;
            else if(ch == ' ')
                spaces++;
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + cons);
        System.out.println("Digits: " + digits);
        System.out.println("Spaces: " + spaces);
    }
}
