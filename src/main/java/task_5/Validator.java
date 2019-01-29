package task_5;

public class Validator {
    private int number;

    public Validator(int number) {
        this.number = number;
    }

    public String branch() {
        Number num = new Number(number);
        String word;
        if (number == 0) {
            word = "ноль";
        } else if (number > 0) {
            word = substitute();
        } else {
            number = num.calculateModuleOfNumber();
            word = ("минус " + substitute());
        }
        return word;
    }

    public String substitute(){
        Spliter spliter = new Spliter(number);
        Assembler assembler = new Assembler();
        int[] groups = spliter.divideForGroups(spliter.calculateGroupsDischarge());
        return assembler.mergeWords(spliter.divideForNumbers(groups));
    }

}
