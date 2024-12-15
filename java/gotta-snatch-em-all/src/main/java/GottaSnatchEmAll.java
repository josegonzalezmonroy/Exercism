import java.util.List;
import java.util.Set;
import java.util.HashSet;

class GottaSnatchEmAll 
{
    static Set<String> newCollection(List<String> cards) 
    {
        Set<String> newCollection = new HashSet<>(cards);

        return newCollection;
    }

    static boolean addCard(String card, Set<String> collection) 
    {
        return collection.add(card);
    }

    static boolean canTrade(Set<String> myCollection, Set<String> theirCollection) 
    {
        boolean myUnique = false;
        if (myCollection.isEmpty() || theirCollection.isEmpty())
            return false;
                
        for (String card : myCollection) 
            if (!theirCollection.contains(card))
            {   
                myUnique = true;
                break;
            }
        
        boolean theirUnique = false;
        for (String card : theirCollection) 
            if (!myCollection.contains(card)) 
            {
                theirUnique = true;
                break; 
            }
        return myUnique && theirUnique;
    }

    static Set<String> commonCards(List<Set<String>> collections) 
    {
        if (collections.isEmpty()) 
            return Set.of();

        Set<String> common = new HashSet<>(collections.get(0));

        for (Set<String> collection : collections) 
            common.retainAll(collection);

        return common;
    }

    static Set<String> allCards(List<Set<String>> collections) 
    {
        Set<String> allCards = new HashSet<>();

        for (Set<String> collection : collections) 
            allCards.addAll(collection);

        return allCards;
    }
}
