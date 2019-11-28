public class ConditionalStatement {
    public static void main(String[] args) {
        int age = 30;
        String sex = "male";
        double height = 1.82;
        char firstNameLetter = 'K';

        if (age > 20) {
            System.out.println("Your are older than 20");
        }
        if (sex == "male") {
            System.out.println("Your are a man");
        }
        if (sex != "male") {
            System.out.println("Your are not a man");
        }
        if (height > 1.80) {
            System.out.println("Your are above 1.80");
        }
        if (height < 1.80) {
            System.out.println("Your are lower 1.80");
        }
        else {
            System.out.println("First part of home work is done");
        }

        if (firstNameLetter == 'M'){
            System.out.println("Your name begins with M");
        } else if (firstNameLetter == 'I'){
            System.out.println("Your name begins with I");
        }
        else {
            System.out.println("The end of homework");
        }

    }
}