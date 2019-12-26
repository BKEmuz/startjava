public class GuessNumber {
    private String p1Name;
    private int p1Number;
    private String p2Name;
    private int p2Number;

    public GuessNumber (String p1Name, int p1Number, String p2Name, int p2Number) {
        this.p1Name = p1Name;
        this.p1Number = p1Number;
        this.p2Name = p2Name;
        this.p1Number = p2Number;
    }

    public void start() {
        boolean p1isright = false;
        boolean p2isright = false;
        int compNumber = (int) (Math.random() * 10);

        while (true) {
            System.out.println("Число которое загадал компьютер " + compNumber);
            System.out.println("Игрок " + p1Name + " думает, что это " + p1Number);
            System.out.println("Игрок " + p2Name + " думает, что это " + p2Number);
            if (p1Number == compNumber) {
                p1isright = true;
            }

            if (p2Number == compNumber) {
                p2isright = true;
            }

            if (p1isright || p2isright) {
                if (p1isright){
                    System.out.println("Игрок " + p1Name + " победил!");
                } else if (p2isright) {
                    System.out.println("Игрок " + p2Name + " победил!");
                }

                break;

            } else {
                System.out.println("Попробуйте еще раз, победителя нет");
                break;
            }
        }
    }
}


