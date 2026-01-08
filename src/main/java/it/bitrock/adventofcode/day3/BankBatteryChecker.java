package it.bitrock.adventofcode.day3;

import it.bitrock.adventofcode.day3.model.Battery;

public class BankBatteryChecker {

    public int extractJoltageFromBatteryArray(Battery[] batteryArray) {
        StringBuilder sb = new StringBuilder();
        if (batteryArray[0].joltage() > batteryArray[1].joltage()) {
            sb.append(batteryArray[0].joltage());
            sb.append(batteryArray[1].joltage());
        } else {
            sb.append(batteryArray[1].joltage());
            sb.append(batteryArray[0].joltage());
        }
        return Integer.parseInt(sb.toString());
    }

    public int getMaxJoltageBatteryArray(String inputBank) {
        StringBuilder result = new StringBuilder();
        Integer[] digits = toDigitsArray(inputBank);
        Battery firstMaxBattery = extractBatteryWithMaxVoltage(digits);
        //result.append(firstMaxBattery.joltage());
        Battery secondMaxBattery = null;
        String secondPart;
        if (firstMaxBattery.positionInBank() < inputBank.length()-1) {
            secondPart = inputBank.substring(firstMaxBattery.positionInBank()+1);
            secondMaxBattery = new Battery(firstMaxBattery.joltage(), inputBank.lastIndexOf(secondPart));
        }
        else {
            result.append(firstMaxBattery.joltage());
            secondPart = inputBank.substring(0, firstMaxBattery.positionInBank());
        }

        //Battery secondMaxBattery;
        if (secondPart.length() > 1) {
            secondMaxBattery = extractBatteryWithMaxVoltage(toDigitsArray(secondPart));
        }
        /*
        else {
            secondMaxBattery = new Battery(Integer.parseInt(secondPart), inputBank.lastIndexOf(secondPart));
       }

         */
        result.append(secondMaxBattery.joltage());
        return Integer.parseInt(result.toString());
    }


    private Battery extractBatteryWithMaxVoltage(Integer[] digits) {
        int maxJoltage = Integer.MIN_VALUE;
        int maxIndex = -1;

        for (int i = 0; i < digits.length; i++) {
            int value = digits[i];
            if (value > maxJoltage) {
                maxJoltage = value;
                maxIndex = i;
            }
        }

        return new Battery(maxJoltage, maxIndex);

    }


    private Integer[] toDigitsArray(String inputBank) {
        return inputBank.chars()
                .map(c -> c - '0')
                .boxed()
                .toArray(Integer[]::new);
    }
}

