class Solution
{
    private List<String> cartProd(List<String> l, List<Character> charList)
    {
        List<String> ans = new ArrayList<>();

        for (String s : l)
            for (char c : charList)
                ans.add(s+c);

        return ans;
    }

    public List<String> letterCombinations(String digits) 
    {
        HashMap<Integer,List<Character>> map = new HashMap<>();
        List<String> list = new ArrayList<>();

        map.put(2,new ArrayList<>(List.of('a','b','c')));
        map.put(3,new ArrayList<>(List.of('d','e','f')));
        map.put(4,new ArrayList<>(List.of('g','h','i')));
        map.put(5,new ArrayList<>(List.of('j','k','l')));
        map.put(6,new ArrayList<>(List.of('m','n','o')));
        map.put(7,new ArrayList<>(List.of('p','q','r','s')));
        map.put(8,new ArrayList<>(List.of('t','u','v')));
        map.put(9,new ArrayList<>(List.of('w','x','y','z')));

        for (char c : map.get(digits.charAt(0)-'0'))
            list.add(Character.toString(c));

        for (int i = 1; i < digits.length(); i++)
            list = cartProd(list,map.get(digits.charAt(i) - '0'));

        return list;
    }
}