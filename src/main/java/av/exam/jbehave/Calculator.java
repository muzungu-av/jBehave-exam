package av.exam.jbehave;

public class Calculator {
    private long lastResult;

    public long add(long value1, long value2) {
        return value1 + value2;
    }

    public long sub(long value1, long value2) {
        return value1 - value2;
    }

    public long mult(long value1, long value2) {
        return value1 * value2;
    }

    /**
     * для простоты алгоритм такой - если второй операнд = 0, вернуть Long.MAX_VALUE
     *
     * @param value1 операнд 1
     * @param value2 операнд 2
     * @return число long - частное (результат деления)
     */
    public long div(long value1, long value2) {
        if (value2 != 0) {
            return value1 / value2;
        } else
            return Long.MAX_VALUE;
    }

    public long getLastResult() {
        return lastResult;
    }
}
