package bean;

public class Teacher extends Person implements Comparable<Teacher>{
    public Teacher(int id, String name, String surname) {
        super(id, name, surname);

    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public boolean equals(Object obj){
        System.out.println("Equals called "+obj);
        if (obj instanceof Teacher){
            Teacher t =  (Teacher) obj;
            if (t.getId()==this.getId()){
                return true;
            }
        }
        return false;
    }

    @Override
    public int compareTo(Teacher o) {
        if (this.getId()>o.getId()){
            return 1;
        }else if(this.getId()==o.getId()){
            return 0;
        }else {
            return -1;
        }
    }
}
