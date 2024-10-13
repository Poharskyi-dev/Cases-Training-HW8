import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;


public class Main {
    static String answerText;

    public static void main(String[] args) throws IOException {

        // idk what is it :D

        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));

        // Week days array
        String[] allWeekDays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        // Current true week day reading
        Calendar calendar = Calendar.getInstance();
        final int currentWeekDayInt = calendar.get(Calendar.DAY_OF_WEEK);

        //Current week day to text
        String currentWeekDayText;
        switch (currentWeekDayInt) {
            case 1 -> currentWeekDayText = allWeekDays[0];
            case 2 -> currentWeekDayText = allWeekDays[1];
            case 3 -> currentWeekDayText = allWeekDays[2];
            case 4 -> currentWeekDayText = allWeekDays[3];
            case 5 -> currentWeekDayText = allWeekDays[4];
            case 6 -> currentWeekDayText = allWeekDays[5];
            case 7 -> currentWeekDayText = allWeekDays[6];
            default -> currentWeekDayText = "Impossible!";
        }

        // Question
        System.out.println("Please write current day of the week" + "\n" + "("
                + allWeekDays[1] + ", " + allWeekDays[2] + ", "
                + allWeekDays[3] + ", " + allWeekDays[4] + ", "
                + allWeekDays[5] + ", " + allWeekDays[6] + ", "
                + allWeekDays[0] + "):");

        String inputWeekDay = reader.readLine();

        // Is it right day of the week today wrote
        int equalDayCheck = inputWeekDay.compareTo(currentWeekDayText);

        // Is it day of the week check
        boolean equalDayArrayCheck = false;
        for (int i = 0; i < allWeekDays.length; i++) {
            if (allWeekDays[i].equals(inputWeekDay)) {
                equalDayArrayCheck = true;
                break;
            }
        }

        // Answer
        if (equalDayCheck == 0) {
            answerText = "You're right, today is " + inputWeekDay;
        } else {
                if (equalDayArrayCheck) {
                    answerText = "No, today is " + currentWeekDayText;
                } else {
                    answerText = inputWeekDay + " is no such day of the week";
                }

            }

        System.out.println(answerText);

        }
    }











