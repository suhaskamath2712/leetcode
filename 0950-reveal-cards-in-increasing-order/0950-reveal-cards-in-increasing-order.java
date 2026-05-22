class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        Arrays.sort(deck);
        Deque <Integer> st=new ArrayDeque<>();

        st.addFirst(deck[deck.length-1]);

        for(int i=deck.length-2;i>=0;i--)
        {
            st.addFirst(st.removeLast());
            st.addFirst(deck[i]);
        }

        for(int i=0;i<deck.length;i++)
            deck[i]=st.removeFirst();
            
        return deck;
    }
}