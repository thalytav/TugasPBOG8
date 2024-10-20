public class Room {
    public String description;
    public Room northExit;
    public Room southExit;
    public Room eastExit; 
    public Room westExit; 
    
    /* Create a room described "description". 
    Initially, it has 
    * no exits. "description" is something like "a kitchen of 
    **an open court yard". */
    
    public Room (String description){ 
        this.description = description; 
    }
    
    /* Define the exits of this room. Every direction leads to another room 
    or is null ino exit there).*/
    public void setExits (Room north, Room east, Room south, Room west){
        if(north != null) 
            northExit = north; 
        if(east != null) 
            eastExit = east; 
        if(south != null) 
            southExit = south; 
        if(west != null) 
            westExit = west;
     } 
     
    public String getDescription(){
        return description;
    }
}