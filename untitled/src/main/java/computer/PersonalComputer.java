package computer;

import java.util.ArrayList;
import java.util.List;

public class PersonalComputer {

    private List<Hardware> hardwares =new ArrayList<>();
    private List<Software> softwares =new ArrayList<>();
    private Cpu cpu;

    public PersonalComputer(Cpu cpu) {
        this.cpu = cpu;
    }

    public List<Hardware> getHardWares() {
        return hardwares;
    }

    public List<Software> getSoftWares() {
        return softwares;
    }

    public Cpu getCpu() {
        return cpu;
    }

    public void addHardware(Hardware hardWare){
        hardwares.add(hardWare);
    }

    public void addSoftware(Software software){
        softwares.add(software);
    }

    @Override
    public String toString() {
        return "PersonalComputer{" +
                "hardwares=" + hardwares +
                ", softwares=" + softwares +
                ", cpu=" + cpu +
                '}';
    }
}
