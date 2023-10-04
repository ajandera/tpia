package examples.cv1;

/*
   Zostavte program Example1.java, ktorý bitovo posunie dve
   zvolené celé čísla o dve miesta doprava i doľava.

   Bitový posun dopravo toľkokrát posunie bity vstupného celého čísla do prava
   koľko je hodnota druhého vstupu. výstupné bity sa stratí a vstupné bity budú 0.
   Bitový posun doprava môžeme použiť pre delenie s mocninou 2.
 */
public class Example1 {
    public static void main(String[] args) {
        int a = 8; //variable to bit move
        int b = 6; // variable to bit move
        int resultALeft; //variable for result
        int resultBLeft; //variable for result
        int resultARight; //variable for result
        int resultBRight; //variable for result

        resultALeft = a << 2;
        resultBLeft = b << 2;
        resultARight = a >> 2;
        resultBRight = b >> 2;

        System.out.println("Result a move left is "+resultALeft);
        System.out.println("Result b move left is "+resultBLeft);
        System.out.println("Result a move right is "+resultARight);
        System.out.println("Result b move right is "+resultBRight);
    }
}

