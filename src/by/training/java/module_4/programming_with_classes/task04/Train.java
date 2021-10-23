package by.training.java.module_4.programming_with_classes.task04;

public class Train {

    private String destinationName;
    private int trainNumber;
    private String departureTime;

    public Train(String firstParameter, int secondParameter, String thirdParameter) {
        destinationName = firstParameter;
        trainNumber = secondParameter;
        departureTime = thirdParameter;
    }

    public static void sortByNumbers(Train trains[]) {
        Train currentTrain;
        boolean cycle = false;
        while (!cycle) {
            cycle = true;
            for (int i = 0; i < trains.length - 1; i++) {
                if (trains[i].trainNumber > trains[i + 1].trainNumber) {
                    currentTrain = trains[i];
                    trains[i] = trains[i + 1];
                    trains[i + 1] = currentTrain;
                    cycle = false;
                }
            }
        }
        for (int i = 0; i < trains.length; i++) {
            System.out.println("Поезд № " + trains[i].trainNumber + ". Пункт назначения: " + trains[i].destinationName
                    + ". Время отправления: " + trains[i].departureTime);
        }
    }

    public static boolean informationByNumbers(Train trains[], String number) {
        boolean possibleNumberTrain = false;
        for (int i = 0; i < trains.length; i++) {
            if (number.matches("\\d+") && Integer.parseInt(number) == trains[i].trainNumber) { //если введенная строка соответствует только числу и равна номеру поезда
                System.out.println("Поезд № " + trains[i].trainNumber + ". Пункт назначения: "
                        + trains[i].destinationName + ". Время отправления: " + trains[i].departureTime);
                possibleNumberTrain = true;                   //при вводе нужного номера выход из данного меню
            }
        }
        return possibleNumberTrain;
    }

    public static void sortByDestination(Train trains[]) {
        Train currentTrain;
        boolean cycle = false;
        while (!cycle) {
            cycle = true;
            for (int i = 0; i < trains.length - 1; i++) {
                if (trains[i].destinationName.compareTo(trains[i + 1].destinationName) == 0) {
                    if (trains[i].departureTime.compareTo(trains[i + 1].departureTime) > 0) {
                        currentTrain = trains[i];
                        trains[i] = trains[i + 1];
                        trains[i + 1] = currentTrain;
                        cycle = false;
                    }
                } else if (trains[i].destinationName.compareTo(trains[i + 1].destinationName) > 0) {
                    currentTrain = trains[i];
                    trains[i] = trains[i + 1];
                    trains[i + 1] = currentTrain;
                    cycle = false;
                }
            }
        }
        for (int i = 0; i < trains.length; i++) {
            System.out.println("Поезд № " + trains[i].trainNumber + ". Пункт назначения: " + trains[i].destinationName
                    + ". Время отправления: " + trains[i].departureTime);
        }
    }

    public String getDestinationName() {
        return destinationName;
    }

    public int getTrainNumber() {
        return trainNumber;
    }

    public String getDepartureTime() {
        return departureTime;
    }
}
