package by.training.java.module_4.programming_with_classes.task10;

public class Airport {

    public static void getFlightList(Airline[] airline, String inputString, int parameter, String inputTime) {
        int outputCounter = 0;
        System.out.println("Полученный список рейсов: ");
        for (int i = 0; i < airline.length; i++) {
            if (inputString.compareToIgnoreCase(airline[i].getDestination()) == 0 && parameter == 1) {
                System.out.println(airline[i].getString());
                outputCounter += 1;
            }
            if (inputString.compareToIgnoreCase(airline[i].getDaysOfTheWeek()) == 0 && parameter == 2) {
                System.out.println(airline[i].getString());
                outputCounter += 1;
            }
            if (inputString.compareToIgnoreCase(airline[i].getDaysOfTheWeek()) == 0 && parameter == 3
                    && inputTime.compareToIgnoreCase(airline[i].getDepartureTime()) < 0) {
                System.out.println(airline[i].getString());
                outputCounter += 1;
            }
        }
        if (outputCounter == 0) {
            System.out.println("К введенному запросу нет подходящих рейсов");
        }
    }
}