public class FootballMatchReports {    
    public static String onField(int shirtNum) {
        String description = "";
        
        switch (shirtNum) 
        {
            case 1:
                description = "goalie";
                break;
            case 2: 
                description = "left back";
                break;
            case 3:
            case 4:
                description = "center back";
                break;
            case 5:
                description = "right back";
                break;
            case 6:
            case 7:
            case 8:
                description = "midfielder";
                break;
            case 9:
                description = "left wing";
                break;
            case 10:
                description = "striker";
                break;
            case 11:
                description = "right wing";
                break;
            default:
                throw new IllegalArgumentException();
        }
        return description;
    }
}
