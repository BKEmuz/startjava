public class ConditionalStatement {

    public static void main(String[] args) {
        int age = 30;
        if (age > 20) {
            System.out.println("Your are older than 20");
        }

        boolean isMale = true;
        if (isMale) {
            System.out.println("Your are a man");
        }

        if (!isMale) {
            System.out.println("Your are a not man");
        }

        double height = 1.82;
        if (height < 1.80) {
            System.out.println("Your are lower 1.80");
        } else {
            System.out.println("First part of home work is done");
        }

        char firstNameLetter = 'K';
        if (firstNameLetter == 'M') {
            System.out.println("Your name begins with M");
        } else if (firstNameLetter == 'I') {
            System.out.println("Your name begins with I");
        } else {
            System.out.println("The end of homework");
        }
    }
}