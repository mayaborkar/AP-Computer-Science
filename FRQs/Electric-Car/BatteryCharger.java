public class BatteryCharger
{
    private int[] rateTable = new int[24];
    
    public BatteryCharger()
    {
        rateTable[0] = 50;
        rateTable[1] = 60;
        rateTable[2] = 160;
        rateTable[3] = 60;
        rateTable[4] = 80;
        rateTable[5] = 100;
        rateTable[6] = 100;
        rateTable[7] = 120;
        rateTable[8] = 150;
        rateTable[9] = 150;
        rateTable[10] = 150;
        rateTable[11] = 200;
        rateTable[12] = 40;
        rateTable[13] = 240;
        rateTable[14] = 220;
        rateTable[15] = 220;
        rateTable[16] = 200;
        rateTable[17] = 200;
        rateTable[18] = 180;
        rateTable[19] = 180;
        rateTable[20] = 140;
        rateTable[21] = 100;
        rateTable[22] = 80;
        rateTable[23] = 60;
        
        System.out.println(getChargingCost(12, 1));
        System.out.println(getChargingCost(0, 2));
        System.out.println(getChargingCost(22, 7));
        System.out.println(getChargingCost(22, 30));
        
        
        System.out.println(getChargeStartTime(1));
        System.out.println(getChargeStartTime(2));
        System.out.println(getChargeStartTime(7));
        System.out.println(getChargeStartTime(30));
    }
    
    private int getChargingCost(int startHour, int chargeTime)
    {
        int cost = 0;
        for (int i = startHour; i < startHour + chargeTime; i++){
            cost += rateTable[i % 24];
        }
        
        return cost;
    }
    
    public int getChargeStartTime(int chargeTime){
        int lowestCost = getChargingCost(0, chargeTime);
        int lowestStartHour = 0;
        for (int i = 0; i < rateTable.length; i++){
             if (getChargingCost(i, chargeTime) < lowestCost){
                 lowestCost = getChargingCost(i, chargeTime);
                 lowestStartHour = i;
             }
        }
        return lowestStartHour;
    }
}