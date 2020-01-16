public class Eagle extends Bird implements Fly{

    private boolean flying;
    private int altitude;

    public Eagle(String name) {
        super(name);
        this.flying = false;
        this.altitude = 0;
    }

    public int getAltitude() {
        return this.altitude;
    }

    public boolean isFlying() {
        return this.flying;
    }

    public void setFlying(boolean flying) {
        this.flying = flying;
    }

    @Override
    public String sing() {
        return "Screech!";
    }

    @Override
    public void takeOff() {
        System.out.printf("%s takes off in the sky\n", this.getName());
    }

    @Override
    public int ascend(int meters) {
        this.altitude = this.altitude + meters;
        System.out.printf("%s flies upward, altitude : %s\n", this.getName(), this.altitude);
        return this.altitude;
    }

    @Override
    public int descend(int meters) {
        this.altitude = this.altitude - meters;
        System.out.printf("%s flies downward, altitude : %s\n", this.getName(), this.altitude);
        return this.altitude;
    }

    @Override
    public void land() {
        if (this.altitude < 5) {
            System.out.printf("%s lands on the ground\n", this.getName());
            this.setFlying(false);
        } else {
            System.out.printf("%s is too high, it can't lands\n", this.getName());
            this.setFlying(true);
        }
    }
}
