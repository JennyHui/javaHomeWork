package util;

import java.util.Objects;

/**
 * @author jennyhui
 */

public class JennyHui implements Cloneable{
    private String name;
    private String lastName;

    JennyHui(String name, String lastName){
        this.name = name;
        this.lastName = lastName;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        JennyHui jennyHui = (JennyHui) o;
//        return Objects.equals(name, jennyHui.name) &&
//                Objects.equals(lastName, jennyHui.lastName);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(name, lastName);
//    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return (JennyHui)super.clone();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
