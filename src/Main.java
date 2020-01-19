public class Main {

    public static void main(String[] args) {
        System.out.println("================================");

        String s1 = "java";
        int x = 111;


        int s1Lenght = s1.length();
        if(s1Lenght < 15){
            int remainingSpaces = (15 - s1Lenght) + 3;
            String s = String.format("%1$"+remainingSpaces+"s", "");
//            System.out.format("[%13s]%n", ""); //example of fixed number of spaces
            if(x < 10){
                System.out.format(s1 + "%" +remainingSpaces +"s%n", "" + "00" + x);
            }
            else if(x < 100){
                System.out.format(s1 + "%" +remainingSpaces +"s%n", "" + "0" + x);
            }
            else{
                System.out.format(s1 + "%" +remainingSpaces +"s%n", "" + x);
            }
        }



        System.out.println("================================");

    }
}
