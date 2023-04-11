public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

    }

    public static String productFormatter(String productName,String date){
        // productName trimmed, spaces=_, date at the end, uppercase
        return productName.concat(date).trim().replace(" ","_").toUpperCase();
    }
}