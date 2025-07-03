package conditionsAndLoops;

public class SwitchCaseInJava {

    //    Instead of writing many if..else statements, you can use the switch statement.
    public static void main(String[] args) {

        System.out.println(whatDayIsToday(1));
        System.out.println(whatDayIsToday(4));
        System.out.println(whatDayIsToday(7));
        System.out.println(whatDayIsToday(10));

        System.out.println("----------------------------------------------------");

        System.out.println(giveDayPerNumber(1));
        System.out.println(giveDayPerNumber(4));
        System.out.println(giveDayPerNumber(7));
        System.out.println(giveDayPerNumber(10));

//        break statement is important in switch
//        If you do not add a break statement in a switch case, execution will "fall through" to
//        the next case, executing its code as well, until a break or the end of the switch is reached.
//        This can lead to unintended behavior if not used deliberately.

    }

    // a function for switch case
    public static String whatDayIsToday(int number) {

        // as its function break is not required
        // if we not add break all following cases will also trigger
        switch (number) {
            case 1:
                return "today is monday";
            case 2:
                return "today is tuesday";
            case 3:
                return "today is wednesday";
            case 4:
                return "today is thursday";
            case 5:
                return "today is friday";
            case 6:
                return "today is saturday";
            case 7:
                return "today is sunday";
            default:
                return "invalid day";
        }
    }

    //another approach to use switch case
    public static String giveDayPerNumber(int number){
        return switch (number) {
            case 1 -> "today is monday";
            case 2 -> "today is tuesday";
            case 3 -> "today is wednesday";
            case 4 -> "today is thursday";
            case 5 -> "today is friday";
            case 6 -> "today is saturday";
            case 7 -> "today is sunday";
            default -> "invalid day";
        };
    }

}
