package kz.kaznitu.lessons.main;


import kz.kaznitu.lessons.interfaces.Robot;

import java.util.Collection;

public class T1000Pool {
    Collection<Robot> robotCollections;

    public T1000Pool() {
    }

    public Collection<Robot> getRobotCollections() {
        return robotCollections;
    }

    public void setRobotCollections(Collection<Robot> robotCollections) {
        this.robotCollections = robotCollections;
    }

    public void action(){
        for (Robot robot : robotCollections){
            robot.action();
        }
    }
}
