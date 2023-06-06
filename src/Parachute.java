public class Parachute {
    public static void main(String[] args) {
        try {
            pull();
        } catch (DeploymentException deploymentException) {
            System.out.println("Uh oh...");
        }
    }

    static void pull() throws DeploymentException { // describes the possibility of there being an exception
        if (Math.random() < 0.001) {
            throw new DeploymentException(); // creates exception, stopping execution of the code
        }
    }
}

class DeploymentException extends Exception {}