public class FootballMatchReports {    
    public static String onField(int shirtNum) {
        String position = "";

        switch(shirtNum) {
            case 1:
                position = "goalie";
                break;
            case 2:
                position = "left back";
                break;
            case 3:
                position = "center back";
                break;
            case 4:
                position = "center back";
                break;
            case 5:
                position = "right back";
                break;
            case 6:
                position = "midfielder";
                break;
            case 7:
                position = "midfielder";
                break;
            case 8:
                position = "midfielder";
                break;
            case 9:
                position = "left wing";
                break;
            case 10:
                position = "striker";
                break;
            case 11:
                position = "right wing";
                break;
            default:
                throw new IllegalArgumentException();
        }

        return position;
    }
}
