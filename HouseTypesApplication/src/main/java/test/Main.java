package test;



import houseTypes.House;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.Service;


public class Main {
    public static void main(String[] args) {

        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");

        //Houses
        House house1 = context.getBean("house1", House.class);
        House house2 = context.getBean("house2", House.class);
        House house3 = context.getBean("house3", House.class);

        //Villas
        House villa1 = context.getBean("villa1", House.class);
        House villa2 = context.getBean("villa2", House.class);
        House villa3 = context.getBean("villa3", House.class);

        //SummerHouses
        House summerHouse1 = context.getBean("summerHouse1", House.class);
        House summerHouse2 = context.getBean("summerHouse2", House.class);
        House summerHouse3 = context.getBean("summerHouse3", House.class);

        //Service
        Service service = context.getBean(Service.class);


        House[] houseList = {house1,house2, house3,
                villa1, villa2, villa3,
                summerHouse1, summerHouse2, summerHouse3};


        System.out.println("Total price of houses: " + service.getTotalHousePrice(houseList));
        System.out.println("Total price of villas: " + service.getTotalVillaPrice(houseList));
        System.out.println("Total price of summer houses: " + service.getTotalSummerHousePrice(houseList));
        System.out.println("Total price of all type houses: " + service.getTotalHouseTypesPrice(houseList));
        System.out.println("Average square meters of villas: " + service.getAverageVillasSquareMeters(houseList));
        System.out.println("Average square meters of houses: " + service.getAverageHousesSquareMeters(houseList));
        System.out.println("Average square meters of summer houses: " + service.getAverageSummerHousesSquareMeters(houseList));
        System.out.println("Average square meters of all houses: " + service.getAverageAllHousesSquareMeters(houseList));
        System.out.println("Filter by number of rooms : ");
        service.getFilterNumberOfRooms(houseList);





    }
}