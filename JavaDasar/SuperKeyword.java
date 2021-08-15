package JavaDasar;

public class SuperKeyword {
    int getKey(){
        return 0;
    }
}

class keyword extends SuperKeyword {
    int getKey(){
        return 4;
    }

    int getParentKeyword(){
        return super.getKey();
    }
}
