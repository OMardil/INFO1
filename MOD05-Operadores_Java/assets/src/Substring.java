public class Substring{

    public static void main(String[] args){
        String s1 = "Monterrey, Nuevo León";
        String ciudad = s1.substring(0,9);
        String estado = s1.substring(11,21);
        
        System.out.println(ciudad); //Prints "Monterrey"
        System.out.println(estado); //Prints "Nuevo León"
        
        String s2 = "smiles".substring(1, 5);
        System.out.println(s2); //prints "mile"     

        s1 = "     :)   ";
        s2 = s1.trim();
        System.out.println(s2);

        s1 = "Bienvenido a la ciudad!";
        s2 = s1.replace('e','x');
        System.out.println(s2); //Prints "Bixnvxnido a la ciudad!"

        s2 = s2.replace('a','x');
        System.out.println(s2); //Prints "Bixnvxnido x lx ciudxd!"

        s1 = "abCD";
        s2 = "abCD";
        
        String lowerCase = s1.toLowerCase();
        String upperCase = s2.toUpperCase();

        System.out.println(lowerCase); //Prints "abcd"
        System.out.println(upperCase); //Prints "ABCD"
        
        int n;
        
        s1 = "12345";
        n = s1.length();
        System.out.println(n); //Prints 5
        
        s1 = "aabc12345";
        n = s1.length();
        System.out.println(n); //Prints 9
        
        s1 = "";
        n = s1.length();
        System.out.println(n); //Prints 0


        // TODO
        
        //FIXME


    }
}