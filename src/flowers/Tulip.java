package flowers;

import java.text.ParseException;

enum TulipSorts {
    DarwinHybrid, Triumph, Fringed, LilyFlowered, Parrot
}

//Чу'лип
public class Tulip extends Flower {
    private TulipSorts sort;

    Tulip(String sDate, double price, FlowerColors color, TulipSorts sort, int length) throws ParseException {
        super(sDate, price, color, length);
        this.name = "Tulip";
        this.sort = sort;
    }

    public TulipSorts getSort() {
        return sort;
    }

    public String toString(){
        String result = String.format("[Flower: %s, color: %s, sort: %s, date:%s, price:%f, length:%d]%n",
                getName(), getColor().toString(), getSort().toString(),
                getsDate(), getPrice(), getLength());
        return result;
    }
}