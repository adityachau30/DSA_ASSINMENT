import java.util.ArrayList;

public class Qus_5_B {
        public int numBatteryReplacements(int[][] serviceCenters, int targetMiles, int startChargeCapacity) {
            int count = 0;
            int currentMiles = startChargeCapacity;
            ArrayList<Integer> distances = new ArrayList<>();
            ArrayList<Integer> capacities = new ArrayList<>();

            for (int[] serviceCenter : serviceCenters) {
                distances.add(serviceCenter[0]);
                capacities.add(serviceCenter[1]);
            }
            for (int i = 0; i < distances.size(); i++) {
                if (distances.get(i) > currentMiles) {
                    currentMiles = capacities.get(i - 1);
                    count++;
                }
            }
            if (currentMiles < targetMiles) {
                count++;
            }

            return count;
        }


        public static void main(String[] args) {
            int [][] serviceCenterList={{10,60},{20,30},{30,30},{60,40}};
            Qus_5_B question1=new Qus_5_B();
            int finalAnswer=question1.numBatteryReplacements(serviceCenterList,100,10);
            System.out.println("the car's batteries need to be replaced: "+finalAnswer +"times.");

        }
    }

