package masterclass.oop.composition;

public class ComputerFactory {
    public static void main(String[] args) {
        ComputerCase theCase = new ComputerCase("2308", "Dell", "240");
        Monitor theMonitor = new Monitor(
                "PB287Q 28\" 4K/ UHD", "Asus", 28, "3840x2160"
        );
        Motherboard theMotherboard = new Motherboard(
                "BJ-200", "Asus", 4, 6, "v2.44"
        );

        PersonalComputer thePC = new PersonalComputer("2308", "Dell", theCase, theMonitor, theMotherboard);

//        thePC.getComputerCase().pressPowerButton();
//        thePC.getMotherboard().loadProgram("Windows");
//        thePC.getMonitor().drawPixelAt(10, 10, "red");

        thePC.powerUp();
    }
}
