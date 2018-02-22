package avatar;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder result = new StringBuilder();
        StringBuilder wars = new StringBuilder();
        int warCount = 1;


        while (true) {
            String[] line = bf.readLine().split(" ");
            if (line[0].equals("Quit")) {
                break;
            }

            switch (line[0]) {
                case "Bender":
                    Factory.createBender(line[1],line[2], Integer.parseInt(line[3]), Double.parseDouble(line[4]));
                    break;
                case "Monument":
                    Factory.createMonument(line[1], line[2], Integer.parseInt(line[3]));
                    break;
                case "Status":
                    result.append(Controller.getStatus(line[1]));
                    break;
                case "War":
                    wars.append(String.format("War %d issued by %s%n", warCount++, line[1]));
                    Controller.beginWar();
                default:
                    break;
            }


        }
        System.out.print(result);
        //System.out.println(result.toString().trim());
        System.out.println(wars);
    }
}
