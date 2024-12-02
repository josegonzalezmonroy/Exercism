class Fighter 
{

    boolean isVulnerable() 
    {
        return true;
    }

    int getDamagePoints(Fighter fighter) 
    {
        return 1;
    }
}

class Warrior extends Fighter
{
    public String toString()
    {
        return "Fighter is a Warrior";
    }

    @Override
    boolean isVulnerable()
    {
        return false;
    }

    @Override
    int getDamagePoints(Fighter fighter) 
    {
        if (fighter.isVulnerable())
            return 10;
        
        return 6;
    }
}
class Wizard extends Fighter
{
    private boolean isVulnerable = true;
    
    public String toString()
    {
        return "Fighter is a Wizard";
    }

    @Override
    public boolean isVulnerable()
    {
        return isVulnerable;
    }

    public void prepareSpell()
    {
        isVulnerable = false;
    }

    @Override
    int getDamagePoints(Fighter fighter) 
    {
        if (!isVulnerable)
            return 12;
        
        return 3;
    }
}
