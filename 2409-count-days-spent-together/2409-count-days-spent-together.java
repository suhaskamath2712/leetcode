class Solution
{
    private short day (String dt)
    {
        short day = 0;

        byte month = (byte) ((dt.charAt(0)-'0')*10 + dt.charAt(1) -'0');

        switch(month)
        {
            case 2: day = 31;   break;
            case 3: day = 59;   break;
            case 4: day = 90;   break;
            case 5: day = 120;   break;
            case 6: day = 151;   break;
            case 7: day = 181;   break;
            case 8: day = 212;   break;
            case 9: day = 243;   break;
            case 10: day = 273;   break;
            case 11: day = 304;   break;
            case 12: day = 334;   break;
        }

        day += (dt.charAt(3)-'0')*10 + dt.charAt(4)-'0';

        return day;
        
    }

    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob)
    {
        return Math.max(0, Math.min(day(leaveAlice), day(leaveBob)) - Math.max(day(arriveAlice), day(arriveBob)) + 1);
    }
}