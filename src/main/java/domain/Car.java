package domain;

public class Car {
    private final String name;
    private int position = 0;

    public Car(String name) {
        this.name = name;
    }

    public void move() {
        if (Math.random() * 10 > 3) {
            position += 1;
        }
    }

    public int getBiggerPosition(int maxPosition) {
        if (position > maxPosition) {
            return position;
        }
        return maxPosition;
    }

    public boolean isMaxPosition(int maxPosition) {
        return position == maxPosition;
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }
}