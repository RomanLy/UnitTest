package task_5;

public class Assembler {

    private String[][] numbers = {
            {"", "один", "два", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять"},
            {"", "десять", "двадцать", "тридцать", "сорок", "пятьдесят", "шестьдесят",
                    "семьдесят", "восемьдесят", "девяносто"},
            {"", "сто", "двести", "триста", "четыреста", "пятьсот", "шестьсот",
                    "семьсот", "восемьсот", "девятьсот"}
    };
    private String[] teens = {"", "одиннадцать", "двенадцать", "тринадцать", "четырнадцать",
            "пятнадцать", "шестнадцать", "семнадцать", "восемнадцать", "девятнадцать"};

    private String[][] difference = {
            {"одна", "две"},
            {"тысяча", "тысячи", "тысяч"},
            {"миллион", "миллиона", "миллионов"}
    };


    protected String mergeWords(int[][] array) {
        String resultString = "";
        for (int line = array.length - 1; line >= 0; line--) {

            for (int column = 2; column >= 0; column--) {

                if (array[line][2] > 0 && array[line][1] == 1 && array[line][0] > 0) {
                    resultString += numbers[column][array[line][column]] + " " + teens[array[line][0]] + " ";
                    break;
                }
                if (array[line][1] == 1 && array[line][0] > 0) {
                    resultString += teens[array[line][0]] + " ";
                    break;
                }
                resultString += numbers[column][array[line][column]] + " ";
            }

            switch (line) {
                case 2:
                    if (array[line][0] == 1) {
                        resultString += difference[line][0] + " ";
                        break;
                    }
                    if (array[line][0] > 1 && array[line][0] < 5) {
                        if (array[line][1] == 1) {
                            resultString += difference[line][2] + " ";
                            break;
                        }
                        resultString += difference[line][1] + " ";
                        break;
                    }
                    resultString += difference[line][2] + " ";
                    break;

                case 1:
                    if (array[line][0] == 1) {
                        resultString += difference[line][0] + " ";
                        break;
                    }
                    if (array[line][0] > 1 && array[line][0] < 5) {
                        if (array[line][1] == 1) {
                            resultString += difference[line][2] + " ";
                            break;
                        }
                        resultString += difference[line][1] + " ";
                        break;
                    }
                    resultString += difference[line][2] + " ";
                    break;
            }
        }
//        System.out.println("mergeWords = " + resultString);
        return resultString;
    }

}
