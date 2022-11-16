package ru.netology.sqr;

public class SQRService {
    public int specifiedRange(int lowBorder, int highBorder) {
        int count = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= lowBorder && i * i <= highBorder) {
                count++;
            }
        }
        return count;
    }

}
