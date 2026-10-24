class Solution
{
    private static int[] daysBase = new int[] {0,31,59,90,120,151,181,212,243,273,304,334};
    private int day (String dt)
    {
        return daysBase[(dt.charAt(0)-'0')*10 + dt.charAt(1) -'0'-1] + (dt.charAt(3)-'0')*10 + dt.charAt(4)-'0';        
    }

    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob)
    {
        return Math.max(0, Math.min(day(leaveAlice), day(leaveBob)) - Math.max(day(arriveAlice), day(arriveBob)) + 1);
    }
}