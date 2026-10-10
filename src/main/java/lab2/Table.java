package lab2;

public class Table {
    private final int[][] data;

    public Table(int rows, int cols) {
        data = new int[rows][cols];
    }

    public int getValue(int row, int col) {
        return data[row][col];
    }

    public void setValue(int row, int col, int value) {
        data[row][col] = value;
    }

    public int rows() {
        return data.length;
    }

    public int cols() {
        return data[0].length;
    }

    public double average() {
        int sum = 0;
        int count = 0;
        for (int[] row : data) {
            for (int value : row) {
                sum += value;
                count++;
            }
        }
        return count == 0 ? 0 : (double) sum / count;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int[] row : data) {
            for (int value : row) {
                sb.append(value).append(" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}