public class Variable {	
    public static void main(String[] args) {
        int ramValue = 16;
        byte cpuCores = 8;
        short cpuGeneration = 8;
        long videoCardModel = 930;
        float cpuFrequency = 1.8f;
        double randomNumber = 254.5858d;
        char hddLetter = 'D';
        boolean logicTrue = true;

        System.out.println("RAM " + ramValue + " GB");
        System.out.println("Processor " + cpuCores + " cores");
        System.out.println("Processor intel " + cpuGeneration + " th generation");
        System.out.println("Video card model = " + videoCardModel + " MX");
        System.out.println("Processor frequancy " + cpuFrequency + " GHz");
        System.out.println("Random double number " + randomNumber);
        System.out.println("Java installed on " + hddLetter + " local drive");
        System.out.println("The Moscow is a capital of Russia, and it is " + logicTrue);
    }
}