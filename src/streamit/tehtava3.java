package streamit;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class tehtava3 {
    public static void main(String[] args) {
        List<String> sanat = new ArrayList<>();
        sanat.add("kissa");
        sanat.add("koira");
        sanat.add("kala");

       //Streami, joka kutsuu metodia caesar:
       List<String> kryptatut = sanat.stream()
                .map(a -> caesar(a))
                .collect(Collectors.toList());

        //tulostetaan kryptatut:
        kryptatut.stream()
                .forEach(System.out::println);
        }

        public static String caesar(String sana) {
            String plaintext = sana;
            String ciphertext = "";
            char alphabet;
            for(int i=0; i < plaintext.length();i++)
            {
                // Shift one character at a time
                alphabet = plaintext.charAt(i);

                // if alphabet lies between a and z
                if(alphabet >= 'a' && alphabet <= 'z')
                {
                    // shift alphabet
                    alphabet = (char) (alphabet + 3);
                    // if shift alphabet greater than 'z'
                    if(alphabet > 'z') {
                        // reshift to starting position
                        alphabet = (char) (alphabet+'a'-'z'-1);
                    }
                    ciphertext = ciphertext + alphabet;
                }

                // if alphabet lies between 'A'and 'Z'
                else if(alphabet >= 'A' && alphabet <= 'Z') {
                    // shift alphabet
                    alphabet = (char) (alphabet + 3);

                    // if shift alphabet greater than 'Z'
                    if(alphabet > 'Z') {
                        //reshift to starting position
                        alphabet = (char) (alphabet+'A'-'Z'-1);
                    }
                    ciphertext = ciphertext + alphabet;
                }
                else {
                    ciphertext = ciphertext + alphabet;
                }



            }

            return ciphertext;

        }
    }




