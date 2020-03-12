package oop.cacttus.education.online1_java2;

public class Vehicle {
    private static int vehicleCount = 0;
    public static int getVehicleCount(){
        return  vehicleCount;
    }

    private String mark;
    private String model;
    private String type;
    private String color;
    private float actualSpeed;
    private float maxSpeed;

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getActualSpeed() {
        return actualSpeed;
    }

    public void setActualSpeed(float actualSpeed) {
        if (actualSpeed >= 0 && actualSpeed <= maxSpeed)
            this.actualSpeed = actualSpeed;
    }

    public float getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(float maxSpeed) { //objekti.setMaxSpeed(500f);
        if (maxSpeed >= 0 && maxSpeed <= 400)
            this.maxSpeed = maxSpeed;
    }

    public short getPower() {
        return power;
    }

    public void setPower(short power) {
        this.power = power;
    }

    public byte getTransition() {
        return transition;
    }

    public void setTransition(byte transition) {
        if (transition >= -1 && transition <= 7)
            this.transition = transition;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public byte getDoors() {
        return doors;
    }

    public void setDoors(byte doors) {
        this.doors = doors;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        if (vin != null && vin.length() == 17)
            this.vin = vin;
    }

    public boolean isManual() {
        return isManual;
    }

    public void setManual(boolean manual) {
        isManual = manual;
    }

    public boolean isTransport() {
        return isTransport;
    }

    public void setTransport(boolean transport) {
        isTransport = transport;
    }

    public byte getSeats() {
        return seats;
    }

    public void setSeats(byte seats) {
        this.seats = seats;
    }

    public short getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(short productionYear) {
        this.productionYear = productionYear;
    }

    private short power; //0-300
    private byte transition; // -1 (R),0 (L), 1,2,3,4,5,6,7
    private String fuelType;
    private byte doors;
    private String vin;
    private boolean isManual;
    private boolean isTransport;
    private byte seats;
    private short productionYear;

    //metode

    public Vehicle() {
        vehicleCount++;
        //java per ne
    }


    public Vehicle(String mark, String model, float maxSpeed) {
        vehicleCount++;
        //e kjartë
        //-1000,
//        if(maxSpeed>=0 && maxSpeed<=400)
//            this.maxSpeed=maxSpeed;

        setMark(mark);
        setModel(model);
        setMaxSpeed(maxSpeed);
    }
}


