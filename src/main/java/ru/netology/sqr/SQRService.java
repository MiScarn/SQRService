package ru.netology.sqr;

public class SQRService {

    public int calc(int min, int max) {
        int result = 0;

        for (int i = 10; i <= 99; ++i) {
            int iSq = i * i;
            if (iSq >= min && iSq <= max) {
                ++result;
            }
        }

        return result;
    }
}
