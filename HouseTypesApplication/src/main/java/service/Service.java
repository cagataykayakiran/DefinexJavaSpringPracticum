package service;

import houseTypes.House;


public class Service {


    public void getHouseList(House[] houseList) {
        for (House house : houseList) {
            if (house.getName().startsWith("house")) {
                System.out.print(house.getName() + " ");
            }
        }
    }

    public void getVillaList(House[] houseList) {
        for (House house : houseList) {
            if (house.getName().startsWith("villa")) {
                System.out.print(house.getName() + " ");
            }
        }
    }

    public void getSummerHouseList(House[] houseList) {
        for (House house : houseList) {
            if (house.getName().startsWith("summerHouse")) {
                System.out.print(house.getName() + ",");
            }
        }
    }

    public int getTotalHousePrice(House[] houseList) {
        int total = 0;
        for (House house : houseList) {
            if (house.getName().startsWith("house")){
                total += house.getPrice();
            }
        }

        return total;
    }

    public int getTotalVillaPrice(House[] houseList) {
        int total = 0;
        for (House house : houseList) {
            if (house.getName().startsWith("villa")) {
                total += house.getPrice();
            }
        }
        return total;
    }

    public int getTotalSummerHousePrice(House[] houseList) {
        int total = 0;
        for (House house : houseList) {
            if (house.getName().startsWith("summerHouse")) {
                total += house.getPrice();
            }
        }
        return total;
    }

    public int getTotalHouseTypesPrice(House[] houseList) {
        int total = 0;
        for (House house : houseList) {
            total += house.getPrice();
        }
        return total;
    }

    public double getAverageHousesSquareMeters(House[] houseList) {
        double average = 0;
        int amount = 0;
        for (House house : houseList) {
            if (house.getName().startsWith("house")) {
                average += house.getSquareMeters();
                amount++;
            }
        }
        return average/amount;
    }

    public double getAverageVillasSquareMeters(House[] houseList) {
        double average = 0;
        int amount = 0;
        for (House house : houseList) {
            if (house.getName().startsWith("villa")) {
                average += house.getSquareMeters();
                amount++;
            }
        }
        return average/amount;
    }

    public double getAverageSummerHousesSquareMeters(House[] houseList) {
        double average = 0;
        int amount = 0;
        for (House house : houseList) {
            if (house.getName().startsWith("house")) {
                average += (house.getSquareMeters());
                amount++;
            }
        }
        return average/amount;
    }

    public double getAverageAllHousesSquareMeters(House[] houseList) {
        double average = 0;
        int amount = 0;
        for (House house : houseList) {
            average += house.getSquareMeters();
            amount++;
        }
        return average/amount;
    }

    public void getFilterNumberOfRooms(House[] houseList) {
        for (House house : houseList) {
            if (house.getRoom() + house.getHall() <= 3){
                System.out.println(house.getName() + " number of room: " + house.getRoom() + " number of hall: " +  house.getHall());
            } else if (house.getRoom() + house.getHall() <= 5 && house.getRoom() + house.getHall() > 3 ) {
                System.out.println(house.getName() + " number of room: " + house.getRoom() + " number of hall: " +  house.getHall());
            } else {
                System.out.println(house.getName() + " number of room: " + house.getRoom() + " number of hall: " +  house.getHall());
            }
        }
    }



}
