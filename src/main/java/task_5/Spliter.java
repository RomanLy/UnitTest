package task_5;

public class Spliter {
    protected int number;

    public Spliter(int number) {
        this.number = number;
    }

    protected int calculateDischarge(int number) {
        int count = 0;
        while (number > 0) {
            number /= 10;
            count++;
        }
        return count;
    }

    protected int calculateGroupsDischarge() {
        int discharge = calculateDischarge(number);
        int groupsDischarge = (discharge % 3) == 0 ? (discharge / 3) : (discharge / 3) + 1;
        return groupsDischarge;
    }

    protected int[] divideForGroups(int groupsDischarge) {
        int[] groups = new int[groupsDischarge];
        int temp = 1;
        for (int i = 0; i < groups.length; i++) {
            groups[i] = number % (temp *= 1000);
            if (groups[i] < 1_000) {
                groups[i] = groups[i];
            }
            if (groups[i] < 1_000_000 && groups[i] >= 1000) {
                groups[i] /= 1_000;
            }
            if (groups[i] < 1_000_000_000 && groups[i] >= 1_000_000) {
                groups[i] /= 1_000_000;
            }
//            System.out.println("groups[" + i + "]" + groups[i]);
        }
        return groups;
    }

    protected int[][] divideForNumbers(int[] groups) {
        int[][] numbers = new int[groups.length][3];
        int temp;
        int tempDiv;
        for (int i = 0; i < groups.length; i++) {
            temp = 1;
            tempDiv = 1;
            for (int j = 0; j < 3; j++) {
                numbers[i][j] = groups[i] % (temp *= 10);
                numbers[i][j] /= tempDiv;
                tempDiv *= 10;
//                System.out.println("numbers[" + i + " " + j + "]" + numbers[i][j]);
            }
        }
        return numbers;
    }


}
