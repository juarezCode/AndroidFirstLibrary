package juarez.roberto.myloglibrary;

import android.util.Log;

public class Calculate {
    private static final String TAG = "CALCULATE_LIBRARY";

    public static void log(String message) {
        Log.d(TAG, message);
    }

    public static int sumar(int a, int b) {
        return (a + b);
    }

    public static int restar(int a, int b) {
        return (a - b);
    }

    public static int multiplicar(int a, int b) {
        return (a * b);
    }

    public static int dividir(int a, int b) {
        if (a == 0 || b == 0) return 0;
        return (a / b);
    }


}
