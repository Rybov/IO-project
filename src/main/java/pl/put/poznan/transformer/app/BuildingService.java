package pl.put.poznan.transformer.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import pl.put.poznan.transformer.logic.*;

import java.util.ArrayList;
import java.util.List;

/**
 *class which manage our buildings
 */
@Component
public class BuildingService {
      //private List<Building> buildings = new ArrayList<Building>();

    private DAO dao = new DAO();
    /**
     * simply constructor, create our data
     */
    public BuildingService() {
//        Room room1 = new Room(0, "Pokoj1", 100, 200, 10, 3);
//        Room room2 = new Room(1, "Pokoj2", 10, 15, 1, 1);
//        Room room3 = new Room(2, "Pokoj3", 100, 2, 5, 5);
//        Floor floor1 = new Floor(3, "Pietro1");
//        Floor floor2 = new Floor(4, "Pietro2");
//        floor1.addRoom(room1);
//        floor1.addRoom(room3);
//        floor2.addRoom(room2);
//        Building building1 = new Building(5, "Budynek1");
//        building1.addFloor(floor1);
//        building1.addFloor(floor2);
//        buildings.add(building1);
//        room1 = new Room(6, "Pokoj1", 20, 40, 5, 5);
//        room2 = new Room(7, "Pokoj2", 10, 15, 1, 1);
//        room3 = new Room(8, "Pokoj3", 15, 252, 10, 7);
//        Room room4 = new Room(8, "Pokoj4", 25, 53, 25, 3);
//        Room room5 = new Room(9, "Pokoj5", 50, 100, 23, 23);
//        floor1 = new Floor(10, "Pietro1");
//        floor2 = new Floor(11, "Pietro2");
//        Floor floor3 = new Floor(12, "Pietro3");
//        floor1.addRoom(room1);
//        floor2.addRoom(room2);
//        floor2.addRoom(room3);
//        floor3.addRoom(room4);
//        floor3.addRoom(room5);
//        building1 = new Building(12, "Budynek2");
//        building1.addFloor(floor1);
//        building1.addFloor(floor2);
//        building1.addFloor(floor3);
//        buildings.add(building1);
    }

    public void setDao(DAO dao) {
        this.dao = dao;
    }

    /**
     * simply getter
     * @return our data
     */
    @Bean
    public List<Building> getBuildings(){
        return dao.getBuildings();
    }


    /**
     * @param build, name of building
     * @param arg, the value of maximum satisfactory heating level
     * @return list of rooms
     */
    public List<Room> getRoomsOverArgument(String build, int arg) {
        List<Room> result = new ArrayList<Room>();
        for (Building b : dao.getBuildings()) {
            if (b.getName().equals(build)) {
                for (Floor f : b.getFloors()) {
                    for (Room r : f.getRooms()) {
                        if (r.getHeatingLevel() > arg) {
                            result.add(r);
                        }
                    }
                }

            }
        }
        return result;
    }

}
