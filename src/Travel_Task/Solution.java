package Travel_Task;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<TravelAgency> travelAgencies = new ArrayList<>();
        System.out.println("Enter the number you want..");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the regNo..");
            int regNo = sc.nextInt();
            System.out.println("Enter the agencyName..");
            String agencyName = sc.next();
            System.out.println("Enter the packageType..");
            String packageType = sc.next();
            System.out.println("Enter the price..");
            int price = sc.nextInt();
            System.out.println("Enter the flightFacility");
            boolean flightFacility = sc.nextBoolean();
            travelAgencies.add(new TravelAgency(regNo, agencyName, packageType, price, flightFacility));
        }
        int regNo1 = sc.nextInt();
        String packageType1 = sc.next();
        System.out.println(findAgencyWithHighestPackagePrice(travelAgencies));
        System.out.println(agencyDetailsForGivenldAndType(travelAgencies, regNo1, packageType1));
    }
    public static int findAgencyWithHighestPackagePrice(List<TravelAgency> travelAgencies) {
        int max = 0;
        if (travelAgencies != null) {
            List<Integer>   list = new ArrayList<>();
            for (TravelAgency travelAgency : travelAgencies) {
                list.add(travelAgency.getPrice());
            }
            max = Collections.max(list);
        }
        return max;
    }
    public static String agencyDetailsForGivenldAndType(List<TravelAgency> travelAgencies, int regNo, String packageTpe) {
        String travelAgency1 = null;
        for (TravelAgency travelAgency : travelAgencies) {
            if (travelAgency.flightFacility == true && travelAgency.getPackageType().equals(packageTpe) && travelAgency.getRegNo() == regNo) {
                travelAgency1 = travelAgency.getAgencyName() + ":" + travelAgency.getPrice();
            }
        }
        if (travelAgency1 == null)
            return null;
        else
            return travelAgency1;
    }
}










