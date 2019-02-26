/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package football;

/**
 *
 * @author lhebe
 */
public enum NFL {
    PACKERS ("Green Bay", "Packers"),
     BEARS ("Chicago", "Bears"),
    LIONS ("Detroit", "Lions"),
    COLTS ("Indianapolis", "Colts"),
    VIKINGS ("Minneapolis", "Vikings");

    private String name;
    private String city;
    private NFL(String city, String name){
        this.name = name;
        this.city = city;
    }

    private String getName(){
        return name;
    }

    private String getCity(){
        return city;
    }
    @Override
    public String toString(){
        String str;
        str = "Your favorite team is are the " + this.getCity()
                + " "+ this.getName() + "." ;
    return str;
    }
}
