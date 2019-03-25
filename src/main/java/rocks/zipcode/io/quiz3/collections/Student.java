package rocks.zipcode.io.quiz3.collections;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 10/12/2018.
 */
public class Student {
    private List<Lab> labList;

    public Student() {
        labList = new ArrayList<>();
    }

    public Student(List<Lab> labs) {
        this.labList = labs;
    }

    public Lab getLab(String labName) {
        for(Lab lab : labList){
            if(lab.getName().equals(labName)){
                return lab;
            }
        }
        return null;
    }

    public void setLabStatus(String labName, LabStatus labStatus) throws UnsupportedOperationException{
        Lab lab = getLab(labName);
        if (lab == null) {
            throw new UnsupportedOperationException();
        }
        lab.setStatus(labStatus);


    }

    public void forkLab(Lab lab) {
        lab.setStatus(LabStatus.PENDING);
        lab.setForked(true);
        labList.add(lab);
    }

    public LabStatus getLabStatus(String labName) {
        for(Lab lab : labList){
            if(lab.getName().equals(labName)){
                return lab.getStatus();
            }
        }
        return null;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(labList.get(labList.size()-1).getName());
        sb.append(" > ");
        sb.append(labList.get(labList.size()-1).getStatus());
        sb.append("\n");
        sb.append(labList.get(labList.size()-2).getName());
        sb.append(" > ");
        sb.append(labList.get(labList.size()-2).getStatus());

        return sb.toString();
    }
}
