package houseTypes;

public class House {

    private String name;
    private int price;
    private int room;
    private int squareMeters;
    private int hall;


    public House() {

    }
    public House(String name, int price, int room, int hall, int squareMeters) {
        this.name = name;
        this.price = price;
        this.room = room;
        this.hall = hall;
        this.squareMeters = squareMeters;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getRoom() {
        return room;
    }

    public void setRoom(int room) {
        this.room = room;
    }

    public int getHall() {
        return hall;
    }

    public void setHall(int hall) {
        this.hall = hall;
    }

    public int getSquareMeters() {
        return squareMeters;
    }

    public void setSquareMeters(int squareMeters) {
        this.squareMeters = squareMeters;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
