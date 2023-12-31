package TollManagement.entities;

import java.util.ArrayList;
import java.util.List;

public class Leaderboard {
    
    private  String leaderboardId;
    private  String name;
    private List<TollBooth> tboothlist ;

    public Leaderboard(String id,String name){

        this.leaderboardId = id;
        this.name = name;
        this.tboothlist = new ArrayList<>();

    }

    public void addtoTollbooth(TollBooth tb){
        this.tboothlist.add(tb);
    }

    public void removefromleaderboard(TollBooth tb){
        this.tboothlist.remove(tb);
    }

    public void listTollbooths(){
        for( TollBooth tb : this.tboothlist){
            System.out.println(tb.getTolladdress());
        }
    }

     public void listtheTolls(){
        for( TollBooth tb : this.tboothlist){
            System.out.println(tb.getTollname());
        }
    }

}
