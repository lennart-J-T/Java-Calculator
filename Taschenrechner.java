public class Taschenrechner {
    public static void main(String[] args) {
        Double ergebnis = Double.parseDouble(IO.readln("Bitte geben sie eine Zahl ein: "));

        while (true) {
            String op = IO.readln("Bitte geben sie eine Rechnenoperation (ADD, SUB, TIMES or DIVIDE) oder STOP ein: ");

            if (op.equals("STOP")) {
                break;
            }

            if (!op.equals("ADD") && !op.equals("SUB") && !op.equals("TIMES") && !op.equals("DIVIDE")) {
                IO.println("Unbekannte Operation. Bitte versuchen sie es erneut.");
                continue;
            }

            Double zahl = Double.parseDouble(IO.readln("Bitte geben sie eine zweite Zahl ein: "));
            
            switch (op) {
                case "ADD": 
                ergebnis += zahl;
                break;
                case "SUB":
                ergebnis -= zahl;
                break;
                case "TIMES":
                ergebnis = ergebnis*zahl;
                break;
                case "DIVIDE":
                ergebnis = ergebnis/zahl;
                break;
                default:
                IO.println("Ungültige Operation! Bitte versuchen sie es erneut.");
            }
            IO.println("Ihr Aktuelles Ergebnis: " + ergebnis);
        }
        IO.println("Ihr Endergebnis: " + ergebnis);
    } 
}